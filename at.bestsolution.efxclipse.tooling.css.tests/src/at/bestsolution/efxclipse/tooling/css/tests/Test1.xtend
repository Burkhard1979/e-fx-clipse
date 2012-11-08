package at.bestsolution.efxclipse.tooling.css.tests

import at.bestsolution.efxclipse.tooling.css.CssDslInjectorProvider
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet
import com.google.inject.Inject
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CssDslInjectorProvider))
class Test1 {
	
	@Inject IGenerator generator;
	@Inject ParseHelper<stylesheet> parseHelper;
	
	def parse(String inputString) {
		val model = parseHelper.parse(inputString)
		val fsa = new InMemoryFileSystemAccess()
		generator.doGenerate(model.eResource, fsa)
		model
	}
	
	@Test
	def testSimpleElementSelector() {
		val model = parse('''
			ElementSelector {}
        ''')
        
        val rs = model.ruleset.get(0)
        
        val sel = rs.selectors.get(0)
        
        val simpleSel = sel.simpleselectors.get(0)
        
        assertNotNull(simpleSel.element)
        
        assertEquals("ElementSelector", simpleSel.element.name)
 	}
 	
 	@Test
	def testSimpleClassSelector() {
		val model = parse('''
			.ClassSelector {}
        ''')
        
        val rs = model.ruleset.get(0)
        
        val sel = rs.selectors.get(0)
        
        val simpleSel = sel.simpleselectors.get(0)
        
        assertNotSame(0, simpleSel.subSelectors.size)
        
        val subsel = simpleSel.subSelectors.get(0) as ClassSelector
        
        assertEquals("ClassSelector", subsel.name)
 	}
 	
 	@Test
 	def testURProblem() {
 		val model = parse('''
 		.future {}
 		.current {}
 		''')
 		
 		assertNotNull(model)
 		
 		val simpleSel1 = model.ruleset.get(0).selectors.get(0).simpleselectors.get(0)
        
        assertNotSame(0, simpleSel1.subSelectors.size)
        
        val subsel = simpleSel1.subSelectors.get(0) as ClassSelector
        
        assertEquals("future", subsel.name)
        
      	assertEquals("current", (model.ruleset.get(1).selectors.get(0).simpleselectors.get(0).subSelectors.get(0) as ClassSelector).name)
      	
        
 	}
 	
 	@Test
 	def testColonNotProblem() {
 		val model = parse('''
 		.a {
 			property:none;
 		}
 		.b {
 			property:nice;
 		}
 		''')
 		
 		assertNotNull(model)
 		
 		val declA = model.ruleset.get(0).declarations.get(0)
 		val declB = model.ruleset.get(1).declarations.get(0)
      	
      	println(declA)
      	println(declB)
        
        return
 	}
 	
 	
}