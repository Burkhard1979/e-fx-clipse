package at.bestsolution.efxclipse.tooling.modeleditor.app;

import java.io.File;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.bestsolution.efxclipse.tooling.modeleditor.ModelEditor;


@SuppressWarnings("restriction")
public class Application {

	@PostConstruct
	void init(Stage primaryStage, IEclipseContext context) {
		ResourceSet resourceSet = new ResourceSetImpl();

		File file = new File("/Users/tomschindl/Documents/e4_workspaces/efxclipse/examplee4/Application.e4xmi");
		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);

		IEclipseContext appContext = context.createChild();
		appContext.set("rootElement", resource.getContents().get(0));
		
		BorderPane p = new BorderPane();
		appContext.set(BorderPane.class, p);
		
		ContextInjectionFactory.make(ModelEditor.class, appContext);

		Scene s = new Scene(p);
		primaryStage.setScene(s);
		primaryStage.setWidth(640);
		primaryStage.setHeight(480);
		primaryStage.show();

		primaryStage.setTitle("Hello JavaFX");
		primaryStage.setWidth(300);
		primaryStage.setHeight(300);
		primaryStage.show();	
	}
}