/*
 * generated by Xtext
 */
package at.bestsolution.efxclipse.tooling.fxgraph.ui.contentassist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.JDTHelperProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.Proposal;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.TypeData;
import at.bestsolution.efxclipse.tooling.fxgraph.util.RelativeFileLocator;

import com.google.inject.Inject;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
@SuppressWarnings("restriction")
public class FXGraphProposalProvider extends AbstractFXGraphProposalProvider {


	@Inject
	private IJavaElementFinder javaElementFinder;
	
	@Inject
	private ITypesProposalProvider typeProposalProviders;

	@Inject 
	private IJvmTypeProvider.Factory jdtTypeProvider;
	
	private JDTHelper helper;

	public FXGraphProposalProvider() {
		this.helper = new JDTHelper();
	}

	private TypeData getTypeData(IJavaProject jproject, JvmTypeReference typeRef) {
		try {
			return helper.getTypeData(jproject, jproject.findType(typeRef.getQualifiedName()));
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private IJavaProject getJavaProject(EObject model) {
		// TODO Should we cache that?
		URI uri = model.eResource().getURI();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
		return JavaCore.create(project);
	}

	@Override
	public void complete_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof ResourceValueProperty) {
			Model m = (Model) model.eResource().getContents().get(0);
			String resourceBundle = m.getComponentDef().getPreviewResourceBundle();
			Properties p = null;

			if (resourceBundle != null) {
				File f = RelativeFileLocator.locateFile(model.eResource().getURI(), resourceBundle);
				if (f != null) {
					FileInputStream fi = null;
					try {
						fi = new FileInputStream(f);
						p = new Properties();
						p.load(fi);
						// TODO Should we build the variants and load them?
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						if (fi != null) {
							try {
								fi.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}

			if (p != null) {
				for (String k : p.stringPropertyNames()) {
					StyledString s = new StyledString(k);
					s.append(" - " + p.getProperty(k), StyledString.DECORATIONS_STYLER);
					acceptor.accept(createCompletionProposal("\"" + k + "\"", s, JFaceResources.getImage(JDTHelper.EXTERNALIZED_STRING_KEY), context));
				}
			}
		}
	}

	@Override
	public void completeBindValueProperty_ElementReference(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		TreeIterator<EObject> it = model.eResource().getAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof Element) {
				Element e = (Element) o;
				if (e.getName() != null && e.getName().trim().length() > 0) {
					StyledString s = new StyledString(e.getName());
					s.append(" - " + e.getType().getQualifiedName(), StyledString.DECORATIONS_STYLER);
					acceptor.accept(createCompletionProposal(e.getName(), s, JFaceResources.getImage(JDTHelper.CLASS_KEY), context));
				}
			}
		}
	}

	@Override
	public void completeBindValueProperty_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		BindValueProperty b = (BindValueProperty) model;
		if (b.getElementReference() != null && b.getElementReference().getType() != null) {
			Element element = b.getElementReference();
			IJavaProject jproject = getJavaProject(model);
			TypeData data = getTypeData(jproject, element.getType());
			// TODO Improve by checking assignable type
			for (JDTHelperProperty prop : data.properties) {
				acceptor.accept(createCompletionProposal(prop.name, prop.getDescription(), prop.getIcon(), context));
			}
		}
	}

	@Override
	public void completeControllerHandledValueProperty_Methodname(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Model m = (Model) model.eResource().getContents().get(0);
		if (m != null) {
			ComponentDefinition def = m.getComponentDef();
			if (def != null) {
				if (def.getController() != null) {
					if (model.eContainer() instanceof at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) {
						at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property p = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) model.eContainer();
						if (p.eContainer() instanceof Element) {
							Element element = (Element) p.eContainer();
							IJavaProject jproject = getJavaProject(model);
							TypeData data = getTypeData(jproject, element.getType());
							for (JDTHelperProperty prop : data.properties) {
								if (p.getName().equals(prop.name)) {
									List<IMethod> methods = findControllerJavaMethods(jproject, def.getController().getType(), prop.method);
									for (IMethod me : methods) {
										Image img = null;
										try {
											if (Flags.isPublic(me.getFlags())) {
												img = JFaceResources.getImage(JDTHelper.METHOD_PUBLIC_KEY);
											} else if (Flags.isProtected(me.getFlags())) {
												img = JFaceResources.getImage(JDTHelper.METHOD_PROTECTED_KEY);
											} else if (Flags.isPackageDefault(me.getFlags())) {
												img = JFaceResources.getImage(JDTHelper.METHOD_DEFAULT_KEY);
											} else {
												img = JFaceResources.getImage(JDTHelper.METHOD_PRIVATE_KEY);
											}
										} catch (JavaModelException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										acceptor.accept(createCompletionProposal(me.getElementName(), me.getElementName() + "(" + Signature.getSimpleName(Signature.toString(me.getParameterTypes()[0])) + ")", img, context));
									}

								}
							}
						}
					}
				}
			}
		}
		super.completeControllerHandledValueProperty_Methodname(model, assignment, context, acceptor);
	}

	private List<IMethod> findControllerJavaMethods(IJavaProject jproject, JvmType type, IMethod bindMethod) {
		IType jdtType = (IType) javaElementFinder.findElementFor(type);

		List<IMethod> allMethods = new ArrayList<IMethod>();
		try {
			allMethods.addAll(Arrays.asList(jdtType.getMethods()));

			for (IType t : JavaModelUtil.getAllSuperTypes(jdtType, new NullProgressMonitor())) {
				allMethods.addAll(Arrays.asList(t.getMethods()));
			}

			String returnSignature = Signature.toString(bindMethod.getReturnType());
			String eventType = null;

			if (returnSignature.startsWith("javafx.event.EventHandler<? super ") || returnSignature.startsWith("javafx.event.EventHandler<")) {
				if (returnSignature.startsWith("javafx.event.EventHandler<? super ")) {
					eventType = returnSignature.substring("javafx.event.EventHandler<? super ".length(), returnSignature.length() - 1);
				} else {
					eventType = returnSignature.substring("javafx.event.EventHandler<".length(), returnSignature.length() - 1);
				}
			}

			List<IMethod> rv = new ArrayList<IMethod>();
			for (IMethod m : allMethods) {
				boolean found = false;
				for (IAnnotation a : m.getAnnotations()) {
					if (a.getElementName().endsWith("FXML")) {
						found = true;
					}
				}
				if (found) {
					String[] types = m.getParameterTypes();
					if (types.length == 1) {
						String[][] paramType = ((IType) m.getParent()).resolveType(Signature.toString(types[0]));
						String v = Signature.toQualifiedName(paramType[0]);
						if (v.equals(eventType)) {
							rv.add(m);
						}
					}
				}
			}

			return rv;
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	@Override
	public void completeStaticValueProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		StaticValueProperty prop = (StaticValueProperty) model;
		JvmTypeReference typeRef = prop.getType();
		JvmTypeReference parentTypeRef = null;

		if (model.eContainer() instanceof Element) {
			Element e = (Element) model.eContainer();
			parentTypeRef = e.getType();
		}

		if (typeRef != null && parentTypeRef != null) {
			IType jdtType = (IType) javaElementFinder.findElementFor(typeRef.getType());
			IType parentJdtType = (IType) javaElementFinder.findElementFor(parentTypeRef.getType());

			List<IMethod> allMethods = new ArrayList<IMethod>();
			try {
				allMethods.addAll(Arrays.asList(jdtType.getMethods()));

				for (IType t : JavaModelUtil.getAllSuperTypes(jdtType, new NullProgressMonitor())) {
					allMethods.addAll(Arrays.asList(t.getMethods()));
				}

				IJavaProject jproject = getJavaProject(model);
				for (IMethod m : allMethods) {
					if (Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && m.getParameterTypes().length == 2) {
						IType t = (IType) m.getParent();
						String signature = Signature.toString(m.getParameterTypes()[0]);
						if (signature.equals("int") || signature.equals("double")) {
							continue;
						} else {

						}
						String p1FQN = Signature.toQualifiedName(t.resolveType(Signature.toString(m.getParameterTypes()[0]))[0]);

						IType parameterType = jproject.findType(p1FQN);

						if (canAssign(parameterType, parentJdtType)) {
							StyledString s = new StyledString(JDTHelper.extractAttributename(m.getElementName()) + " : ");
							s.append(Signature.toString(m.getParameterTypes()[1]), StyledString.QUALIFIER_STYLER);
							
							ICompletionProposal cp = createCompletionProposal(JDTHelper.extractAttributename(m.getElementName()), s, JFaceResources.getImage(JDTHelper.STAT_METHOD_PUBLIC_KEY), context);
							
							if( cp instanceof ConfigurableCompletionProposal ) {
								ConfigurableCompletionProposal cProposal = (ConfigurableCompletionProposal) cp;
								cProposal.setAdditionalProposalInfo(model);
								cProposal.setHover(new HoverImpl(m));
							}
							
							acceptor.accept(cp);
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	private static boolean canAssign(IType target, IType targetToAssign) {
		if (target.equals(targetToAssign)) {
			return true;
		}

		try {
			for (IType parentType : JavaModelUtil.getAllSuperTypes(targetToAssign, new NullProgressMonitor())) {
				if (parentType.equals(target)) {
					return true;
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void complete_Property(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (context.getCurrentModel() instanceof Element) {
			Element element = (Element) context.getCurrentModel();
			TypeData data = getTypeData(getJavaProject(model), element.getType());
			if (data != null) {
				for (JDTHelperProperty p : data.properties) {
					ICompletionProposal proposal = createCompletionProposal(p.name + " : ", p.getDescription(), p.getIcon(), context);
					if( proposal instanceof ConfigurableCompletionProposal ) {
						ConfigurableCompletionProposal cProposal = (ConfigurableCompletionProposal) proposal;
						cProposal.setAdditionalProposalInfo(element);
						cProposal.setHover(new HoverImpl(p.method));
					}
					acceptor.accept(proposal);
				}
			}
		}
		super.complete_Property(model, ruleCall, context, acceptor);
	}

	@Override
	public void completeProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (context.getCurrentModel() instanceof at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) {
			Element element = (Element) ((at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) context.getCurrentModel()).eContainer();
			TypeData data = getTypeData(getJavaProject(model), element.getType());
			if (data != null) {
				for (JDTHelperProperty p : data.properties) {
					ICompletionProposal proposal = createCompletionProposal(p.name + " : ", p.getDescription(), p.getIcon(), context);
					if( proposal instanceof ConfigurableCompletionProposal ) {
						ConfigurableCompletionProposal cProposal = (ConfigurableCompletionProposal) proposal;
						cProposal.setAdditionalProposalInfo(element);
						cProposal.setHover(new HoverImpl(p.method));
					}
					acceptor.accept(proposal);
				}
			}
		}
		super.completeProperty_Name(model, assignment, context, acceptor);
	}

	@Override
	public void completeProperty_Preview(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// System.err.println("Property preview completetion");
		// TODO Auto-generated method stub
		super.completeProperty_Preview(model, assignment, context, acceptor);
	}

	@Override
	public void completeProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (context.getCurrentModel().eContainer() instanceof Element) {
			at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property propertyElement = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) context.getCurrentModel();
			Element element = (Element) context.getCurrentModel().eContainer();
			TypeData data = getTypeData(getJavaProject(model), element.getType());

			if (data != null) {
				for (JDTHelperProperty p : data.properties) {
					if (p.name.equals(propertyElement.getName())) {
						for (Proposal prop : p.getProposals()) {
							acceptor.accept(createCompletionProposal(prop.value, prop.description, prop.icon, context));
						}
						return;
					}
				}
			}
		}
		super.completeProperty_Value(model, assignment, context, acceptor);
	}

	@Override
	public void completeJvmParameterizedTypeReference_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// We are in single property
		if (model.eContainer() instanceof at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) {
			final IJavaProject jp = getJavaProject(model);
			at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property p = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) model.eContainer();
			Element e = (Element) model.eContainer().eContainer();

			try {
				TypeData typeData = helper.getTypeData(jp, jp.findType(e.getType().getQualifiedName()));
				IType type = null;

				for (JDTHelperProperty jdtProp : typeData.properties) {
					if (jdtProp.name.equals(p.getName())) {
						type = jp.findType(Signature.toString(jdtProp.method.getReturnType()));
						break;
					}
				}

				if( type != null ) {
					JvmType superType = jdtTypeProvider.createTypeProvider(model.eResource().getResourceSet()).findTypeByName(type.getFullyQualifiedName());
					
					if( superType != null) {
						typeProposalProviders.createSubTypeProposals(superType, this, context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, acceptor);	
					}
				}
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if( model instanceof Element && model.eContainer() instanceof ListValueProperty && model.eContainer().eContainer() instanceof at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property && model.eContainer().eContainer().eContainer() instanceof Element ) {
			final IJavaProject jp = getJavaProject(model);
			at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property p = (at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property) model.eContainer().eContainer();
			Element e = (Element) model.eContainer().eContainer().eContainer();
			
			try {
				TypeData typeData = helper.getTypeData(jp, jp.findType(e.getType().getQualifiedName()));
				IType type = null;

				for (JDTHelperProperty jdtProp : typeData.properties) {
					if (jdtProp.name.equals(p.getName())) {
						String[] t = Signature.getTypeArguments(jdtProp.method.getReturnType());
						if( t.length > 0 ) {
							type = jp.findType(Signature.toString(t[0]));
						}
						break;
					}
				}

				if( type != null ) {
					JvmType superType = jdtTypeProvider.createTypeProvider(model.eResource().getResourceSet()).findTypeByName(type.getFullyQualifiedName());
					if( superType != null ) {
						typeProposalProviders.createSubTypeProposals(superType, this, context, TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE, acceptor);		
					}
				}
			} catch (JavaModelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else {
			super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
		}
	}
	
	@Override
	public void completeElement_Factory(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Element element = (Element) model;
		
		if( element.getType() != null ) {
			Property property = (Property) element.eContainer();
			Element parentElement = (Element) property.eContainer();
			
			IType targetType = null;
			IJavaProject jProject = getJavaProject(model);
			
			for( JDTHelperProperty p : getTypeData(getJavaProject(model), parentElement.getType()).properties ) {
				if( p.name.equals(property.getName()) ) {
					try {
						String rt = p.method.getReturnType();
						String typeName = Signature.toString(Signature.getTypeErasure(rt));
						targetType = jProject.findType(typeName);
						break;
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			IType type = (IType) javaElementFinder.findElementFor(element.getType().getType());
			if( type != null ) {
				try {
					for( IMethod m : type.getMethods() ) {
						
						if( Flags.isPublic(m.getFlags()) && Flags.isStatic(m.getFlags()) && ! m.getReturnType().equals("void") && m.getParameterNames().length == 0 ) {
							String rt = m.getReturnType();
							String typeName = Signature.toString(Signature.getTypeErasure(rt));
							IType returnType = jProject.findType(typeName);
							
							if( returnType != null && targetType != null && canAssign(returnType, targetType) ) {
								StyledString s = new StyledString(m.getElementName() + " : " + Signature.getSignatureSimpleName(m.getReturnType()) );
								s.append(" - " + type.getElementName(), StyledString.QUALIFIER_STYLER);
								
								ICompletionProposal proposal = createCompletionProposal(m.getElementName(), s, JFaceResources.getImage(JDTHelper.STAT_METHOD_PUBLIC_KEY), context);
								if( proposal instanceof ConfigurableCompletionProposal ) {
									ConfigurableCompletionProposal cProposal = (ConfigurableCompletionProposal) proposal;
									cProposal.setAdditionalProposalInfo(element);
									cProposal.setHover(new HoverImpl(m));
								}
								acceptor.accept(proposal);
							}
						}
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		super.completeElement_Factory(model, assignment, context, acceptor);
	}
	
	static class HoverImpl implements IEObjectHover, ITextHoverExtension {
		private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper ();
		private IMethod method;
		
		public HoverImpl(IMethod method) {
			this.method = method;
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			javadocHover.setJavaElement(method);
			return javadocHover.getHoverInfo2(textViewer, hoverRegion);
		}

		@Override
		public IInformationControlCreator getHoverControlCreator() {
			return javadocHover.getHoverControlCreator();
		}
		
	}
	
	static class JavadocHoverWrapper extends JavadocHover  {

		IJavaElement currentElement;
		
		void setJavaElement (IJavaElement element) {
			currentElement = element;
		}
		
		@Override
		protected IJavaElement[] getJavaElementsAt(ITextViewer textViewer, IRegion hoverRegion) {
			// hack: return previously registered element
			// required as JavadocHover.getHoverInfo(IJavaElement[] elements,...) is private
			return new IJavaElement[] { currentElement };
		}	
		
	}
}
