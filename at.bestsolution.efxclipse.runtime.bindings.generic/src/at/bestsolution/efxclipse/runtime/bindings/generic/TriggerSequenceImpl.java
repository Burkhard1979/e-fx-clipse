package at.bestsolution.efxclipse.runtime.bindings.generic;

import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.runtime.bindings.Trigger;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;

public abstract class TriggerSequenceImpl implements TriggerSequence {
	private final List<Trigger> triggers;
	
	/**
	 * The value to see that hash code to if the hash code is not yet computed.
	 */
	private static final int HASH_CODE_NOT_COMPUTED = -1;

	/**
	 * A factor for computing the hash code for all trigger sequences.
	 */
	private static final int HASH_FACTOR = 89;

	/**
	 * An internal constant used only in this object's hash code algorithm.
	 */
	private static final int HASH_INITIAL = TriggerSequence.class.getName()
			.hashCode();

	/**
	 * The hash code for this object. This value is computed lazily, and marked
	 * as invalid when one of the values on which it is based changes.  This
	 * values is <code>HASH_CODE_NOT_COMPUTED</code> iff the hash code has not
	 * yet been computed.
	 */
	protected transient int hashCode = HASH_CODE_NOT_COMPUTED;
	
	public TriggerSequenceImpl(final Trigger[] triggers) {
		if (triggers == null) {
			throw new NullPointerException("The triggers cannot be null"); //$NON-NLS-1$
		}

		for (int i = 0; i < triggers.length; i++) {
			if (triggers[i] == null) {
				throw new IllegalArgumentException(
						"All triggers in a trigger sequence must be an instance of Trigger"); //$NON-NLS-1$
			}
		}

		this.triggers = Arrays.asList(triggers);
	}
	
	@Override
	public Trigger[] getTriggers() {
		return triggers.toArray(new Trigger[0]);
	}
	
	public final boolean isEmpty() {
		return triggers.isEmpty();
	}
	
	public final int hashCode() {
		if (hashCode == HASH_CODE_NOT_COMPUTED) {
			hashCode = HASH_INITIAL;
			hashCode = hashCode * HASH_FACTOR + Util.hashCode(triggers.toArray());
			if (hashCode == HASH_CODE_NOT_COMPUTED) {
				hashCode++;
			}
		}

		return hashCode;
	}
	
	public final boolean equals(final Object object) {
		System.err.println("RUNNING EQUALS CHECK");
		// Check if they're the same.
		if (object == this) {
			return true;
		}

		// Check if they're the same type.
		if (!(object instanceof TriggerSequence)) {
			return false;
		}

		final TriggerSequence triggerSequence = (TriggerSequence) object;
		return Util.equals(triggers.toArray(), triggerSequence.getTriggers());
	}
}
