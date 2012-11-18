package at.bestsolution.efxclipse.tooling.rrobot.impl.generators

import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.PluginXMLFile
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import java.io.ByteArrayInputStream
import java.util.Map
import at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Element

class PluginXMLGenerator implements Generator<PluginXMLFile> {
	

	override generate(PluginXMLFile file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}
	
	def generateContent(PluginXMLFile file, Map<String,Object> data) '''<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.0"?>
<plugin>
«FOR ext : file.extensions»
	<extension «IF ext.id != null»id="«ext.id»"«ENDIF» point="«ext.point»">
		«FOR el : ext.elements»
			«el.elementBuilder»
		«ENDFOR»
	</extension>
«ENDFOR»
</plugin>

	'''
	
	def elementBuilder(Element el) '''
	<«el.name» «el.attributes.map([a|a.name+"=\""+a.value+"\""]).join(" ")» «IF el.children.empty»/«ENDIF»>
	«IF !el.children.empty»
		«FOR c : el.children»
			«c.elementBuilder»
		«ENDFOR»
	</«el.name»>
	«ENDIF»
	
	'''
}