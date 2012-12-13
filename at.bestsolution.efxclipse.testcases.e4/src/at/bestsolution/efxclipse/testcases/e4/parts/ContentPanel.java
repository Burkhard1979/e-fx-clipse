package at.bestsolution.efxclipse.testcases.e4.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.testcases.e4.handlers.EventSender;

import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@SuppressWarnings("restriction")
public class ContentPanel {
	
	private TextField f;
	
	@Inject
	protected UISynchronize uiSync;

	@Inject
	public ContentPanel(BorderPane p, MPart part) {
		f = new TextField(part.getLocalizedLabel());
		p.setTop(f);
	}
	
	@PostConstruct
	void sync() {
		System.err.println("The sync: " + uiSync);
	}
	
	@Focus
	void focus() {
		f.requestFocus();
	}
	
//	@Inject
//	@Optional
//	void eventSync(@EventTopic(EventSender.SYNC_EVENT) String event) {
//		System.err.println("SYNC: Received event: " + event + " on thread " + Thread.currentThread());
//	}
//	
//	@Inject
//	@Optional
//	void eventASync(@EventTopic(EventSender.ASYNC_EVENT) String event) {
//		System.err.println("ASYNC: Received event: " + event + " on thread " + Thread.currentThread());
//	}
	
	@Inject
	@Optional
	void eventSyncUI(@UIEventTopic(EventSender.SYNC_EVENT) String event) {
		System.err.println("UI-SYNC: Received event: " + event + " on thread " + Thread.currentThread());
	}
	
	@Inject
	@Optional
	void eventASyncUI(@UIEventTopic(EventSender.ASYNC_EVENT) String event) {
		System.err.println("UI-ASYNC: Received event: " + event + " on thread " + Thread.currentThread());
	}
}
