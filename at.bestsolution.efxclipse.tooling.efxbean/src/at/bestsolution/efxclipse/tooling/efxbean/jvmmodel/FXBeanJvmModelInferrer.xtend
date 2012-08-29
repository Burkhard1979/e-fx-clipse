package at.bestsolution.efxclipse.tooling.efxbean.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.FXBeanUnit
import quicktime.app.display.FullScreenWindow$QTM
import org.eclipse.xtext.naming.IQualifiedNameProvider
import at.bestsolution.efxclipse.tooling.efxbean.fXBean.Bean
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.common.types.access.IJvmTypeProvider

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class FXBeanJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject private TypesFactory typesFactory;
	@Inject private IJvmTypeProvider$Factory typeProviderFactory;

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
   	def dispatch void infer(Bean element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
//   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
//   		acceptor.accept(element.toClass(element.fullyQualifiedName)).initializeLater([ 
//   			if (element.superType != null)
//				superTypes += element.superType.cloneWithProxies
//				val procedure = element.newTypeRef(typeof(Procedure1), it.newTypeRef())
//				members += element.toConstructor() []
//				members += element.toConstructor() [
//				parameters += element.toParameter("initializer", procedure)
//				body = [it.append("initializer.apply(this);")]
//				val fields = <JvmField>newArrayList()
//				
//				val IJvmTypeProvider typeProvider = typeProviderFactory.findOrCreateTypeProvider(element.eResource.resourceSet);
//				
//				for ( prop : element.properties ) {
//					val result = typesFactory.createJvmField();
//					result.setSimpleName(prop.name);
//					result.setVisibility(JvmVisibility::PRIVATE);
////					typeProvider.findTypeByName(prop.type.fullyQualifiedName.toString);
//					
//					if( prop.type.fullyQualifiedName.equals("java.lang.String") ) {
//						typeProvider.findTypeByName("");
//					} else if( prop.type.fullyQualifiedName.equals("java.lang.Double") ) {
//						
//					} else if( prop.type.fullyQualifiedName.equals("java.lang.Integer") ) {
//						
//					} else if( prop.type.fullyQualifiedName.equals("java.lang.Boolean") ) {
//						
//					} else {
//						
//					}
//				}
//			]
//   		])
   	}
}

