/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler

import java.io.File
import java.util.Collection
import java.util.Map
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask

class EMFAntTemplate {
	def generateAnt(Map<String,Object> properties, AntTask task) {
		val projectName = properties.get("projectName") as String;
		
		'''
		<?xml version="1.0" encoding="UTF-8"?>
			<project name="«projectName»" default="do-deploy" basedir="."  xmlns:fx="javafx:com.sun.javafx.tools.ant">
			«createInitTaskTarget(properties)»
			«createLocalSetup(properties)»
			«compileTarget(properties)»
			«createDoDeployTarget(task)»
		</project>
		'''.toString
	}
	
	def createLocalSetup(Map<String,Object> properties) {
		val externalLibs = properties.get("orig.externalLibs") as Collection<File>;
		val projectSrcDirs = properties.get("orig.projectSourceDirs") as Collection<SetupDirectory>;
		var projectRefs = properties.get("orig.projectRefSourceDirs") as Collection<SetupDirectory>;
		'''
		<target name="setup-staging-area">
			<delete dir="externalLibs" />
			<delete dir="project" />
			<delete dir="projectRefs" />
			
			<mkdir dir="externalLibs" />
			
			«FOR File l : externalLibs»
			<copy todir="externalLibs">
				<fileset dir="«l.parent»">
					<filename name="«l.name»"/>	
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="project" />
			«FOR SetupDirectory d : projectSrcDirs»
			<copy todir="project">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.name»/**" />
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="projectRefs" />
			«FOR SetupDirectory d : projectRefs»
			<copy todir="projectRefs">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.path»/**" />
				</fileset>
			</copy>
			«ENDFOR»
		</target>
		'''
	}
	
	def createInitTaskTarget(Map<String,Object> properties) {
		val sdkAntPath = properties.get("jfxantjar") as String;
		'''
		<target name="init-fx-tasks">
			<property name="javafx.tools.ant.jar" value="«sdkAntPath»"/>
			
			<taskdef resource="com/sun/javafx/tools/ant/antlib.xml"      
				uri="javafx:com.sun.javafx.tools.ant"
				classpath="${javafx.tools.ant.jar}"/>
		</target>
		'''
	}
	
	def compileTarget(Map<String,Object> properties) {
		val projectRefs = properties.get("projectRefSourceDirs") as Collection<String>;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val projectSourceDirs = properties.get("projectSourceDirs") as Collection<String>;
		val fxJarPath = properties.get("jfxjar") as String;
		var encoding = properties.get("projectEncoding") as String;
		var sourceCompliance = properties.get("sourceCompliance") as String;
		var targetCompliance = properties.get("targetCompliance") as String;
		
		'''
		<target name='do-compile'>
			<delete dir="build" />
			<mkdir dir="build/src" />
			<mkdir dir="build/libs" />
			<mkdir dir="build/classes" />
		
			<!-- Copy project-libs references -->
			<copy todir="build/libs">
				<fileset dir="externalLibs">
					«FOR String s : externalLibs»
					<include name="«s»"/>
					«ENDFOR»
				</fileset>
			</copy>
		
			<!-- Copy project references -->
			«FOR String s : projectRefs»
			<copy todir="build/src">
				<fileset dir="projectRefs/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<!-- Copy project sources itself -->
			«FOR String s : projectSourceDirs»
			<copy todir="build/src">
				<fileset dir="project/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<javac includeantruntime="false" source="«sourceCompliance»" target="«targetCompliance»" srcdir="build/src" destdir="build/classes"«IF encoding != null» encoding="«encoding»"«ENDIF»>
				<classpath>
					<fileset dir="build/libs">
						<include name="*"/>
					</fileset>
					«IF fxJarPath != null»
					<filelist>
						<file name="«fxJarPath»"/>
					</filelist>
					«ENDIF»
				</classpath>
			</javac>
			
			<!-- Copy over none Java-Files -->
			<copy todir="build/classes">
			«FOR String s : projectSourceDirs»
				<fileset dir="project/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			«ENDFOR»
			</copy>
		
			«FOR String s : projectRefs»
			<copy todir="build/classes">
				<fileset dir="projectRefs/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			</copy>
			«ENDFOR»

		</target>
		'''	
	}
	
