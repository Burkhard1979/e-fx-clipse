package at.bestsolution.efxclipse.formats.svg.converter;

import at.bestsolution.efxclipse.formats.svg.converter.Colors;
import at.bestsolution.efxclipse.formats.svg.svg.ContentElement;
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linecap;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linejoin;
import at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlurElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgGElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgImageElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPolygonElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPolylineElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgStopElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement;
import at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FXMLConverter {
  private SvgSvgElement rootElement;
  
  public FXMLConverter(final SvgSvgElement rootElement) {
    this.rootElement = rootElement;
  }
  
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFD\uFFFDval content = handle(rootElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import java.lang.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.shape.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.paint.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.image.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.transform.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.effect.*?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDcontent\uFFFD\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Unhandled type \'\uFFFD\uFFFDo.eClass.name\uFFFD\uFFFD\' -->");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgLinearGradientElement o) {
    return null;
  }
  
  protected CharSequence _handle(final SvgRadialGradientElement o) {
    return null;
  }
  
  protected CharSequence _handle(final SvgSvgElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<Group fx:id=\'_root\' xmlns:fx=\"http://javafx.com/fxml\" xmlns:fxsvg=\"http://efxclipse.org/fxml-svg\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\uFFFD\uFFFDIF element.styleSheet != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\t<stylesheets>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\t\t<String fx:value=\"\uFFFD\uFFFDelement.styleSheet\uFFFD\uFFFD\" />");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\t</stylesheets>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR o : element.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(o)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgDefsElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<fx:define>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDFOR o : element.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDhandle(o)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</fx:define>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleGradient(final SvgLinearGradientElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<LinearGradient");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDval t = createAffineTransform(element.gradientTransform) as AffineTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDvar x1 = element.x1.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDvar y1 = element.y1.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDvar x2 = element.x2.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDvar y2 = element.y2.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.x1 != null\uFFFD\uFFFDstartX=\"\uFFFD\uFFFDt.transform( new Point2D$Double(x1,y1), null).x\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.y1 != null\uFFFD\uFFFDstartY=\"\uFFFD\uFFFDt.transform( new Point2D$Double(x1,y1),null).y\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.x2 != null\uFFFD\uFFFDendX=\"\uFFFD\uFFFDt.transform( new Point2D$Double(x2,y2), null).x\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.y2 != null\uFFFD\uFFFDendY=\"\uFFFD\uFFFDt.transform( new Point2D$Double(x2,y2), null).y\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.spreadMethod != SpreadMethod::PAD\uFFFD\uFFFDcycleMethod=\"\uFFFD\uFFFDelement.spreadMethod.toFx\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("proportional=\"false\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDval owner = resolveGradientStopElement(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF owner != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<stops>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDFOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleStop(o,opacity)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</stops>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</LinearGradient>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleGradient(final SvgRadialGradientElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<RadialGradient");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval t = createAffineTransform(element.gradientTransform) as AffineTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDvar cx = element.cx.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDvar cy = element.cy.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDvar fx = element.fx.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDvar fy = element.fy.parseCoordinate\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.cx != null\uFFFD\uFFFDcenterX=\"\uFFFD\uFFFDt.transform(new Point2D$Double(cx,cy),null).x\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.cy != null\uFFFD\uFFFDcenterY=\"\uFFFD\uFFFDt.transform(new Point2D$Double(cx,cy),null).y\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.r != null\uFFFD\uFFFDradius=\"\uFFFD\uFFFDelement.r.parseLength*t.scaleX\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.fx != null || element.fy != null\uFFFD\uFFFDfocusDistance=\"\uFFFD\uFFFDcalculateFocusDistance(t,cx,cy,fx,fy)\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD Is the Focus Radius calculation really correct???");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.fx != null || element.fy != null\uFFFD\uFFFDfocusAngle=\"\uFFFD\uFFFDcalculateFocusAngle(t,cx,cy,fx,fy)\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.spreadMethod != SpreadMethod::PAD\uFFFD\uFFFDcycleMethod=\"\uFFFD\uFFFDelement.spreadMethod.toFx\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("proportional=\"false\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval owner = resolveGradientStopElement(element)\uFFFD\uFFFD ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF owner != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<stops>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleStop(o,opacity)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</stops>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</RadialGradient>");
    _builder.newLine();
    return _builder;
  }
  
  public AffineTransform createAffineTransform(final String transformSpec) {
    boolean _equals = Objects.equal(transformSpec, null);
    if (_equals) {
      AffineTransform _affineTransform = new AffineTransform();
      return _affineTransform;
    } else {
      int _indexOf = transformSpec.indexOf("(");
      int _plus = (_indexOf + 1);
      int _indexOf_1 = transformSpec.indexOf(")");
      final String params = transformSpec.substring(_plus, _indexOf_1);
      boolean _startsWith = transformSpec.startsWith("matrix");
      if (_startsWith) {
        final String[] parts = params.split("\\s*,\\s*|\\s+");
        String _get = ((List<String>)Conversions.doWrapArray(parts)).get(0);
        double _parseDouble = Double.parseDouble(_get);
        String _get_1 = ((List<String>)Conversions.doWrapArray(parts)).get(1);
        double _parseDouble_1 = Double.parseDouble(_get_1);
        String _get_2 = ((List<String>)Conversions.doWrapArray(parts)).get(2);
        double _parseDouble_2 = Double.parseDouble(_get_2);
        String _get_3 = ((List<String>)Conversions.doWrapArray(parts)).get(3);
        double _parseDouble_3 = Double.parseDouble(_get_3);
        String _get_4 = ((List<String>)Conversions.doWrapArray(parts)).get(4);
        double _parseDouble_4 = Double.parseDouble(_get_4);
        String _get_5 = ((List<String>)Conversions.doWrapArray(parts)).get(5);
        double _parseDouble_5 = Double.parseDouble(_get_5);
        AffineTransform _affineTransform_1 = new AffineTransform(_parseDouble, _parseDouble_1, _parseDouble_2, _parseDouble_3, _parseDouble_4, _parseDouble_5);
        final AffineTransform rv = _affineTransform_1;
        return rv;
      } else {
        boolean _startsWith_1 = transformSpec.startsWith("translate");
        if (_startsWith_1) {
          final String[] parts_1 = params.split("\\s*,\\s*|\\s+");
          AffineTransform _affineTransform_2 = new AffineTransform();
          final AffineTransform rv_1 = _affineTransform_2;
          String _get_6 = ((List<String>)Conversions.doWrapArray(parts_1)).get(0);
          double _parseDouble_6 = Double.parseDouble(_get_6);
          String _get_7 = ((List<String>)Conversions.doWrapArray(parts_1)).get(1);
          double _parseDouble_7 = Double.parseDouble(_get_7);
          rv_1.translate(_parseDouble_6, _parseDouble_7);
          return rv_1;
        } else {
          boolean _startsWith_2 = transformSpec.startsWith("scale");
          if (_startsWith_2) {
            final String[] parts_2 = params.split("\\s*,\\s*|\\s+");
            AffineTransform _affineTransform_3 = new AffineTransform();
            final AffineTransform rv_2 = _affineTransform_3;
            String _get_8 = ((List<String>)Conversions.doWrapArray(parts_2)).get(0);
            double _parseDouble_8 = Double.parseDouble(_get_8);
            String _get_9 = ((List<String>)Conversions.doWrapArray(parts_2)).get(1);
            double _parseDouble_9 = Double.parseDouble(_get_9);
            rv_2.scale(_parseDouble_8, _parseDouble_9);
            return rv_2;
          } else {
            boolean _startsWith_3 = transformSpec.startsWith("rotate");
            if (_startsWith_3) {
              final String[] parts_3 = params.split("\\s*,\\s*|\\s+");
              AffineTransform _affineTransform_4 = new AffineTransform();
              final AffineTransform rv_3 = _affineTransform_4;
              String _get_10 = ((List<String>)Conversions.doWrapArray(parts_3)).get(0);
              double _parseDouble_10 = Double.parseDouble(_get_10);
              String _get_11 = ((List<String>)Conversions.doWrapArray(parts_3)).get(1);
              double _parseDouble_11 = Double.parseDouble(_get_11);
              String _get_12 = ((List<String>)Conversions.doWrapArray(parts_3)).get(2);
              double _parseDouble_12 = Double.parseDouble(_get_12);
              rv_3.rotate(_parseDouble_10, _parseDouble_11, _parseDouble_12);
              return rv_3;
            }
          }
        }
      }
    }
    AffineTransform _affineTransform_5 = new AffineTransform();
    return _affineTransform_5;
  }
  
  public double calculateFocusDistance(final AffineTransform transform, final double cx, final double cy, final double fx, final double fy) {
    boolean _and = false;
    boolean _equals = (fx == cx);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = (fy == cy);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return 0;
    } else {
      java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(cx, cy);
      final Point2D c = transform.transform(_double, null);
      java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(fx, fy);
      final Point2D f = transform.transform(_double_1, null);
      double _x = c.getX();
      double _x_1 = f.getX();
      double _minus = (_x - _x_1);
      double _pow = Math.pow(_minus, 2);
      double _y = c.getY();
      double _y_1 = f.getY();
      double _minus_1 = (_y - _y_1);
      double _pow_1 = Math.pow(_minus_1, 2);
      double _plus = (_pow + _pow_1);
      return Math.sqrt(_plus);
    }
  }
  
  public double calculateFocusAngle(final AffineTransform transform, final double cx, final double cy, final double fx, final double fy) {
    boolean _and = false;
    boolean _equals = (fx == cx);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = (fy == cy);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return 0;
    } else {
      java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(cx, cy);
      final Point2D c = transform.transform(_double, null);
      java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(fx, fy);
      final Point2D f = transform.transform(_double_1, null);
      double _y = c.getY();
      double _y_1 = f.getY();
      double _minus = (_y - _y_1);
      double _pow = Math.pow(_minus, 2);
      double _x = c.getX();
      double _x_1 = f.getX();
      double _minus_1 = (_x - _x_1);
      double _pow_1 = Math.pow(_minus_1, 2);
      double _divide = (_pow / _pow_1);
      return Math.atan(_divide);
    }
  }
  
  public Object resolveGradientStopElement(final SvgElement element) {
    if ((element instanceof ContentElement)) {
      final ContentElement rv = ((ContentElement) element);
      EList _children = rv.getChildren();
      Iterable<SvgStopElement> _filter = Iterables.<SvgStopElement>filter(_children, SvgStopElement.class);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter);
      if (_isEmpty) {
        if ((element instanceof XLinkAttributes)) {
          final XLinkAttributes v = ((XLinkAttributes) element);
          SvgElement _resolvedInstance = v.getResolvedInstance();
          boolean _notEquals = (!Objects.equal(_resolvedInstance, null));
          if (_notEquals) {
            SvgElement _resolvedInstance_1 = v.getResolvedInstance();
            return this.resolveGradientStopElement(_resolvedInstance_1);
          }
        }
      } else {
        return rv;
      }
    }
    return null;
  }
  
  public SvgElement resolveElement(final String id) {
    TreeIterator<Object> _allContents = EcoreUtil.<Object>getAllContents(this.rootElement, true);
    final Iterator<SvgElement> treeIt = Iterators.<SvgElement>filter(_allContents, SvgElement.class);
    boolean _hasNext = treeIt.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final SvgElement o = treeIt.next();
        if ((o instanceof CoreAttributes)) {
          String _id = ((CoreAttributes) o).getId();
          boolean _equals = id.equals(_id);
          if (_equals) {
            return o;
          }
        } else {
          final SvgElement eo = ((SvgElement) o);
          EClass _eClass = eo.eClass();
          final EStructuralFeature f = _eClass.getEStructuralFeature("id");
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(f, null));
          if (!_notEquals) {
            _and = false;
          } else {
            Object _eGet = eo.eGet(f);
            boolean _equals_1 = id.equals(_eGet);
            _and = (_notEquals && _equals_1);
          }
          if (_and) {
            return o;
          }
        }
      }
      boolean _hasNext_1 = treeIt.hasNext();
      _while = _hasNext_1;
    }
    return null;
  }
  
  public CharSequence handleStop(final SvgStopElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Stop");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.offset != null\uFFFD\uFFFDoffset=\"\uFFFD\uFFFDelement.offset.parsePercentage\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.stop_opacity != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<color>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF opacity != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF element.stop_color != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.stop_color.fillPaint(Double::parseDouble(element.stop_opacity)*opacity)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<opacity>\uFFFD\uFFFDDouble::parseDouble(element.stop_opacity)*opacity\uFFFD\uFFFD</opacity>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF element.stop_color != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.stop_color.fillPaint(Double::parseDouble(element.stop_opacity))\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<opacity>\uFFFD\uFFFDelement.stop_opacity\uFFFD\uFFFD</opacity>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDELSEIF element.stop_color != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<color>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF opacity != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.stop_color.fillPaint(opacity)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.stop_color.fillPaint\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Stop>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgImageElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<ImageView");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.x != null\uFFFD\uFFFDx=\"\uFFFD\uFFFDelement.x.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.y != null\uFFFD\uFFFDy=\"\uFFFD\uFFFDelement.y.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\uFFFD\uFFFDIF element.width != null\uFFFD\uFFFDwidth=\"\uFFFD\uFFFDelement.width.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\uFFFD\uFFFDIF element.height != null\uFFFD\uFFFDheight=\"\uFFFD\uFFFDelement.height.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Image ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("url=\"\uFFFD\uFFFDelement.xlink__href\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</ImageView>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgRectElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Rectangle");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.x != null\uFFFD\uFFFDx=\"\uFFFD\uFFFDelement.x.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.y != null\uFFFD\uFFFDy=\"\uFFFD\uFFFDelement.y.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.width != null\uFFFD\uFFFDwidth=\"\uFFFD\uFFFDelement.width.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.height != null\uFFFD\uFFFDheight=\"\uFFFD\uFFFDelement.height.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.rx != null\uFFFD\uFFFDarcWidth=\"\uFFFD\uFFFDelement.rx.parseLength * Double::valueOf(\"2.0\")\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.ry != null\uFFFD\uFFFDarcHeight=\"\uFFFD\uFFFDelement.ry.parseLength * Double::valueOf(\"2.0\")\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Rectangle>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgGElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.x != null\uFFFD\uFFFDtranslateX=\"\uFFFD\uFFFDelement.x.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.y != null\uFFFD\uFFFDtranslateY=\"\uFFFD\uFFFDelement.y.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity.parseDouble * element.fill_opacity.parseDouble\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDFOR o : element.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(o)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgUseElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.x != null\uFFFD\uFFFDtranslateX=\"\uFFFD\uFFFDelement.x.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.y != null\uFFFD\uFFFDtranslateY=\"\uFFFD\uFFFDelement.y.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity.parseDouble * element.fill_opacity.parseDouble\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.resolvedInstance != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDhandle(element.resolvedInstance)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public Object lookupFeature(final EStructuralFeature feature, final EObject object) {
    EObject eo = object;
    boolean _dowhile = false;
    do {
      {
        EClass _eClass = eo.eClass();
        EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
        boolean _contains = _eAllStructuralFeatures.contains(feature);
        if (_contains) {
          boolean _eIsSet = eo.eIsSet(feature);
          if (_eIsSet) {
            return eo.eGet(feature);
          }
        }
        EObject _eContainer = eo.eContainer();
        eo = _eContainer;
      }
      boolean _notEquals = (!Objects.equal(eo, null));
      _dowhile = _notEquals;
    } while(_dowhile);
    return null;
  }
  
  public CharSequence handleShapePresentationAttributes(final PresentationAttributes element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\t\t\uFFFD\uFFFDIF element.stroke_dasharray != null\uFFFD\uFFFD\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET,element) != null\uFFFD\uFFFDstrokeDashOffset=\"\uFFFD\uFFFD(lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET,element) as String).parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_LINECAP,element) != null\uFFFD\uFFFDstrokeLineCap=\"\uFFFD\uFFFD(lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_LINECAP,element) as Stroke_linecap).toFx\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN,element) != null\uFFFD\uFFFDstrokeLineJoin=\"\uFFFD\uFFFD(lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN,element) as Stroke_linejoin).toFx\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT,element) != null\uFFFD\uFFFDstrokeMiterLimit=\"\uFFFD\uFFFD(lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT,element) as String).parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_WIDTH,element) != null\uFFFD\uFFFDstrokeWidth=\"\uFFFD\uFFFD(lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_WIDTH,element) as String).parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleStyleClassAttributes(final String styleClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFD\uFFFDIF styleClass != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<styleClass>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDFOR c : styleClass.split(\" \")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<String fx:value=\"\uFFFD\uFFFDc.trim\uFFFD\uFFFD\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</styleClass>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgPathElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<SVGPath");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.d != null\uFFFD\uFFFDcontent=\"\uFFFD\uFFFDelement.d\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.fill_rule != Fill_rule::NONZERO\uFFFD\uFFFDfillRule=\"EVEN_ODD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</SVGPath>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleFilter(final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Unsupported filter type -->");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleFilter(final SvgFeGaussianBlurElement blur) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<GaussianBlur");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF blur.stdDeviation != null\uFFFD\uFFFDradius=\"\uFFFD\uFFFDblur.stdDeviation.parseDouble * 2\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handlePaint(final String type, final String fillDefinition, final String typeOpacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFD\uFFFDIF fillDefinition != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<\uFFFD\uFFFDtype\uFFFD\uFFFD>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF fillDefinition.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("TRANSPARENT");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDELSEIF typeOpacity != null && Double::parseDouble(typeOpacity) != Double::valueOf(\"1.0\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDfillDefinition.fillPaint(Double::parseDouble(typeOpacity))\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDfillDefinition.fillPaint\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</\uFFFD\uFFFDtype\uFFFD\uFFFD>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgClipPathElement element) {
    return null;
  }
  
  protected CharSequence _handle(final SvgEllipseElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Ellipse");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.rx != null\uFFFD\uFFFDradiusX=\"\uFFFD\uFFFDelement.rx.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.ry != null\uFFFD\uFFFDradiusY=\"\uFFFD\uFFFDelement.ry.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.cx != null\uFFFD\uFFFDcenterX=\"\uFFFD\uFFFDelement.cx.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.cy != null\uFFFD\uFFFDcenterY=\"\uFFFD\uFFFDelement.cy.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Ellipse>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgCircleElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Circle");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.r != null\uFFFD\uFFFDradius=\"\uFFFD\uFFFDelement.r.parseLength\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.cx != null\uFFFD\uFFFDcenterX=\"\uFFFD\uFFFDelement.cx.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.cy != null\uFFFD\uFFFDcenterY=\"\uFFFD\uFFFDelement.cy.parseCoordinate\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Circle>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgPolylineElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Polyline");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.points != null\uFFFD\uFFFDpoints=\"\uFFFD\uFFFDelement.points.replaceAll(\"\\\\s+\",\",\")\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Polyline>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgPolygonElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Polygon");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.points != null\uFFFD\uFFFDpoints=\"\uFFFD\uFFFDelement.points.replaceAll(\"\\\\s+\",\",\")\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.opacity != null\uFFFD\uFFFDopacity=\"\uFFFD\uFFFDelement.opacity\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDhandleShapePresentationAttributes(element)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.id != null\uFFFD\uFFFDfx:id=\"\uFFFD\uFFFDelement.id.validateId\uFFFD\uFFFD\"\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append(">");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandlePaint(\"fill\", lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__FILL_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandlePaint(\"stroke\",lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE,element) as String,lookupFeature(SvgPackage$Literals::PRESENTATION_ATTRIBUTES__STROKE_OPACITY,element) as String)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDhandleStyleClassAttributes(element.class_)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDIF element.transform != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDelement.transform.handleTransform\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF element.filter != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF e != null\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF e.children.filter(typeof(FilterPrimitiveElement)).size == 1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDval fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<effect>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleFilter(fiElement)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</effect>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<!-- Multi filter needs different handling -->");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDIF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<clip>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<children>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDFOR e : clipElement.children\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandle(e)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDENDFOR\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDIF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals(\"none\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\uFFFD\uFFFDhandleTransform(clipElement.transform)\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</clip>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("</Polygon>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fillPaint(final String fill) {
    CharSequence _xifexpression = null;
    boolean _startsWith = fill.startsWith("#");
    if (_startsWith) {
      return this.hexColor(fill);
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _startsWith_1 = fill.startsWith("rgb");
      if (_startsWith_1) {
        int _indexOf = fill.indexOf("(");
        int _plus = (_indexOf + 1);
        int _indexOf_1 = fill.indexOf(")");
        final String c = fill.substring(_plus, _indexOf_1);
        return this.rgbColor(c);
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _startsWith_2 = fill.startsWith("argb");
        if (_startsWith_2) {
          _xifexpression_2 = null;
        } else {
          boolean _startsWith_3 = fill.startsWith("url");
          if (_startsWith_3) {
            int _length = fill.length();
            int _minus = (_length - 1);
            String _substring = fill.substring(5, _minus);
            final SvgElement e = this.resolveElement(_substring);
            if ((e instanceof SvgLinearGradientElement)) {
              return this.handleGradient(((SvgLinearGradientElement) e), null);
            } else {
              if ((e instanceof SvgRadialGradientElement)) {
                return this.handleGradient(((SvgRadialGradientElement) e), null);
              }
            }
          } else {
            return fill.toUpperCase();
          }
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence fillPaint(final String fill, final Double opacity) {
    CharSequence _xifexpression = null;
    boolean _startsWith = fill.startsWith("#");
    if (_startsWith) {
      return this.hexColor(fill, opacity);
    } else {
      CharSequence _xifexpression_1 = null;
      String _lowerCase = fill.toLowerCase();
      boolean _startsWith_1 = _lowerCase.startsWith("rgb");
      if (_startsWith_1) {
        int _indexOf = fill.indexOf("(");
        int _plus = (_indexOf + 1);
        int _indexOf_1 = fill.indexOf(")");
        final String c = fill.substring(_plus, _indexOf_1);
        return this.rgbColor(c);
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _startsWith_2 = fill.startsWith("argb");
        if (_startsWith_2) {
          _xifexpression_2 = null;
        } else {
          boolean _startsWith_3 = fill.startsWith("url");
          if (_startsWith_3) {
            int _length = fill.length();
            int _minus = (_length - 1);
            String _substring = fill.substring(5, _minus);
            final SvgElement e = this.resolveElement(_substring);
            if ((e instanceof SvgLinearGradientElement)) {
              return this.handleGradient(((SvgLinearGradientElement) e), opacity);
            } else {
              if ((e instanceof SvgRadialGradientElement)) {
                return this.handleGradient(((SvgRadialGradientElement) e), opacity);
              }
            }
          } else {
            final Colors c_1 = Colors.findColorByName(fill);
            boolean _notEquals = (!Objects.equal(c_1, null));
            if (_notEquals) {
              return this.hexColor(c_1.hexvalue, opacity);
            }
            return fill.toUpperCase();
          }
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence rgbColor(final String fill) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>\uFFFD\uFFFDfill.rgbRed\uFFFD\uFFFD</red>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<green>\uFFFD\uFFFDfill.rgbGreen\uFFFD\uFFFD</green>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<blue>\uFFFD\uFFFDfill.rgbBlue\uFFFD\uFFFD</blue>");
    _builder.newLine();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence rgbColor(final String fill, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>\uFFFD\uFFFDfill.rgbRed\uFFFD\uFFFD</red>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<green>\uFFFD\uFFFDfill.rgbGreen\uFFFD\uFFFD</green>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<blue>\uFFFD\uFFFDfill.rgbBlue\uFFFD\uFFFD</blue>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<opacity>\uFFFD\uFFFDopacity\uFFFD\uFFFD</opacity>");
    _builder.newLine();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public double rgbRed(final String color) {
    String[] _split = color.split(",");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(0);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public double rgbGreen(final String color) {
    String[] _split = color.split(",");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(1);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public double rgbBlue(final String color) {
    String[] _split = color.split(",");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(2);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public CharSequence hexColor(final String fill) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>\uFFFD\uFFFDfill.hexRed\uFFFD\uFFFD</red>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<green>\uFFFD\uFFFDfill.hexGreen\uFFFD\uFFFD</green>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<blue>\uFFFD\uFFFDfill.hexBlue\uFFFD\uFFFD</blue>");
    _builder.newLine();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence hexColor(final String fill, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>\uFFFD\uFFFDfill.hexRed\uFFFD\uFFFD</red>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<green>\uFFFD\uFFFDfill.hexGreen\uFFFD\uFFFD</green>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<blue>\uFFFD\uFFFDfill.hexBlue\uFFFD\uFFFD</blue>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<opacity>\uFFFD\uFFFDopacity\uFFFD\uFFFD</opacity>");
    _builder.newLine();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public double hexRed(final String color) {
    return Colors.hexRed(color);
  }
  
  public double hexGreen(final String color) {
    return Colors.hexGreen(color);
  }
  
  public double hexBlue(final String color) {
    return Colors.hexBlue(color);
  }
  
  public CharSequence handleTransform(final String transform) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFD\uFFFDval params = transform.substring(transform.indexOf(\"(\")+1,transform.indexOf(\")\"))\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDIF transform.startsWith(\"translate\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("<Translate");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF params.indexOf(\",\") != -1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval parts = params.split(\",\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x=\"\uFFFD\uFFFDparts.get(0)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x=\"\uFFFD\uFFFDparams\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y=\"\uFFFD\uFFFDparams\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("</Translate>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDELSEIF transform.startsWith(\"scale\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("<Scale");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF params.indexOf(\",\") != -1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval parts = params.split(\",\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x=\"\uFFFD\uFFFDparts.get(0)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x=\"\uFFFD\uFFFDparams\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y=\"\uFFFD\uFFFDparams\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append(">");
    _builder.newLine();
    _builder.append("</Scale>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDELSEIF transform.startsWith(\"rotate\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("<Rotate");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDIF params.indexOf(\",\") != -1\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDval parts = params.split(\",\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDIF parts.size == 2\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("angle=\"\uFFFD\uFFFDparts.get(0)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pivotX=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pivotY=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDELSEIF parts.size == 3\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("angle=\"\uFFFD\uFFFDparts.get(0)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pivotX=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("pivotY=\"\uFFFD\uFFFDparts.get(2)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDELSE\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("angle=\"\uFFFD\uFFFDparams\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append(">");
    _builder.newLine();
    _builder.append("</Rotate>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDELSEIF transform.startsWith(\"matrix\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDval parts = params.split(\"[,\\\\s+]\")\uFFFD\uFFFD");
    _builder.newLine();
    _builder.append("<Affine");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mxx=\"\uFFFD\uFFFDparts.get(0)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("myx=\"\uFFFD\uFFFDparts.get(1)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mxy=\"\uFFFD\uFFFDparts.get(2)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("myy=\"\uFFFD\uFFFDparts.get(3)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tx=\"\uFFFD\uFFFDparts.get(4)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ty=\"\uFFFD\uFFFDparts.get(5)\uFFFD\uFFFD\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("</Affine>");
    _builder.newLine();
    _builder.append("\uFFFD\uFFFDENDIF\uFFFD\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgFilterElement filter) {
    return null;
  }
  
  protected CharSequence _handle(final SvgFeGaussianBlurElement f) {
    return null;
  }
  
  public String toFx(final SpreadMethod m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.PAD)) {
        _matched=true;
        return "NO_CYCLE";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.REFLECT)) {
        _matched=true;
        return "REFLECT";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.REPEAT)) {
        _matched=true;
        return "REPEAT";
      }
    }
    return "NO_CYCLE";
  }
  
  public String toFx(final Stroke_linecap m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.BUTT)) {
        _matched=true;
        return "BUTT";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.ROUND)) {
        _matched=true;
        return "ROUND";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.SQUARE)) {
        _matched=true;
        return "SQUARE";
      }
    }
    return "BUTT";
  }
  
  public String toFx(final Stroke_linejoin m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.BEVEL)) {
        _matched=true;
        return "BEVEL";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.MITER)) {
        _matched=true;
        return "MITER";
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.ROUND)) {
        _matched=true;
        return "ROUND";
      }
    }
    return "BEVEL";
  }
  
  public double parseLength(final String length) {
    boolean _notEquals = (!Objects.equal(length, null));
    if (_notEquals) {
      boolean _endsWith = length.endsWith("px");
      if (_endsWith) {
        int _length = length.length();
        int _minus = (_length - 2);
        String _substring = length.substring(0, _minus);
        return Double.parseDouble(_substring);
      } else {
        return Double.parseDouble(length);
      }
    }
    return 0.0;
  }
  
  public double parseCoordinate(final String coordinate) {
    boolean _notEquals = (!Objects.equal(coordinate, null));
    if (_notEquals) {
      return Double.parseDouble(coordinate);
    }
    return 0.0;
  }
  
  public double parsePercentage(final String percentage) {
    boolean _notEquals = (!Objects.equal(percentage, null));
    if (_notEquals) {
      return Double.parseDouble(percentage);
    }
    return 0.0;
  }
  
  public double parseDouble(final String value) {
    boolean _notEquals = (!Objects.equal(value, null));
    if (_notEquals) {
      return Double.parseDouble(value);
    }
    return 0.0;
  }
  
  public String validateId(final String value) {
    String _replace = value.replace(".", "_dot");
    return _replace.replace("-", "_dash");
  }
  
  public CharSequence handle(final EObject element) {
    if (element instanceof SvgDefsElement) {
      return _handle((SvgDefsElement)element);
    } else if (element instanceof SvgGElement) {
      return _handle((SvgGElement)element);
    } else if (element instanceof SvgSvgElement) {
      return _handle((SvgSvgElement)element);
    } else if (element instanceof SvgCircleElement) {
      return _handle((SvgCircleElement)element);
    } else if (element instanceof SvgClipPathElement) {
      return _handle((SvgClipPathElement)element);
    } else if (element instanceof SvgEllipseElement) {
      return _handle((SvgEllipseElement)element);
    } else if (element instanceof SvgFeGaussianBlurElement) {
      return _handle((SvgFeGaussianBlurElement)element);
    } else if (element instanceof SvgFilterElement) {
      return _handle((SvgFilterElement)element);
    } else if (element instanceof SvgImageElement) {
      return _handle((SvgImageElement)element);
    } else if (element instanceof SvgLinearGradientElement) {
      return _handle((SvgLinearGradientElement)element);
    } else if (element instanceof SvgPathElement) {
      return _handle((SvgPathElement)element);
    } else if (element instanceof SvgPolygonElement) {
      return _handle((SvgPolygonElement)element);
    } else if (element instanceof SvgPolylineElement) {
      return _handle((SvgPolylineElement)element);
    } else if (element instanceof SvgRadialGradientElement) {
      return _handle((SvgRadialGradientElement)element);
    } else if (element instanceof SvgRectElement) {
      return _handle((SvgRectElement)element);
    } else if (element instanceof SvgUseElement) {
      return _handle((SvgUseElement)element);
    } else if (element != null) {
      return _handle(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  public CharSequence handleFilter(final EObject blur) {
    if (blur instanceof SvgFeGaussianBlurElement) {
      return _handleFilter((SvgFeGaussianBlurElement)blur);
    } else if (blur != null) {
      return _handleFilter(blur);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(blur).toString());
    }
  }
}
