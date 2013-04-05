package at.bestsolution.efxclipse.runtime.ecp.dummy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPElement;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DummyProject implements ECPProject {
	
	EditingDomain editingDomain;
	Resource resource;
	String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public String getType() {
		return ECPProject.TYPE;
	}

	@Override
	public int compareTo(ECPElement arg0) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ECPModelContext getContext() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ECPProvider getProvider() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ECPRepository getRepository() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public ECPProperties getProperties() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean isOpen() {
		return true;
	}

	@Override
	public void open() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void close() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean canDelete() {
		return false;
	}

	@Override
	public void delete() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	@Override
	public Object getAdapter(Class adapter) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public EList<Object> getElements() {
		EList<? extends Object> contents = ECollections.unmodifiableEList(resource.getContents());
		return (EList<Object>) contents;
	}

	@Override
	public Collection<EPackage> getUnsupportedEPackages() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void setVisiblePackages(Set<EPackage> visiblePackages) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Set<EPackage> getVisiblePackages() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Set<EClass> getVisibleEClasses() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void setVisibleEClasses(Set<EClass> visibleEClasses) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public Iterator<EObject> getReferenceCandidates(EObject eObject, EReference eReference) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void saveProperties() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void saveModel() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean isModelDirty() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public void deleteElements(Collection<EObject> eObjects) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean isModelRoot(Object object) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public boolean contains(Object object) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

}
