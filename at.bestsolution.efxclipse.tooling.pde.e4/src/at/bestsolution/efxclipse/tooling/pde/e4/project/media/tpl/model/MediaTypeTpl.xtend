package at.bestsolution.efxclipse.tooling.pde.e4.project.media.tpl.model

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
import at.bestsolution.efxclipse.tooling.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class MediaTypeTpl implements Generator<DynamicFile> {

	override generate(DynamicFile file, Map<String,Object> data) {
		val cu = file.eContainer as CompilationUnit;
		return new ByteArrayInputStream(generate(cu.packagename).toString.bytes);
	}
	
	def generate(String packageName) '''package «packageName»;

public enum MediaType {
	MOVIE,
	SOUND,
	PICTURE
}
'''
}