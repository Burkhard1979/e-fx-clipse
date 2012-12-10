package at.bestsolution.efxclipse.runtime.core;

public class Util {
	public static boolean isFX2() {
		return System.getProperty("javafx.version") != null && System.getProperty("javafx.version").startsWith("2");
	}
}
