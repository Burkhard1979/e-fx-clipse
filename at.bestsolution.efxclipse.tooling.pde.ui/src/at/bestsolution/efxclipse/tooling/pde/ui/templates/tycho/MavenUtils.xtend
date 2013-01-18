package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho

class MavenUtils {
	def static String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
}