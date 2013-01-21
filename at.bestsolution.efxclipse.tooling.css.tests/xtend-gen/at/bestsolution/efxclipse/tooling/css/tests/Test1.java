package at.bestsolution.efxclipse.tooling.css.tests;

import at.bestsolution.efxclipse.tooling.css.CssDslInjectorProvider;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ClassSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ElementSelector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = CssDslInjectorProvider.class)
@SuppressWarnings("all")
public class Test1 {
  @Inject
  private IGenerator generator;
  
  @Inject
  private ParseHelper<stylesheet> parseHelper;
  
  public stylesheet parse(final String inputString) {
    try {
      stylesheet _xblockexpression = null;
      {
        final stylesheet model = this.parseHelper.parse(inputString);
        InMemoryFileSystemAccess _inMemoryFileSystemAccess = new InMemoryFileSystemAccess();
        final InMemoryFileSystemAccess fsa = _inMemoryFileSystemAccess;
        Resource _eResource = model.eResource();
        this.generator.doGenerate(_eResource, fsa);
        _xblockexpression = (model);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleElementSelector() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ElementSelector {}");
    _builder.newLine();
    final stylesheet model = this.parse(_builder.toString());
    EList<ruleset> _ruleset = model.getRuleset();
    final ruleset rs = _ruleset.get(0);
    EList<selector> _selectors = rs.getSelectors();
    final selector sel = _selectors.get(0);
    EList<simple_selector> _simpleselectors = sel.getSimpleselectors();
    final simple_selector simpleSel = _simpleselectors.get(0);
    ElementSelector _element = simpleSel.getElement();
    Assert.assertNotNull(_element);
    ElementSelector _element_1 = simpleSel.getElement();
    String _name = _element_1.getName();
    Assert.assertEquals("ElementSelector", _name);
  }
  
  @Test
  public void testSimpleClassSelector() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".ClassSelector {}");
    _builder.newLine();
    final stylesheet model = this.parse(_builder.toString());
    EList<ruleset> _ruleset = model.getRuleset();
    final ruleset rs = _ruleset.get(0);
    EList<selector> _selectors = rs.getSelectors();
    final selector sel = _selectors.get(0);
    EList<simple_selector> _simpleselectors = sel.getSimpleselectors();
    final simple_selector simpleSel = _simpleselectors.get(0);
    EList<CssSelector> _subSelectors = simpleSel.getSubSelectors();
    int _size = _subSelectors.size();
    Assert.assertNotSame(Integer.valueOf(0), Integer.valueOf(_size));
    EList<CssSelector> _subSelectors_1 = simpleSel.getSubSelectors();
    CssSelector _get = _subSelectors_1.get(0);
    final ClassSelector subsel = ((ClassSelector) _get);
    String _name = subsel.getName();
    Assert.assertEquals("ClassSelector", _name);
  }
  
  @Test
  public void testURProblem() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".future {}");
    _builder.newLine();
    _builder.append(".current {}");
    _builder.newLine();
    final stylesheet model = this.parse(_builder.toString());
    Assert.assertNotNull(model);
    EList<ruleset> _ruleset = model.getRuleset();
    ruleset _get = _ruleset.get(0);
    EList<selector> _selectors = _get.getSelectors();
    selector _get_1 = _selectors.get(0);
    EList<simple_selector> _simpleselectors = _get_1.getSimpleselectors();
    final simple_selector simpleSel1 = _simpleselectors.get(0);
    EList<CssSelector> _subSelectors = simpleSel1.getSubSelectors();
    int _size = _subSelectors.size();
    Assert.assertNotSame(Integer.valueOf(0), Integer.valueOf(_size));
    EList<CssSelector> _subSelectors_1 = simpleSel1.getSubSelectors();
    CssSelector _get_2 = _subSelectors_1.get(0);
    final ClassSelector subsel = ((ClassSelector) _get_2);
    String _name = subsel.getName();
    Assert.assertEquals("future", _name);
    EList<ruleset> _ruleset_1 = model.getRuleset();
    ruleset _get_3 = _ruleset_1.get(1);
    EList<selector> _selectors_1 = _get_3.getSelectors();
    selector _get_4 = _selectors_1.get(0);
    EList<simple_selector> _simpleselectors_1 = _get_4.getSimpleselectors();
    simple_selector _get_5 = _simpleselectors_1.get(0);
    EList<CssSelector> _subSelectors_2 = _get_5.getSubSelectors();
    CssSelector _get_6 = _subSelectors_2.get(0);
    String _name_1 = ((ClassSelector) _get_6).getName();
    Assert.assertEquals("current", _name_1);
  }
  
  @Test
  public void testColonNotProblem() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".a {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("property:none;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".b {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("property:nice;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final stylesheet model = this.parse(_builder.toString());
    Assert.assertNotNull(model);
    EList<ruleset> _ruleset = model.getRuleset();
    ruleset _get = _ruleset.get(0);
    EList<css_declaration> _declarations = _get.getDeclarations();
    final css_declaration declA = _declarations.get(0);
    EList<ruleset> _ruleset_1 = model.getRuleset();
    ruleset _get_1 = _ruleset_1.get(1);
    EList<css_declaration> _declarations_1 = _get_1.getDeclarations();
    final css_declaration declB = _declarations_1.get(0);
    InputOutput.<css_declaration>println(declA);
    InputOutput.<css_declaration>println(declB);
    return;
  }
}
