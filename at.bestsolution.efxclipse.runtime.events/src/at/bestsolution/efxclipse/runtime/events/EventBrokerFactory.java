package at.bestsolution.efxclipse.runtime.events;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;



/**
 * Use this class to obtain an instance of {@link IEventBroker}.
 * 
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be sub-classed by clients.
 */

@SuppressWarnings("restriction")
public class EventBrokerFactory extends ContextFunction {
	@Override
	public Object compute(IEclipseContext context) {
        EventBroker broker = context.getLocal(EventBroker.class);
		if (broker == null) {
            broker = ContextInjectionFactory.make(EventBroker.class, context);
            context.set(EventBroker.class, broker);
		}
		return broker;
	}
}

