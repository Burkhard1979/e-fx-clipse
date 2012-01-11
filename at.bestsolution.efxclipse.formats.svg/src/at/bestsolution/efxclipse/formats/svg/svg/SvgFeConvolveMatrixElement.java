/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fe Convolve Matrix Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getOrder <em>Order</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getKernelMatrix <em>Kernel Matrix</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getDivisor <em>Divisor</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getBias <em>Bias</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getTargetX <em>Target X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getTargetY <em>Target Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getEdgeMode <em>Edge Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getKernelUnitLength <em>Kernel Unit Length</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#isPreserveAlpha <em>Preserve Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement()
 * @model
 * @generated
 */
public interface SvgFeConvolveMatrixElement extends SvgElement, CoreAttributes, PresentationAttributes, FilterPrimitiveAttributes, ContentElement<SvgElement> {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_Order()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.NumberOptionalNumber"
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

	/**
	 * Returns the value of the '<em><b>Kernel Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Matrix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Matrix</em>' attribute.
	 * @see #setKernelMatrix(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_KernelMatrix()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.ListOfNumbers"
	 * @generated
	 */
	String getKernelMatrix();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getKernelMatrix <em>Kernel Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Matrix</em>' attribute.
	 * @see #getKernelMatrix()
	 * @generated
	 */
	void setKernelMatrix(String value);

	/**
	 * Returns the value of the '<em><b>Divisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisor</em>' attribute.
	 * @see #setDivisor(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_Divisor()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getDivisor();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getDivisor <em>Divisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divisor</em>' attribute.
	 * @see #getDivisor()
	 * @generated
	 */
	void setDivisor(Double value);

	/**
	 * Returns the value of the '<em><b>Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bias</em>' attribute.
	 * @see #setBias(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_Bias()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getBias();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getBias <em>Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias</em>' attribute.
	 * @see #getBias()
	 * @generated
	 */
	void setBias(Double value);

	/**
	 * Returns the value of the '<em><b>Target X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target X</em>' attribute.
	 * @see #setTargetX(Integer)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_TargetX()
	 * @model
	 * @generated
	 */
	Integer getTargetX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getTargetX <em>Target X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target X</em>' attribute.
	 * @see #getTargetX()
	 * @generated
	 */
	void setTargetX(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Y</em>' attribute.
	 * @see #setTargetY(Integer)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_TargetY()
	 * @model
	 * @generated
	 */
	Integer getTargetY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getTargetY <em>Target Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Y</em>' attribute.
	 * @see #getTargetY()
	 * @generated
	 */
	void setTargetY(Integer value);

	/**
	 * Returns the value of the '<em><b>Edge Mode</b></em>' attribute.
	 * The default value is <code>"ConvolveMatrixEdgeMode.duplicate"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.svg.svg.ConvolveMatrixEdgeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ConvolveMatrixEdgeMode
	 * @see #setEdgeMode(ConvolveMatrixEdgeMode)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_EdgeMode()
	 * @model default="ConvolveMatrixEdgeMode.duplicate"
	 * @generated
	 */
	ConvolveMatrixEdgeMode getEdgeMode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getEdgeMode <em>Edge Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ConvolveMatrixEdgeMode
	 * @see #getEdgeMode()
	 * @generated
	 */
	void setEdgeMode(ConvolveMatrixEdgeMode value);

	/**
	 * Returns the value of the '<em><b>Kernel Unit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Unit Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Unit Length</em>' attribute.
	 * @see #setKernelUnitLength(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_KernelUnitLength()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.NumberOptionalNumber"
	 * @generated
	 */
	String getKernelUnitLength();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#getKernelUnitLength <em>Kernel Unit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Unit Length</em>' attribute.
	 * @see #getKernelUnitLength()
	 * @generated
	 */
	void setKernelUnitLength(String value);

	/**
	 * Returns the value of the '<em><b>Preserve Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preserve Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preserve Alpha</em>' attribute.
	 * @see #setPreserveAlpha(boolean)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeConvolveMatrixElement_PreserveAlpha()
	 * @model
	 * @generated
	 */
	boolean isPreserveAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrixElement#isPreserveAlpha <em>Preserve Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preserve Alpha</em>' attribute.
	 * @see #isPreserveAlpha()
	 * @generated
	 */
	void setPreserveAlpha(boolean value);

} // SvgFeConvolveMatrixElement
