package at.bestsolution.efxclipse.tooling.pde.ui.templates

class JemmyLaunch {
	def generate(JemmyLaunchDef launch) '''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<launchConfiguration type="org.eclipse.pde.ui.JunitLaunchConfig">
			<booleanAttribute key="append.args" value="true"/>
			<stringAttribute key="application" value="org.eclipse.pde.junit.runtime.coretestapplication"/>
			<booleanAttribute key="askclear" value="false"/>
			<booleanAttribute key="automaticAdd" value="false"/>
			<booleanAttribute key="automaticValidate" value="false"/>
			<stringAttribute key="bootstrap" value=""/>
			<stringAttribute key="checked" value="[NONE]"/>
			<booleanAttribute key="clearConfig" value="true"/>
			<booleanAttribute key="clearws" value="true"/>
			<booleanAttribute key="clearwslog" value="false"/>
			<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/pde-junit"/>
			<booleanAttribute key="default" value="false"/>
			<booleanAttribute key="includeOptional" value="true"/>
			<stringAttribute key="location" value="${workspace_loc}/../junit-workspace"/>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_PATHS">
				<listEntry value="/«launch.projectName»/src/«launch.junitClassName.replace('.','/')».java"/>
			</listAttribute>
			<listAttribute key="org.eclipse.debug.core.MAPPED_RESOURCE_TYPES">
				<listEntry value="1"/>
			</listAttribute>
			<stringAttribute key="org.eclipse.jdt.junit.CONTAINER" value=""/>
			<booleanAttribute key="org.eclipse.jdt.junit.KEEPRUNNING_ATTR" value="false"/>
			<stringAttribute key="org.eclipse.jdt.junit.TESTNAME" value=""/>
			<stringAttribute key="org.eclipse.jdt.junit.TEST_KIND" value="org.eclipse.jdt.junit.loader.junit4"/>
			<stringAttribute key="org.eclipse.jdt.launching.MAIN_TYPE" value="«launch.junitClassName»"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-nl ${target.nl} -consoleLog -nosplash -console"/>
			<stringAttribute key="org.eclipse.jdt.launching.PROJECT_ATTR" value="«launch.projectName»"/>
			<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
			<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Xms40m -Xmx512m -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi -Dtest.jemmy.product=«launch.testProductId»"/>
			<stringAttribute key="pde.version" value="3.3"/>
			<stringAttribute key="product" value="org.eclipse.sdk.ide"/>
			<booleanAttribute key="run_in_ui_thread" value="false"/>
			<stringAttribute key="selected_target_plugins" value="«launch.targetPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»" />
			<stringAttribute key="selected_workspace_plugins" value="«launch.workbenchPlugins.map([p|p.name+"@"+p.startLevel+":"+p.autoStart]).join(",")»"/>
			<booleanAttribute key="show_selected_only" value="false"/>
			<booleanAttribute key="tracing" value="false"/>
			<booleanAttribute key="useCustomFeatures" value="false"/>
			<booleanAttribute key="useDefaultConfig" value="true"/>
			<booleanAttribute key="useDefaultConfigArea" value="false"/>
			<booleanAttribute key="useProduct" value="false"/>
		</launchConfiguration> 
	'''
}