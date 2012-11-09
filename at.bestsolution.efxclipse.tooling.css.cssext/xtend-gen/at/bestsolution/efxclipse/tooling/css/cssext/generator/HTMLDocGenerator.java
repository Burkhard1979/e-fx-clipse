package at.bestsolution.efxclipse.tooling.css.cssext.generator;

import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleId;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.Doku;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition;
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PropertyDefinition;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class HTMLDocGenerator {
  public CharSequence generate(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _leadin = this.leadin();
    _builder.append(_leadin, "");
    _builder.newLineIfNotEmpty();
    CharSequence _navbar = this.navbar("JavaFX CSS");
    _builder.append(_navbar, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<div class=\"container-fluid\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"row-fluid\">");
    _builder.newLine();
    _builder.append("\t\t");
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    CharSequence _sidebar = this.sidebar(((CssExtension) _get));
    _builder.append(_sidebar, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    EList<EObject> _contents_1 = resource.getContents();
    EObject _get_1 = _contents_1.get(0);
    CharSequence _contentArea = this.contentArea(((CssExtension) _get_1));
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
    _builder.append("    ");
    _builder.append("</style>");
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
    _builder.append("<body>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence navbar(final String name) {
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
    _builder.append("<li><a href=\"#about\">About</a></li>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<li><a href=\"#contact\">Contact</a></li>");
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
            _builder.append("<li><a href=\"#\">");
            String _name = c.getName();
            _builder.append(_name, "			");
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
    _builder.append("<h1>");
    String _calcPackagename = this.calcPackagename(p);
    _builder.append(_calcPackagename, "		");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2>Rules</h2>");
    _builder.newLine();
    {
      EList<CSSRuleDefinition> _rules = p.getRules();
      for(final CSSRuleDefinition r : _rules) {
        _builder.append("\t");
        _builder.append("<h4>");
        CSSRuleId _name = r.getName();
        String _name_1 = _name.getName();
        _builder.append(_name_1, "	");
        _builder.append("</h4>");
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
            CSSRule _func = r.getFunc();
            String _name_2 = ((CSSRuleFunc) _func).getName();
            _builder.append(_name_2, "		");
            _builder.append("(");
            CSSRule _func_1 = r.getFunc();
            CSSRule _params = ((CSSRuleFunc) _func_1).getParams();
            String _translateRule_1 = this.translateRule(_params);
            _builder.append(_translateRule_1, "		");
            _builder.append(")");
          }
        }
        _builder.append("</code>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"bs-docs-description\">");
        Doku _doku = r==null?(Doku)null:r.getDoku();
        String _content = _doku==null?(String)null:_doku.getContent();
        String _fixJDoc = _content==null?(String)null:this.fixJDoc(_content);
        _builder.append(_fixJDoc, "		");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
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
        _builder.append("<h4>");
        String _name_3 = e.getName();
        _builder.append(_name_3, "	");
        _builder.append("</h4>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div style=\"padding-left: 40px;\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<div class=\"bs-docs-description\">");
        Doku _doku_1 = e==null?(Doku)null:e.getDoku();
        String _content_1 = _doku_1==null?(String)null:_doku_1.getContent();
        String _fixJDoc_1 = _content_1==null?(String)null:this.fixJDoc(_content_1);
        _builder.append(_fixJDoc_1, "		");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<table class=\"table table-bordered table-striped\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<thead>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<th>Property</th>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<th>Definition</th>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<th>Default</th>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("<th>Description</th>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</tr>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</thead>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<tbody>");
        _builder.newLine();
        {
          EList<PropertyDefinition> _properties = e.getProperties();
          for(final PropertyDefinition prop : _properties) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<tr>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td><nobr>");
            String _name_4 = prop.getName();
            _builder.append(_name_4, "			");
            _builder.append("</nobr></td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            CSSRule _rule_2 = prop.getRule();
            String _translateRule_2 = this.translateRule(_rule_2);
            _builder.append(_translateRule_2, "			");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            CSSDefaultValue _default = prop==null?(CSSDefaultValue)null:prop.getDefault();
            String _calcDefault = _default==null?(String)null:this.calcDefault(_default);
            _builder.append(_calcDefault, "			");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            Doku _doku_2 = prop==null?(Doku)null:prop.getDoku();
            String _content_2 = _doku_2==null?(String)null:_doku_2.getContent();
            String _fixJDoc_2 = _content_2==null?(String)null:this.fixJDoc(_content_2);
            _builder.append(_fixJDoc_2, "			");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</tr>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</tbody>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</table>");
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
                  CSSRuleId _ref = ((CSSRuleRef) r).getRef();
                  String _name = _ref.getName();
                  String _plus_2 = ("&lt;" + _name);
                  String _plus_3 = (_plus_2 + "&gt;");
                  result.append(_plus_3);
                } else {
                  if ((r instanceof CSSRulePostfix)) {
                    CSSRule _rule = ((CSSRulePostfix) r).getRule();
                    String _translateRule_1 = this.translateRule(_rule);
                    String _cardinality = ((CSSRulePostfix) r).getCardinality();
                    String _plus_4 = (_translateRule_1 + _cardinality);
                    result.append(_plus_4);
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
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
