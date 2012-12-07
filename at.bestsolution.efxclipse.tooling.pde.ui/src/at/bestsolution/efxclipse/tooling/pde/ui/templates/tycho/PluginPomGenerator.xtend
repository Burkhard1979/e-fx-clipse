package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho

class PluginPomGenerator {
	def generate(PomData data) '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<name>«data.description»</name>
	<groupId>«data.groupId»</groupId>
	<artifactId>«data.artifactId»</artifactId>
	<packaging>eclipse-plugin</packaging>

	<parent>
		<groupId>«data.parentGroupId»</groupId>
		<artifactId>«data.parentArtifactId»</artifactId>
		<relativePath>«data.parentPomPath»/pom.xml</relativePath>
		<version>«data.parentVersion»</version>
	</parent>

	<build>
		<resources>
			<resource>
				<directory>.</directory>
				<includes>
					<include>META-INF/</include>
				</includes>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-source-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
	'''
}