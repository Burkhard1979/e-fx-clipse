/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTask;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Deploy;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.Jar;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.model.anttasks.SignJar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntTasksFactoryImpl extends EFactoryImpl implements AntTasksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AntTasksFactory init() {
		try {
			AntTasksFactory theAntTasksFactory = (AntTasksFactory)EPackage.Registry.INSTANCE.getEFactory("http://at.bestsolution.efxclipse.tooling.jdt/1.0"); 
			if (theAntTasksFactory != null) {
				return theAntTasksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AntTasksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntTasksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AntTasksPackage.ANT_TASK: return createAntTask();
			case AntTasksPackage.DEPLOY: return createDeploy();
			case AntTasksPackage.JAR: return createJar();
			case AntTasksPackage.SIGN_JAR: return createSignJar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntTask createAntTask() {
		AntTaskImpl antTask = new AntTaskImpl();
		return antTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy createDeploy() {
		DeployImpl deploy = new DeployImpl();
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jar createJar() {
		JarImpl jar = new JarImpl();
		return jar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignJar createSignJar() {
		SignJarImpl signJar = new SignJarImpl();
		return signJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntTasksPackage getAntTasksPackage() {
		return (AntTasksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AntTasksPackage getPackage() {
		return AntTasksPackage.eINSTANCE;
	}

} //AntTasksFactoryImpl
