/*
 * generated by Xtext
 */
package at.bestsolution.efxclipse.tooling.fxgraph.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import java.util.List
import org.eclipse.core.internal.resources.Workspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.internal.core.JavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.internal.core.ClasspathEntry
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty
import org.eclipse.xtend.typesystem.StaticProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.common.types.JvmTypeReference
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Language

class FXGraphGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
try {
		if( resource.URI.platformResource ) {
			var uri = resource.URI;
			var root = ResourcesPlugin::workspace.root;
			var project = root.getProject(uri.segment(1));
			var projectRelativePath = "";
			var i = 0;
			
			for( seg : uri.segments ) {
				if( i >= 1 ) {
					projectRelativePath = projectRelativePath + "/" + uri.segment(i);
				}
				i = i + 1;
			}
			
			var file = project.getFile(projectRelativePath);
			var jproject = JavaCore::create(project);
			var prefix = null;
			for( packroot: jproject.rawClasspath ) {
				if( packroot.entryKind == IClasspathEntry::CPE_SOURCE ) {
					if( projectRelativePath.startsWith(packroot.path.toString) ) {
						projectRelativePath = projectRelativePath.substring(packroot.path.toString.length);
					}
				}
			}
			
			fsa.generateFile(projectRelativePath.replaceFirst(".fxgraph$",".fxml"), createContent(resource, projectRelativePath));	
		}
		} catch (Exception e) {
		}
	}
	
	
	def createContent(Resource resource, String projectRelativePath) '''
		�val importManager = new ImportManager(true)�
		<?xml version="1.0" encoding="UTF-8"?>
		<!-- 
			Do not edit this file it is generated by e(fx)clipse from �projectRelativePath�
		-->
		
		�FOR lang : resource.contents.get(0).eContents.filter(typeof(Language))�
			<?language �lang.language�?>
		�ENDFOR�
		
		�FOR rootElement : resource.contents.get(0).eContents.filter(typeof(Element))�
		�val body = elementContent(rootElement, true, importManager)�
		<?import java.lang.*?>
		�FOR i:importManager.imports�
			<?import �i�?>
		�ENDFOR�
		
		�body�
		�ENDFOR�
	'''
	
	def elementContent(Element element, boolean root, ImportManager importManager) '''
		<�element.type.shortName(importManager)��IF root� xmlns:fx="http://javafx.com/fxml"�ENDIF��fxElementAttributes(element,importManager)��IF hasAttributeProperties(element)��elementAttributes(element.properties)��ENDIF��IF ! hasNestedProperties(element)�/�ENDIF�> 
		�IF hasNestedProperties(element)�
			�IF element.defines.size > 0�
			<fx:define>
				�FOR define : element.defines�
				�elementContent(define.element,false,importManager)�
				�ENDFOR�
			</fx:define>
			�ENDIF�
			�FOR script : element.scripts�
			�IF script.sourcecode != null�
			<fx:script>�script.sourcecode.substring(2,script.sourcecode.length-2)�
			</fx:script>
			�ELSE�
			<fx:script source="�script.source�"/>
			�ENDIF�
			�ENDFOR�
			�propContents(element.properties,importManager)�
			�statPropContent(element.staticProperties,importManager)�
		</�element.type.shortName(importManager)�>
		�ENDIF�
	'''
	
	def propContents(List<Property> properties, ImportManager importManager) '''
		�FOR prop : properties.filter([Property p|subelementFilter(p)])�
		�propContent(prop,importManager)�
		�ENDFOR�
	'''
	
	def propContent(Property prop, ImportManager importManager) '''
		�IF prop.value instanceof SimpleValueProperty�
			�IF (prop.value as SimpleValueProperty).stringValue != null�
				<�prop.name�>�(prop.value as SimpleValueProperty).stringValue�</�prop.name�>
			�ENDIF�
		�ELSEIF prop.value instanceof ListValueProperty�
			<�prop.name�>
				�propListContent(prop.value as ListValueProperty,importManager)�
			</�prop.name�>
		�ELSEIF prop.value instanceof MapValueProperty�
			<�prop.name�>
				�propContents((prop.value as MapValueProperty).properties,importManager)�
			</�prop.name�>
		�ELSEIF prop.value instanceof Element�
			<�prop.name�>
				�elementContent(prop.value as Element,false,importManager)�
			</�prop.name�>
		�ELSEIF prop.value instanceof ReferenceValueProperty�
			<�prop.name�>
				<fx:reference source="�(prop.value as ReferenceValueProperty).reference.name�" />
			</�prop.name�>
		�ELSEIF prop.value instanceof IncludeValueProperty�
			<�prop.name�>
				<fx:include source="�(prop.value as IncludeValueProperty).source�" />
			</�prop.name�>
		�ELSEIF prop.value instanceof CopyValueProperty�
			<�prop.name�>
				<fx:copy source="�(prop.value as CopyValueProperty).reference.name�" />
			</�prop.name�>
		�ENDIF�
	'''
	
	def statPropContent(List<StaticValueProperty> properties, ImportManager importManager) '''
		�FOR prop : properties�
		�IF prop.value instanceof SimpleValueProperty�
			�IF (prop.value as SimpleValueProperty).stringValue != null�
				<�prop.type.shortName(importManager)�.�prop.name�>�(prop.value as SimpleValueProperty).stringValue�</�prop.type.shortName(importManager)�.�prop.name�>
			�ELSE�
				<�prop.type.shortName(importManager)�.�prop.name�>�simpleAttributeValue(prop.value as SimpleValueProperty)�</�prop.type.shortName(importManager)�.�prop.name�>
			�ENDIF�
		�ELSEIF prop.value instanceof ListValueProperty�
			<�prop.type.shortName(importManager)�.�prop.name�>
				�propListContent(prop.value as ListValueProperty,importManager)�
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ELSEIF prop.value instanceof MapValueProperty�
			<�prop.type.shortName(importManager)�.�prop.name�>
				�propContents((prop.value as MapValueProperty).properties,importManager)�
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ELSEIF prop.value instanceof Element�
			<�prop.type.shortName(importManager)�.�prop.name�>
				�elementContent(prop.value as Element,false,importManager)�
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ELSEIF prop.value instanceof ReferenceValueProperty�
			<�prop.type.shortName(importManager)�.�prop.name�>
				<fx:reference source="�(prop.value as ReferenceValueProperty).reference.name�" />
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ELSEIF prop.value instanceof IncludeValueProperty�
			<�prop.type.shortName(importManager)�.�prop.name�>
				<fx:include source="�(prop.value as IncludeValueProperty).source�" />
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ELSEIF prop.value instanceof CopyValueProperty�
			<�prop.type.shortName(importManager)�.�prop.name�>
				<fx:copy source="�(prop.value as CopyValueProperty).reference.name�" />
			</�prop.type.shortName(importManager)�.�prop.name�>
		�ENDIF�
		�ENDFOR�
	'''
	
	def propListContent(ListValueProperty listProp, ImportManager importManager) '''
		�FOR e : listProp.value�
			�IF e instanceof Element�
				�elementContent(e as Element,false,importManager)�
			�ELSEIF e instanceof ReferenceValueProperty�
				<fx:reference source="�(e as ReferenceValueProperty).reference.name�" />
			�ELSEIF e instanceof IncludeValueProperty�
				<fx:include source="�(e as IncludeValueProperty).source�" />
			�ENDIF�
		�ENDFOR�
	'''

	def fxElementAttributes(Element element, ImportManager importManager) {
		var builder = new StringBuilder();
		
		if(element.name != null) {
			builder.append(" fx:id=\""+element.name+"\"");
		}
		
		if( element.value != null ) {
			builder.append(" fx:value=\""+ simpleAttributeValue(element.value) + "\"");
		} else if( element.factory != null ) {
			builder.append(" fx:factory=\""+ element.factory + "\"");
		}
		
		if( element.controller != null ) {
			builder.append(" fx:controller=\""+ element.controller.qualifiedName + "\"");
		}
		
		return builder.toString;
	}
	
	def elementAttributes(List<Property> properties) {
		var builder = new StringBuilder();
		
		for( p : properties.filter([Property p|elementAttributeFilter(p)]) ) {
			if( p.value instanceof SimpleValueProperty ) {
				builder.append(" " + p.name + "=\""+simpleAttributeValue(p.value as SimpleValueProperty)+"\"");
			} else if( p.value instanceof ReferenceValueProperty ) {
				builder.append(" " + p.name + "=\"$"+(p.value as ReferenceValueProperty).reference.name+"\"");
			} else if( p.value instanceof ControllerHandledValueProperty ) {
				builder.append(" " + p.name + "=\"#"+(p.value as ControllerHandledValueProperty).methodname +"\"");
			} else if( p.value instanceof ScriptHandlerHandledValueProperty ) {
				builder.append(" " + p.name + "=\""+(p.value as ScriptHandlerHandledValueProperty).functionname +"\"");
			} else if( p.value instanceof ScriptValueExpression ) {
				builder.append(" " + p.name + "=\""+(p.value as ScriptValueExpression).sourcecode.substring(2,(p.value as ScriptValueExpression).sourcecode.length-2).trim() +";\"");
			}
		}
		
		return builder;
	}
	
	def subelementFilter(Property property) {
		return ! elementAttributeFilter(property);
	}

	def elementAttributeFilter(Property property) {
		if( property.value instanceof SimpleValueProperty ) {
			if( (property.value as SimpleValueProperty).stringValue == null ) {
				return true;
			}
		} else if( property.value instanceof ReferenceValueProperty ) {
			return true;
		} else if( property.value instanceof ControllerHandledValueProperty ) {
			return true;
		} else if( property.value instanceof ScriptHandlerHandledValueProperty ) {
			return true;
		} else if( property.value instanceof ScriptValueExpression ) {
			return true;
		}
		return false;
	}

	def simpleAttributeValue(SimpleValueProperty value) {
		if( value.stringValue != null ) {
			return value.stringValue;
		} else if( value.booleanValue != null ) {
			return value.booleanValue;
		} else if( (value.realValue as int) != 0 ) {
			if( value.negative ) {
				return "-" + value.realValue;
			} else {
				return value.realValue;
			}
		} else {
			if( value.negative ) {
				return "-" + value.intValue;
			} else {
				return value.intValue;
			}
		}
	}
	
	def hasAttributeProperties(Element element) {
		return element.properties.size > 0 && ! element.properties.filter([Property p|elementAttributeFilter(p)]).nullOrEmpty;
	}
	
	def hasNestedProperties(Element element) {
		if( element.staticProperties.size > 0) {
			return true;
		} else if( element.defines.size > 0 ) {
			return true;
		} else if( element.scripts.size > 0 ) {
			return true;
		}
		
		if( element.properties.size > 0 ) {
			return ! element.properties.filter([Property p|subelementFilter(p)]).nullOrEmpty;
		}
		
		return false;
	}
	
	def shortName(JvmTypeReference r, ImportManager importManager) {
		val builder = new StringBuilder()
		importManager.appendTypeRef(r, builder)
		builder.toString
	}
}