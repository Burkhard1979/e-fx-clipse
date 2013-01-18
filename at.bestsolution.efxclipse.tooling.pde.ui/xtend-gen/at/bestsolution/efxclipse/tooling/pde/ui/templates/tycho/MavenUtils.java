package at.bestsolution.efxclipse.tooling.pde.ui.templates.tycho;

@SuppressWarnings("all")
public class MavenUtils {
  public static String toPomVersion(final String version) {
    return version.replace(".qualifier", "-SNAPSHOT");
  }
}
