package at.bestsolution.efxclipse.runtime.dialogs;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Window;
import at.bestsolution.efxclipse.runtime.panels.GridLayoutPane;

public class MessageDialog extends Dialog {
	public enum Type {
		CUSTOM,
		QUESTION,
		INFORMATION,
		WARNING,
		ERROR,
		CONFIRM,
		QUESTION_CANCEL
	}
	
	public enum Question {
		YES(0),
		NO(1);
		
		private final int index;
		
		private Question(int index) {
			this.index = index;
		}
		
		static Question fromIndex(int index) {
			if( index == YES.index ) {
				return YES;
			} else {
				return NO;
			}
		}
	}
	
	public enum QuestionCancel {
		YES(0),
		NO(1),
		CANCEL(2);
		
		private final int index;
		
		private QuestionCancel(int index) {
			this.index = index;
		}
		
		static QuestionCancel fromIndex(int index) {
			if( index == YES.index ) {
				return YES;
			} else if( index == NO.index ) {
				return NO;
			} else {
				return CANCEL;
			}
		}
	}
	
	public enum Confirm {
		OK(0),
		CANCEL(1);
		
		private final int index;
		
		private Confirm(int index) {
			this.index = index;
		}
		
		static Confirm fromIndex(int index) {
			if( index == OK.index ) {
				return OK;
			} else {
				return CANCEL;
			}
		}
	}
	
	private final Type type;
	private final String message;
	private final String[] dialogButtonLabels;
	
	public MessageDialog(Window parent, String windowTitle, String message, Type type, String... dialogButtonLabels) {
		super(parent, windowTitle);
		this.type = type;
		this.message = message;
		this.dialogButtonLabels = dialogButtonLabels;
	}

	@Override
	protected Node createDialogArea() {
		Image img = getGraphic(type);
		
		if( img != null ) {
			GridLayoutPane b = new GridLayoutPane();
			b.setHorizontalSpacing(20);
			b.setNumColumns(2);
			b.getChildren().add(new ImageView(img));
			b.getChildren().add(new Label(message));
			
			return b;
		} else {
			return new Label(message);
		}
	}
	
	@Override
	protected List<Button> createButtonsForBar() {
		List<Button> rv = new ArrayList<Button>();
		for( int i = 0; i < dialogButtonLabels.length; i++ ) {
			rv.add(createButtonForBar(i,dialogButtonLabels[i]));
		}
		return rv;
	}
	
	@Override
	protected void buttonPressed(int type) {
		setReturnCode(type);
		close();
	}

	private Image getGraphic(Type type) {
		String imgUrl = null;
		switch (type) {
		case CONFIRM:
			imgUrl = "icons/preferences-desktop-notification.png";
			break;
		case CUSTOM:
			break;
		case ERROR:
			imgUrl = "icons/dialog-error.png";
			break;
		case INFORMATION:
			imgUrl = "icons/dialog-information.png";
			break;
		case QUESTION:
		case QUESTION_CANCEL:
			imgUrl = "icons/system-help.png";
			break;
		case WARNING:
			imgUrl = "icons/dialog-warning.png";
			break;
		default:
			break;
		}
		
		if( imgUrl != null ) {
			InputStream in = getClass().getResourceAsStream(imgUrl);
			Image img = new Image(in);
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return img;
		}
		return null;
	}
	
	public static void openErrorDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.ERROR, "Ok").open();
	}
	
	public static void openWarningDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.WARNING, "Ok").open();
	}
	
	public static void openInformationDialog(Window parent, String title, String message) {
		new MessageDialog(parent, title, message, Type.INFORMATION, "Ok").open();
	}
	
	public static Question openQuestionDialog(Window parent, String title, String message) {
		return Question.fromIndex(new MessageDialog(parent, title, message, Type.QUESTION, "Yes", "No").open());
	}
	
	public static QuestionCancel openQuestionCancelDialog(Window parent, String title, String message) {
		return QuestionCancel.fromIndex(new MessageDialog(parent, title, message, Type.QUESTION, "Yes", "No", "Cancel").open());
	}
	
	public static Confirm openConfirmDialog(Window parent, String title, String message) {
		return Confirm.fromIndex(new MessageDialog(parent, title, message, Type.CONFIRM, "Ok", "Cancel").open());
	}
}