	def createDoDeployTarget(AntTask task) {
		val projectName = task.getDeploy().getApplication().getName();
		val mainClass = task.getDeploy().getApplication().getMainclass();
		val appletWidth = task.getDeploy().getWidth();
		val appletHeight = task.getDeploy().getHeight();
		val appTitle = task.getDeploy().getInfo().getTitle();
		val appVersion = task.getDeploy().getApplication().getVersion();
		val preloaderClass = task.getDeploy().getApplication().getPreloaderclass();
		val nativePackage = task.getDeploy().isNativePackage();
		
		var preloaderPath = "";
		if( preloaderClass == null ) {
			preloaderPath = null;
		} else {
			preloaderPath = preloaderClass.replace('.','/');
		}
		val fallBackClass = task.getDeploy().getApplication().getFallbackclass();
		
		'''
		<target name="do-deploy" depends="setup-staging-area, do-compile, init-fx-tasks">
			<delete file="dist"/>
			<delete file="deploy" />
			
			<mkdir dir="dist" />
			<mkdir dir="dist/libs" />
			
			<copy todir="dist/libs">
				<fileset dir="externalLibs">
					<include name="*" />
				</fileset>
			</copy>
			
			«IF preloaderClass != null»
			<jar destfile="dist/libs/«projectName»-preloader.jar">
				<fileset dir="build/classes">
					<include name="«preloaderPath».class"/>
				</fileset>
			</jar>
			«ENDIF»
			
			<fx:resources id="appRes">
				«IF preloaderClass != null»
				<fx:fileset dir="dist" requiredFor="preloader"
					includes="«projectName»-preloader.jar"/>
				«ENDIF»
				<fx:fileset dir="dist" includes="«projectName».jar"/>
				<fx:fileset dir="dist" includes="libs/*"/>
			</fx:resources> 
			
			<fx:application id="fxApplication"
				name="«projectName»"
				mainClass="«mainClass»"
				«IF preloaderClass != null»
				preloaderClass="«preloaderClass»"
				«ENDIF»
				«IF fallBackClass != null»
				fallbackClass="«fallBackClass»"
				«ENDIF»
				/>
			
			<fx:jar destfile="dist/«projectName».jar">
				<fx:application refid="fxApplication"/>
				<fileset dir="build/classes">
				«IF preloaderClass != null»
					<exclude name="«preloaderPath».class" />
				«ENDIF»
				</fileset>
				<fx:resources refid="appRes"/>
				
				<manifest>
					<attribute name="Implementation-Vendor" value="«task.getDeploy().getInfo().getVendor()»"/>
					<attribute name="Implementation-Title" value="«appTitle»"/>
					<attribute name="Implementation-Version" value="«appVersion»"/>
					«IF task.getDeploy().getSplashImage() != null»
						<attribute name="SplashScreen-Image" value="«task.getDeploy().getSplashImage()»"/>
					«ENDIF»
					«FOR a : task.getManifestEntries()»
						<attribute name="«a.getName()»" value="«a.getValue()»"/>
					«ENDFOR»
				</manifest>
			</fx:jar>
			
			«IF task.getSignjar().getKeystore() != null»
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:signjar"
				" keystore="«task.getSignjar().getKeystore()»
				" alias="«task.getSignjar().getAlias()» 
				" keypass="«task.getSignjar().getKeypass()» 
				" storepass="«task.getSignjar().getStorepass()» 
				«IF task.getSignjar().getStoretype() != null»" storetype="«task.getSignjar().getStoretype()» «ENDIF»
				" destDir="${basedir}/dist">
				<fileset dir='dist'>
					<include name='**/*.jar' />
				</fileset>
			</fx:signjar>
			«ENDIF»
		
			«IF (appletWidth != null && appletHeight != null) || nativePackage»
			<mkdir dir="deploy" />
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:deploy
				" embedJNLP="«task.getDeploy().isEmbedjnlp()»"
				" extension="«task.getDeploy().isExtension()»"
				«IF appletWidth != null && appletHeight != null»width="«appletWidth»" height="«appletHeight» «ENDIF» 
				" includeDT="«task.getDeploy().isIncludeDT()»"
				" offlineAllowed="«task.getDeploy().isOfflineAllowed()»"
				" outdir="${basedir}/deploy""
				" outfile="«projectName»" «IF nativePackage»nativeBundles="all"«ENDIF»">
				«IF task.getDeploy().getPlaceholderref() != null »placeholderref="«task.getDeploy().getPlaceholderref()»«ENDIF» 
				«IF task.getDeploy().getPlaceholderid() != null »placeholderid="«task.getDeploy().getPlaceholderid()»«ENDIF» 
				«IF task.getDeploy().getUpdatemode() != null »updatemode="«task.getDeploy().getUpdatemode()»«ENDIF» 

				«IF task.getDeploy().getInfo().getSplash().isEmpty() && task.getDeploy().getInfo().getIcon().isEmpty()»
					<fx:info title="«projectName»" vendor="«task.getDeploy().getInfo().getVendor()»"/>
				«ELSE»
					<fx:info title="«projectName»" vendor="«task.getDeploy().getInfo().getVendor()»">
						«FOR s : task.getDeploy().getInfo().getSplash()»
							<fx:splash href="«s.getHref()»" «IF s.getMode() != null»mode="«s.getMode()»"«ENDIF» />
						«ENDFOR»
						«FOR i : task.getDeploy().getInfo().getIcon()»
							<fx:icon href="«i.getHref()»" «IF i.getDepth() != null»depth="«i.getDepth()»"«ENDIF» «IF i.getHeight() != null»height="«i.getHeight()»"«ENDIF» «IF i.getKind() != null»kind="«i.getKind()»"«ENDIF» «IF i.getWidth() != null»width="«i.getWidth()»"«ENDIF» />
						«ENDFOR»
					</fx:info>
				«ENDIF»
				<fx:application refId="fxApplication"/>
				<fx:resources refid="appRes"/>
				<fx:permissions elevated="true"/>
			</fx:deploy>
			«ENDIF»
		</target>
		'''
	}
}