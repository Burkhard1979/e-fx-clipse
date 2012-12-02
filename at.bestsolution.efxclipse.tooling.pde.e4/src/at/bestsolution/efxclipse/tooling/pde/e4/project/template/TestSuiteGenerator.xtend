package at.bestsolution.efxclipse.tooling.pde.e4.project.template

class TestSuiteGenerator {
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