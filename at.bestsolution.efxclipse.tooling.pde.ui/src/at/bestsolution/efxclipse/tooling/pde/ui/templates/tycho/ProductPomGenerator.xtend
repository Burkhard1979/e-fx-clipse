package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
import java.io.ByteArrayInputStream

class ProductPomGenerator implements Generator<DynamicFile> {
	override generate(DynamicFile file, Map<String,Object> data) {
		val projectName = data.get("BundleProject_projectName") as String;
		val productName = data.get("BundleProject_productName") as String;
		val bundleId = data.get("BundleProject_bundleId") as String;
		val bundleVersion = data.get("BundleProject_bundleVersion") as String;
		val pomData = new PomData(productName + " - product feature", toPomGroupId(bundleId), bundleId +".product", toPomGroupId(bundleId), bundleId+".releng", toPomVersion(bundleVersion), "../"+projectName+".releng")
		return new ByteArrayInputStream(generate(pomData).toString.bytes);
	}
	
	def toPomGroupId(String bundleId) {
		if( bundleId.indexOf('.') != -1 ) {
			return bundleId.substring(0,bundleId.lastIndexOf('.'));
		}
		return bundleId;
	}
	
	def String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
	
	def generate(PomData data) '''<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<name>«data.description»</name>
	<groupId>«data.groupId»</groupId>
	<artifactId>«data.artifactId»</artifactId>
	<packaging>eclipse-application</packaging>

	<parent>
		<groupId>«data.parentGroupId»</groupId>
		<artifactId>«data.parentArtifactId»</artifactId>
		<relativePath>«data.parentPomPath»/pom.xml</relativePath>
		<version>«data.parentVersion»</version>
	</parent>
</project>'''	
}