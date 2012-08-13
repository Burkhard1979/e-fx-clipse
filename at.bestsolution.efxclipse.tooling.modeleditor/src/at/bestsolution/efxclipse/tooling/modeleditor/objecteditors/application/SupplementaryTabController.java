package at.bestsolution.efxclipse.tooling.modeleditor.objecteditors.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;

import at.bestsolution.efxclipse.runtime.databinding.AdapterFactory;
import at.bestsolution.efxclipse.runtime.databinding.IJFXBeanValueProperty;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;

@SuppressWarnings("restriction")
public class SupplementaryTabController implements Initializable {
	private WritableValue master = new WritableValue();
	
	@FXML TextField accessField;
	@FXML TextField variablesField;

	@FXML ListView<String> variablesList;

	@FXML TextField tagsField;

	@FXML ListView<String> tagsList;

	@FXML
	void onVariableUp(ActionEvent event) {
		
	}
	
	@FXML
	void onVariableDown(ActionEvent event) {
		
	}
	
	@FXML
	void onVariableRemove(ActionEvent event) {
		
	}

	@FXML
	void onTagUp(ActionEvent event) {
		
	}
	
	@FXML
	void onTagDown(ActionEvent event) {
		
	}
	
	@FXML
	void onTagRemove(ActionEvent event) {
		
	}
	
	@Inject
	public void setSelectedElement(@Optional @Named("selectedTreeElement") MApplicationElement element) {
		if( element instanceof MApplication ) {
			master.setValue(element);	
		} else {
			master.setValue(null);
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		{
			IJFXBeanValueProperty uiProp = JFXBeanProperties.value("text");
			IEMFValueProperty mProp = EMFProperties.value(UiPackageImpl.Literals.UI_ELEMENT__ACCESSIBILITY_PHRASE);
			dbc.bindValue(uiProp.observe(accessField), mProp.observeDetail(master));
		}
		
		{
			IEMFListProperty mProp = EMFProperties.list(UiPackageImpl.Literals.CONTEXT__VARIABLES);
			IObservableList mList = mProp.observeDetail(master);
			ObservableList<String> l = AdapterFactory.adapt(mList);
			variablesList.setItems(l);
		}
		
		{
			IEMFListProperty mProp = EMFProperties.list(ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__TAGS);
			IObservableList mList = mProp.observeDetail(master);
			ObservableList<String> l = AdapterFactory.adapt(mList);
			tagsList.setItems(l);
		}
	}
}