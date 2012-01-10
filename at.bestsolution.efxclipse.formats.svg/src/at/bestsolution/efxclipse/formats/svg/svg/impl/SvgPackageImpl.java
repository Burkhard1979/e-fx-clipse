/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg.impl;

import at.bestsolution.efxclipse.formats.svg.svg.Alignment_baseline;
import at.bestsolution.efxclipse.formats.svg.svg.BasicShapeElement;
import at.bestsolution.efxclipse.formats.svg.svg.BlendMode;
import at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector;
import at.bestsolution.efxclipse.formats.svg.svg.ClipPathUnits;
import at.bestsolution.efxclipse.formats.svg.svg.Clip_rule;
import at.bestsolution.efxclipse.formats.svg.svg.ColorMatrixType;
import at.bestsolution.efxclipse.formats.svg.svg.Color_interpolation;
import at.bestsolution.efxclipse.formats.svg.svg.Color_interpolation_filters;
import at.bestsolution.efxclipse.formats.svg.svg.Color_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.CompositeOperator;
import at.bestsolution.efxclipse.formats.svg.svg.ConditionalProcessingAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.ContainerElement;
import at.bestsolution.efxclipse.formats.svg.svg.ConvolveMatrixEdgeMode;
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.DescriptiveElement;
import at.bestsolution.efxclipse.formats.svg.svg.Direction;
import at.bestsolution.efxclipse.formats.svg.svg.Display;
import at.bestsolution.efxclipse.formats.svg.svg.DocumentEventAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.Dominant_baseline;
import at.bestsolution.efxclipse.formats.svg.svg.Fill_rule;
import at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveElement;
import at.bestsolution.efxclipse.formats.svg.svg.FilterUnits;
import at.bestsolution.efxclipse.formats.svg.svg.Font_stretch;
import at.bestsolution.efxclipse.formats.svg.svg.Font_style;
import at.bestsolution.efxclipse.formats.svg.svg.Font_variant;
import at.bestsolution.efxclipse.formats.svg.svg.Font_weight;
import at.bestsolution.efxclipse.formats.svg.svg.GradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.GradientUnits;
import at.bestsolution.efxclipse.formats.svg.svg.GraphicalEventAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.GraphicsElement;
import at.bestsolution.efxclipse.formats.svg.svg.GraphicsReferencingElement;
import at.bestsolution.efxclipse.formats.svg.svg.Image_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.LengthAdjust;
import at.bestsolution.efxclipse.formats.svg.svg.LightSourceElement;
import at.bestsolution.efxclipse.formats.svg.svg.MarkerUnits;
import at.bestsolution.efxclipse.formats.svg.svg.MaskUnits;
import at.bestsolution.efxclipse.formats.svg.svg.Method;
import at.bestsolution.efxclipse.formats.svg.svg.MorphologyOperator;
import at.bestsolution.efxclipse.formats.svg.svg.Overflow;
import at.bestsolution.efxclipse.formats.svg.svg.PatternUnits;
import at.bestsolution.efxclipse.formats.svg.svg.Pointer_events;
import at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.Rendering_intent;
import at.bestsolution.efxclipse.formats.svg.svg.ShapeElement;
import at.bestsolution.efxclipse.formats.svg.svg.Shape_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.Spacing;
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod;
import at.bestsolution.efxclipse.formats.svg.svg.StitchTiles;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linecap;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linejoin;
import at.bestsolution.efxclipse.formats.svg.svg.StructuralElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphDefElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphItemElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphRefElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgDescElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFactory;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeBlend;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeColorMatrix;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeComponentTransfer;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrix;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeDiffuseLighting;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeFlood;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncA;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncB;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncG;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncR;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeImage;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeMerge;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeMergeNode;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeMorphology;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeOffset;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFePointLight;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpecularLighting;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpotLight;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeTile;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeTurbulence;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgGElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgGradientStopElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgImageElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgLineElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgMarkerElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgMaskElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPackage;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPatternElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPolygonElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPolylineElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSwitchElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSymbolElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgTextElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgTextPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgTitleElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgTrefElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgTspanElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement;
import at.bestsolution.efxclipse.formats.svg.svg.TextContentChildElement;
import at.bestsolution.efxclipse.formats.svg.svg.TextContentElement;
import at.bestsolution.efxclipse.formats.svg.svg.Text_anchor;
import at.bestsolution.efxclipse.formats.svg.svg.Text_rendering;
import at.bestsolution.efxclipse.formats.svg.svg.TurbulenceType;
import at.bestsolution.efxclipse.formats.svg.svg.Unicode_bidi;
import at.bestsolution.efxclipse.formats.svg.svg.Visibility;
import at.bestsolution.efxclipse.formats.svg.svg.Writing_mode;
import at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.ZoomAndPan;
import at.bestsolution.efxclipse.formats.svg.svg.____ATTRIBUTES____;
import at.bestsolution.efxclipse.formats.svg.svg.____DATATYPES____;
import at.bestsolution.efxclipse.formats.svg.svg.____ELEMENTES____;
import at.bestsolution.efxclipse.formats.svg.svg.____ENUMS____;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgPackageImpl extends EPackageImpl implements SvgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsReferencingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicShapeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContentChildElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterPrimitiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ____ENUMS____EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ____DATATYPES____EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ____ATTRIBUTES____EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalProcessingAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEventAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalEventAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLinkAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterPrimitiveAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ____ELEMENTES____EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgSvgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgGElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgDefsElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgDescElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgTitleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgSymbolElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgUseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgImageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgSwitchElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgRectElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgCircleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgEllipseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgLineElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgPolylineElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgPolygonElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgTspanElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgTrefElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgTextPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgAltGlyphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgAltGlyphDefElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgAltGlyphItemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgAltGlyphRefElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgMarkerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgColorProfileElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgLinearGradientElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgRadialGradientElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgGradientStopElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgClipPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgMaskElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFilterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeDistantLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFePointLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeSpotLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeBlendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeColorMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeComponentTransferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeFuncREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeFuncGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeFuncBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeFuncAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeConvolveMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeDiffuseLightingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeDisplacementMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeFloodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeGaussianBlurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeMergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeMorphologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeSpecularLightingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeTileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFeTurbulenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignment_baselineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clip_ruleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum color_interpolationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum color_interpolation_filtersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum color_renderingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dominant_baselineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fill_ruleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum font_stretchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum font_styleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum font_variantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum font_weightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum image_renderingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overflowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pointer_eventsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shape_renderingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stroke_linecapEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stroke_linejoinEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum text_anchorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum text_renderingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unicode_bidiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum writing_modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum zoomAndPanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthAdjustEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spacingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum markerUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rendering_intentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradientUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spreadMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patternUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clipPathUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maskUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blendModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorMatrixTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum convolveMatrixEdgeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelSelectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum morphologyOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stitchTilesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum turbulenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shapeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType funciriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paintEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacity_valueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseline_shiftEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clipEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clip_pathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color_profileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cursorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enable_backgroundEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fill_opacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flood_colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flood_opacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType font_familyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType font_sizeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType font_size_adjustEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glyph_orientation_horizontalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glyph_orientation_verticalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kerningEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType letter_spacingEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lighting_colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marker_endEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marker_midEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marker_startEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masksEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stop_colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stop_opacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stroke_dasharrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stroke_dashoffsetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stroke_miterlimitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stroke_opacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stroke_widthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType text_decorationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType word_spacingEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewBoxEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preserveAspectRatioEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transformEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfPointsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfLengthsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfNumbersEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfCoordinatesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberOptionalNumberEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SvgPackageImpl() {
		super(eNS_URI, SvgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SvgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SvgPackage init() {
		if (isInited) return (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Obtain or create and register package
		SvgPackageImpl theSvgPackage = (SvgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SvgPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSvgPackage.createPackageContents();

		// Initialize created meta-data
		theSvgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSvgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SvgPackage.eNS_URI, theSvgPackage);
		return theSvgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerElement() {
		return containerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerElement_Children() {
		return (EReference)containerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralElement() {
		return structuralElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgElement() {
		return svgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveElement() {
		return descriptiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsElement() {
		return graphicsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsReferencingElement() {
		return graphicsReferencingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeElement() {
		return shapeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicShapeElement() {
		return basicShapeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContentElement() {
		return textContentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContentChildElement() {
		return textContentChildElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientElement() {
		return gradientElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSourceElement() {
		return lightSourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterPrimitiveElement() {
		return filterPrimitiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get____ENUMS____() {
		return ____ENUMS____EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get____DATATYPES____() {
		return ____DATATYPES____EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get____ATTRIBUTES____() {
		return ____ATTRIBUTES____EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalProcessingAttributes() {
		return conditionalProcessingAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalProcessingAttributes_RequiredFeatures() {
		return (EAttribute)conditionalProcessingAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalProcessingAttributes_RequiredExtensions() {
		return (EAttribute)conditionalProcessingAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalProcessingAttributes_SystemLanguage() {
		return (EAttribute)conditionalProcessingAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreAttributes() {
		return coreAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreAttributes_Id() {
		return (EAttribute)coreAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreAttributes_Xml__base() {
		return (EAttribute)coreAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreAttributes_Xml__lang() {
		return (EAttribute)coreAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreAttributes_Xml__space() {
		return (EAttribute)coreAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentEventAttributes() {
		return documentEventAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onunload() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onabort() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onerror() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onresize() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onscroll() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEventAttributes_Onzoom() {
		return (EAttribute)documentEventAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalEventAttributes() {
		return graphicalEventAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onfocusin() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onfocusout() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onactivate() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onclick() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onmousedown() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onmouseup() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onmouseover() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onmousemove() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onmouseout() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalEventAttributes_Onload() {
		return (EAttribute)graphicalEventAttributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationAttributes() {
		return presentationAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Alignment_baseline() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Baseline_shift() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Clip() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Clip_path() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Clip_rule() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Color() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Color_interpolation() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Color_interpolation_filters() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Color_profile() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Color_rendering() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Cursor() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Direction() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Display() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Dominant_baseline() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Enable_background() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Fill() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Fill_opacity() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Fill_rule() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Filter() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Flood_color() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Flood_opacity() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_family() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_size() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_size_adjust() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_stretch() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_style() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_variant() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Font_weight() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Glyph_orientation_horizontal() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Glyph_orientation_vertical() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Image_rendering() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Kerning() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Letter_spacing() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Lighting_color() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Marker_end() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Marker_mid() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Marker_start() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Masks() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Opacity() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Overflow() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Pointer_events() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Shape_rendering() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stop_color() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stop_opacity() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_dasharray() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_dashoffset() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_linecap() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_linejoin() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_miterlimit() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_opacity() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Stroke_width() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Text_anchor() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Text_decoration() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Text_rendering() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Unicode_bidi() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Visibility() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Word_spacing() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationAttributes_Writing_mode() {
		return (EAttribute)presentationAttributesEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLinkAttributes() {
		return xLinkAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__href() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__show() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__actuate() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__type() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__role() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__arcrole() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLinkAttributes_Xlink__title() {
		return (EAttribute)xLinkAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterPrimitiveAttributes() {
		return filterPrimitiveAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_X() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_Y() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_Width() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_Height() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_Result() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPrimitiveAttributes_In() {
		return (EAttribute)filterPrimitiveAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get____ELEMENTES____() {
		return ____ELEMENTES____EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgSvgElement() {
		return svgSvgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Class() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Style() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_ExternalResourcesRequired() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_X() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Y() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Width() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Height() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_ViewBox() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_PreserveAspectRatio() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_ZoomAndPan() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_Version() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_BaseProfile() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_ContentScriptType() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSvgElement_ContentStyleType() {
		return (EAttribute)svgSvgElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgGElement() {
		return svgGElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_Class() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_Style() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_ExternalResourcesRequired() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_Transform() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_X() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGElement_Y() {
		return (EAttribute)svgGElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgDefsElement() {
		return svgDefsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDefsElement_Class() {
		return (EAttribute)svgDefsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDefsElement_Style() {
		return (EAttribute)svgDefsElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDefsElement_ExternalResourcesRequired() {
		return (EAttribute)svgDefsElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDefsElement_Transform() {
		return (EAttribute)svgDefsElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgDescElement() {
		return svgDescElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDescElement_Class() {
		return (EAttribute)svgDescElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgDescElement_Style() {
		return (EAttribute)svgDescElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgTitleElement() {
		return svgTitleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTitleElement_Class() {
		return (EAttribute)svgTitleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTitleElement_Style() {
		return (EAttribute)svgTitleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgSymbolElement() {
		return svgSymbolElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSymbolElement_Class() {
		return (EAttribute)svgSymbolElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSymbolElement_Style() {
		return (EAttribute)svgSymbolElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSymbolElement_ExternalResourcesRequired() {
		return (EAttribute)svgSymbolElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSymbolElement_ViewBox() {
		return (EAttribute)svgSymbolElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSymbolElement_PreserveAspectRatio() {
		return (EAttribute)svgSymbolElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgUseElement() {
		return svgUseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_Class() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_Style() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_ExternalResourcesRequired() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_Transform() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_Width() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgUseElement_Height() {
		return (EAttribute)svgUseElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgImageElement() {
		return svgImageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Class() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Style() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_ExternalResourcesRequired() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_PreserveAspectRatio() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Transform() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_X() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Y() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Width() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgImageElement_Height() {
		return (EAttribute)svgImageElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgSwitchElement() {
		return svgSwitchElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSwitchElement_Class() {
		return (EAttribute)svgSwitchElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSwitchElement_Style() {
		return (EAttribute)svgSwitchElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSwitchElement_ExternalResourcesRequired() {
		return (EAttribute)svgSwitchElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgSwitchElement_Transform() {
		return (EAttribute)svgSwitchElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgPathElement() {
		return svgPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_Class() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_Style() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_ExternalResourcesRequired() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_Transform() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_D() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPathElement_PathLength() {
		return (EAttribute)svgPathElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgRectElement() {
		return svgRectElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Class() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Style() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_ExternalResourcesRequired() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Transform() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_X() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Y() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Width() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Height() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Rx() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRectElement_Ry() {
		return (EAttribute)svgRectElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgCircleElement() {
		return svgCircleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_Class() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_Style() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_ExternalResourcesRequired() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_Transform() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_Cx() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_Cy() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgCircleElement_R() {
		return (EAttribute)svgCircleElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgEllipseElement() {
		return svgEllipseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Class() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Style() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_ExternalResourcesRequired() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Transform() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Cx() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Cy() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Rx() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgEllipseElement_Ry() {
		return (EAttribute)svgEllipseElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgLineElement() {
		return svgLineElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_Class() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_Style() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_ExternalResourcesRequired() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_Transform() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_X1() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_Y1() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_X2() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLineElement_Y2() {
		return (EAttribute)svgLineElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgPolylineElement() {
		return svgPolylineElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolylineElement_Class() {
		return (EAttribute)svgPolylineElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolylineElement_Style() {
		return (EAttribute)svgPolylineElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolylineElement_ExternalResourcesRequired() {
		return (EAttribute)svgPolylineElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolylineElement_Transform() {
		return (EAttribute)svgPolylineElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolylineElement_Points() {
		return (EAttribute)svgPolylineElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgPolygonElement() {
		return svgPolygonElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolygonElement_Class() {
		return (EAttribute)svgPolygonElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolygonElement_Style() {
		return (EAttribute)svgPolygonElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolygonElement_ExternalResourcesRequired() {
		return (EAttribute)svgPolygonElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolygonElement_Transform() {
		return (EAttribute)svgPolygonElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPolygonElement_Points() {
		return (EAttribute)svgPolygonElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgTextElement() {
		return svgTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Class() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Style() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_ExternalResourcesRequired() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Transform() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_LengthAdjust() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_X() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Y() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Dx() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Dy() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_Rotate() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextElement_TextLength() {
		return (EAttribute)svgTextElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgTspanElement() {
		return svgTspanElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Class() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Style() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_ExternalResourcesRequired() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_X() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Y() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Dx() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Dy() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_Rotate() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_TextLength() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTspanElement_LengthAdjust() {
		return (EAttribute)svgTspanElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgTrefElement() {
		return svgTrefElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTrefElement_Class() {
		return (EAttribute)svgTrefElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTrefElement_Style() {
		return (EAttribute)svgTrefElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTrefElement_ExternalResourcesRequired() {
		return (EAttribute)svgTrefElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgTextPathElement() {
		return svgTextPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_Class() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_Style() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_ExternalResourcesRequired() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_StartOffset() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_Method() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgTextPathElement_Spacing() {
		return (EAttribute)svgTextPathElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgAltGlyphElement() {
		return svgAltGlyphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Class() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Style() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_ExternalResourcesRequired() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_X() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Y() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Dx() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Dy() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_GlyphRef() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Format() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphElement_Rotate() {
		return (EAttribute)svgAltGlyphElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgAltGlyphDefElement() {
		return svgAltGlyphDefElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgAltGlyphItemElement() {
		return svgAltGlyphItemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgAltGlyphRefElement() {
		return svgAltGlyphRefElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Class() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Style() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_X() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Y() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Dx() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Dy() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_GlyphRef() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgAltGlyphRefElement_Format() {
		return (EAttribute)svgAltGlyphRefElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgMarkerElement() {
		return svgMarkerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_Class() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_Style() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_ExternalResourcesRequired() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_ViewBox() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_PreserveAspectRatio() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_RefX() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_RefY() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_MarkerUnits() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_MarkerWidth() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_MarkerHeight() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMarkerElement_Orient() {
		return (EAttribute)svgMarkerElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgColorProfileElement() {
		return svgColorProfileElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgColorProfileElement_Local() {
		return (EAttribute)svgColorProfileElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgColorProfileElement_Name() {
		return (EAttribute)svgColorProfileElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgColorProfileElement_Rendering_intent() {
		return (EAttribute)svgColorProfileElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgLinearGradientElement() {
		return svgLinearGradientElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_Class() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_Style() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_ExternalResourcesRequired() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_X1() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_Y1() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_X2() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_Y2() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_GradientUnits() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgLinearGradientElement_SpreadMethod() {
		return (EAttribute)svgLinearGradientElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgRadialGradientElement() {
		return svgRadialGradientElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Class() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Style() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_ExternalResourcesRequired() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Cx() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Cy() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_R() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Fx() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_Fy() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgRadialGradientElement_SpreadMethod() {
		return (EAttribute)svgRadialGradientElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgGradientStopElement() {
		return svgGradientStopElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGradientStopElement_Class() {
		return (EAttribute)svgGradientStopElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGradientStopElement_Style() {
		return (EAttribute)svgGradientStopElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgGradientStopElement_Offset() {
		return (EAttribute)svgGradientStopElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgPatternElement() {
		return svgPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_Class() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_Style() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_ExternalResourcesRequired() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_ViewBox() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_PreserveAspectRatio() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_X() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_Y() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_Width() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_Height() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_PatternUnits() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_PatternContentUnits() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgPatternElement_PatternTransform() {
		return (EAttribute)svgPatternElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgClipPathElement() {
		return svgClipPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgClipPathElement_Class() {
		return (EAttribute)svgClipPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgClipPathElement_Style() {
		return (EAttribute)svgClipPathElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgClipPathElement_ExternalResourcesRequired() {
		return (EAttribute)svgClipPathElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgClipPathElement_Transform() {
		return (EAttribute)svgClipPathElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgClipPathElement_ClipPathUnits() {
		return (EAttribute)svgClipPathElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgMaskElement() {
		return svgMaskElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_Class() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_Style() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_ExternalResourcesRequired() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_X() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_Y() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_Width() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_Height() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_MaskUnits() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgMaskElement_MaskContentUnits() {
		return (EAttribute)svgMaskElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFilterElement() {
		return svgFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_Class() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_Style() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_ExternalResourcesRequired() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_X() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_Y() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_Width() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_Height() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_FilterRes() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_FilterUnits() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFilterElement_PrimitiveUnits() {
		return (EAttribute)svgFilterElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeDistantLight() {
		return svgFeDistantLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDistantLight_Azimuth() {
		return (EAttribute)svgFeDistantLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDistantLight_Elevation() {
		return (EAttribute)svgFeDistantLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFePointLight() {
		return svgFePointLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFePointLight_X() {
		return (EAttribute)svgFePointLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFePointLight_Y() {
		return (EAttribute)svgFePointLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFePointLight_Z() {
		return (EAttribute)svgFePointLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeSpotLight() {
		return svgFeSpotLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_X() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_Y() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_Z() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_PointsAtX() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_PointsAtY() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_PointsAtZ() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_SpecularExponent() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpotLight_LimitingConeAngle() {
		return (EAttribute)svgFeSpotLightEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeBlend() {
		return svgFeBlendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeBlend_Class() {
		return (EAttribute)svgFeBlendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeBlend_Style() {
		return (EAttribute)svgFeBlendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeBlend_In2() {
		return (EAttribute)svgFeBlendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeBlend_Mode() {
		return (EAttribute)svgFeBlendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeColorMatrix() {
		return svgFeColorMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeColorMatrix_Class() {
		return (EAttribute)svgFeColorMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeColorMatrix_Style() {
		return (EAttribute)svgFeColorMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeColorMatrix_Type() {
		return (EAttribute)svgFeColorMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeColorMatrix_Values() {
		return (EAttribute)svgFeColorMatrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeComponentTransfer() {
		return svgFeComponentTransferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComponentTransfer_Class() {
		return (EAttribute)svgFeComponentTransferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComponentTransfer_Style() {
		return (EAttribute)svgFeComponentTransferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeFuncR() {
		return svgFeFuncREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeFuncG() {
		return svgFeFuncGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeFuncB() {
		return svgFeFuncBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeFuncA() {
		return svgFeFuncAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeComposite() {
		return svgFeCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_Class() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_Style() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_In2() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_Operator() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_K1() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_K2() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_K3() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeComposite_K4() {
		return (EAttribute)svgFeCompositeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeConvolveMatrix() {
		return svgFeConvolveMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_Class() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_Style() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_Order() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_KernelMatrix() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_Divisor() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_Bias() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_TargetX() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_TargetY() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_EdgeMode() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_KernelUnitLength() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeConvolveMatrix_PreserveAlpha() {
		return (EAttribute)svgFeConvolveMatrixEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeDiffuseLighting() {
		return svgFeDiffuseLightingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDiffuseLighting_Class() {
		return (EAttribute)svgFeDiffuseLightingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDiffuseLighting_Style() {
		return (EAttribute)svgFeDiffuseLightingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDiffuseLighting_SurfaceScale() {
		return (EAttribute)svgFeDiffuseLightingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDiffuseLighting_DiffuseConstant() {
		return (EAttribute)svgFeDiffuseLightingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDiffuseLighting_KernelUnitLength() {
		return (EAttribute)svgFeDiffuseLightingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeDisplacementMap() {
		return svgFeDisplacementMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_Class() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_Style() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_In2() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_Scale() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_XChannelSelector() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeDisplacementMap_YChannelSelector() {
		return (EAttribute)svgFeDisplacementMapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeFlood() {
		return svgFeFloodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeFlood_Class() {
		return (EAttribute)svgFeFloodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeFlood_Style() {
		return (EAttribute)svgFeFloodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeGaussianBlur() {
		return svgFeGaussianBlurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeGaussianBlur_Class() {
		return (EAttribute)svgFeGaussianBlurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeGaussianBlur_Style() {
		return (EAttribute)svgFeGaussianBlurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeGaussianBlur_StdDeviation() {
		return (EAttribute)svgFeGaussianBlurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeImage() {
		return svgFeImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeImage_Class() {
		return (EAttribute)svgFeImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeImage_Style() {
		return (EAttribute)svgFeImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeImage_ExternalResourcesRequired() {
		return (EAttribute)svgFeImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeImage_PreserveAspectRatio() {
		return (EAttribute)svgFeImageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeMerge() {
		return svgFeMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMerge_Class() {
		return (EAttribute)svgFeMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMerge_Style() {
		return (EAttribute)svgFeMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeMergeNode() {
		return svgFeMergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeMorphology() {
		return svgFeMorphologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMorphology_Class() {
		return (EAttribute)svgFeMorphologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMorphology_Style() {
		return (EAttribute)svgFeMorphologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMorphology_Operator() {
		return (EAttribute)svgFeMorphologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeMorphology_Radius() {
		return (EAttribute)svgFeMorphologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeOffset() {
		return svgFeOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeOffset_Class() {
		return (EAttribute)svgFeOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeOffset_Style() {
		return (EAttribute)svgFeOffsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeOffset_Dx() {
		return (EAttribute)svgFeOffsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeOffset_Dy() {
		return (EAttribute)svgFeOffsetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeSpecularLighting() {
		return svgFeSpecularLightingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_Class() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_Style() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_SurfaceScale() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_SpecularConstant() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_SpecularExponent() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeSpecularLighting_KernelUnitLength() {
		return (EAttribute)svgFeSpecularLightingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeTile() {
		return svgFeTileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTile_Class() {
		return (EAttribute)svgFeTileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTile_Style() {
		return (EAttribute)svgFeTileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSvgFeTurbulence() {
		return svgFeTurbulenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_Class() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_Style() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_BaseFrequency() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_NumOctaves() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_Seed() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_StitchTiles() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSvgFeTurbulence_Type() {
		return (EAttribute)svgFeTurbulenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignment_baseline() {
		return alignment_baselineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClip_rule() {
		return clip_ruleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor_interpolation() {
		return color_interpolationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor_interpolation_filters() {
		return color_interpolation_filtersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor_rendering() {
		return color_renderingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplay() {
		return displayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDominant_baseline() {
		return dominant_baselineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFill_rule() {
		return fill_ruleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFont_stretch() {
		return font_stretchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFont_style() {
		return font_styleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFont_variant() {
		return font_variantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFont_weight() {
		return font_weightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImage_rendering() {
		return image_renderingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOverflow() {
		return overflowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPointer_events() {
		return pointer_eventsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShape_rendering() {
		return shape_renderingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStroke_linecap() {
		return stroke_linecapEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStroke_linejoin() {
		return stroke_linejoinEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getText_anchor() {
		return text_anchorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getText_rendering() {
		return text_renderingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnicode_bidi() {
		return unicode_bidiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWriting_mode() {
		return writing_modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getZoomAndPan() {
		return zoomAndPanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthAdjust() {
		return lengthAdjustEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethod() {
		return methodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpacing() {
		return spacingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMarkerUnits() {
		return markerUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRendering_intent() {
		return rendering_intentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGradientUnits() {
		return gradientUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpreadMethod() {
		return spreadMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatternUnits() {
		return patternUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClipPathUnits() {
		return clipPathUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaskUnits() {
		return maskUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterUnits() {
		return filterUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlendMode() {
		return blendModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorMatrixType() {
		return colorMatrixTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositeOperator() {
		return compositeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConvolveMatrixEdgeMode() {
		return convolveMatrixEdgeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelSelector() {
		return channelSelectorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMorphologyOperator() {
		return morphologyOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStitchTiles() {
		return stitchTilesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTurbulenceType() {
		return turbulenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLength() {
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle() {
		return angleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercentage() {
		return percentageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShape() {
		return shapeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFunciri() {
		return funciriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPaint() {
		return paintEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacity_value() {
		return opacity_valueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBaseline_shift() {
		return baseline_shiftEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClip() {
		return clipEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClip_path() {
		return clip_pathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor_profile() {
		return color_profileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCursor() {
		return cursorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnable_background() {
		return enable_backgroundEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFill() {
		return fillEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFill_opacity() {
		return fill_opacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilter() {
		return filterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlood_color() {
		return flood_colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlood_opacity() {
		return flood_opacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFont_family() {
		return font_familyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFont_size() {
		return font_sizeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFont_size_adjust() {
		return font_size_adjustEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlyph_orientation_horizontal() {
		return glyph_orientation_horizontalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlyph_orientation_vertical() {
		return glyph_orientation_verticalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKerning() {
		return kerningEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLetter_spacing() {
		return letter_spacingEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLighting_color() {
		return lighting_colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarker_end() {
		return marker_endEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarker_mid() {
		return marker_midEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarker_start() {
		return marker_startEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasks() {
		return masksEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOpacity() {
		return opacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStop_color() {
		return stop_colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStop_opacity() {
		return stop_opacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke() {
		return strokeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke_dasharray() {
		return stroke_dasharrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke_dashoffset() {
		return stroke_dashoffsetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke_miterlimit() {
		return stroke_miterlimitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke_opacity() {
		return stroke_opacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStroke_width() {
		return stroke_widthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getText_decoration() {
		return text_decorationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWord_spacing() {
		return word_spacingEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoordinate() {
		return coordinateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewBox() {
		return viewBoxEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreserveAspectRatio() {
		return preserveAspectRatioEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransform() {
		return transformEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathData() {
		return pathDataEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfPoints() {
		return listOfPointsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfLengths() {
		return listOfLengthsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfNumbers() {
		return listOfNumbersEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListOfCoordinates() {
		return listOfCoordinatesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getName_() {
		return nameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberOptionalNumber() {
		return numberOptionalNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactory getSvgFactory() {
		return (SvgFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containerElementEClass = createEClass(CONTAINER_ELEMENT);
		createEReference(containerElementEClass, CONTAINER_ELEMENT__CHILDREN);

		structuralElementEClass = createEClass(STRUCTURAL_ELEMENT);

		svgElementEClass = createEClass(SVG_ELEMENT);

		descriptiveElementEClass = createEClass(DESCRIPTIVE_ELEMENT);

		graphicsElementEClass = createEClass(GRAPHICS_ELEMENT);

		graphicsReferencingElementEClass = createEClass(GRAPHICS_REFERENCING_ELEMENT);

		shapeElementEClass = createEClass(SHAPE_ELEMENT);

		basicShapeElementEClass = createEClass(BASIC_SHAPE_ELEMENT);

		textContentElementEClass = createEClass(TEXT_CONTENT_ELEMENT);

		textContentChildElementEClass = createEClass(TEXT_CONTENT_CHILD_ELEMENT);

		gradientElementEClass = createEClass(GRADIENT_ELEMENT);

		lightSourceElementEClass = createEClass(LIGHT_SOURCE_ELEMENT);

		filterPrimitiveElementEClass = createEClass(FILTER_PRIMITIVE_ELEMENT);

		____ENUMS____EClass = createEClass(_ENUMS_);

		____DATATYPES____EClass = createEClass(_DATATYPES_);

		____ATTRIBUTES____EClass = createEClass(_ATTRIBUTES_);

		conditionalProcessingAttributesEClass = createEClass(CONDITIONAL_PROCESSING_ATTRIBUTES);
		createEAttribute(conditionalProcessingAttributesEClass, CONDITIONAL_PROCESSING_ATTRIBUTES__REQUIRED_FEATURES);
		createEAttribute(conditionalProcessingAttributesEClass, CONDITIONAL_PROCESSING_ATTRIBUTES__REQUIRED_EXTENSIONS);
		createEAttribute(conditionalProcessingAttributesEClass, CONDITIONAL_PROCESSING_ATTRIBUTES__SYSTEM_LANGUAGE);

		coreAttributesEClass = createEClass(CORE_ATTRIBUTES);
		createEAttribute(coreAttributesEClass, CORE_ATTRIBUTES__ID);
		createEAttribute(coreAttributesEClass, CORE_ATTRIBUTES__XML_BASE);
		createEAttribute(coreAttributesEClass, CORE_ATTRIBUTES__XML_LANG);
		createEAttribute(coreAttributesEClass, CORE_ATTRIBUTES__XML_SPACE);

		documentEventAttributesEClass = createEClass(DOCUMENT_EVENT_ATTRIBUTES);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONUNLOAD);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONABORT);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONERROR);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONRESIZE);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONSCROLL);
		createEAttribute(documentEventAttributesEClass, DOCUMENT_EVENT_ATTRIBUTES__ONZOOM);

		graphicalEventAttributesEClass = createEClass(GRAPHICAL_EVENT_ATTRIBUTES);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONFOCUSIN);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONFOCUSOUT);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONACTIVATE);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONCLICK);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONMOUSEDOWN);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONMOUSEUP);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONMOUSEOVER);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONMOUSEMOVE);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONMOUSEOUT);
		createEAttribute(graphicalEventAttributesEClass, GRAPHICAL_EVENT_ATTRIBUTES__ONLOAD);

		presentationAttributesEClass = createEClass(PRESENTATION_ATTRIBUTES);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__ALIGNMENT_BASELINE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__BASELINE_SHIFT);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__CLIP);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__CLIP_PATH);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__CLIP_RULE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__COLOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__COLOR_INTERPOLATION_FILTERS);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__COLOR_PROFILE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__COLOR_RENDERING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__CURSOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__DIRECTION);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__DISPLAY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__DOMINANT_BASELINE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__ENABLE_BACKGROUND);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FILL);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FILL_OPACITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FILL_RULE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FILTER);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FLOOD_COLOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FLOOD_OPACITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_FAMILY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_SIZE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_SIZE_ADJUST);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_STRETCH);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_STYLE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_VARIANT);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__FONT_WEIGHT);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_HORIZONTAL);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__GLYPH_ORIENTATION_VERTICAL);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__IMAGE_RENDERING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__KERNING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__LETTER_SPACING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__LIGHTING_COLOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__MARKER_END);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__MARKER_MID);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__MARKER_START);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__MASKS);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__OPACITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__OVERFLOW);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__POINTER_EVENTS);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__SHAPE_RENDERING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STOP_COLOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STOP_OPACITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_DASHARRAY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_LINECAP);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_OPACITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__STROKE_WIDTH);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__TEXT_ANCHOR);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__TEXT_DECORATION);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__TEXT_RENDERING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__UNICODE_BIDI);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__VISIBILITY);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__WORD_SPACING);
		createEAttribute(presentationAttributesEClass, PRESENTATION_ATTRIBUTES__WRITING_MODE);

		xLinkAttributesEClass = createEClass(XLINK_ATTRIBUTES);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_HREF);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_SHOW);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_ACTUATE);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_TYPE);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_ROLE);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_ARCROLE);
		createEAttribute(xLinkAttributesEClass, XLINK_ATTRIBUTES__XLINK_TITLE);

		filterPrimitiveAttributesEClass = createEClass(FILTER_PRIMITIVE_ATTRIBUTES);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__X);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__Y);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__WIDTH);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__HEIGHT);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__RESULT);
		createEAttribute(filterPrimitiveAttributesEClass, FILTER_PRIMITIVE_ATTRIBUTES__IN);

		____ELEMENTES____EClass = createEClass(_ELEMENTES_);

		svgSvgElementEClass = createEClass(SVG_SVG_ELEMENT);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__CLASS);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__STYLE);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__X);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__Y);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__WIDTH);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__HEIGHT);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__VIEW_BOX);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__PRESERVE_ASPECT_RATIO);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__ZOOM_AND_PAN);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__VERSION);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__BASE_PROFILE);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__CONTENT_SCRIPT_TYPE);
		createEAttribute(svgSvgElementEClass, SVG_SVG_ELEMENT__CONTENT_STYLE_TYPE);

		svgGElementEClass = createEClass(SVG_GELEMENT);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__CLASS);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__STYLE);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__TRANSFORM);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__X);
		createEAttribute(svgGElementEClass, SVG_GELEMENT__Y);

		svgDefsElementEClass = createEClass(SVG_DEFS_ELEMENT);
		createEAttribute(svgDefsElementEClass, SVG_DEFS_ELEMENT__CLASS);
		createEAttribute(svgDefsElementEClass, SVG_DEFS_ELEMENT__STYLE);
		createEAttribute(svgDefsElementEClass, SVG_DEFS_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgDefsElementEClass, SVG_DEFS_ELEMENT__TRANSFORM);

		svgDescElementEClass = createEClass(SVG_DESC_ELEMENT);
		createEAttribute(svgDescElementEClass, SVG_DESC_ELEMENT__CLASS);
		createEAttribute(svgDescElementEClass, SVG_DESC_ELEMENT__STYLE);

		svgTitleElementEClass = createEClass(SVG_TITLE_ELEMENT);
		createEAttribute(svgTitleElementEClass, SVG_TITLE_ELEMENT__CLASS);
		createEAttribute(svgTitleElementEClass, SVG_TITLE_ELEMENT__STYLE);

		svgSymbolElementEClass = createEClass(SVG_SYMBOL_ELEMENT);
		createEAttribute(svgSymbolElementEClass, SVG_SYMBOL_ELEMENT__CLASS);
		createEAttribute(svgSymbolElementEClass, SVG_SYMBOL_ELEMENT__STYLE);
		createEAttribute(svgSymbolElementEClass, SVG_SYMBOL_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgSymbolElementEClass, SVG_SYMBOL_ELEMENT__VIEW_BOX);
		createEAttribute(svgSymbolElementEClass, SVG_SYMBOL_ELEMENT__PRESERVE_ASPECT_RATIO);

		svgUseElementEClass = createEClass(SVG_USE_ELEMENT);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__CLASS);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__STYLE);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__TRANSFORM);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__WIDTH);
		createEAttribute(svgUseElementEClass, SVG_USE_ELEMENT__HEIGHT);

		svgImageElementEClass = createEClass(SVG_IMAGE_ELEMENT);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__CLASS);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__STYLE);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__PRESERVE_ASPECT_RATIO);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__TRANSFORM);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__X);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__Y);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__WIDTH);
		createEAttribute(svgImageElementEClass, SVG_IMAGE_ELEMENT__HEIGHT);

		svgSwitchElementEClass = createEClass(SVG_SWITCH_ELEMENT);
		createEAttribute(svgSwitchElementEClass, SVG_SWITCH_ELEMENT__CLASS);
		createEAttribute(svgSwitchElementEClass, SVG_SWITCH_ELEMENT__STYLE);
		createEAttribute(svgSwitchElementEClass, SVG_SWITCH_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgSwitchElementEClass, SVG_SWITCH_ELEMENT__TRANSFORM);

		svgPathElementEClass = createEClass(SVG_PATH_ELEMENT);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__CLASS);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__STYLE);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__TRANSFORM);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__D);
		createEAttribute(svgPathElementEClass, SVG_PATH_ELEMENT__PATH_LENGTH);

		svgRectElementEClass = createEClass(SVG_RECT_ELEMENT);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__CLASS);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__STYLE);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__TRANSFORM);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__X);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__Y);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__WIDTH);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__HEIGHT);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__RX);
		createEAttribute(svgRectElementEClass, SVG_RECT_ELEMENT__RY);

		svgCircleElementEClass = createEClass(SVG_CIRCLE_ELEMENT);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__CLASS);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__STYLE);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__TRANSFORM);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__CX);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__CY);
		createEAttribute(svgCircleElementEClass, SVG_CIRCLE_ELEMENT__R);

		svgEllipseElementEClass = createEClass(SVG_ELLIPSE_ELEMENT);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__CLASS);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__STYLE);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__TRANSFORM);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__CX);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__CY);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__RX);
		createEAttribute(svgEllipseElementEClass, SVG_ELLIPSE_ELEMENT__RY);

		svgLineElementEClass = createEClass(SVG_LINE_ELEMENT);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__CLASS);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__STYLE);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__TRANSFORM);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__X1);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__Y1);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__X2);
		createEAttribute(svgLineElementEClass, SVG_LINE_ELEMENT__Y2);

		svgPolylineElementEClass = createEClass(SVG_POLYLINE_ELEMENT);
		createEAttribute(svgPolylineElementEClass, SVG_POLYLINE_ELEMENT__CLASS);
		createEAttribute(svgPolylineElementEClass, SVG_POLYLINE_ELEMENT__STYLE);
		createEAttribute(svgPolylineElementEClass, SVG_POLYLINE_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgPolylineElementEClass, SVG_POLYLINE_ELEMENT__TRANSFORM);
		createEAttribute(svgPolylineElementEClass, SVG_POLYLINE_ELEMENT__POINTS);

		svgPolygonElementEClass = createEClass(SVG_POLYGON_ELEMENT);
		createEAttribute(svgPolygonElementEClass, SVG_POLYGON_ELEMENT__CLASS);
		createEAttribute(svgPolygonElementEClass, SVG_POLYGON_ELEMENT__STYLE);
		createEAttribute(svgPolygonElementEClass, SVG_POLYGON_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgPolygonElementEClass, SVG_POLYGON_ELEMENT__TRANSFORM);
		createEAttribute(svgPolygonElementEClass, SVG_POLYGON_ELEMENT__POINTS);

		svgTextElementEClass = createEClass(SVG_TEXT_ELEMENT);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__CLASS);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__STYLE);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__TRANSFORM);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__LENGTH_ADJUST);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__X);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__Y);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__DX);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__DY);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__ROTATE);
		createEAttribute(svgTextElementEClass, SVG_TEXT_ELEMENT__TEXT_LENGTH);

		svgTspanElementEClass = createEClass(SVG_TSPAN_ELEMENT);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__CLASS);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__STYLE);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__X);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__Y);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__DX);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__DY);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__ROTATE);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__TEXT_LENGTH);
		createEAttribute(svgTspanElementEClass, SVG_TSPAN_ELEMENT__LENGTH_ADJUST);

		svgTrefElementEClass = createEClass(SVG_TREF_ELEMENT);
		createEAttribute(svgTrefElementEClass, SVG_TREF_ELEMENT__CLASS);
		createEAttribute(svgTrefElementEClass, SVG_TREF_ELEMENT__STYLE);
		createEAttribute(svgTrefElementEClass, SVG_TREF_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);

		svgTextPathElementEClass = createEClass(SVG_TEXT_PATH_ELEMENT);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__CLASS);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__STYLE);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__START_OFFSET);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__METHOD);
		createEAttribute(svgTextPathElementEClass, SVG_TEXT_PATH_ELEMENT__SPACING);

		svgAltGlyphElementEClass = createEClass(SVG_ALT_GLYPH_ELEMENT);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__CLASS);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__STYLE);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__X);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__Y);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__DX);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__DY);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__GLYPH_REF);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__FORMAT);
		createEAttribute(svgAltGlyphElementEClass, SVG_ALT_GLYPH_ELEMENT__ROTATE);

		svgAltGlyphDefElementEClass = createEClass(SVG_ALT_GLYPH_DEF_ELEMENT);

		svgAltGlyphItemElementEClass = createEClass(SVG_ALT_GLYPH_ITEM_ELEMENT);

		svgAltGlyphRefElementEClass = createEClass(SVG_ALT_GLYPH_REF_ELEMENT);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__CLASS);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__STYLE);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__X);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__Y);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__DX);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__DY);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__GLYPH_REF);
		createEAttribute(svgAltGlyphRefElementEClass, SVG_ALT_GLYPH_REF_ELEMENT__FORMAT);

		svgMarkerElementEClass = createEClass(SVG_MARKER_ELEMENT);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__CLASS);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__STYLE);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__VIEW_BOX);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__PRESERVE_ASPECT_RATIO);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__REF_X);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__REF_Y);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__MARKER_UNITS);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__MARKER_WIDTH);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__MARKER_HEIGHT);
		createEAttribute(svgMarkerElementEClass, SVG_MARKER_ELEMENT__ORIENT);

		svgColorProfileElementEClass = createEClass(SVG_COLOR_PROFILE_ELEMENT);
		createEAttribute(svgColorProfileElementEClass, SVG_COLOR_PROFILE_ELEMENT__LOCAL);
		createEAttribute(svgColorProfileElementEClass, SVG_COLOR_PROFILE_ELEMENT__NAME);
		createEAttribute(svgColorProfileElementEClass, SVG_COLOR_PROFILE_ELEMENT__RENDERING_INTENT);

		svgLinearGradientElementEClass = createEClass(SVG_LINEAR_GRADIENT_ELEMENT);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__CLASS);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__STYLE);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__X1);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__Y1);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__X2);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__Y2);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__GRADIENT_UNITS);
		createEAttribute(svgLinearGradientElementEClass, SVG_LINEAR_GRADIENT_ELEMENT__SPREAD_METHOD);

		svgRadialGradientElementEClass = createEClass(SVG_RADIAL_GRADIENT_ELEMENT);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__CLASS);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__STYLE);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__CX);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__CY);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__R);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__FX);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__FY);
		createEAttribute(svgRadialGradientElementEClass, SVG_RADIAL_GRADIENT_ELEMENT__SPREAD_METHOD);

		svgGradientStopElementEClass = createEClass(SVG_GRADIENT_STOP_ELEMENT);
		createEAttribute(svgGradientStopElementEClass, SVG_GRADIENT_STOP_ELEMENT__CLASS);
		createEAttribute(svgGradientStopElementEClass, SVG_GRADIENT_STOP_ELEMENT__STYLE);
		createEAttribute(svgGradientStopElementEClass, SVG_GRADIENT_STOP_ELEMENT__OFFSET);

		svgPatternElementEClass = createEClass(SVG_PATTERN_ELEMENT);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__CLASS);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__STYLE);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__VIEW_BOX);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__PRESERVE_ASPECT_RATIO);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__X);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__Y);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__WIDTH);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__HEIGHT);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__PATTERN_UNITS);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__PATTERN_CONTENT_UNITS);
		createEAttribute(svgPatternElementEClass, SVG_PATTERN_ELEMENT__PATTERN_TRANSFORM);

		svgClipPathElementEClass = createEClass(SVG_CLIP_PATH_ELEMENT);
		createEAttribute(svgClipPathElementEClass, SVG_CLIP_PATH_ELEMENT__CLASS);
		createEAttribute(svgClipPathElementEClass, SVG_CLIP_PATH_ELEMENT__STYLE);
		createEAttribute(svgClipPathElementEClass, SVG_CLIP_PATH_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgClipPathElementEClass, SVG_CLIP_PATH_ELEMENT__TRANSFORM);
		createEAttribute(svgClipPathElementEClass, SVG_CLIP_PATH_ELEMENT__CLIP_PATH_UNITS);

		svgMaskElementEClass = createEClass(SVG_MASK_ELEMENT);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__CLASS);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__STYLE);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__X);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__Y);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__WIDTH);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__HEIGHT);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__MASK_UNITS);
		createEAttribute(svgMaskElementEClass, SVG_MASK_ELEMENT__MASK_CONTENT_UNITS);

		svgFilterElementEClass = createEClass(SVG_FILTER_ELEMENT);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__CLASS);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__STYLE);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__X);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__Y);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__WIDTH);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__HEIGHT);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__FILTER_RES);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__FILTER_UNITS);
		createEAttribute(svgFilterElementEClass, SVG_FILTER_ELEMENT__PRIMITIVE_UNITS);

		svgFeDistantLightEClass = createEClass(SVG_FE_DISTANT_LIGHT);
		createEAttribute(svgFeDistantLightEClass, SVG_FE_DISTANT_LIGHT__AZIMUTH);
		createEAttribute(svgFeDistantLightEClass, SVG_FE_DISTANT_LIGHT__ELEVATION);

		svgFePointLightEClass = createEClass(SVG_FE_POINT_LIGHT);
		createEAttribute(svgFePointLightEClass, SVG_FE_POINT_LIGHT__X);
		createEAttribute(svgFePointLightEClass, SVG_FE_POINT_LIGHT__Y);
		createEAttribute(svgFePointLightEClass, SVG_FE_POINT_LIGHT__Z);

		svgFeSpotLightEClass = createEClass(SVG_FE_SPOT_LIGHT);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__X);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__Y);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__Z);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__POINTS_AT_X);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__POINTS_AT_Y);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__POINTS_AT_Z);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__SPECULAR_EXPONENT);
		createEAttribute(svgFeSpotLightEClass, SVG_FE_SPOT_LIGHT__LIMITING_CONE_ANGLE);

		svgFeBlendEClass = createEClass(SVG_FE_BLEND);
		createEAttribute(svgFeBlendEClass, SVG_FE_BLEND__CLASS);
		createEAttribute(svgFeBlendEClass, SVG_FE_BLEND__STYLE);
		createEAttribute(svgFeBlendEClass, SVG_FE_BLEND__IN2);
		createEAttribute(svgFeBlendEClass, SVG_FE_BLEND__MODE);

		svgFeColorMatrixEClass = createEClass(SVG_FE_COLOR_MATRIX);
		createEAttribute(svgFeColorMatrixEClass, SVG_FE_COLOR_MATRIX__CLASS);
		createEAttribute(svgFeColorMatrixEClass, SVG_FE_COLOR_MATRIX__STYLE);
		createEAttribute(svgFeColorMatrixEClass, SVG_FE_COLOR_MATRIX__TYPE);
		createEAttribute(svgFeColorMatrixEClass, SVG_FE_COLOR_MATRIX__VALUES);

		svgFeComponentTransferEClass = createEClass(SVG_FE_COMPONENT_TRANSFER);
		createEAttribute(svgFeComponentTransferEClass, SVG_FE_COMPONENT_TRANSFER__CLASS);
		createEAttribute(svgFeComponentTransferEClass, SVG_FE_COMPONENT_TRANSFER__STYLE);

		svgFeFuncREClass = createEClass(SVG_FE_FUNC_R);

		svgFeFuncGEClass = createEClass(SVG_FE_FUNC_G);

		svgFeFuncBEClass = createEClass(SVG_FE_FUNC_B);

		svgFeFuncAEClass = createEClass(SVG_FE_FUNC_A);

		svgFeCompositeEClass = createEClass(SVG_FE_COMPOSITE);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__CLASS);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__STYLE);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__IN2);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__OPERATOR);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__K1);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__K2);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__K3);
		createEAttribute(svgFeCompositeEClass, SVG_FE_COMPOSITE__K4);

		svgFeConvolveMatrixEClass = createEClass(SVG_FE_CONVOLVE_MATRIX);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__CLASS);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__STYLE);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__ORDER);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__KERNEL_MATRIX);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__DIVISOR);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__BIAS);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__TARGET_X);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__TARGET_Y);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__EDGE_MODE);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__KERNEL_UNIT_LENGTH);
		createEAttribute(svgFeConvolveMatrixEClass, SVG_FE_CONVOLVE_MATRIX__PRESERVE_ALPHA);

		svgFeDiffuseLightingEClass = createEClass(SVG_FE_DIFFUSE_LIGHTING);
		createEAttribute(svgFeDiffuseLightingEClass, SVG_FE_DIFFUSE_LIGHTING__CLASS);
		createEAttribute(svgFeDiffuseLightingEClass, SVG_FE_DIFFUSE_LIGHTING__STYLE);
		createEAttribute(svgFeDiffuseLightingEClass, SVG_FE_DIFFUSE_LIGHTING__SURFACE_SCALE);
		createEAttribute(svgFeDiffuseLightingEClass, SVG_FE_DIFFUSE_LIGHTING__DIFFUSE_CONSTANT);
		createEAttribute(svgFeDiffuseLightingEClass, SVG_FE_DIFFUSE_LIGHTING__KERNEL_UNIT_LENGTH);

		svgFeDisplacementMapEClass = createEClass(SVG_FE_DISPLACEMENT_MAP);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__CLASS);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__STYLE);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__IN2);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__SCALE);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__XCHANNEL_SELECTOR);
		createEAttribute(svgFeDisplacementMapEClass, SVG_FE_DISPLACEMENT_MAP__YCHANNEL_SELECTOR);

		svgFeFloodEClass = createEClass(SVG_FE_FLOOD);
		createEAttribute(svgFeFloodEClass, SVG_FE_FLOOD__CLASS);
		createEAttribute(svgFeFloodEClass, SVG_FE_FLOOD__STYLE);

		svgFeGaussianBlurEClass = createEClass(SVG_FE_GAUSSIAN_BLUR);
		createEAttribute(svgFeGaussianBlurEClass, SVG_FE_GAUSSIAN_BLUR__CLASS);
		createEAttribute(svgFeGaussianBlurEClass, SVG_FE_GAUSSIAN_BLUR__STYLE);
		createEAttribute(svgFeGaussianBlurEClass, SVG_FE_GAUSSIAN_BLUR__STD_DEVIATION);

		svgFeImageEClass = createEClass(SVG_FE_IMAGE);
		createEAttribute(svgFeImageEClass, SVG_FE_IMAGE__CLASS);
		createEAttribute(svgFeImageEClass, SVG_FE_IMAGE__STYLE);
		createEAttribute(svgFeImageEClass, SVG_FE_IMAGE__EXTERNAL_RESOURCES_REQUIRED);
		createEAttribute(svgFeImageEClass, SVG_FE_IMAGE__PRESERVE_ASPECT_RATIO);

		svgFeMergeEClass = createEClass(SVG_FE_MERGE);
		createEAttribute(svgFeMergeEClass, SVG_FE_MERGE__CLASS);
		createEAttribute(svgFeMergeEClass, SVG_FE_MERGE__STYLE);

		svgFeMergeNodeEClass = createEClass(SVG_FE_MERGE_NODE);

		svgFeMorphologyEClass = createEClass(SVG_FE_MORPHOLOGY);
		createEAttribute(svgFeMorphologyEClass, SVG_FE_MORPHOLOGY__CLASS);
		createEAttribute(svgFeMorphologyEClass, SVG_FE_MORPHOLOGY__STYLE);
		createEAttribute(svgFeMorphologyEClass, SVG_FE_MORPHOLOGY__OPERATOR);
		createEAttribute(svgFeMorphologyEClass, SVG_FE_MORPHOLOGY__RADIUS);

		svgFeOffsetEClass = createEClass(SVG_FE_OFFSET);
		createEAttribute(svgFeOffsetEClass, SVG_FE_OFFSET__CLASS);
		createEAttribute(svgFeOffsetEClass, SVG_FE_OFFSET__STYLE);
		createEAttribute(svgFeOffsetEClass, SVG_FE_OFFSET__DX);
		createEAttribute(svgFeOffsetEClass, SVG_FE_OFFSET__DY);

		svgFeSpecularLightingEClass = createEClass(SVG_FE_SPECULAR_LIGHTING);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__CLASS);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__STYLE);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__SURFACE_SCALE);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__SPECULAR_CONSTANT);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__SPECULAR_EXPONENT);
		createEAttribute(svgFeSpecularLightingEClass, SVG_FE_SPECULAR_LIGHTING__KERNEL_UNIT_LENGTH);

		svgFeTileEClass = createEClass(SVG_FE_TILE);
		createEAttribute(svgFeTileEClass, SVG_FE_TILE__CLASS);
		createEAttribute(svgFeTileEClass, SVG_FE_TILE__STYLE);

		svgFeTurbulenceEClass = createEClass(SVG_FE_TURBULENCE);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__CLASS);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__STYLE);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__BASE_FREQUENCY);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__NUM_OCTAVES);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__SEED);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__STITCH_TILES);
		createEAttribute(svgFeTurbulenceEClass, SVG_FE_TURBULENCE__TYPE);

		// Create enums
		alignment_baselineEEnum = createEEnum(ALIGNMENT_BASELINE);
		clip_ruleEEnum = createEEnum(CLIP_RULE);
		color_interpolationEEnum = createEEnum(COLOR_INTERPOLATION);
		color_interpolation_filtersEEnum = createEEnum(COLOR_INTERPOLATION_FILTERS);
		color_renderingEEnum = createEEnum(COLOR_RENDERING);
		directionEEnum = createEEnum(DIRECTION);
		displayEEnum = createEEnum(DISPLAY);
		dominant_baselineEEnum = createEEnum(DOMINANT_BASELINE);
		fill_ruleEEnum = createEEnum(FILL_RULE);
		font_stretchEEnum = createEEnum(FONT_STRETCH);
		font_styleEEnum = createEEnum(FONT_STYLE);
		font_variantEEnum = createEEnum(FONT_VARIANT);
		font_weightEEnum = createEEnum(FONT_WEIGHT);
		image_renderingEEnum = createEEnum(IMAGE_RENDERING);
		overflowEEnum = createEEnum(OVERFLOW);
		pointer_eventsEEnum = createEEnum(POINTER_EVENTS);
		shape_renderingEEnum = createEEnum(SHAPE_RENDERING);
		stroke_linecapEEnum = createEEnum(STROKE_LINECAP);
		stroke_linejoinEEnum = createEEnum(STROKE_LINEJOIN);
		text_anchorEEnum = createEEnum(TEXT_ANCHOR);
		text_renderingEEnum = createEEnum(TEXT_RENDERING);
		unicode_bidiEEnum = createEEnum(UNICODE_BIDI);
		visibilityEEnum = createEEnum(VISIBILITY);
		writing_modeEEnum = createEEnum(WRITING_MODE);
		zoomAndPanEEnum = createEEnum(ZOOM_AND_PAN);
		lengthAdjustEEnum = createEEnum(LENGTH_ADJUST);
		methodEEnum = createEEnum(METHOD);
		spacingEEnum = createEEnum(SPACING);
		markerUnitsEEnum = createEEnum(MARKER_UNITS);
		rendering_intentEEnum = createEEnum(RENDERING_INTENT);
		gradientUnitsEEnum = createEEnum(GRADIENT_UNITS);
		spreadMethodEEnum = createEEnum(SPREAD_METHOD);
		patternUnitsEEnum = createEEnum(PATTERN_UNITS);
		clipPathUnitsEEnum = createEEnum(CLIP_PATH_UNITS);
		maskUnitsEEnum = createEEnum(MASK_UNITS);
		filterUnitsEEnum = createEEnum(FILTER_UNITS);
		blendModeEEnum = createEEnum(BLEND_MODE);
		colorMatrixTypeEEnum = createEEnum(COLOR_MATRIX_TYPE);
		compositeOperatorEEnum = createEEnum(COMPOSITE_OPERATOR);
		convolveMatrixEdgeModeEEnum = createEEnum(CONVOLVE_MATRIX_EDGE_MODE);
		channelSelectorEEnum = createEEnum(CHANNEL_SELECTOR);
		morphologyOperatorEEnum = createEEnum(MORPHOLOGY_OPERATOR);
		stitchTilesEEnum = createEEnum(STITCH_TILES);
		turbulenceTypeEEnum = createEEnum(TURBULENCE_TYPE);

		// Create data types
		lengthEDataType = createEDataType(LENGTH);
		angleEDataType = createEDataType(ANGLE);
		percentageEDataType = createEDataType(PERCENTAGE);
		shapeEDataType = createEDataType(SHAPE);
		funciriEDataType = createEDataType(FUNCIRI);
		colorEDataType = createEDataType(COLOR);
		paintEDataType = createEDataType(PAINT);
		opacity_valueEDataType = createEDataType(OPACITY_VALUE);
		baseline_shiftEDataType = createEDataType(BASELINE_SHIFT);
		clipEDataType = createEDataType(CLIP);
		clip_pathEDataType = createEDataType(CLIP_PATH);
		color_profileEDataType = createEDataType(COLOR_PROFILE);
		cursorEDataType = createEDataType(CURSOR);
		enable_backgroundEDataType = createEDataType(ENABLE_BACKGROUND);
		fillEDataType = createEDataType(FILL);
		fill_opacityEDataType = createEDataType(FILL_OPACITY);
		filterEDataType = createEDataType(FILTER);
		flood_colorEDataType = createEDataType(FLOOD_COLOR);
		flood_opacityEDataType = createEDataType(FLOOD_OPACITY);
		font_familyEDataType = createEDataType(FONT_FAMILY);
		font_sizeEDataType = createEDataType(FONT_SIZE);
		font_size_adjustEDataType = createEDataType(FONT_SIZE_ADJUST);
		glyph_orientation_horizontalEDataType = createEDataType(GLYPH_ORIENTATION_HORIZONTAL);
		glyph_orientation_verticalEDataType = createEDataType(GLYPH_ORIENTATION_VERTICAL);
		kerningEDataType = createEDataType(KERNING);
		letter_spacingEDataType = createEDataType(LETTER_SPACING);
		lighting_colorEDataType = createEDataType(LIGHTING_COLOR);
		marker_endEDataType = createEDataType(MARKER_END);
		marker_midEDataType = createEDataType(MARKER_MID);
		marker_startEDataType = createEDataType(MARKER_START);
		masksEDataType = createEDataType(MASKS);
		opacityEDataType = createEDataType(OPACITY);
		stop_colorEDataType = createEDataType(STOP_COLOR);
		stop_opacityEDataType = createEDataType(STOP_OPACITY);
		strokeEDataType = createEDataType(STROKE);
		stroke_dasharrayEDataType = createEDataType(STROKE_DASHARRAY);
		stroke_dashoffsetEDataType = createEDataType(STROKE_DASHOFFSET);
		stroke_miterlimitEDataType = createEDataType(STROKE_MITERLIMIT);
		stroke_opacityEDataType = createEDataType(STROKE_OPACITY);
		stroke_widthEDataType = createEDataType(STROKE_WIDTH);
		text_decorationEDataType = createEDataType(TEXT_DECORATION);
		word_spacingEDataType = createEDataType(WORD_SPACING);
		coordinateEDataType = createEDataType(COORDINATE);
		viewBoxEDataType = createEDataType(VIEW_BOX);
		preserveAspectRatioEDataType = createEDataType(PRESERVE_ASPECT_RATIO);
		numberEDataType = createEDataType(NUMBER);
		transformEDataType = createEDataType(TRANSFORM);
		pathDataEDataType = createEDataType(PATH_DATA);
		listOfPointsEDataType = createEDataType(LIST_OF_POINTS);
		listOfLengthsEDataType = createEDataType(LIST_OF_LENGTHS);
		listOfNumbersEDataType = createEDataType(LIST_OF_NUMBERS);
		listOfCoordinatesEDataType = createEDataType(LIST_OF_COORDINATES);
		nameEDataType = createEDataType(NAME);
		numberOptionalNumberEDataType = createEDataType(NUMBER_OPTIONAL_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter containerElementEClass_T = addETypeParameter(containerElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSvgElement());
		containerElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSvgElement());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		EGenericType g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralElement());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getConditionalProcessingAttributes());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDocumentEventAttributes());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphicalEventAttributes());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgSvgElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSvgElement());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralElement());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getConditionalProcessingAttributes());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphicalEventAttributes());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgGElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSvgElement());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralElement());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getConditionalProcessingAttributes());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphicalEventAttributes());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgDefsElementEClass.getEGenericSuperTypes().add(g1);
		svgDescElementEClass.getESuperTypes().add(this.getSvgElement());
		svgDescElementEClass.getESuperTypes().add(this.getDescriptiveElement());
		svgDescElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgTitleElementEClass.getESuperTypes().add(this.getSvgElement());
		svgTitleElementEClass.getESuperTypes().add(this.getDescriptiveElement());
		svgTitleElementEClass.getESuperTypes().add(this.getCoreAttributes());
		g1 = createEGenericType(this.getSvgElement());
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralElement());
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphicalEventAttributes());
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgSymbolElementEClass.getEGenericSuperTypes().add(g1);
		svgUseElementEClass.getESuperTypes().add(this.getSvgElement());
		svgUseElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgUseElementEClass.getESuperTypes().add(this.getGraphicsReferencingElement());
		svgUseElementEClass.getESuperTypes().add(this.getStructuralElement());
		svgUseElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgUseElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgUseElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgUseElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgUseElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgImageElementEClass.getESuperTypes().add(this.getSvgElement());
		svgImageElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgImageElementEClass.getESuperTypes().add(this.getGraphicsReferencingElement());
		svgImageElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgImageElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgImageElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgImageElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgImageElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		g1 = createEGenericType(this.getSvgElement());
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getConditionalProcessingAttributes());
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGraphicalEventAttributes());
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgSwitchElementEClass.getEGenericSuperTypes().add(g1);
		svgPathElementEClass.getESuperTypes().add(this.getSvgElement());
		svgPathElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgPathElementEClass.getESuperTypes().add(this.getShapeElement());
		svgPathElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgPathElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgPathElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgPathElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgRectElementEClass.getESuperTypes().add(this.getSvgElement());
		svgRectElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgRectElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgRectElementEClass.getESuperTypes().add(this.getShapeElement());
		svgRectElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgRectElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgRectElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgRectElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgCircleElementEClass.getESuperTypes().add(this.getSvgElement());
		svgCircleElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgCircleElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgCircleElementEClass.getESuperTypes().add(this.getShapeElement());
		svgCircleElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgCircleElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgCircleElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgCircleElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgEllipseElementEClass.getESuperTypes().add(this.getSvgElement());
		svgEllipseElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgEllipseElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgEllipseElementEClass.getESuperTypes().add(this.getShapeElement());
		svgEllipseElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgEllipseElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgEllipseElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgEllipseElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgLineElementEClass.getESuperTypes().add(this.getSvgElement());
		svgLineElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgLineElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgLineElementEClass.getESuperTypes().add(this.getShapeElement());
		svgLineElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgLineElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgLineElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgLineElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgPolylineElementEClass.getESuperTypes().add(this.getSvgElement());
		svgPolylineElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgPolylineElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgPolylineElementEClass.getESuperTypes().add(this.getShapeElement());
		svgPolylineElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgPolylineElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgPolylineElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgPolylineElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgPolygonElementEClass.getESuperTypes().add(this.getSvgElement());
		svgPolygonElementEClass.getESuperTypes().add(this.getBasicShapeElement());
		svgPolygonElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgPolygonElementEClass.getESuperTypes().add(this.getShapeElement());
		svgPolygonElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgPolygonElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgPolygonElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgPolygonElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgTextElementEClass.getESuperTypes().add(this.getSvgElement());
		svgTextElementEClass.getESuperTypes().add(this.getGraphicsElement());
		svgTextElementEClass.getESuperTypes().add(this.getTextContentElement());
		svgTextElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgTextElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgTextElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgTextElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgTspanElementEClass.getESuperTypes().add(this.getSvgElement());
		svgTspanElementEClass.getESuperTypes().add(this.getTextContentElement());
		svgTspanElementEClass.getESuperTypes().add(this.getTextContentChildElement());
		svgTspanElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgTspanElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgTspanElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgTspanElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgTrefElementEClass.getESuperTypes().add(this.getSvgElement());
		svgTrefElementEClass.getESuperTypes().add(this.getTextContentElement());
		svgTrefElementEClass.getESuperTypes().add(this.getTextContentChildElement());
		svgTrefElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgTrefElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgTrefElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgTrefElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgTrefElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgTextPathElementEClass.getESuperTypes().add(this.getSvgElement());
		svgTextPathElementEClass.getESuperTypes().add(this.getTextContentElement());
		svgTextPathElementEClass.getESuperTypes().add(this.getTextContentChildElement());
		svgTextPathElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgTextPathElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgTextPathElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgTextPathElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgTextPathElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getSvgElement());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getTextContentElement());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getTextContentChildElement());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getGraphicalEventAttributes());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgAltGlyphElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgAltGlyphDefElementEClass.getESuperTypes().add(this.getSvgElement());
		svgAltGlyphDefElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgAltGlyphItemElementEClass.getESuperTypes().add(this.getSvgElement());
		svgAltGlyphItemElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgAltGlyphRefElementEClass.getESuperTypes().add(this.getSvgElement());
		svgAltGlyphRefElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgAltGlyphRefElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgAltGlyphRefElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgMarkerElementEClass.getESuperTypes().add(this.getSvgElement());
		svgMarkerElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgMarkerElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgColorProfileElementEClass.getESuperTypes().add(this.getSvgElement());
		svgColorProfileElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgColorProfileElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgColorProfileElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgLinearGradientElementEClass.getESuperTypes().add(this.getSvgElement());
		svgLinearGradientElementEClass.getESuperTypes().add(this.getGradientElement());
		svgLinearGradientElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgLinearGradientElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgLinearGradientElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgRadialGradientElementEClass.getESuperTypes().add(this.getSvgElement());
		svgRadialGradientElementEClass.getESuperTypes().add(this.getGradientElement());
		svgRadialGradientElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgRadialGradientElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgRadialGradientElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgGradientStopElementEClass.getESuperTypes().add(this.getSvgElement());
		svgGradientStopElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgGradientStopElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		g1 = createEGenericType(this.getSvgElement());
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getSvgElement());
		g1.getETypeArguments().add(g2);
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getConditionalProcessingAttributes());
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCoreAttributes());
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPresentationAttributes());
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getXLinkAttributes());
		svgPatternElementEClass.getEGenericSuperTypes().add(g1);
		svgClipPathElementEClass.getESuperTypes().add(this.getSvgElement());
		svgClipPathElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgClipPathElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgClipPathElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgMaskElementEClass.getESuperTypes().add(this.getSvgElement());
		svgMaskElementEClass.getESuperTypes().add(this.getConditionalProcessingAttributes());
		svgMaskElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgMaskElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFilterElementEClass.getESuperTypes().add(this.getSvgElement());
		svgFilterElementEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFilterElementEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFilterElementEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgFeDistantLightEClass.getESuperTypes().add(this.getSvgElement());
		svgFeDistantLightEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFePointLightEClass.getESuperTypes().add(this.getSvgElement());
		svgFePointLightEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFePointLightEClass.getESuperTypes().add(this.getLightSourceElement());
		svgFeSpotLightEClass.getESuperTypes().add(this.getSvgElement());
		svgFeSpotLightEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeSpotLightEClass.getESuperTypes().add(this.getLightSourceElement());
		svgFeBlendEClass.getESuperTypes().add(this.getSvgElement());
		svgFeBlendEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeBlendEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeBlendEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeColorMatrixEClass.getESuperTypes().add(this.getSvgElement());
		svgFeColorMatrixEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeColorMatrixEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeColorMatrixEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeComponentTransferEClass.getESuperTypes().add(this.getSvgElement());
		svgFeComponentTransferEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeComponentTransferEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeComponentTransferEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeFuncREClass.getESuperTypes().add(this.getSvgElement());
		svgFeFuncREClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeFuncREClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeFuncGEClass.getESuperTypes().add(this.getSvgElement());
		svgFeFuncGEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeFuncGEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeFuncBEClass.getESuperTypes().add(this.getSvgElement());
		svgFeFuncBEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeFuncBEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeFuncAEClass.getESuperTypes().add(this.getSvgElement());
		svgFeFuncAEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeFuncAEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeCompositeEClass.getESuperTypes().add(this.getSvgElement());
		svgFeCompositeEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeCompositeEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeCompositeEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeConvolveMatrixEClass.getESuperTypes().add(this.getSvgElement());
		svgFeConvolveMatrixEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeConvolveMatrixEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeConvolveMatrixEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeDiffuseLightingEClass.getESuperTypes().add(this.getSvgElement());
		svgFeDiffuseLightingEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeDiffuseLightingEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeDiffuseLightingEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeDisplacementMapEClass.getESuperTypes().add(this.getSvgElement());
		svgFeDisplacementMapEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeDisplacementMapEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeDisplacementMapEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeFloodEClass.getESuperTypes().add(this.getSvgElement());
		svgFeFloodEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeFloodEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeFloodEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeGaussianBlurEClass.getESuperTypes().add(this.getSvgElement());
		svgFeGaussianBlurEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeGaussianBlurEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeGaussianBlurEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeImageEClass.getESuperTypes().add(this.getSvgElement());
		svgFeImageEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeImageEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeImageEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeImageEClass.getESuperTypes().add(this.getXLinkAttributes());
		svgFeMergeEClass.getESuperTypes().add(this.getSvgElement());
		svgFeMergeEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeMergeEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeMergeEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeMergeNodeEClass.getESuperTypes().add(this.getSvgElement());
		svgFeMergeNodeEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeMorphologyEClass.getESuperTypes().add(this.getSvgElement());
		svgFeMorphologyEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeMorphologyEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeMorphologyEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeOffsetEClass.getESuperTypes().add(this.getSvgElement());
		svgFeOffsetEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeOffsetEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeOffsetEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeSpecularLightingEClass.getESuperTypes().add(this.getSvgElement());
		svgFeSpecularLightingEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeSpecularLightingEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeSpecularLightingEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeTileEClass.getESuperTypes().add(this.getSvgElement());
		svgFeTileEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeTileEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeTileEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());
		svgFeTurbulenceEClass.getESuperTypes().add(this.getSvgElement());
		svgFeTurbulenceEClass.getESuperTypes().add(this.getCoreAttributes());
		svgFeTurbulenceEClass.getESuperTypes().add(this.getPresentationAttributes());
		svgFeTurbulenceEClass.getESuperTypes().add(this.getFilterPrimitiveAttributes());

		// Initialize classes and features; add operations and parameters
		initEClass(containerElementEClass, ContainerElement.class, "ContainerElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(containerElementEClass_T);
		initEReference(getContainerElement_Children(), g1, null, "children", null, 0, -1, ContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralElementEClass, StructuralElement.class, "StructuralElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgElementEClass, SvgElement.class, "SvgElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveElementEClass, DescriptiveElement.class, "DescriptiveElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicsElementEClass, GraphicsElement.class, "GraphicsElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphicsReferencingElementEClass, GraphicsReferencingElement.class, "GraphicsReferencingElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeElementEClass, ShapeElement.class, "ShapeElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicShapeElementEClass, BasicShapeElement.class, "BasicShapeElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContentElementEClass, TextContentElement.class, "TextContentElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContentChildElementEClass, TextContentChildElement.class, "TextContentChildElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gradientElementEClass, GradientElement.class, "GradientElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lightSourceElementEClass, LightSourceElement.class, "LightSourceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterPrimitiveElementEClass, FilterPrimitiveElement.class, "FilterPrimitiveElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(____ENUMS____EClass, ____ENUMS____.class, "____ENUMS____", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(____DATATYPES____EClass, ____DATATYPES____.class, "____DATATYPES____", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(____ATTRIBUTES____EClass, ____ATTRIBUTES____.class, "____ATTRIBUTES____", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalProcessingAttributesEClass, ConditionalProcessingAttributes.class, "ConditionalProcessingAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalProcessingAttributes_RequiredFeatures(), ecorePackage.getEString(), "requiredFeatures", null, 0, 1, ConditionalProcessingAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalProcessingAttributes_RequiredExtensions(), ecorePackage.getEString(), "requiredExtensions", null, 0, 1, ConditionalProcessingAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalProcessingAttributes_SystemLanguage(), ecorePackage.getEString(), "systemLanguage", null, 0, 1, ConditionalProcessingAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreAttributesEClass, CoreAttributes.class, "CoreAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoreAttributes_Id(), ecorePackage.getEString(), "id", null, 0, 1, CoreAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreAttributes_Xml__base(), ecorePackage.getEString(), "xml__base", null, 0, 1, CoreAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreAttributes_Xml__lang(), ecorePackage.getEString(), "xml__lang", null, 0, 1, CoreAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoreAttributes_Xml__space(), ecorePackage.getEString(), "xml__space", null, 0, 1, CoreAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEventAttributesEClass, DocumentEventAttributes.class, "DocumentEventAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentEventAttributes_Onunload(), ecorePackage.getEString(), "onunload", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEventAttributes_Onabort(), ecorePackage.getEString(), "onabort", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEventAttributes_Onerror(), ecorePackage.getEString(), "onerror", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEventAttributes_Onresize(), ecorePackage.getEString(), "onresize", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEventAttributes_Onscroll(), ecorePackage.getEString(), "onscroll", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEventAttributes_Onzoom(), ecorePackage.getEString(), "onzoom", null, 0, 1, DocumentEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalEventAttributesEClass, GraphicalEventAttributes.class, "GraphicalEventAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalEventAttributes_Onfocusin(), ecorePackage.getEString(), "onfocusin", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onfocusout(), ecorePackage.getEString(), "onfocusout", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onactivate(), ecorePackage.getEString(), "onactivate", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onclick(), ecorePackage.getEString(), "onclick", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onmousedown(), ecorePackage.getEString(), "onmousedown", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onmouseup(), ecorePackage.getEString(), "onmouseup", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onmouseover(), ecorePackage.getEString(), "onmouseover", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onmousemove(), ecorePackage.getEString(), "onmousemove", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onmouseout(), ecorePackage.getEString(), "onmouseout", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalEventAttributes_Onload(), ecorePackage.getEString(), "onload", null, 0, 1, GraphicalEventAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationAttributesEClass, PresentationAttributes.class, "PresentationAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentationAttributes_Alignment_baseline(), this.getAlignment_baseline(), "alignment_baseline", "alignment_baseline.auto", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Baseline_shift(), this.getBaseline_shift(), "baseline_shift", "\"baseline\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Clip(), this.getClip(), "clip", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Clip_path(), this.getClip_path(), "clip_path", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Clip_rule(), this.getClip_rule(), "clip_rule", "clip_rule.nonzero", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Color(), this.getColor(), "color", null, 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Color_interpolation(), this.getColor_interpolation(), "color_interpolation", "color_interpolation.sRGB", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Color_interpolation_filters(), this.getColor_interpolation_filters(), "color_interpolation_filters", "color_interpolation_filters.linearRGB", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Color_profile(), this.getColor_profile(), "color_profile", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Color_rendering(), this.getColor_rendering(), "color_rendering", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Cursor(), this.getCursor(), "cursor", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Direction(), this.getDirection(), "direction", "direction.ltr", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Display(), this.getDisplay(), "display", "display.inline", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Dominant_baseline(), this.getDominant_baseline(), "dominant_baseline", "dominant_baseline.auto", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Enable_background(), this.getEnable_background(), "enable_background", "\"inherit\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Fill(), this.getFill(), "fill", "\"black\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Fill_opacity(), this.getFill_opacity(), "fill_opacity", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Fill_rule(), this.getFill_rule(), "fill_rule", "fill_rule.nonzero", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Filter(), this.getFilter(), "filter", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Flood_color(), this.getFlood_color(), "flood_color", "\"black\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Flood_opacity(), this.getFlood_opacity(), "flood_opacity", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_family(), this.getFont_family(), "font_family", null, 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_size(), this.getFont_size(), "font_size", "\"medium\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_size_adjust(), this.getFont_size_adjust(), "font_size_adjust", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_stretch(), this.getFont_stretch(), "font_stretch", "font_stretch.none", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_style(), this.getFont_style(), "font_style", "font_style.normal", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_variant(), this.getFont_variant(), "font_variant", "font_variant.normal", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Font_weight(), this.getFont_weight(), "font_weight", "font_weight.normal", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Glyph_orientation_horizontal(), this.getGlyph_orientation_horizontal(), "glyph_orientation_horizontal", "\"0deg\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Glyph_orientation_vertical(), this.getGlyph_orientation_vertical(), "glyph_orientation_vertical", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Image_rendering(), this.getImage_rendering(), "image_rendering", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Kerning(), this.getKerning(), "kerning", "\"auto\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Letter_spacing(), this.getLetter_spacing(), "letter_spacing", "\"normal\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Lighting_color(), this.getLighting_color(), "lighting_color", "\"white\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Marker_end(), this.getMarker_end(), "marker_end", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Marker_mid(), this.getMarker_mid(), "marker_mid", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Marker_start(), this.getMarker_start(), "marker_start", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Masks(), this.getMasks(), "masks", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Opacity(), this.getOpacity(), "opacity", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Overflow(), this.getOverflow(), "overflow", "null", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Pointer_events(), this.getPointer_events(), "pointer_events", "pointer_events.visiblePainted", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Shape_rendering(), this.getShape_rendering(), "shape_rendering", "shape_rendering.auto", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stop_color(), this.getStop_color(), "stop_color", "\"black\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stop_opacity(), this.getStop_opacity(), "stop_opacity", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke(), this.getStroke(), "stroke", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_dasharray(), this.getStroke_dasharray(), "stroke_dasharray", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_dashoffset(), this.getStroke_dashoffset(), "stroke_dashoffset", "\"0\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_linecap(), this.getStroke_linecap(), "stroke_linecap", "\"butt\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_linejoin(), this.getStroke_linejoin(), "stroke_linejoin", "stroke_linejoin.miter", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_miterlimit(), this.getStroke_miterlimit(), "stroke_miterlimit", "4", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_opacity(), this.getStroke_opacity(), "stroke_opacity", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Stroke_width(), this.getStroke_width(), "stroke_width", "\"1\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Text_anchor(), this.getText_anchor(), "text_anchor", "text_anchor.start", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Text_decoration(), this.getText_decoration(), "text_decoration", "\"none\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Text_rendering(), this.getText_rendering(), "text_rendering", "text_rendering.auto", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Unicode_bidi(), this.getUnicode_bidi(), "unicode_bidi", "unicode_bidi.normal", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Visibility(), this.getVisibility(), "visibility", "visibility.visible", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Word_spacing(), this.getWord_spacing(), "word_spacing", "\"normal\"", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationAttributes_Writing_mode(), this.getWriting_mode(), "writing_mode", "writing_mode.lr_tb", 0, 1, PresentationAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xLinkAttributesEClass, XLinkAttributes.class, "XLinkAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXLinkAttributes_Xlink__href(), ecorePackage.getEString(), "xlink__href", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__show(), ecorePackage.getEString(), "xlink__show", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__actuate(), ecorePackage.getEString(), "xlink__actuate", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__type(), ecorePackage.getEString(), "xlink__type", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__role(), ecorePackage.getEString(), "xlink__role", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__arcrole(), ecorePackage.getEString(), "xlink__arcrole", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLinkAttributes_Xlink__title(), ecorePackage.getEString(), "xlink__title", null, 0, 1, XLinkAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterPrimitiveAttributesEClass, FilterPrimitiveAttributes.class, "FilterPrimitiveAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterPrimitiveAttributes_X(), this.getCoordinate(), "x", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterPrimitiveAttributes_Y(), this.getCoordinate(), "y", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterPrimitiveAttributes_Width(), this.getLength(), "width", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterPrimitiveAttributes_Height(), this.getLength(), "height", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterPrimitiveAttributes_Result(), ecorePackage.getEString(), "result", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterPrimitiveAttributes_In(), ecorePackage.getEString(), "in", null, 0, 1, FilterPrimitiveAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(____ELEMENTES____EClass, ____ELEMENTES____.class, "____ELEMENTES____", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgSvgElementEClass, SvgSvgElement.class, "SvgSvgElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgSvgElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_Width(), this.getLength(), "width", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_Height(), this.getLength(), "height", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_ViewBox(), this.getViewBox(), "viewBox", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_ZoomAndPan(), this.getZoomAndPan(), "zoomAndPan", "zoomandpan.disable", 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_Version(), this.getNumber(), "version", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_BaseProfile(), ecorePackage.getEString(), "baseProfile", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_ContentScriptType(), ecorePackage.getEString(), "contentScriptType", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSvgElement_ContentStyleType(), ecorePackage.getEString(), "contentStyleType", null, 0, 1, SvgSvgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgGElementEClass, SvgGElement.class, "SvgGElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgGElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgGElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgDefsElementEClass, SvgDefsElement.class, "SvgDefsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgDefsElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgDefsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgDefsElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgDefsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgDefsElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgDefsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgDefsElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgDefsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgDescElementEClass, SvgDescElement.class, "SvgDescElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgDescElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgDescElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgDescElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgDescElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgTitleElementEClass, SvgTitleElement.class, "SvgTitleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgTitleElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgTitleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTitleElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgTitleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgSymbolElementEClass, SvgSymbolElement.class, "SvgSymbolElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgSymbolElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgSymbolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSymbolElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgSymbolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSymbolElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgSymbolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSymbolElement_ViewBox(), this.getViewBox(), "viewBox", null, 0, 1, SvgSymbolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSymbolElement_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgSymbolElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgUseElementEClass, SvgUseElement.class, "SvgUseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgUseElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgUseElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgUseElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgUseElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgUseElement_Width(), this.getLength(), "width", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgUseElement_Height(), this.getLength(), "height", null, 0, 1, SvgUseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgImageElementEClass, SvgImageElement.class, "SvgImageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgImageElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_Width(), this.getLength(), "width", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgImageElement_Height(), this.getLength(), "height", null, 0, 1, SvgImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgSwitchElementEClass, SvgSwitchElement.class, "SvgSwitchElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgSwitchElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgSwitchElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSwitchElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgSwitchElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSwitchElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgSwitchElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgSwitchElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgSwitchElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgPathElementEClass, SvgPathElement.class, "SvgPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgPathElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPathElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPathElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPathElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPathElement_D(), this.getPathData(), "d", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPathElement_PathLength(), this.getNumber(), "pathLength", null, 0, 1, SvgPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgRectElementEClass, SvgRectElement.class, "SvgRectElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgRectElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Width(), this.getLength(), "width", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Height(), this.getLength(), "height", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Rx(), this.getLength(), "rx", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRectElement_Ry(), this.getLength(), "ry", null, 0, 1, SvgRectElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgCircleElementEClass, SvgCircleElement.class, "SvgCircleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgCircleElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_Cx(), this.getCoordinate(), "cx", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_Cy(), this.getCoordinate(), "cy", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgCircleElement_R(), this.getLength(), "r", null, 0, 1, SvgCircleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgEllipseElementEClass, SvgEllipseElement.class, "SvgEllipseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgEllipseElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Cx(), this.getCoordinate(), "cx", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Cy(), this.getCoordinate(), "cy", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Rx(), this.getLength(), "rx", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgEllipseElement_Ry(), this.getLength(), "ry", null, 0, 1, SvgEllipseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgLineElementEClass, SvgLineElement.class, "SvgLineElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgLineElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_X1(), this.getCoordinate(), "x1", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_Y1(), this.getCoordinate(), "y1", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_X2(), this.getCoordinate(), "x2", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLineElement_Y2(), this.getCoordinate(), "y2", null, 0, 1, SvgLineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgPolylineElementEClass, SvgPolylineElement.class, "SvgPolylineElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgPolylineElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgPolylineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolylineElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgPolylineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolylineElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgPolylineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolylineElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgPolylineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolylineElement_Points(), this.getListOfPoints(), "points", null, 0, 1, SvgPolylineElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgPolygonElementEClass, SvgPolygonElement.class, "SvgPolygonElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgPolygonElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgPolygonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolygonElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgPolygonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolygonElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgPolygonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolygonElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgPolygonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPolygonElement_Points(), this.getListOfPoints(), "points", null, 0, 1, SvgPolygonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgTextElementEClass, SvgTextElement.class, "SvgTextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgTextElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_LengthAdjust(), this.getLengthAdjust(), "lengthAdjust", "LengthAdjust.spacing", 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Dx(), this.getListOfLengths(), "dx", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Dy(), this.getListOfLengths(), "dy", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_Rotate(), this.getListOfNumbers(), "rotate", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextElement_TextLength(), this.getLength(), "textLength", null, 0, 1, SvgTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgTspanElementEClass, SvgTspanElement.class, "SvgTspanElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgTspanElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_X(), this.getListOfCoordinates(), "x", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_Y(), this.getListOfCoordinates(), "y", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_Dx(), this.getListOfLengths(), "dx", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_Dy(), this.getListOfLengths(), "dy", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_Rotate(), this.getListOfNumbers(), "rotate", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_TextLength(), this.getLength(), "textLength", null, 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTspanElement_LengthAdjust(), this.getLengthAdjust(), "lengthAdjust", "LengthAdjust.spacing", 0, 1, SvgTspanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgTrefElementEClass, SvgTrefElement.class, "SvgTrefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgTrefElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgTrefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTrefElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgTrefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTrefElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgTrefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgTextPathElementEClass, SvgTextPathElement.class, "SvgTextPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgTextPathElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextPathElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextPathElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextPathElement_StartOffset(), this.getLength(), "startOffset", null, 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextPathElement_Method(), this.getMethod(), "method", "Method.align", 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgTextPathElement_Spacing(), this.getSpacing(), "spacing", "Spacing.exact", 0, 1, SvgTextPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgAltGlyphElementEClass, SvgAltGlyphElement.class, "SvgAltGlyphElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgAltGlyphElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_X(), this.getListOfCoordinates(), "x", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Y(), this.getListOfCoordinates(), "y", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Dx(), this.getListOfLengths(), "dx", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Dy(), this.getListOfLengths(), "dy", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_GlyphRef(), ecorePackage.getEString(), "glyphRef", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Format(), ecorePackage.getEString(), "format", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphElement_Rotate(), this.getListOfNumbers(), "rotate", null, 0, 1, SvgAltGlyphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgAltGlyphDefElementEClass, SvgAltGlyphDefElement.class, "SvgAltGlyphDefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgAltGlyphItemElementEClass, SvgAltGlyphItemElement.class, "SvgAltGlyphItemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgAltGlyphRefElementEClass, SvgAltGlyphRefElement.class, "SvgAltGlyphRefElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgAltGlyphRefElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_X(), this.getNumber(), "x", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_Y(), this.getNumber(), "y", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_Dx(), this.getNumber(), "dx", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_Dy(), this.getNumber(), "dy", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_GlyphRef(), ecorePackage.getEString(), "glyphRef", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgAltGlyphRefElement_Format(), ecorePackage.getEString(), "format", null, 0, 1, SvgAltGlyphRefElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgMarkerElementEClass, SvgMarkerElement.class, "SvgMarkerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgMarkerElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_ViewBox(), this.getViewBox(), "viewBox", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_RefX(), this.getCoordinate(), "refX", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_RefY(), this.getCoordinate(), "refY", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_MarkerUnits(), this.getMarkerUnits(), "markerUnits", "MarkerUnits.strokeWidth", 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_MarkerWidth(), this.getLength(), "markerWidth", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_MarkerHeight(), this.getLength(), "markerHeight", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMarkerElement_Orient(), ecorePackage.getEString(), "orient", null, 0, 1, SvgMarkerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgColorProfileElementEClass, SvgColorProfileElement.class, "SvgColorProfileElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgColorProfileElement_Local(), ecorePackage.getEString(), "local", null, 0, 1, SvgColorProfileElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgColorProfileElement_Name(), this.getName_(), "name", null, 0, 1, SvgColorProfileElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgColorProfileElement_Rendering_intent(), this.getRendering_intent(), "rendering_intent", "Rendering_intent.auto", 0, 1, SvgColorProfileElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgLinearGradientElementEClass, SvgLinearGradientElement.class, "SvgLinearGradientElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgLinearGradientElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_X1(), this.getCoordinate(), "x1", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_Y1(), this.getCoordinate(), "y1", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_X2(), this.getCoordinate(), "x2", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_Y2(), this.getCoordinate(), "y2", null, 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_GradientUnits(), this.getGradientUnits(), "gradientUnits", "GradientUnits.objectBoundingBox", 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgLinearGradientElement_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", "SpreadMethod.pad", 0, 1, SvgLinearGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgRadialGradientElementEClass, SvgRadialGradientElement.class, "SvgRadialGradientElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgRadialGradientElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_Cx(), this.getCoordinate(), "cx", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_Cy(), this.getCoordinate(), "cy", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_R(), this.getLength(), "r", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_Fx(), this.getCoordinate(), "fx", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_Fy(), this.getCoordinate(), "fy", null, 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgRadialGradientElement_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", "SpreadMethod.pad", 0, 1, SvgRadialGradientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgGradientStopElementEClass, SvgGradientStopElement.class, "SvgGradientStopElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgGradientStopElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgGradientStopElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGradientStopElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgGradientStopElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgGradientStopElement_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, SvgGradientStopElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgPatternElementEClass, SvgPatternElement.class, "SvgPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgPatternElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_ViewBox(), this.getViewBox(), "viewBox", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_Width(), this.getLength(), "width", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_Height(), this.getLength(), "height", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_PatternUnits(), this.getPatternUnits(), "patternUnits", "PatternUnits.objectBoundingBox", 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_PatternContentUnits(), this.getPatternUnits(), "patternContentUnits", "PatternUnits.userSpaceOnUse", 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgPatternElement_PatternTransform(), ecorePackage.getEString(), "patternTransform", null, 0, 1, SvgPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgClipPathElementEClass, SvgClipPathElement.class, "SvgClipPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgClipPathElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgClipPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgClipPathElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgClipPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgClipPathElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgClipPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgClipPathElement_Transform(), this.getTransform(), "transform", null, 0, 1, SvgClipPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgClipPathElement_ClipPathUnits(), this.getClipPathUnits(), "clipPathUnits", "ClipPathUnits.userSpaceOnUse", 0, 1, SvgClipPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgMaskElementEClass, SvgMaskElement.class, "SvgMaskElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgMaskElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_Width(), this.getLength(), "width", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_Height(), this.getLength(), "height", null, 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_MaskUnits(), this.getMaskUnits(), "maskUnits", "MaskUnits.objectBoundingBox", 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgMaskElement_MaskContentUnits(), this.getMaskUnits(), "maskContentUnits", "MaskUnits.userSpaceOnUse", 0, 1, SvgMaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFilterElementEClass, SvgFilterElement.class, "SvgFilterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFilterElement_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_X(), this.getCoordinate(), "x", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_Y(), this.getCoordinate(), "y", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_Width(), this.getLength(), "width", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_Height(), this.getLength(), "height", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_FilterRes(), this.getNumberOptionalNumber(), "filterRes", null, 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_FilterUnits(), this.getFilterUnits(), "filterUnits", "FilterUnits.userSpaceOnUse", 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFilterElement_PrimitiveUnits(), this.getFilterUnits(), "primitiveUnits", "FilterUnits.userSpaceOnUse", 0, 1, SvgFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeDistantLightEClass, SvgFeDistantLight.class, "SvgFeDistantLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeDistantLight_Azimuth(), this.getNumber(), "azimuth", null, 0, 1, SvgFeDistantLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDistantLight_Elevation(), this.getNumber(), "elevation", null, 0, 1, SvgFeDistantLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFePointLightEClass, SvgFePointLight.class, "SvgFePointLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFePointLight_X(), this.getNumber(), "x", null, 0, 1, SvgFePointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFePointLight_Y(), this.getNumber(), "y", null, 0, 1, SvgFePointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFePointLight_Z(), this.getNumber(), "z", null, 0, 1, SvgFePointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeSpotLightEClass, SvgFeSpotLight.class, "SvgFeSpotLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeSpotLight_X(), this.getNumber(), "x", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_Y(), this.getNumber(), "y", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_Z(), this.getNumber(), "z", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_PointsAtX(), this.getNumber(), "pointsAtX", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_PointsAtY(), this.getNumber(), "pointsAtY", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_PointsAtZ(), this.getNumber(), "pointsAtZ", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_SpecularExponent(), this.getNumber(), "specularExponent", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpotLight_LimitingConeAngle(), this.getNumber(), "limitingConeAngle", null, 0, 1, SvgFeSpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeBlendEClass, SvgFeBlend.class, "SvgFeBlend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeBlend_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeBlend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeBlend_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeBlend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeBlend_In2(), ecorePackage.getEString(), "in2", null, 0, 1, SvgFeBlend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeBlend_Mode(), this.getBlendMode(), "mode", "Mode.normal", 0, 1, SvgFeBlend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeColorMatrixEClass, SvgFeColorMatrix.class, "SvgFeColorMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeColorMatrix_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeColorMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeColorMatrix_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeColorMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeColorMatrix_Type(), this.getColorMatrixType(), "type", "ColorMatrixType.matrix", 0, 1, SvgFeColorMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeColorMatrix_Values(), this.getListOfNumbers(), "values", null, 0, 1, SvgFeColorMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeComponentTransferEClass, SvgFeComponentTransfer.class, "SvgFeComponentTransfer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeComponentTransfer_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeComponentTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComponentTransfer_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeComponentTransfer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeFuncREClass, SvgFeFuncR.class, "SvgFeFuncR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgFeFuncGEClass, SvgFeFuncG.class, "SvgFeFuncG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgFeFuncBEClass, SvgFeFuncB.class, "SvgFeFuncB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgFeFuncAEClass, SvgFeFuncA.class, "SvgFeFuncA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgFeCompositeEClass, SvgFeComposite.class, "SvgFeComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeComposite_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_In2(), ecorePackage.getEString(), "in2", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_Operator(), this.getCompositeOperator(), "operator", "CompositeOperator.over", 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_K1(), this.getNumber(), "k1", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_K2(), this.getNumber(), "k2", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_K3(), this.getNumber(), "k3", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeComposite_K4(), this.getNumber(), "k4", null, 0, 1, SvgFeComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeConvolveMatrixEClass, SvgFeConvolveMatrix.class, "SvgFeConvolveMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeConvolveMatrix_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_Order(), this.getNumberOptionalNumber(), "order", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_KernelMatrix(), this.getListOfNumbers(), "kernelMatrix", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_Divisor(), this.getNumber(), "divisor", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_Bias(), this.getNumber(), "bias", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_TargetX(), ecorePackage.getEIntegerObject(), "targetX", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_TargetY(), ecorePackage.getEIntegerObject(), "targetY", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_EdgeMode(), this.getConvolveMatrixEdgeMode(), "edgeMode", "ConvolveMatrixEdgeMode.duplicate", 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_KernelUnitLength(), this.getNumberOptionalNumber(), "kernelUnitLength", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeConvolveMatrix_PreserveAlpha(), ecorePackage.getEBoolean(), "preserveAlpha", null, 0, 1, SvgFeConvolveMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeDiffuseLightingEClass, SvgFeDiffuseLighting.class, "SvgFeDiffuseLighting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeDiffuseLighting_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeDiffuseLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDiffuseLighting_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeDiffuseLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDiffuseLighting_SurfaceScale(), this.getNumber(), "surfaceScale", null, 0, 1, SvgFeDiffuseLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDiffuseLighting_DiffuseConstant(), this.getNumber(), "diffuseConstant", null, 0, 1, SvgFeDiffuseLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDiffuseLighting_KernelUnitLength(), this.getNumberOptionalNumber(), "kernelUnitLength", null, 0, 1, SvgFeDiffuseLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeDisplacementMapEClass, SvgFeDisplacementMap.class, "SvgFeDisplacementMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeDisplacementMap_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDisplacementMap_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDisplacementMap_In2(), ecorePackage.getEString(), "in2", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDisplacementMap_Scale(), this.getNumber(), "scale", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDisplacementMap_XChannelSelector(), this.getChannelSelector(), "xChannelSelector", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeDisplacementMap_YChannelSelector(), this.getChannelSelector(), "yChannelSelector", null, 0, 1, SvgFeDisplacementMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeFloodEClass, SvgFeFlood.class, "SvgFeFlood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeFlood_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeFlood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeFlood_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeFlood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeGaussianBlurEClass, SvgFeGaussianBlur.class, "SvgFeGaussianBlur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeGaussianBlur_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeGaussianBlur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeGaussianBlur_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeGaussianBlur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeGaussianBlur_StdDeviation(), this.getNumberOptionalNumber(), "stdDeviation", null, 0, 1, SvgFeGaussianBlur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeImageEClass, SvgFeImage.class, "SvgFeImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeImage_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeImage_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeImage_ExternalResourcesRequired(), ecorePackage.getEString(), "externalResourcesRequired", null, 0, 1, SvgFeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeImage_PreserveAspectRatio(), this.getPreserveAspectRatio(), "preserveAspectRatio", null, 0, 1, SvgFeImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeMergeEClass, SvgFeMerge.class, "SvgFeMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeMerge_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeMerge_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeMergeNodeEClass, SvgFeMergeNode.class, "SvgFeMergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(svgFeMorphologyEClass, SvgFeMorphology.class, "SvgFeMorphology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeMorphology_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeMorphology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeMorphology_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeMorphology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeMorphology_Operator(), this.getMorphologyOperator(), "operator", "MorphologyOperator.erode", 0, 1, SvgFeMorphology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeMorphology_Radius(), this.getNumberOptionalNumber(), "radius", null, 0, 1, SvgFeMorphology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeOffsetEClass, SvgFeOffset.class, "SvgFeOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeOffset_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeOffset_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeOffset_Dx(), this.getNumber(), "dx", null, 0, 1, SvgFeOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeOffset_Dy(), this.getNumber(), "dy", null, 0, 1, SvgFeOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeSpecularLightingEClass, SvgFeSpecularLighting.class, "SvgFeSpecularLighting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeSpecularLighting_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpecularLighting_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpecularLighting_SurfaceScale(), this.getNumber(), "surfaceScale", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpecularLighting_SpecularConstant(), this.getNumber(), "specularConstant", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpecularLighting_SpecularExponent(), this.getNumber(), "specularExponent", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeSpecularLighting_KernelUnitLength(), this.getNumberOptionalNumber(), "kernelUnitLength", null, 0, 1, SvgFeSpecularLighting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeTileEClass, SvgFeTile.class, "SvgFeTile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeTile_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTile_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeTile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFeTurbulenceEClass, SvgFeTurbulence.class, "SvgFeTurbulence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSvgFeTurbulence_Class(), ecorePackage.getEString(), "class", null, 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_Style(), ecorePackage.getEString(), "style", null, 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_BaseFrequency(), this.getNumberOptionalNumber(), "baseFrequency", null, 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_NumOctaves(), ecorePackage.getEInt(), "numOctaves", "1", 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_Seed(), this.getNumber(), "seed", "0", 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_StitchTiles(), this.getStitchTiles(), "stitchTiles", "StitchTiles.noStitch", 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSvgFeTurbulence_Type(), this.getTurbulenceType(), "type", "TurbulenceType.turbulence", 0, 1, SvgFeTurbulence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignment_baselineEEnum, Alignment_baseline.class, "Alignment_baseline");
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.AUTO);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.BASELINE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.BEFORE_EDGE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.TEXT_BEFORE_EDGE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.MIDDLE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.CENTRAL);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.AFTER_EDGE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.TEXT_AFTER_EDGE);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.IDEOGRAPHIC);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.ALPHABETIC);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.HANGING);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.MATHEMATICAL);
		addEEnumLiteral(alignment_baselineEEnum, Alignment_baseline.INHERIT);

		initEEnum(clip_ruleEEnum, Clip_rule.class, "Clip_rule");
		addEEnumLiteral(clip_ruleEEnum, Clip_rule.NONZERO);
		addEEnumLiteral(clip_ruleEEnum, Clip_rule.EVENODD);
		addEEnumLiteral(clip_ruleEEnum, Clip_rule.INHERIT);

		initEEnum(color_interpolationEEnum, Color_interpolation.class, "Color_interpolation");
		addEEnumLiteral(color_interpolationEEnum, Color_interpolation.SRGB);
		addEEnumLiteral(color_interpolationEEnum, Color_interpolation.AUTO);
		addEEnumLiteral(color_interpolationEEnum, Color_interpolation.LINEAR_RGB);
		addEEnumLiteral(color_interpolationEEnum, Color_interpolation.INHERIT);

		initEEnum(color_interpolation_filtersEEnum, Color_interpolation_filters.class, "Color_interpolation_filters");
		addEEnumLiteral(color_interpolation_filtersEEnum, Color_interpolation_filters.AUTO);
		addEEnumLiteral(color_interpolation_filtersEEnum, Color_interpolation_filters.SRGB);
		addEEnumLiteral(color_interpolation_filtersEEnum, Color_interpolation_filters.LINEAR_RGB);
		addEEnumLiteral(color_interpolation_filtersEEnum, Color_interpolation_filters.INHERIT);

		initEEnum(color_renderingEEnum, Color_rendering.class, "Color_rendering");
		addEEnumLiteral(color_renderingEEnum, Color_rendering.AUTO);
		addEEnumLiteral(color_renderingEEnum, Color_rendering.OPTIMIZE_SPEED);
		addEEnumLiteral(color_renderingEEnum, Color_rendering.OPTIMIZE_QUALITY);
		addEEnumLiteral(color_renderingEEnum, Color_rendering.INHERIT);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.LTR);
		addEEnumLiteral(directionEEnum, Direction.RTL);
		addEEnumLiteral(directionEEnum, Direction.INHERIT);

		initEEnum(displayEEnum, Display.class, "Display");
		addEEnumLiteral(displayEEnum, Display.INLINE);
		addEEnumLiteral(displayEEnum, Display.BLOCK);
		addEEnumLiteral(displayEEnum, Display.LIST_ITEM);
		addEEnumLiteral(displayEEnum, Display.RUN_IN);
		addEEnumLiteral(displayEEnum, Display.COMPACT);
		addEEnumLiteral(displayEEnum, Display.MARKER);
		addEEnumLiteral(displayEEnum, Display.TABLE);
		addEEnumLiteral(displayEEnum, Display.INLINE_TABLE);
		addEEnumLiteral(displayEEnum, Display.TABLE_ROW_GROUP);
		addEEnumLiteral(displayEEnum, Display.TABLE_HEADER_GROUP);
		addEEnumLiteral(displayEEnum, Display.TABLE_FOOTER_GROUP);
		addEEnumLiteral(displayEEnum, Display.TABLE_ROW);
		addEEnumLiteral(displayEEnum, Display.TABLE_COLUMN_GROUP);
		addEEnumLiteral(displayEEnum, Display.TABLE_COLUMN);
		addEEnumLiteral(displayEEnum, Display.TABLE_CELL);
		addEEnumLiteral(displayEEnum, Display.TABLE_CAPTION);
		addEEnumLiteral(displayEEnum, Display.NONE);
		addEEnumLiteral(displayEEnum, Display.INHERIT);

		initEEnum(dominant_baselineEEnum, Dominant_baseline.class, "Dominant_baseline");
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.AUTO);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.USE_SCRIPT);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.NO_CHANGE);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.RESET_SIZE);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.IDEOGRAPHIC);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.ALPHABETIC);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.HANGING);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.MATHEMATICAL);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.CENTRAL);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.MIDDLE);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.TEXT_AFTER_EDGE);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.TEXT_BEFORE_EDGE);
		addEEnumLiteral(dominant_baselineEEnum, Dominant_baseline.INHERIT);

		initEEnum(fill_ruleEEnum, Fill_rule.class, "Fill_rule");
		addEEnumLiteral(fill_ruleEEnum, Fill_rule.NONZERO);
		addEEnumLiteral(fill_ruleEEnum, Fill_rule.EVENODD);
		addEEnumLiteral(fill_ruleEEnum, Fill_rule.INHERIT);

		initEEnum(font_stretchEEnum, Font_stretch.class, "Font_stretch");
		addEEnumLiteral(font_stretchEEnum, Font_stretch.NORMAL);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.WIDER);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.NARROWER);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.ULTRA_CONDENSED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.EXTRA_CONDENSED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.CONDENSED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.SEMI_CONDENSED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.SEMI_EXPANDED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.EXPANDED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.EXTRA_EXPANDED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.ULTRA_EXPANDED);
		addEEnumLiteral(font_stretchEEnum, Font_stretch.INHERIT);

		initEEnum(font_styleEEnum, Font_style.class, "Font_style");
		addEEnumLiteral(font_styleEEnum, Font_style.NORMAL);
		addEEnumLiteral(font_styleEEnum, Font_style.ITALIC);
		addEEnumLiteral(font_styleEEnum, Font_style.OBLIQUE);
		addEEnumLiteral(font_styleEEnum, Font_style.INHERIT);

		initEEnum(font_variantEEnum, Font_variant.class, "Font_variant");
		addEEnumLiteral(font_variantEEnum, Font_variant.NORMAL);
		addEEnumLiteral(font_variantEEnum, Font_variant.SMALL_CAPS);
		addEEnumLiteral(font_variantEEnum, Font_variant.INHERIT);

		initEEnum(font_weightEEnum, Font_weight.class, "Font_weight");
		addEEnumLiteral(font_weightEEnum, Font_weight.NORMAL);
		addEEnumLiteral(font_weightEEnum, Font_weight.BOLD);
		addEEnumLiteral(font_weightEEnum, Font_weight.BOLDER);
		addEEnumLiteral(font_weightEEnum, Font_weight.LIGHTER);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM100);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM200);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM300);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM400);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM500);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM600);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM700);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM800);
		addEEnumLiteral(font_weightEEnum, Font_weight.EM900);
		addEEnumLiteral(font_weightEEnum, Font_weight.INHERIT);

		initEEnum(image_renderingEEnum, Image_rendering.class, "Image_rendering");
		addEEnumLiteral(image_renderingEEnum, Image_rendering.AUTO);
		addEEnumLiteral(image_renderingEEnum, Image_rendering.OPTIMIZE_SPEED);
		addEEnumLiteral(image_renderingEEnum, Image_rendering.OPTIMIZE_QUALITY);
		addEEnumLiteral(image_renderingEEnum, Image_rendering.INHERIT);

		initEEnum(overflowEEnum, Overflow.class, "Overflow");
		addEEnumLiteral(overflowEEnum, Overflow.VISIBLE);
		addEEnumLiteral(overflowEEnum, Overflow.HIDDEN);
		addEEnumLiteral(overflowEEnum, Overflow.SCROLL);
		addEEnumLiteral(overflowEEnum, Overflow.AUTO);
		addEEnumLiteral(overflowEEnum, Overflow.INHERIT);

		initEEnum(pointer_eventsEEnum, Pointer_events.class, "Pointer_events");
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.VISIBLE_PAINTED);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.VISIBLE_FILL);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.VISIBLE_STROKE);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.VISIBLE);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.PAINTED);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.FILL);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.STROKE);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.ALL);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.NONE);
		addEEnumLiteral(pointer_eventsEEnum, Pointer_events.INHERIT);

		initEEnum(shape_renderingEEnum, Shape_rendering.class, "Shape_rendering");
		addEEnumLiteral(shape_renderingEEnum, Shape_rendering.AUTO);
		addEEnumLiteral(shape_renderingEEnum, Shape_rendering.OPTIMIZE_SPEED);
		addEEnumLiteral(shape_renderingEEnum, Shape_rendering.CRISP_EDGES);
		addEEnumLiteral(shape_renderingEEnum, Shape_rendering.GEOMETRIC_PRECISION);
		addEEnumLiteral(shape_renderingEEnum, Shape_rendering.INHERIT);

		initEEnum(stroke_linecapEEnum, Stroke_linecap.class, "Stroke_linecap");
		addEEnumLiteral(stroke_linecapEEnum, Stroke_linecap.BUTT);
		addEEnumLiteral(stroke_linecapEEnum, Stroke_linecap.ROUND);
		addEEnumLiteral(stroke_linecapEEnum, Stroke_linecap.SQUARE);
		addEEnumLiteral(stroke_linecapEEnum, Stroke_linecap.INHERIT);

		initEEnum(stroke_linejoinEEnum, Stroke_linejoin.class, "Stroke_linejoin");
		addEEnumLiteral(stroke_linejoinEEnum, Stroke_linejoin.MITER);
		addEEnumLiteral(stroke_linejoinEEnum, Stroke_linejoin.ROUND);
		addEEnumLiteral(stroke_linejoinEEnum, Stroke_linejoin.BEVEL);
		addEEnumLiteral(stroke_linejoinEEnum, Stroke_linejoin.INHERIT);

		initEEnum(text_anchorEEnum, Text_anchor.class, "Text_anchor");
		addEEnumLiteral(text_anchorEEnum, Text_anchor.START);
		addEEnumLiteral(text_anchorEEnum, Text_anchor.MIDDLE);
		addEEnumLiteral(text_anchorEEnum, Text_anchor.END);
		addEEnumLiteral(text_anchorEEnum, Text_anchor.INHERIT);

		initEEnum(text_renderingEEnum, Text_rendering.class, "Text_rendering");
		addEEnumLiteral(text_renderingEEnum, Text_rendering.AUTO);
		addEEnumLiteral(text_renderingEEnum, Text_rendering.OPTIMIZE_SPEED);
		addEEnumLiteral(text_renderingEEnum, Text_rendering.OPTIMIZE_LEGIBILITY);
		addEEnumLiteral(text_renderingEEnum, Text_rendering.GEOMETRIC_PRECISION);
		addEEnumLiteral(text_renderingEEnum, Text_rendering.INHERIT);

		initEEnum(unicode_bidiEEnum, Unicode_bidi.class, "Unicode_bidi");
		addEEnumLiteral(unicode_bidiEEnum, Unicode_bidi.NORMAL);
		addEEnumLiteral(unicode_bidiEEnum, Unicode_bidi.EMBED);
		addEEnumLiteral(unicode_bidiEEnum, Unicode_bidi.BIDI_OVERRIDE);
		addEEnumLiteral(unicode_bidiEEnum, Unicode_bidi.INHERIT);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.VISIBLE);
		addEEnumLiteral(visibilityEEnum, Visibility.HIDDEN);
		addEEnumLiteral(visibilityEEnum, Visibility.COLLAPSE);
		addEEnumLiteral(visibilityEEnum, Visibility.INHERIT);

		initEEnum(writing_modeEEnum, Writing_mode.class, "Writing_mode");
		addEEnumLiteral(writing_modeEEnum, Writing_mode.LR_TB);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.RL_TB);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.TB_RL);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.LR);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.RL);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.TB);
		addEEnumLiteral(writing_modeEEnum, Writing_mode.INHERIT);

		initEEnum(zoomAndPanEEnum, ZoomAndPan.class, "ZoomAndPan");
		addEEnumLiteral(zoomAndPanEEnum, ZoomAndPan.DISABLE);
		addEEnumLiteral(zoomAndPanEEnum, ZoomAndPan.MAGNIFY);

		initEEnum(lengthAdjustEEnum, LengthAdjust.class, "LengthAdjust");
		addEEnumLiteral(lengthAdjustEEnum, LengthAdjust.SPACING);
		addEEnumLiteral(lengthAdjustEEnum, LengthAdjust.SPACING_AND_GLYPHS);

		initEEnum(methodEEnum, Method.class, "Method");
		addEEnumLiteral(methodEEnum, Method.ALIGN);
		addEEnumLiteral(methodEEnum, Method.STRETCH);

		initEEnum(spacingEEnum, Spacing.class, "Spacing");
		addEEnumLiteral(spacingEEnum, Spacing.AUTO);
		addEEnumLiteral(spacingEEnum, Spacing.EXACT);

		initEEnum(markerUnitsEEnum, MarkerUnits.class, "MarkerUnits");
		addEEnumLiteral(markerUnitsEEnum, MarkerUnits.STROKE_WIDTH);
		addEEnumLiteral(markerUnitsEEnum, MarkerUnits.USER_SPACE_ON_USE);

		initEEnum(rendering_intentEEnum, Rendering_intent.class, "Rendering_intent");
		addEEnumLiteral(rendering_intentEEnum, Rendering_intent.AUTO);
		addEEnumLiteral(rendering_intentEEnum, Rendering_intent.PERCEPTUAL);
		addEEnumLiteral(rendering_intentEEnum, Rendering_intent.RELATIVE_COLORIMETRIC);
		addEEnumLiteral(rendering_intentEEnum, Rendering_intent.SATURATION);
		addEEnumLiteral(rendering_intentEEnum, Rendering_intent.ABSOLUTE_COLORIMETRIC);

		initEEnum(gradientUnitsEEnum, GradientUnits.class, "GradientUnits");
		addEEnumLiteral(gradientUnitsEEnum, GradientUnits.USER_SPACE_ON_USE);
		addEEnumLiteral(gradientUnitsEEnum, GradientUnits.OBJECT_BOUNDING_BOX);

		initEEnum(spreadMethodEEnum, SpreadMethod.class, "SpreadMethod");
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.PAD);
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.REFLECT);
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.REPEAT);

		initEEnum(patternUnitsEEnum, PatternUnits.class, "PatternUnits");
		addEEnumLiteral(patternUnitsEEnum, PatternUnits.USER_SPACE_ON_USE);
		addEEnumLiteral(patternUnitsEEnum, PatternUnits.OBJECT_BOUNDING_BOX);

		initEEnum(clipPathUnitsEEnum, ClipPathUnits.class, "ClipPathUnits");
		addEEnumLiteral(clipPathUnitsEEnum, ClipPathUnits.USER_SPACE_ON_USE);
		addEEnumLiteral(clipPathUnitsEEnum, ClipPathUnits.OBJECT_BOUNDING_BOX);

		initEEnum(maskUnitsEEnum, MaskUnits.class, "MaskUnits");
		addEEnumLiteral(maskUnitsEEnum, MaskUnits.USER_SPACE_ON_USE);
		addEEnumLiteral(maskUnitsEEnum, MaskUnits.OBJECT_BOUNDING_BOX);

		initEEnum(filterUnitsEEnum, FilterUnits.class, "FilterUnits");
		addEEnumLiteral(filterUnitsEEnum, FilterUnits.USER_SPACE_ON_USE);
		addEEnumLiteral(filterUnitsEEnum, FilterUnits.OBJECT_BOUNDING_BOX);

		initEEnum(blendModeEEnum, BlendMode.class, "BlendMode");
		addEEnumLiteral(blendModeEEnum, BlendMode.NORMAL);
		addEEnumLiteral(blendModeEEnum, BlendMode.LIGHTEN);
		addEEnumLiteral(blendModeEEnum, BlendMode.MULTIPLY);
		addEEnumLiteral(blendModeEEnum, BlendMode.SCREEN);
		addEEnumLiteral(blendModeEEnum, BlendMode.DARKEN);

		initEEnum(colorMatrixTypeEEnum, ColorMatrixType.class, "ColorMatrixType");
		addEEnumLiteral(colorMatrixTypeEEnum, ColorMatrixType.MATRIX);
		addEEnumLiteral(colorMatrixTypeEEnum, ColorMatrixType.SATURATE);
		addEEnumLiteral(colorMatrixTypeEEnum, ColorMatrixType.HUE_ROTATE);
		addEEnumLiteral(colorMatrixTypeEEnum, ColorMatrixType.LUMINANCE_TO_ALPHA);

		initEEnum(compositeOperatorEEnum, CompositeOperator.class, "CompositeOperator");
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.OVER);
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.IN);
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.OUT);
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.ATOP);
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.XOR);
		addEEnumLiteral(compositeOperatorEEnum, CompositeOperator.ARITHMETIC);

		initEEnum(convolveMatrixEdgeModeEEnum, ConvolveMatrixEdgeMode.class, "ConvolveMatrixEdgeMode");
		addEEnumLiteral(convolveMatrixEdgeModeEEnum, ConvolveMatrixEdgeMode.DUPLICATE);
		addEEnumLiteral(convolveMatrixEdgeModeEEnum, ConvolveMatrixEdgeMode.WRAP);
		addEEnumLiteral(convolveMatrixEdgeModeEEnum, ConvolveMatrixEdgeMode.NONE);

		initEEnum(channelSelectorEEnum, ChannelSelector.class, "ChannelSelector");
		addEEnumLiteral(channelSelectorEEnum, ChannelSelector.R);
		addEEnumLiteral(channelSelectorEEnum, ChannelSelector.G);
		addEEnumLiteral(channelSelectorEEnum, ChannelSelector.B);
		addEEnumLiteral(channelSelectorEEnum, ChannelSelector.A);

		initEEnum(morphologyOperatorEEnum, MorphologyOperator.class, "MorphologyOperator");
		addEEnumLiteral(morphologyOperatorEEnum, MorphologyOperator.ERODE);
		addEEnumLiteral(morphologyOperatorEEnum, MorphologyOperator.DILATE);

		initEEnum(stitchTilesEEnum, StitchTiles.class, "StitchTiles");
		addEEnumLiteral(stitchTilesEEnum, StitchTiles.STITCH);
		addEEnumLiteral(stitchTilesEEnum, StitchTiles.NO_STITCH);

		initEEnum(turbulenceTypeEEnum, TurbulenceType.class, "TurbulenceType");
		addEEnumLiteral(turbulenceTypeEEnum, TurbulenceType.FRACTAL_NOISE);
		addEEnumLiteral(turbulenceTypeEEnum, TurbulenceType.TURBULENCE);

		// Initialize data types
		initEDataType(lengthEDataType, String.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angleEDataType, String.class, "Angle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentageEDataType, String.class, "Percentage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shapeEDataType, String.class, "Shape", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(funciriEDataType, String.class, "Funciri", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, String.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(paintEDataType, String.class, "Paint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(opacity_valueEDataType, String.class, "Opacity_value", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseline_shiftEDataType, String.class, "Baseline_shift", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clipEDataType, String.class, "Clip", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(clip_pathEDataType, String.class, "Clip_path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color_profileEDataType, String.class, "Color_profile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cursorEDataType, String.class, "Cursor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enable_backgroundEDataType, String.class, "Enable_background", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fillEDataType, String.class, "Fill", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fill_opacityEDataType, String.class, "Fill_opacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(filterEDataType, String.class, "Filter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(flood_colorEDataType, String.class, "Flood_color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(flood_opacityEDataType, String.class, "Flood_opacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(font_familyEDataType, String.class, "Font_family", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(font_sizeEDataType, String.class, "Font_size", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(font_size_adjustEDataType, String.class, "Font_size_adjust", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(glyph_orientation_horizontalEDataType, String.class, "Glyph_orientation_horizontal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(glyph_orientation_verticalEDataType, String.class, "Glyph_orientation_vertical", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kerningEDataType, String.class, "Kerning", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(letter_spacingEDataType, String.class, "Letter_spacing", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lighting_colorEDataType, String.class, "Lighting_color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marker_endEDataType, String.class, "Marker_end", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marker_midEDataType, String.class, "Marker_mid", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marker_startEDataType, String.class, "Marker_start", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(masksEDataType, String.class, "Masks", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(opacityEDataType, String.class, "Opacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stop_colorEDataType, String.class, "Stop_color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stop_opacityEDataType, String.class, "Stop_opacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strokeEDataType, String.class, "Stroke", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stroke_dasharrayEDataType, String.class, "Stroke_dasharray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stroke_dashoffsetEDataType, String.class, "Stroke_dashoffset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stroke_miterlimitEDataType, String.class, "Stroke_miterlimit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stroke_opacityEDataType, String.class, "Stroke_opacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stroke_widthEDataType, String.class, "Stroke_width", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(text_decorationEDataType, String.class, "Text_decoration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(word_spacingEDataType, String.class, "Word_spacing", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordinateEDataType, String.class, "Coordinate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewBoxEDataType, String.class, "ViewBox", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preserveAspectRatioEDataType, String.class, "PreserveAspectRatio", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, Double.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transformEDataType, String.class, "Transform", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pathDataEDataType, String.class, "PathData", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfPointsEDataType, String.class, "ListOfPoints", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfLengthsEDataType, String.class, "ListOfLengths", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfNumbersEDataType, String.class, "ListOfNumbers", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfCoordinatesEDataType, String.class, "ListOfCoordinates", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameEDataType, String.class, "Name", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberOptionalNumberEDataType, String.class, "NumberOptionalNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SvgPackageImpl