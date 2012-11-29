package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho

class JemmyPomGenerator {
	def generate(JemmyPomData data) '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<name>«data.description»</name>
	<groupId>«data.groupId»</groupId>
	<artifactId>«data.artifactId»</artifactId>
	<packaging>eclipse-test-plugin</packaging>

	<parent>
		<groupId>«data.parentGroupId»</groupId>
		<artifactId>«data.parentArtifactId»</artifactId>
		<relativePath>«data.parentPomPath»/pom.xml</relativePath>
		<version>«data.parentVersion»</version>
	</parent>

	<build>
		<plugins>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-surefire-plugin</artifactId>
				<version>${tycho-version}</version>
				<configuration>
					<testSuite>«data.testSuiteBundle»</testSuite>
					<testClass>«data.testSuiteClass»</testClass>
					<useUIHarness>false</useUIHarness>
					<useUIThread>false</useUIThread>
					<argLine>-Xms40m -Xmx512m -Defxclipse.osgi.hook.debug=true -Dosgi.framework.extensions=at.bestsolution.efxclipse.runtime.osgi -Dtest.jemmy.product=«data.testProductId»</argLine>
					<appArgLine>-consoleLog -nosplash -console</appArgLine>
					<application>org.eclipse.pde.junit.runtime.coretestapplication</application>
					<dependencies>
						<dependency>
							<type>eclipse-feature</type>
							<artifactId>«data.applicationFeature»</artifactId>
							<version>0.0.0</version>
						</dependency>
					</dependencies>
					<frameworkExtensions>
						<frameworkExtension>
							<groupId>at.bestsolution.efxclipse</groupId>
							<artifactId>at.bestsolution.efxclipse.runtime.osgi</artifactId>
							<version>${efx-version}</version>
						</frameworkExtension>
					</frameworkExtensions>
				</configuration>
				<executions>
					<execution>
						<phase>test</phase>
						<goals>
							<goal>test</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-maven-plugin</artifactId>
				<version>${tycho-version}</version>
				<extensions>true</extensions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>target-platform-configuration</artifactId>
				<version>${tycho-version}</version>
				<configuration>
					<resolver>p2</resolver>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

</project>
	'''
}