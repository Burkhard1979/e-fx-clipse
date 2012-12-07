package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho

@Data class PomData {
	String description;
	String groupId;
	String artifactId;
//	String version;
	
	String parentGroupId;
	String parentArtifactId;
	String parentVersion;
	
	String parentPomPath;
}