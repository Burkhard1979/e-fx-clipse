package at.bestsolution.efxclipse.text.editor.internal;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.text.templates.TemplateException;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleReference;

import at.bestsolution.efxclipse.jface.preferences.IPreferenceStore;
import at.bestsolution.efxclipse.jface.preferences.ScopedPreferenceStore;
import at.bestsolution.efxclipse.text.editor.AnnotationPreferenceLookup;
import at.bestsolution.efxclipse.text.editor.AnnotationTypeHierarchy;
import at.bestsolution.efxclipse.text.editor.AnnotationTypeLookup;
import at.bestsolution.efxclipse.text.editor.MarkerAnnotationPreferences;
import at.bestsolution.efxclipse.text.editor.spelling.SpellingEngineRegistry;
import at.bestsolution.efxclipse.text.editor.spelling.SpellingService;

public class TextEditorPlugin implements BundleActivator {
	public static final String PLUGIN_ID = "at.bestsolution.efxclipse.text.editor";

	private static TextEditorPlugin INSTANCE;
	
	public static void log(IStatus status) {
		// TODO Auto-generated method stub
		
	}

	public static void log(String string, CoreException e) {
		// TODO Auto-generated method stub
		
	}

	private AnnotationTypeLookup annotationTypeLookup;

	private AnnotationTypeHierarchy annotationTypeHierarchy;

	private MarkerAnnotationPreferences markerAnnotationPreferences;

	private AnnotationPreferenceLookup annotationPreferenceLookup;
	
	/**
	 * The spelling engine registry
	 * @since 3.1
	 */
	private SpellingEngineRegistry spellingEngineRegistry;

	private SpellingService spellingService;

	private ScopedPreferenceStore preferenceStore;

	@Override
	public void start(BundleContext context) throws Exception {
		INSTANCE = this;
		spellingEngineRegistry= new SpellingEngineRegistry();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		INSTANCE = null;
	}
	
	public static TextEditorPlugin getDefault() {
		return INSTANCE;
	}
	
	/**
	 * Returns the annotation type lookup of this plug-in.
	 *
	 * @return the annotation type lookup
	 * @since 3.0
	 */
	public AnnotationTypeLookup getAnnotationTypeLookup() {
		if (annotationTypeLookup == null)
			annotationTypeLookup= new AnnotationTypeLookup();
		return annotationTypeLookup;
	}
	
	/**
	 * Returns the annotation type hierarchy for this plug-in.
	 *
	 * @return the annotation type hierarchy
	 * @since 3.0
	 */
	public AnnotationTypeHierarchy getAnnotationTypeHierarchy() {
		if (annotationTypeHierarchy == null)
			annotationTypeHierarchy= new AnnotationTypeHierarchy();
		return annotationTypeHierarchy;
	}
	
	/**
	 * Tells whether the marker annotation preferences are initialized.
	 *
	 * @return <code>true</code> if initialized
	 * @since 3.2
	 */
	public boolean isMarkerAnnotationPreferencesInitialized() {
		return markerAnnotationPreferences != null;
	}
	
	/**
	 * Returns the marker annotation preferences.
	 *
	 * @return the marker annotation preferences
	 * @since 3.1
	 */
	public synchronized MarkerAnnotationPreferences getMarkerAnnotationPreferences() {
		if (!isMarkerAnnotationPreferencesInitialized())
			new MarkerAnnotationPreferences().getAnnotationPreferences(); // force creation of shared preferences
		return markerAnnotationPreferences;
	}
	
	/**
	 * Sets the marker annotation preferences.
	 * <p>
	 * Note: This method must only be called once.
	 * </p>
	 *
	 * @param markerAnnotationPreferences the marker annotation preferences
	 * @since 3.1
	 */
	public synchronized void setMarkerAnnotationPreferences(MarkerAnnotationPreferences markerAnnotationPreferences) {
		Assert.isTrue(this.markerAnnotationPreferences == null);
		this.markerAnnotationPreferences= markerAnnotationPreferences;
	}
	
	/**
	 * Returns the annotation preference lookup of this plug-in.
	 *
	 * @return the annotation preference lookup
	 * @since 3.0
	 */
	public AnnotationPreferenceLookup getAnnotationPreferenceLookup() {
		if (annotationPreferenceLookup == null)
			annotationPreferenceLookup= new AnnotationPreferenceLookup();
		return annotationPreferenceLookup;
	}
	
	/**
	 * Returns this plug-ins spelling engine registry.
	 *
	 * @return the spelling engine registry or <code>null</code> if this plug-in has been shutdown
	 * @since 3.1
	 */
	public SpellingEngineRegistry getSpellingEngineRegistry() {
		return spellingEngineRegistry;
	}
	
	/**
	 * Returns the spelling service.
	 *
	 * @return the spelling service
	 * @since 3.1
	 */
	public SpellingService getSpellingService() {
		if (spellingService == null)
			spellingService= new SpellingService(getPreferenceStore());
		return spellingService;
	}
	
	/**
     * Returns the preference store for this UI plug-in.
     * This preference store is used to hold persistent settings for this plug-in in
     * the context of a workbench. Some of these settings will be user controlled, 
     * whereas others may be internal setting that are never exposed to the user.
     * <p>
     * If an error occurs reading the preference store, an empty preference store is
     * quietly created, initialized with defaults, and returned.
     * </p>
     * <p>
     * <strong>NOTE:</strong> As of Eclipse 3.1 this method is
     * no longer referring to the core runtime compatibility layer and so
     * plug-ins relying on Plugin#initializeDefaultPreferences
     * will have to access the compatibility layer themselves.
     * </p>
     *
     * @return the preference store 
     */
    public IPreferenceStore getPreferenceStore() {
        // Create the preference store lazily.
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(new InstanceScope(),getBundle().getSymbolicName());

        }
        return preferenceStore;
    }
    
    /**
	 * Returns the bundle associated with this plug-in.
	 * 
	 * @return the associated bundle
	 * @since 3.0
	 */
	public final Bundle getBundle() {
//		if (bundle != null)
//			return bundle;
		ClassLoader cl = getClass().getClassLoader();
		if (cl instanceof BundleReference)
			return ((BundleReference) cl).getBundle(); 
		return null;
	}

	public static void log(CoreException e) {
		// TODO Auto-generated method stub
		
	}

	public static void logErrorMessage(String format) {
		// TODO Auto-generated method stub
		
	}

	public static void log(String format, TemplateException e) {
		// TODO Auto-generated method stub
		
	}

	public static void log(IOException x) {
		// TODO Auto-generated method stub
		
	}
}
