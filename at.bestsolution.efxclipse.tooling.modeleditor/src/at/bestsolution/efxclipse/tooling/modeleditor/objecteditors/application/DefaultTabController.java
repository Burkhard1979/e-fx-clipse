package at.bestsolution.efxclipse.tooling.modeleditor.objecteditors.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.commands.MBindingContext;
import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;

import at.bestsolution.efxclipse.runtime.databinding.AdapterFactory;
import at.bestsolution.efxclipse.runtime.databinding.IJFXBeanValueProperty;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;
import at.bestsolution.efxclipse.runtime.di.ResourcePool;
import at.bestsolution.efxclipse.tooling.modeleditor.ResourceProvider;

@SuppressWarnings("restriction")
public class DefaultTabController implements Initializable {
	@Inject
	private ResourcePool pool;
	
	private WritableValue master = new WritableValue();
	
	@FXML
	TextField idField;
	
	@FXML
	ListView<MBindingContext> bindingContextsView;

	@FXML CheckBox renderField;

	@FXML CheckBox visibleField;
	
	@FXML
	void onBindingUp(ActionEvent event) {
		
	}
	
	@FXML
	void onBindingDown(ActionEvent event) {
		
	}
	
	@FXML
	void onBindingAdd(ActionEvent event) {
		
	}
	
	@FXML
	void onBindingRemove(ActionEvent event) {
		
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
		bindingContextsView.setCellFactory(new Callback<ListView<MBindingContext>, ListCell<MBindingContext>>() {
			
			@Override
			public ListCell<MBindingContext> call(ListView<MBindingContext> param) {
				return new BindingCell();
			}
		});
		
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		{
			IJFXBeanValueProperty uiProp = JFXBeanProperties.value("text");
			IEMFValueProperty mProp = EMFProperties.value(ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__ELEMENT_ID);
			dbc.bindValue(uiProp.observe(idField), mProp.observeDetail(master));
		}
		
		{
			IJFXBeanValueProperty uiProp = JFXBeanProperties.value("selected");
			IEMFValueProperty mProp = EMFProperties.value(UiPackageImpl.Literals.UI_ELEMENT__TO_BE_RENDERED);
			dbc.bindValue(uiProp.observe(renderField), mProp.observeDetail(master));
		}
		
		{
			IJFXBeanValueProperty uiProp = JFXBeanProperties.value("selected");
			IEMFValueProperty mProp = EMFProperties.value(UiPackageImpl.Literals.UI_ELEMENT__VISIBLE);
			dbc.bindValue(uiProp.observe(visibleField), mProp.observeDetail(master));
		}
		
		{
			IEMFListProperty mProp = EMFProperties.list(CommandsPackageImpl.Literals.BINDINGS__BINDING_CONTEXTS);
			IObservableList mList = mProp.observeDetail(master);
			ObservableList<MBindingContext> l = AdapterFactory.adapt(mList);
			bindingContextsView.setItems(l);
		}
		
	}
	
	class BindingCell extends ListCell<MBindingContext> {
		@Override
		protected void updateItem(MBindingContext item, boolean empty) {
			super.updateItem(item, empty);
			if( item != null ) {
				setText("BindingContext - " + item.getName());
				System.err.println(pool.getImageUnchecked(ResourceProvider.Model_BindingContext));
				setGraphic(new ImageView(pool.getImageUnchecked(ResourceProvider.Model_BindingContext)));
			}
		}
	}
}