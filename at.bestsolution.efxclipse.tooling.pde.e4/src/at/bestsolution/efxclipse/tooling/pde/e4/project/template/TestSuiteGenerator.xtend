package at.bestsolution.efxclipse.tooling.pde.e4.project.template

import at.bestsolution.efxclipse.tooling.rrobot.model.task.File
import java.util.Map
import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import java.io.ByteArrayInputStream

class TestSuiteGenerator implements Generator<File> {
	override generate(File file, Map<String,Object> data) {
		val cp = file.eContainer as CompilationUnit
		return new ByteArrayInputStream(generate(cp.packagename).toString.bytes);
	}
	
	def generate(String packageName) '''package «packageName»;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import at.bestsolution.efxclipse.runtime.jemmy.OSGiJemmyBootstrapTestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SampleTestCase.class })
public class TestSuite extends OSGiJemmyBootstrapTestCase {

}
	'''
}