package at.bestsolution.efxclipse.runtime.workbench.internal.key;

import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.KeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.service.BindingFactory;
import javafx.scene.input.KeyEvent;

public class FxKeySupport {

	public static int convertEventToUnmodifiedAccelerator(KeyEvent event) {
		int modifiers = getStateMask(event) & FxKeyLookup.MODIFIER_MASK;
		return modifiers + event.getCode().impl_getChar().toUpperCase().charAt(0);
	}
	
	public static final int convertEventToUnshiftedModifiedAccelerator(
			final KeyEvent event) {
		// Disregard alphabetic key strokes.
		if (Character.isLetter(event.getCharacter().charAt(0))) {
			return convertEventToUnmodifiedAccelerator(event);
		}

		int modifiers = getStateMask(event) & (FxKeyLookup.MODIFIER_MASK ^ FxKeyLookup.SHIFT);
		return modifiers + event.getCode().impl_getChar().toUpperCase().charAt(0);
//		char character = topKey(event);
//		return modifiers + toUpperCase(character);
	}

	public static final int convertEventToModifiedAccelerator(final KeyEvent event) {
		int modifiers = getStateMask(event) & FxKeyLookup.MODIFIER_MASK;
		return modifiers + event.getCode().impl_getChar().toUpperCase().charAt(0);
//		char character = topKey(event);
//		return modifiers + toUpperCase(character);
	}
	
	public static int getStateMask(KeyEvent event) {
		int rv = 0;
		if( event.isAltDown() ) {
			rv |= FxKeyLookup.ALT;
		}
		if( event.isControlDown() ) {
			rv |= FxKeyLookup.CTRL;
		}
		if( event.isShiftDown() ) {
			rv |= FxKeyLookup.SHIFT;
		}
		if( event.isMetaDown() ) {
			rv |= FxKeyLookup.COMMAND;
		}
		return rv;
	}

	public static KeyStroke convertAcceleratorToKeyStroke(BindingFactory factory, KeyLookup lookup, int accelerator) {
		final int modifierKeys = accelerator & FxKeyLookup.MODIFIER_MASK;
		final int naturalKey;
		if (accelerator == modifierKeys) {
			naturalKey = FxKeyLookup.NO_KEY;
		} else {
			naturalKey = accelerator - modifierKeys;
		}
		
		return factory.getKeyStrokeInstance(lookup, modifierKeys, naturalKey);
	}

	
//	private static final char topKey(final KeyEvent event) {
//		char character = event.getCharacter().charAt(0);
//		boolean ctrlDown = (getStateMask(event) & FxKeyLookup.CTRL) != 0;
//
//		if (ctrlDown && event.character != event.keyCode
//				&& event.character < 0x20 
//				&& (event.keyCode & SWT.KEYCODE_BIT) == 0) {
//			character += 0x40;
//		}
//
//		return character;
//	}
}
