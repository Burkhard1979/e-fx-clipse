package at.bestsolution.efxclipse.runtime.demo.contacts.views;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import java.net.MalformedURLException;

import org.eclipse.core.runtime.Platform;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.PasteFromClipboardCommand;

import org.eclipse.emf.edit.command.CopyToClipboardCommand;

import org.eclipse.emf.edit.command.CutToClipboardCommand;

import org.eclipse.emf.edit.domain.EditingDomain;

import at.bestsolution.efxclipse.runtime.demo.contacts.Contact;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsFactory;
import at.bestsolution.efxclipse.runtime.demo.contacts.ContactsPackage;
import at.bestsolution.efxclipse.runtime.demo.contacts.Group;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;

public class ContextMenuProvider implements ICellUpdateListener {

	EditingDomain editingDomain;

	public ContextMenuProvider(EditingDomain editingDomain) {
		super();
		this.editingDomain = editingDomain;
	}

	@Override
	public void updateItem(Cell<?> cell, final Object item, boolean empty) {

		ContextMenu contextMenu = new ContextMenu();

		if (item instanceof Contact) {
			
			MenuItem deleteMenuItem = new MenuItem("Delete", getImage("icons/silk/cross.png"));
			deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = DeleteCommand.create(editingDomain, item);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(deleteMenuItem);

			MenuItem cutMenuItem = new MenuItem("Cut", getImage("icons/silk/cut.png"));
			cutMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = CutToClipboardCommand.create(editingDomain, item);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(cutMenuItem);

			MenuItem copyMenuItem = new MenuItem("Copy", getImage("icons/silk/page_copy.png"));
			copyMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Command command = CopyToClipboardCommand.create(editingDomain, item);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(copyMenuItem);

			MenuItem pasteMenuItem = new MenuItem("Paste", getImage("icons/silk/page_paste.png"));
			pasteMenuItem.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					Contact contact = (Contact) item;
					Command command = PasteFromClipboardCommand.create(editingDomain, contact.eContainer(), contact.eContainingFeature());
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			contextMenu.getItems().add(pasteMenuItem);
		}

		if (!contextMenu.getItems().isEmpty())
			cell.setContextMenu(contextMenu);
	}

	private ImageView getImage(String path) {
		ImageView imageView = null;
		try {
			URL url = new URL("platform:/plugin/at.bestsolution.efxclipse.runtime.demo.contacts.app/" + path);
			imageView = new ImageView(new Image(url.toExternalForm()));
		} catch (MalformedURLException e) {
		}
		return imageView;
	}
}
