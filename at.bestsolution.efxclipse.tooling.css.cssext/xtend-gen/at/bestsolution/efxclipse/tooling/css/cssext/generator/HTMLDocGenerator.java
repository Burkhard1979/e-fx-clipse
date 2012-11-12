package at.bestsolution.efxclipse.tooling.css.cssext.generator;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Definition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PseudoClassDefinition;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class HTMLDocGenerator {
  public CharSequence generate(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _leadin = this.leadin();
    _builder.append(_leadin, "");
    _builder.newLineIfNotEmpty();
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    CharSequence _navbar = this.navbar("JavaFX CSS", ((CssExtension) _get));
    _builder.append(_navbar, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"container-fluid\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"row-fluid\">");
    _builder.newLine();
    _builder.append("\t\t");
    EList<EObject> _contents_1 = resource.getContents();
    EObject _get_1 = _contents_1.get(0);
    CharSequence _sidebar = this.sidebar(((CssExtension) _get_1));
    _builder.append(_sidebar, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    EList<EObject> _contents_2 = resource.getContents();
    EObject _get_2 = _contents_2.get(0);
    CharSequence _contentArea = this.contentArea(((CssExtension) _get_2));
    _builder.append(_contentArea, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    CharSequence _leadout = this.leadout();
    _builder.append(_leadout, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence leadin() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>CSS Documentation</title>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- Le styles -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"http://twitter.github.com/bootstrap/assets/css/bootstrap.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"http://twitter.github.com/bootstrap/assets/js/google-code-prettify/prettify.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("body {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("padding-top: 60px;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("padding-bottom: 40px;");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(".sidebar-nav {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("padding: 9px 0;");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(".bs-docs-description:after {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background-color: #F5F5F5;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("border: 1px solid #DDDDDD;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("border-radius: 4px 0 4px 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("color: #9DA0A4;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("content: \"Description\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("font-size: 12px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("font-weight: bold;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("left: -1px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("padding: 3px 7px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("position: absolute;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("top: -1px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".bs-docs-description {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("background-color: #FFFFFF;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("border: 1px solid #DDDDDD;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("border-radius: 4px 4px 4px 4px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("margin: 15px 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("padding: 39px 19px 14px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("position: relative;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".bs-href {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color: inherit;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append(".bs-href:hover {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color: #0088CC;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence navbar(final String name, final CssExtension cssExt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"navbar navbar-inverse navbar-fixed-top\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"navbar-inner\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"container-fluid\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<a class=\"brand\" href=\"#\">");
    _builder.append(name, "			");
    _builder.append("</a>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<ul class=\"nav\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<li class=\"active\"><a href=\"#\">Home</a></li>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<li class=\"dropdown\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Elements");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<b class=\"caret\"></b>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</a>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<ul class=\"dropdown-menu\">");
    _builder.newLine();
    {
      TreeIterator<EObject> _eAllContents = cssExt.eAllContents();
      Iterator<PackageDefinition> _filter = Iterators.<PackageDefinition>filter(_eAllContents, PackageDefinition.class);
      final Function1<PackageDefinition,Boolean> _function = new Function1<PackageDefinition,Boolean>() {
          public Boolean apply(final PackageDefinition e) {
            EList<ElementDefinition> _elements = e.getElements();
            boolean _isEmpty = _elements.isEmpty();
            boolean _not = (!_isEmpty);
            return Boolean.valueOf(_not);
          }
        };
      Iterator<PackageDefinition> _filter_1 = IteratorExtensions.<PackageDefinition>filter(_filter, _function);
      List<PackageDefinition> _list = IteratorExtensions.<PackageDefinition>toList(_filter_1);
      for(final PackageDefinition j : _list) {
        _builder.append("\t\t\t\t\t\t");
        EList<ElementDefinition> _elements = ((PackageDefinition) j).getElements();
        ArrayList<List<ElementDefinition>> splitted = this.splitUp(_elements, 15);
        _builder.newLineIfNotEmpty();
        {
          for(final List<ElementDefinition> elements : splitted) {
            _builder.append("\t\t\t\t\t\t");
            _builder.append("<li class=\"dropdown-submenu\">");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("<a href=\"#pack_");
            String _calcPackagename = this.calcPackagename(j);
            _builder.append(_calcPackagename, "							");
            _builder.append("\">");
            String _calcPackagename_1 = this.calcPackagename(j);
            _builder.append(_calcPackagename_1, "							");
            {
              int _size = splitted.size();
              boolean _greaterThan = (_size > 1);
              if (_greaterThan) {
                _builder.append(" - ");
                int _indexOf = splitted.indexOf(elements);
                int _plus = (_indexOf + 1);
                _builder.append(_plus, "							");
              }
            }
            _builder.append("</a>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("<ul class=\"dropdown-menu\">");
            _builder.newLine();
            {
              for(final ElementDefinition c : elements) {
                _builder.append("\t\t\t\t\t\t");
                _builder.append("\t\t");
                _builder.append("<li><a href=\'#el_");
                EObject _eContainer = c.eContainer();
                String _calcPackagename_2 = this.calcPackagename(((PackageDefinition) _eContainer));
                _builder.append(_calcPackagename_2, "								");
                _builder.append(".");
                String _name = c.getName();
                _builder.append(_name, "								");
                _builder.append("\'>");
                String _name_1 = c.getName();
                _builder.append(_name_1, "								");
                _builder.append("</a></li>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("</ul>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("</li>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public ArrayList<List<ElementDefinition>> splitUp(final List<ElementDefinition> elements, final int max) {
    ArrayList<List<ElementDefinition>> _arrayList = new ArrayList<List<ElementDefinition>>();
    final ArrayList<List<ElementDefinition>> rv = _arrayList;
    ArrayList<ElementDefinition> _arrayList_1 = new ArrayList<ElementDefinition>();
    ArrayList<ElementDefinition> currentList = _arrayList_1;
    int i = 0;
    for (final ElementDefinition e : elements) {
      {
        int _modulo = (i % max);
        boolean _equals = (_modulo == 0);
        if (_equals) {
          ArrayList<ElementDefinition> _arrayList_2 = new ArrayList<ElementDefinition>();
          currentList = _arrayList_2;
          rv.add(currentList);
        }
        currentList.add(e);
        int _plus = (i + 1);
        i = _plus;
      }
    }
    return rv;
  }
  
  public CharSequence sidebar(final CssExtension cssExt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"span3\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"well sidebar-nav\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul class=\"nav nav-list\">");
    _builder.newLine();
    {
      TreeIterator<EObject> _eAllContents = cssExt.eAllContents();
      Iterator<PackageDefinition> _filter = Iterators.<PackageDefinition>filter(_eAllContents, PackageDefinition.class);
      List<PackageDefinition> _list = IteratorExtensions.<PackageDefinition>toList(_filter);
      for(final PackageDefinition j : _list) {
        _builder.append("\t\t\t");
        _builder.append("<li class=\"nav-header\">");
        String _calcPackagename = this.calcPackagename(j);
        _builder.append(_calcPackagename, "			");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
        {
          EList<ElementDefinition> _elements = ((PackageDefinition) j).getElements();
          for(final ElementDefinition c : _elements) {
            _builder.append("\t\t\t");
            _builder.append("<li><a href=\'#el_");
            EObject _eContainer = c.eContainer();
            String _calcPackagename_1 = this.calcPackagename(((PackageDefinition) _eContainer));
            _builder.append(_calcPackagename_1, "			");
            _builder.append(".");
            String _name = c.getName();
            _builder.append(_name, "			");
            _builder.append("\'>");
            String _name_1 = c.getName();
            _builder.append(_name_1, "			");
            _builder.append("</a></li>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence contentArea(final CssExtension cssExt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"span9\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"hero-unit\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>JavaFX CSS Documentation</h1>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    {
      TreeIterator<EObject> _eAllContents = cssExt.eAllContents();
      Iterator<PackageDefinition> _filter = Iterators.<PackageDefinition>filter(_eAllContents, PackageDefinition.class);
      List<PackageDefinition> _list = IteratorExtensions.<PackageDefinition>toList(_filter);
      for(final PackageDefinition j : _list) {
        CharSequence _packageContent = this.packageContent(j);
        _builder.append(_packageContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence packageContent(final PackageDefinition p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<section id=\"global\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<a name=\"pack_");
    String _calcPackagename = this.calcPackagename(p);
    _builder.append(_calcPackagename, "		");
    _builder.append("\"></a><h1>");
    String _calcPackagename_1 = this.calcPackagename(p);
    _builder.append(_calcPackagename_1, "		");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2>Rules</h2>");
    _builder.newLine();
    {
      EList<Definition> _rules = p.getRules();
      for(final Definition r : _rules) {
        _builder.append("\t");
        _builder.append("<a name=\"r_");
        String _calcPackagename_2 = this.calcPackagename(p);
        String _plus = (_calcPackagename_2 + ".");
        String _name = r.getName();
        String _plus_1 = (_plus + _name);
        _builder.append(_plus_1, "	");
        _builder.append("\"></a>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<h3>");
        String _name_1 = r.getName();
        _builder.append(_name_1, "	");
        _builder.append("</h3>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div style=\"padding-left: 40px;\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<code>");
        {
          CSSRule _rule = r.getRule();
          boolean _notEquals = (!Objects.equal(_rule, null));
          if (_notEquals) {
            CSSRule _rule_1 = r.getRule();
            String _translateRule = this.translateRule(_rule_1);
            _builder.append(_translateRule, "		");
          } else {
            CSSRule _func = ((CSSRuleDefinition) r).getFunc();
            String _name_2 = ((CSSRuleFunc) _func).getName();
            _builder.append(_name_2, "		");
            _builder.append("(");
            CSSRule _func_1 = ((CSSRuleDefinition) r).getFunc();
            CSSRule _params = ((CSSRuleFunc) _func_1).getParams();
            String _translateRule_1 = this.translateRule(_params);
            _builder.append(_translateRule_1, "		");
            _builder.append(")");
          }
        }
        _builder.append("</code>");
        _builder.newLineIfNotEmpty();
        {
          Doku _doku = r.getDoku();
          boolean _notEquals_1 = (!Objects.equal(_doku, null));
          if (_notEquals_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<div class=\"bs-docs-description\">");
            Doku _doku_1 = r==null?(Doku)null:r.getDoku();
            String _content = _doku_1==null?(String)null:_doku_1.getContent();
            String _fixJDoc = _content==null?(String)null:this.fixJDoc(_content);
            _builder.append(_fixJDoc, "		");
            _builder.append("</div>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("<h2>Elements</h2>");
    _builder.newLine();
    {
      EList<ElementDefinition> _elements = p.getElements();
      for(final ElementDefinition e : _elements) {
        _builder.append("\t");
        _builder.append("<a name=\"el_");
        String _calcPackagename_3 = this.calcPackagename(p);
        String _plus_2 = (_calcPackagename_3 + ".");
        String _name_3 = e.getName();
        String _plus_3 = (_plus_2 + _name_3);
        _builder.append(_plus_3, "	");
        _builder.append("\"></a>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<h3>");
        String _name_4 = e.getName();
        _builder.append(_name_4, "	");
        {
          EList<ElementDefinition> _super = e.getSuper();
          boolean _isEmpty = _super.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("  <small>extends ");
            EList<ElementDefinition> _super_1 = e.getSuper();
            final Function1<ElementDefinition,String> _function = new Function1<ElementDefinition,String>() {
                public String apply(final ElementDefinition el) {
                  EObject _eContainer = el.eContainer();
                  String _calcPackagename = HTMLDocGenerator.this.calcPackagename(((PackageDefinition) _eContainer));
                  String _plus = ("<a class=\'bs-href\' href=\'#el_" + _calcPackagename);
                  String _plus_1 = (_plus + ".");
                  String _name = el.getName();
                  String _plus_2 = (_plus_1 + _name);
                  String _plus_3 = (_plus_2 + "\'>");
                  String _name_1 = el.getName();
                  String _plus_4 = (_plus_3 + _name_1);
                  String _plus_5 = (_plus_4 + "</a>");
                  return _plus_5;
                }
              };
            List<String> _map = ListExtensions.<ElementDefinition, String>map(_super_1, _function);
            String _join = IterableExtensions.join(_map, ",");
            _builder.append(_join, "	");
            _builder.append("</small>");
          }
        }
        _builder.append("</h3>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div style=\"padding-left: 40px;\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"accordion\" id=\"ac_");
        String _calcPackagename_4 = this.calcPackagename(p);
        String _replace = _calcPackagename_4.replace(".", "_");
        String _plus_4 = (_replace + "_");
        String _name_5 = e.getName();
        String _plus_5 = (_plus_4 + _name_5);
        _builder.append(_plus_5, "		");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<div class=\"accordion-group\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<div class=\"accordion-heading\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("<a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#ac_");
        String _calcPackagename_5 = this.calcPackagename(p);
        String _replace_1 = _calcPackagename_5.replace(".", "_");
        String _plus_6 = (_replace_1 + "_");
        String _name_6 = e.getName();
        String _plus_7 = (_plus_6 + _name_6);
        _builder.append(_plus_7, "					");
        _builder.append("\" href=\"#desc_");
        String _calcPackagename_6 = this.calcPackagename(p);
        String _replace_2 = _calcPackagename_6.replace(".", "_");
        String _plus_8 = (_replace_2 + "_");
        String _name_7 = e.getName();
        String _plus_9 = (_plus_8 + _name_7);
        _builder.append(_plus_9, "					");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t");
        _builder.append("Description");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("</a>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<div id=\"desc_");
        String _calcPackagename_7 = this.calcPackagename(p);
        String _replace_3 = _calcPackagename_7.replace(".", "_");
        String _plus_10 = (_replace_3 + "_");
        String _name_8 = e.getName();
        String _plus_11 = (_plus_10 + _name_8);
        _builder.append(_plus_11, "				");
        _builder.append("\" class=\"accordion-body collapse\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("<div class=\"accordion-inner\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t");
        Doku _doku_2 = e==null?(Doku)null:e.getDoku();
        String _content_1 = _doku_2==null?(String)null:_doku_2.getContent();
        String _fixJDoc_1 = _content_1==null?(String)null:this.fixJDoc(_content_1);
        _builder.append(_fixJDoc_1, "						");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
        {
          EList<Definition> _properties = e.getProperties();
          boolean _isEmpty_1 = _properties.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<div class=\"accordion-group\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div class=\"accordion-heading\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#ac_");
            String _calcPackagename_8 = this.calcPackagename(p);
            String _replace_4 = _calcPackagename_8.replace(".", "_");
            String _plus_12 = (_replace_4 + "_");
            String _name_9 = e.getName();
            String _plus_13 = (_plus_12 + _name_9);
            _builder.append(_plus_13, "					");
            _builder.append("\" href=\"#props_");
            String _calcPackagename_9 = this.calcPackagename(p);
            String _replace_5 = _calcPackagename_9.replace(".", "_");
            String _plus_14 = (_replace_5 + "_");
            String _name_10 = e.getName();
            String _plus_15 = (_plus_14 + _name_10);
            _builder.append(_plus_15, "					");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Properties");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</a>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div id=\"props_");
            String _calcPackagename_10 = this.calcPackagename(p);
            String _replace_6 = _calcPackagename_10.replace(".", "_");
            String _plus_16 = (_replace_6 + "_");
            String _name_11 = e.getName();
            String _plus_17 = (_plus_16 + _name_11);
            _builder.append(_plus_17, "				");
            _builder.append("\" class=\"accordion-body collapse\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<table class=\"table table-bordered table-striped\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Property</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Definition</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Default</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Description</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              EList<Definition> _properties_1 = e.getProperties();
              for(final Definition prop : _properties_1) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("<tr>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<td><nobr>");
                String _name_12 = prop.getName();
                _builder.append(_name_12, "								");
                _builder.append("</nobr></td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<td>");
                CSSRule _rule_2 = prop.getRule();
                String _translateRule_2 = this.translateRule(_rule_2);
                _builder.append(_translateRule_2, "								");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<td>");
                CSSDefaultValue _default = ((PropertyDefinition) prop)==null?(CSSDefaultValue)null:((PropertyDefinition) prop).getDefault();
                String _calcDefault = _default==null?(String)null:this.calcDefault(_default);
                _builder.append(_calcDefault, "								");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("\t");
                _builder.append("<td>");
                Doku _doku_3 = prop==null?(Doku)null:prop.getDoku();
                String _content_2 = _doku_3==null?(String)null:_doku_3.getContent();
                String _fixJDoc_2 = _content_2==null?(String)null:this.fixJDoc(_content_2);
                _builder.append(_fixJDoc_2, "								");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("</tr>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</table>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
        {
          HashSet<ElementDefinition> _allSuperElements = this.allSuperElements(e);
          boolean _isEmpty_2 = _allSuperElements.isEmpty();
          boolean _not_2 = (!_isEmpty_2);
          if (_not_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<div class=\"accordion-group\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div class=\"accordion-heading\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#ac_");
            String _calcPackagename_11 = this.calcPackagename(p);
            String _replace_7 = _calcPackagename_11.replace(".", "_");
            String _plus_18 = (_replace_7 + "_");
            String _name_13 = e.getName();
            String _plus_19 = (_plus_18 + _name_13);
            _builder.append(_plus_19, "					");
            _builder.append("\" href=\"#props_");
            String _calcPackagename_12 = this.calcPackagename(p);
            String _replace_8 = _calcPackagename_12.replace(".", "_");
            String _plus_20 = (_replace_8 + "_");
            String _name_14 = e.getName();
            String _plus_21 = (_plus_20 + _name_14);
            _builder.append(_plus_21, "					");
            _builder.append("_inherited\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Inherited Properties");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</a>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div id=\"props_");
            String _calcPackagename_13 = this.calcPackagename(p);
            String _replace_9 = _calcPackagename_13.replace(".", "_");
            String _plus_22 = (_replace_9 + "_");
            String _name_15 = e.getName();
            String _plus_23 = (_plus_22 + _name_15);
            _builder.append(_plus_23, "				");
            _builder.append("_inherited\" class=\"accordion-body collapse\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<table class=\"table table-bordered table-striped\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Element</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Property</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Definition</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Default</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Description</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              HashSet<ElementDefinition> _allSuperElements_1 = this.allSuperElements(e);
              for(final ElementDefinition su : _allSuperElements_1) {
                {
                  EList<Definition> _properties_2 = ((ElementDefinition) su).getProperties();
                  for(final Definition prop_1 : _properties_2) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("<tr>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    {
                      EList<Definition> _properties_3 = ((ElementDefinition) su).getProperties();
                      Definition _get = _properties_3.get(0);
                      boolean _equals = Objects.equal(_get, prop_1);
                      if (_equals) {
                        _builder.append("<nobr>");
                        String _name_16 = ((ElementDefinition) su).getName();
                        _builder.append(_name_16, "								");
                        _builder.append("</nobr>");
                      }
                    }
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td><nobr>");
                    String _name_17 = prop_1.getName();
                    _builder.append(_name_17, "								");
                    _builder.append("</nobr></td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    CSSRule _rule_3 = prop_1.getRule();
                    String _translateRule_3 = this.translateRule(_rule_3);
                    _builder.append(_translateRule_3, "								");
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    CSSDefaultValue _default_1 = ((PropertyDefinition) prop_1)==null?(CSSDefaultValue)null:((PropertyDefinition) prop_1).getDefault();
                    String _calcDefault_1 = _default_1==null?(String)null:this.calcDefault(_default_1);
                    _builder.append(_calcDefault_1, "								");
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    Doku _doku_4 = prop_1==null?(Doku)null:prop_1.getDoku();
                    String _content_3 = _doku_4==null?(String)null:_doku_4.getContent();
                    String _fixJDoc_3 = _content_3==null?(String)null:this.fixJDoc(_content_3);
                    _builder.append(_fixJDoc_3, "								");
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t\t");
                    _builder.append("</tr>");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</table>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
        {
          EList<PseudoClassDefinition> _pseudoClasses = e.getPseudoClasses();
          boolean _isEmpty_3 = _pseudoClasses.isEmpty();
          boolean _not_3 = (!_isEmpty_3);
          if (_not_3) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<div class=\"accordion-group\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div class=\"accordion-heading\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#ac_");
            String _calcPackagename_14 = this.calcPackagename(p);
            String _replace_10 = _calcPackagename_14.replace(".", "_");
            String _plus_24 = (_replace_10 + "_");
            String _name_18 = e.getName();
            String _plus_25 = (_plus_24 + _name_18);
            _builder.append(_plus_25, "					");
            _builder.append("\" href=\"#pseudo_");
            String _calcPackagename_15 = this.calcPackagename(p);
            String _replace_11 = _calcPackagename_15.replace(".", "_");
            String _plus_26 = (_replace_11 + "_");
            String _name_19 = e.getName();
            String _plus_27 = (_plus_26 + _name_19);
            _builder.append(_plus_27, "					");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Pseudo-Classes");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</a>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div id=\"pseudo_");
            String _calcPackagename_16 = this.calcPackagename(p);
            String _replace_12 = _calcPackagename_16.replace(".", "_");
            String _plus_28 = (_replace_12 + "_");
            String _name_20 = e.getName();
            String _plus_29 = (_plus_28 + _name_20);
            _builder.append(_plus_29, "				");
            _builder.append("\" class=\"accordion-body collapse\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<table class=\"table table-bordered table-striped\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Name</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Definition</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              EList<PseudoClassDefinition> _pseudoClasses_1 = e.getPseudoClasses();
              for(final PseudoClassDefinition pseudo : _pseudoClasses_1) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("<tr>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("<td>");
                String _name_21 = pseudo.getName();
                _builder.append(_name_21, "							");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("<td>");
                Doku _doku_5 = pseudo==null?(Doku)null:pseudo.getDoku();
                String _content_4 = _doku_5==null?(String)null:_doku_5.getContent();
                String _fixJDoc_4 = _content_4==null?(String)null:this.fixJDoc(_content_4);
                _builder.append(_fixJDoc_4, "							");
                _builder.append("</td>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("</tr>");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</table>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
        {
          HashSet<ElementDefinition> _allSuperElements_2 = this.allSuperElements(e);
          boolean _isEmpty_4 = _allSuperElements_2.isEmpty();
          boolean _not_4 = (!_isEmpty_4);
          if (_not_4) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<div class=\"accordion-group\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div class=\"accordion-heading\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<a class=\"accordion-toggle\" data-toggle=\"collapse\" data-parent=\"#ac_");
            String _calcPackagename_17 = this.calcPackagename(p);
            String _replace_13 = _calcPackagename_17.replace(".", "_");
            String _plus_30 = (_replace_13 + "_");
            String _name_22 = e.getName();
            String _plus_31 = (_plus_30 + _name_22);
            _builder.append(_plus_31, "					");
            _builder.append("\" href=\"#pseudo_");
            String _calcPackagename_18 = this.calcPackagename(p);
            String _replace_14 = _calcPackagename_18.replace(".", "_");
            String _plus_32 = (_replace_14 + "_");
            String _name_23 = e.getName();
            String _plus_33 = (_plus_32 + _name_23);
            _builder.append(_plus_33, "					");
            _builder.append("_inherited\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Inherited Pseudo-Classes");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</a>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<div id=\"pseudo_");
            String _calcPackagename_19 = this.calcPackagename(p);
            String _replace_15 = _calcPackagename_19.replace(".", "_");
            String _plus_34 = (_replace_15 + "_");
            String _name_24 = e.getName();
            String _plus_35 = (_plus_34 + _name_24);
            _builder.append(_plus_35, "				");
            _builder.append("_inherited\" class=\"accordion-body collapse\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("<table class=\"table table-bordered table-striped\">");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Element</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Name</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("<th>Definition</th>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("</tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</thead>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("<tbody>");
            _builder.newLine();
            {
              HashSet<ElementDefinition> _allSuperElements_3 = this.allSuperElements(e);
              for(final ElementDefinition su_1 : _allSuperElements_3) {
                {
                  EList<PseudoClassDefinition> _pseudoClasses_2 = su_1.getPseudoClasses();
                  for(final PseudoClassDefinition pseudo_1 : _pseudoClasses_2) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t");
                    _builder.append("<tr>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    {
                      EList<PseudoClassDefinition> _pseudoClasses_3 = ((ElementDefinition) su_1).getPseudoClasses();
                      PseudoClassDefinition _get_1 = _pseudoClasses_3.get(0);
                      boolean _equals_1 = Objects.equal(_get_1, pseudo_1);
                      if (_equals_1) {
                        _builder.append("<nobr>");
                        String _name_25 = ((ElementDefinition) su_1).getName();
                        _builder.append(_name_25, "							");
                        _builder.append("</nobr>");
                      }
                    }
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    String _name_26 = pseudo_1.getName();
                    _builder.append(_name_26, "							");
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("<td>");
                    Doku _doku_6 = pseudo_1==null?(Doku)null:pseudo_1.getDoku();
                    String _content_5 = _doku_6==null?(String)null:_doku_6.getContent();
                    String _fixJDoc_5 = _content_5==null?(String)null:this.fixJDoc(_content_5);
                    _builder.append(_fixJDoc_5, "							");
                    _builder.append("</td>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t\t");
                    _builder.append("\t\t\t");
                    _builder.append("</tr>");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("</tbody>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("</table>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("</div>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("</section>");
    _builder.newLine();
    return _builder;
  }
  
  public HashSet<ElementDefinition> allSuperElements(final ElementDefinition definition) {
    HashSet<ElementDefinition> _hashSet = new HashSet<ElementDefinition>();
    final HashSet<ElementDefinition> set = _hashSet;
    EList<ElementDefinition> _super = definition.getSuper();
    for (final ElementDefinition su : _super) {
      {
        set.add(su);
        HashSet<ElementDefinition> _allSuperElements = this.allSuperElements(su);
        set.addAll(_allSuperElements);
      }
    }
    return set;
  }
  
  public String calcDefault(final CSSDefaultValue defaultValue) {
    CSSRule _val = defaultValue.getVal();
    boolean _notEquals = (!Objects.equal(_val, null));
    if (_notEquals) {
      CSSRule _val_1 = defaultValue.getVal();
      return this.translateRule(_val_1);
    } else {
      String _sval = defaultValue.getSval();
      boolean _notEquals_1 = (!Objects.equal(_sval, null));
      if (_notEquals_1) {
        String _sval_1 = defaultValue.getSval();
        String _plus = ("\"" + _sval_1);
        return (_plus + "\"");
      } else {
        int _ival = defaultValue.getIval();
        boolean _notEquals_2 = (_ival != 0);
        if (_notEquals_2) {
          int _ival_1 = defaultValue.getIval();
          return (Integer.valueOf(_ival_1) + "");
        } else {
          double _dval = defaultValue.getDval();
          return (Double.valueOf(_dval) + "");
        }
      }
    }
  }
  
  public String calcPackagename(final PackageDefinition p) {
    String rv = p.getName();
    PackageDefinition parent = p;
    EObject _eContainer = parent.eContainer();
    boolean _while = (_eContainer instanceof PackageDefinition);
    while (_while) {
      {
        EObject _eContainer_1 = parent.eContainer();
        parent = ((PackageDefinition) _eContainer_1);
        String _name = parent.getName();
        String _plus = (_name + ".");
        String _plus_1 = (_plus + rv);
        rv = _plus_1;
      }
      EObject _eContainer_1 = parent.eContainer();
      _while = (_eContainer_1 instanceof PackageDefinition);
    }
    return rv;
  }
  
  public String fixJDoc(final String doc) {
    StringBuffer _stringBuffer = new StringBuffer();
    final StringBuffer result = _stringBuffer;
    StringTokenizer _stringTokenizer = new StringTokenizer(doc, "\r\n");
    final StringTokenizer linetokenizer = _stringTokenizer;
    boolean _hasMoreElements = linetokenizer.hasMoreElements();
    boolean _while = _hasMoreElements;
    while (_while) {
      {
        String line = linetokenizer.nextToken();
        String _replaceFirst = line.replaceFirst("^/[*][*]", "");
        line = _replaceFirst;
        String _replaceFirst_1 = line.replaceFirst("[*][/]$", "");
        line = _replaceFirst_1;
        String _replaceFirst_2 = line.replaceFirst("^.*[*]\t*", "");
        line = _replaceFirst_2;
        boolean _and = false;
        int _length = line.length();
        boolean _equals = (_length == 0);
        if (!_equals) {
          _and = false;
        } else {
          int _length_1 = result.length();
          boolean _greaterThan = (_length_1 > 0);
          _and = (_equals && _greaterThan);
        }
        if (_and) {
          result.append("<br/>");
        } else {
          result.append(line);
        }
      }
      boolean _hasMoreElements_1 = linetokenizer.hasMoreElements();
      _while = _hasMoreElements_1;
    }
    return result.toString();
  }
  
  public String translateRule(final CSSRule r) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder result = _stringBuilder;
    if ((r instanceof CSSRuleOr)) {
      EList<CSSRule> _ors = ((CSSRuleOr) r).getOrs();
      final Iterator<CSSRule> iterator = _ors.iterator();
      boolean _hasNext = iterator.hasNext();
      boolean _while = _hasNext;
      while (_while) {
        {
          CSSRule _next = iterator.next();
          String _translateRule = this.translateRule(_next);
          result.append(_translateRule);
          boolean _hasNext_1 = iterator.hasNext();
          if (_hasNext_1) {
            result.append(" | ");
          }
        }
        boolean _hasNext_1 = iterator.hasNext();
        _while = _hasNext_1;
      }
    } else {
      if ((r instanceof CSSRuleConcat)) {
        EList<CSSRule> _conc = ((CSSRuleConcat) r).getConc();
        final Iterator<CSSRule> iterator_1 = _conc.iterator();
        boolean _hasNext_1 = iterator_1.hasNext();
        boolean _while_1 = _hasNext_1;
        while (_while_1) {
          {
            CSSRule _next = iterator_1.next();
            String _translateRule = this.translateRule(_next);
            result.append(_translateRule);
            boolean _hasNext_2 = iterator_1.hasNext();
            if (_hasNext_2) {
              result.append(" ");
            }
          }
          boolean _hasNext_2 = iterator_1.hasNext();
          _while_1 = _hasNext_2;
        }
      } else {
        if ((r instanceof CSSRuleBracket)) {
          CSSRule _inner = ((CSSRuleBracket) r).getInner();
          String _translateRule = this.translateRule(_inner);
          String _plus = ("[ " + _translateRule);
          String _plus_1 = (_plus + " ]");
          result.append(_plus_1);
        } else {
          if ((r instanceof CSSRuleXor)) {
            EList<CSSRule> _xors = ((CSSRuleXor) r).getXors();
            final Iterator<CSSRule> iterator_2 = _xors.iterator();
            boolean _hasNext_2 = iterator_2.hasNext();
            boolean _while_2 = _hasNext_2;
            while (_while_2) {
              {
                CSSRule _next = iterator_2.next();
                String _translateRule_1 = this.translateRule(_next);
                result.append(_translateRule_1);
                boolean _hasNext_3 = iterator_2.hasNext();
                if (_hasNext_3) {
                  result.append(" || ");
                }
              }
              boolean _hasNext_3 = iterator_2.hasNext();
              _while_2 = _hasNext_3;
            }
          } else {
            if ((r instanceof CSSRuleLiteral)) {
              String _value = ((CSSRuleLiteral) r).getValue();
              result.append(_value);
            } else {
              if ((r instanceof CSSNumLiteral)) {
                int _value_1 = ((CSSNumLiteral) r).getValue();
                result.append(_value_1);
              } else {
                if ((r instanceof CSSRuleRef)) {
                  final CSSRuleRef ref = ((CSSRuleRef) r);
                  Definition _ref = ref.getRef();
                  EObject _findpackage = this.findpackage(_ref);
                  String _calcPackagename = this.calcPackagename(((PackageDefinition) _findpackage));
                  String _plus_2 = ("&lt;<a class=\'bs-href\' href=\'#r_" + _calcPackagename);
                  String _plus_3 = (_plus_2 + ".");
                  Definition _ref_1 = ref.getRef();
                  String _name = _ref_1.getName();
                  String _plus_4 = (_plus_3 + _name);
                  String _plus_5 = (_plus_4 + "\'>");
                  Definition _ref_2 = ref.getRef();
                  String _name_1 = _ref_2.getName();
                  String _plus_6 = (_plus_5 + _name_1);
                  String _plus_7 = (_plus_6 + "</a>&gt;");
                  result.append(_plus_7);
                } else {
                  if ((r instanceof CSSRulePostfix)) {
                    CSSRule _rule = ((CSSRulePostfix) r).getRule();
                    String _translateRule_1 = this.translateRule(_rule);
                    String _cardinality = ((CSSRulePostfix) r).getCardinality();
                    String _plus_8 = (_translateRule_1 + _cardinality);
                    result.append(_plus_8);
                  } else {
                    if ((r instanceof CSSRuleRegex)) {
                      String _regex = ((CSSRuleRegex) r).getRegex();
                      result.append(_regex);
                    } else {
                      if ((r instanceof CSSRuleSymbol)) {
                        String _symbol = ((CSSRuleSymbol) r).getSymbol();
                        result.append(_symbol);
                      } else {
                        boolean _equals = Objects.equal(r, null);
                        if (_equals) {
                          return "null";
                        } else {
                          return r.getType();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return result.toString();
  }
  
  public EObject findpackage(final Definition rule) {
    EObject e = rule.eContainer();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(e, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _not = (!(e instanceof PackageDefinition));
      _and = (_notEquals && _not);
    }
    boolean _while = _and;
    while (_while) {
      EObject _eContainer = e.eContainer();
      e = _eContainer;
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(e, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _not_1 = (!(e instanceof PackageDefinition));
        _and_1 = (_notEquals_1 && _not_1);
      }
      _while = _and_1;
    }
    return e;
  }
  
  public CharSequence leadout() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/jquery.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-transition.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-alert.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-modal.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-scrollspy.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-tab.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-tooltip.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-popover.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-button.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-collapse.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-carousel.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-typeahead.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"http://twitter.github.com/bootstrap/assets/js/bootstrap-affix.js\">");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
