package at.bestsolution.efxclipse.tooling.pde.e4.project.template

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.File
import java.util.Map
import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class SampleTestCaseGenerator implements Generator<File> {
	override generate(File file, Map<String,Object> data) {
		val cp = file.eContainer as CompilationUnit
		return new ByteArrayInputStream(generate(cp.packagename).toString.bytes);
	}
	
	def generate(String packageName) '''package «packageName»;

import junit.framework.Assert;

import org.jemmy.fx.SceneDock;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTestCase {
	protected static SceneDock scene;
	
	@BeforeClass
	public static void startApp() throws InterruptedException {
		try {
			scene = new SceneDock();
		} catch(Throwable t ) {
			t.printStackTrace();
		}
	}
	
	@Test
	public void sampleTestMethod() {
		Assert.fail("Not implemented");
	}
}
	'''
	
}