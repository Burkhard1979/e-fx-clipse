package at.bestsolution.efxclipse.runtime.ecp.dummy;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPElement;

public class DummyProvider implements ECPProvider {

	DummyWorkspace workspace = DummyWorkspace.INSTANCE;

	@Override
	public String getName() {
		return "Dummy Provider";
	}

	@Override
	public String getType() {
		return ECPProvider.TYPE;
	}

	@Override
	public int compareTo(ECPElement arg0) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Object getAdapter(Class adapter) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public String getLabel() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Set<ECPRepository> getRepositories() {
		return Collections.singleton((ECPRepository) workspace.getRepository());
	}

	@Override
	public boolean canAddRepositories() {
		return false;
	}

	@Override
	public boolean hasUnsharedProjectSupport() {
		return false;
	}

}
