package at.bestsolution.efxclipse.tooling.css.cssext.generator

import org.eclipse.emf.ecore.resource.Resource
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CssExtension
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.PackageDefinition
import java.util.StringTokenizer
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRule
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleOr
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleConcat
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleBracket
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleXor
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleLiteral
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSNumLiteral
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRef
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRulePostfix
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleRegex
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleSymbol
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSRuleFunc
import at.bestsolution.efxclipse.tooling.css.cssext.cssExtDsl.CSSDefaultValue

class HTMLDocGenerator {
	def generate(Resource resource) '''
	«leadin»
	«navbar("JavaFX CSS")»
	<div class="container-fluid">
		<div class="row-fluid">
			«sidebar(resource.contents.get(0) as CssExtension)»
			«contentArea(resource.contents.get(0) as CssExtension)»
		</div>
	</div>
	«leadout»
	'''
	
	def leadin() '''
	<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>CSS Documentation</title>

    <!-- Le styles -->
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
      
      .bs-docs-description:after {
    background-color: #F5F5F5;
    border: 1px solid #DDDDDD;
    border-radius: 4px 0 4px 0;
    color: #9DA0A4;
    content: "Description";
    font-size: 12px;
    font-weight: bold;
    left: -1px;
    padding: 3px 7px;
    position: absolute;
    top: -1px;
}
.bs-docs-description {
    background-color: #FFFFFF;
    border: 1px solid #DDDDDD;
    border-radius: 4px 4px 4px 4px;
    margin: 15px 0;
    padding: 39px 19px 14px;
    position: relative;
}
    </style>
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/js/google-code-prettify/prettify.css" rel="stylesheet">
<body>
	'''
	def navbar(String name) '''
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a class="brand" href="#">«name»</a>
			<ul class="nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#about">About</a></li>
				<li><a href="#contact">Contact</a></li>
			</ul>
		</div>
	</div>
</div>
	'''
	
	def sidebar(CssExtension cssExt) '''
<div class="span3">
	<div class="well sidebar-nav">
		<ul class="nav nav-list">
			«FOR j : cssExt.eAllContents.filter(typeof(PackageDefinition)).toList»
				<li class="nav-header">«j.calcPackagename»</li>
				«FOR c : (j as PackageDefinition).elements»
				<li><a href="#">«c.name»</a></li>
				«ENDFOR»
			«ENDFOR»
		</ul>
	</div>
</div>
	'''
	
	def contentArea(CssExtension cssExt) '''
	<div class="span9">
		<div class="hero-unit">
			<h1>JavaFX CSS Documentation</h1>
		</div>
	«FOR j : cssExt.eAllContents.filter(typeof(PackageDefinition)).toList»
		«packageContent(j)»
	«ENDFOR»
	</div>
	'''
	
	def packageContent(PackageDefinition p) '''
	<section id="global">
		<div class="page-header">
			<h1>«p.calcPackagename»</h1>
		</div>
		<h2>Rules</h2>
		«FOR r : p.rules»
		<h4>«r.name.name»</h4>
		<div style="padding-left: 40px;">
			<code>«IF r.rule != null»«r.rule.translateRule»«ELSE»«(r.func as CSSRuleFunc).name»(«(r.func as CSSRuleFunc).params.translateRule»)«ENDIF»</code>
			<div class="bs-docs-description">«r?.doku?.content?.fixJDoc»</div>
		</div>
		«ENDFOR»
		<h2>Elements</h2>
		«FOR e : p.elements»
		<h4>«e.name»</h4>
		<div style="padding-left: 40px;">
			<div class="bs-docs-description">«e?.doku?.content?.fixJDoc»</div>
			<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th>Property</th>
					<th>Definition</th>
					<th>Default</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody>
			«FOR prop : e.properties»
			<tr>
				<td><nobr>«prop.name»</nobr></td>
				<td>«prop.rule.translateRule»</td>
				<td>«prop?.getDefault()?.calcDefault»</td>
				<td>«prop?.doku?.content?.fixJDoc»</td>
			</tr>
			«ENDFOR»
			</tbody>
			</table>
		</div>
		«ENDFOR»
	</section>
	'''
	
	def calcDefault(CSSDefaultValue defaultValue) {
		if( defaultValue.getVal() != null ) {
			return defaultValue.getVal().translateRule;
		} else if( defaultValue.sval != null ) {
			return "\""+defaultValue.sval+"\"";
		} else if( defaultValue.ival != 0) {
			return defaultValue.ival + "";
		} else {
			return defaultValue.dval + "";
		}
	}
	
	def calcPackagename(PackageDefinition p) {
		var rv = p.name;
		var parent = p;
		while( parent.eContainer instanceof PackageDefinition ) {
			parent = parent.eContainer as PackageDefinition;
			rv = parent.name + "." +  rv;
			
		}
		return rv;
	}
	
	def fixJDoc(String doc) {
		val result = new StringBuffer();
		val linetokenizer = new StringTokenizer(doc, "\r\n");
		
		while (linetokenizer.hasMoreElements()) {
			var line = linetokenizer.nextToken();
			
			line = line.replaceFirst("^/[*][*]", "");
			line = line.replaceFirst("[*][/]$", "");
			line = line.replaceFirst("^.*[*]\t*", "");
			
			if (line.length() == 0 && result.length() > 0) {
				result.append("<br/>");
			}
			
			else {
				result.append(line);
			}
		}
		return result.toString();
	}
	
	def String translateRule(CSSRule r) {
		var result = new StringBuilder;
		if (r instanceof CSSRuleOr) {
			val iterator =(r as CSSRuleOr).getOrs().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" | ");
				}
			}
		}
		else if (r instanceof CSSRuleConcat) {
			val iterator =( r as CSSRuleConcat).getConc().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" ");
				}
			}
		}
		else if (r instanceof CSSRuleBracket) {
			result.append("[ " + translateRule(( r as CSSRuleBracket).getInner()) + " ]");
		}
		else if (r instanceof CSSRuleXor) {
			val iterator =(r as CSSRuleXor).getXors().iterator();
			while (iterator.hasNext()) {
				result.append(translateRule(iterator.next()));
				if (iterator.hasNext()) {
					result.append(" || ");
				}
			}
		}
		else if (r instanceof CSSRuleLiteral) {
			result.append(( r as CSSRuleLiteral).getValue());
		}
		else if (r instanceof CSSNumLiteral) {
			result.append((r as CSSNumLiteral).getValue());
		}
		else if (r instanceof CSSRuleRef) {
			result.append("&lt;" + (r as CSSRuleRef).getRef().getName() + "&gt;");
		}
		else if (r instanceof CSSRulePostfix) {
			result.append(translateRule(( r as CSSRulePostfix).getRule()) + (r as CSSRulePostfix).getCardinality());
		}
		else if (r instanceof CSSRuleRegex) {
			result.append(( r as CSSRuleRegex).getRegex());
		}
		else if (r instanceof CSSRuleSymbol) {
			result.append((r as CSSRuleSymbol).getSymbol());
		}
		else {
			if (r == null) {
				return "null";
			}
			else {
				return r.getType();
			}
		}
		return result.toString;
	}
	
	def leadout() '''
	<script src="http://twitter.github.com/bootstrap/assets/js/jquery.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-transition.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-alert.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-modal.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-scrollspy.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tab.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tooltip.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-popover.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-button.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-collapse.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-carousel.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-typeahead.js"></script>
</body>
</html>
	'''
}