/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.jfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.Group;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.Node;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.AreaChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BarChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BarChart3D;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BubbleChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.Chart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.LineChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.PieChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.PieChart3D;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.ScatterChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.XYChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.Axis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.CategoryAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.Legend;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.NumberAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.PlotSymbol;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.ValueAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Label;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Labeled;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.MenuBar;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.PasswordBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Region;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.ScrollBar;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.ScrollView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Separator;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Slider;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.TextBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.TextInputControl;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.image.ImageView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.ClipView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Container;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Flow;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.HBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Stack;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Tile;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.VBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.shape.Rectangle;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.shape.Shape;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.text.Text;
import at.bestsolution.efxclipse.tooling.css.jfx.validators.GradientValidator;
import at.bestsolution.efxclipse.tooling.css.jfx.validators.LinearGradientValidator;
import at.bestsolution.efxclipse.tooling.css.jfx.validators.RadialGradientValidator;

public class JFXDialectExtension implements CssDialectExtension {
	private static List<Property> PROPERTIES = new ArrayList<Property>();
	private static List<Proposal> PREDEFINED_COLORS = new ArrayList<Proposal>();
	
	static {
		init();	
	}
	
	
	private static void init() {
		initColors();
		
		PROPERTIES.addAll(Node.init());
		PROPERTIES.addAll(Group.init());
		PROPERTIES.addAll(ImageView.init());
		PROPERTIES.addAll(ClipView.init());
		PROPERTIES.addAll(Container.init());
		PROPERTIES.addAll(Flow.init());
		PROPERTIES.addAll(HBox.init());
		PROPERTIES.addAll(Stack.init());
		PROPERTIES.addAll(Tile.init());
		PROPERTIES.addAll(VBox.init());
		PROPERTIES.addAll(Shape.init());
		PROPERTIES.addAll(Rectangle.init());
		PROPERTIES.addAll(Text.init());
		PROPERTIES.addAll(Region.init());
		PROPERTIES.addAll(Label.init());
		PROPERTIES.addAll(Labeled.init());
		PROPERTIES.addAll(PasswordBox.init());
		PROPERTIES.addAll(ScrollBar.init());
		PROPERTIES.addAll(ScrollView.init());
		PROPERTIES.addAll(Separator.init());
		PROPERTIES.addAll(Slider.init());
		PROPERTIES.addAll(TextBox.init());
		PROPERTIES.addAll(TextInputControl.init());
		PROPERTIES.addAll(AreaChart.init());
		PROPERTIES.addAll(BarChart.init());
		PROPERTIES.addAll(BarChart3D.init());
		PROPERTIES.addAll(BubbleChart.init());
		PROPERTIES.addAll(Chart.init());
		PROPERTIES.addAll(LineChart.init());
		PROPERTIES.addAll(PieChart.init());
		PROPERTIES.addAll(PieChart3D.init());
		PROPERTIES.addAll(ScatterChart.init());
		PROPERTIES.addAll(XYChart.init());
		PROPERTIES.addAll(Axis.init());
		PROPERTIES.addAll(CategoryAxis.init());
		PROPERTIES.addAll(Legend.init());
		PROPERTIES.addAll(NumberAxis.init());
		PROPERTIES.addAll(PlotSymbol.init());
		PROPERTIES.addAll(ValueAxis.init());
		PROPERTIES.addAll(MenuBar.init());
		
		//TODO we have to add validation here
		PROPERTIES.add(new Property("-fx-font") {
			@Override
			public List<Proposal> getInitialTermProposals() {
				return Collections.emptyList();
			}
		});
		PROPERTIES.add(new StringProperty("-fx-font-family"));
		PROPERTIES.add(new SizeProperty("-fx-font-size"));
		PROPERTIES.addAll(CssDialectExtension.Util.createEnumProperties(Arrays.asList("-fx-font-style"), "normal","italic","oblique"));
		PROPERTIES.addAll(CssDialectExtension.Util.createEnumProperties(Arrays.asList("-fx-font-weight"), "normal","bold","bolder","lighter","100","200","300","400","500","600","700","800","900"));
	}
	
	private static void initColors() {
		PREDEFINED_COLORS.add(new DialogProposal(0,"Pick color ...") {
				
				@Override
				public String openProposal() {
					ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
					RGB rgb = dialog.open();
					if( rgb != null ) {
						return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
					}
					return null;
				}
			});
		PREDEFINED_COLORS.add(new Proposal("aliceblue"));
		PREDEFINED_COLORS.add(new Proposal("aqua"));
		PREDEFINED_COLORS.add(new Proposal("antiquewhite"));
		PREDEFINED_COLORS.add(new Proposal("aquamarine"));

		PREDEFINED_COLORS.add(new Proposal("azure"));
		PREDEFINED_COLORS.add(new Proposal("beige"));
		PREDEFINED_COLORS.add(new Proposal("bisque"));
		PREDEFINED_COLORS.add(new Proposal("black"));

		PREDEFINED_COLORS.add(new Proposal("blanchedalmond"));
		PREDEFINED_COLORS.add(new Proposal("blue"));
		PREDEFINED_COLORS.add(new Proposal("blueviolet"));
		PREDEFINED_COLORS.add(new Proposal("brown"));

		PREDEFINED_COLORS.add(new Proposal("burlywood"));
		PREDEFINED_COLORS.add(new Proposal("cadetblue"));
		PREDEFINED_COLORS.add(new Proposal("chartreuse"));
		PREDEFINED_COLORS.add(new Proposal("chocolate"));

		PREDEFINED_COLORS.add(new Proposal("coral"));
		PREDEFINED_COLORS.add(new Proposal("cornflowerblue"));
		PREDEFINED_COLORS.add(new Proposal("cornsilk"));
		PREDEFINED_COLORS.add(new Proposal("crimson"));

		PREDEFINED_COLORS.add(new Proposal("cyan"));
		PREDEFINED_COLORS.add(new Proposal("darkblue"));
		PREDEFINED_COLORS.add(new Proposal("darkcyan"));
		PREDEFINED_COLORS.add(new Proposal("darkgoldenrod"));

		PREDEFINED_COLORS.add(new Proposal("darkgray"));
		PREDEFINED_COLORS.add(new Proposal("darkgreen"));
		PREDEFINED_COLORS.add(new Proposal("darkgrey"));
		PREDEFINED_COLORS.add(new Proposal("darkkhaki"));

		PREDEFINED_COLORS.add(new Proposal("darkmagenta"));
		PREDEFINED_COLORS.add(new Proposal("darkolivegreen"));
		PREDEFINED_COLORS.add(new Proposal("darkorange"));
		PREDEFINED_COLORS.add(new Proposal("darkorchid"));

		PREDEFINED_COLORS.add(new Proposal("darkred"));
		PREDEFINED_COLORS.add(new Proposal("darksalmon"));
		PREDEFINED_COLORS.add(new Proposal("darkseagreen"));
		PREDEFINED_COLORS.add(new Proposal("darkslateblue"));

		PREDEFINED_COLORS.add(new Proposal("darkslategray"));
		PREDEFINED_COLORS.add(new Proposal("darkslategrey"));
		PREDEFINED_COLORS.add(new Proposal("darkturquoise"));
		PREDEFINED_COLORS.add(new Proposal("darkviolet"));

		PREDEFINED_COLORS.add(new Proposal("deeppink"));
		PREDEFINED_COLORS.add(new Proposal("deepskyblue"));
		PREDEFINED_COLORS.add(new Proposal("dimgray"));
		PREDEFINED_COLORS.add(new Proposal("dimgrey"));

		PREDEFINED_COLORS.add(new Proposal("dodgerblue"));
		PREDEFINED_COLORS.add(new Proposal("firebrick"));
		PREDEFINED_COLORS.add(new Proposal("floralwhite"));
		PREDEFINED_COLORS.add(new Proposal("forestgreen"));

		PREDEFINED_COLORS.add(new Proposal("fuchsia"));
		PREDEFINED_COLORS.add(new Proposal("gainsboro"));
		PREDEFINED_COLORS.add(new Proposal("ghostwhite"));
		PREDEFINED_COLORS.add(new Proposal("gold"));

		PREDEFINED_COLORS.add(new Proposal("goldenrod"));
		PREDEFINED_COLORS.add(new Proposal("gray"));
		PREDEFINED_COLORS.add(new Proposal("green"));
		PREDEFINED_COLORS.add(new Proposal("greenyellow"));

		PREDEFINED_COLORS.add(new Proposal("grey"));
		PREDEFINED_COLORS.add(new Proposal("honeydew"));
		PREDEFINED_COLORS.add(new Proposal("hotpink"));
		PREDEFINED_COLORS.add(new Proposal("indianred"));

		PREDEFINED_COLORS.add(new Proposal("indigo"));
		PREDEFINED_COLORS.add(new Proposal("ivory"));
		PREDEFINED_COLORS.add(new Proposal("khaki"));
		PREDEFINED_COLORS.add(new Proposal("lavender"));

		PREDEFINED_COLORS.add(new Proposal("lavenderblush"));
		PREDEFINED_COLORS.add(new Proposal("lawngreen"));
		PREDEFINED_COLORS.add(new Proposal("lemonchiffon"));
		PREDEFINED_COLORS.add(new Proposal("lightblue"));

		PREDEFINED_COLORS.add(new Proposal("lightcoral"));
		PREDEFINED_COLORS.add(new Proposal("lightcyan"));
		PREDEFINED_COLORS.add(new Proposal("lightgoldenrodyellow"));
		PREDEFINED_COLORS.add(new Proposal("lightgray"));

		PREDEFINED_COLORS.add(new Proposal("lightgreen"));
		PREDEFINED_COLORS.add(new Proposal("lightgrey"));
		PREDEFINED_COLORS.add(new Proposal("lightpink"));
		PREDEFINED_COLORS.add(new Proposal("lightsalmon"));

		PREDEFINED_COLORS.add(new Proposal("lightseagreen"));
		PREDEFINED_COLORS.add(new Proposal("lightskyblue"));
		PREDEFINED_COLORS.add(new Proposal("lightslategray"));
		PREDEFINED_COLORS.add(new Proposal("lightslategrey"));

		PREDEFINED_COLORS.add(new Proposal("lightsteelblue"));
		PREDEFINED_COLORS.add(new Proposal("lightyellow"));
		PREDEFINED_COLORS.add(new Proposal("lime"));
		PREDEFINED_COLORS.add(new Proposal("limegreen"));

		PREDEFINED_COLORS.add(new Proposal("linen"));
		PREDEFINED_COLORS.add(new Proposal("magenta"));
		PREDEFINED_COLORS.add(new Proposal("maroon"));
		PREDEFINED_COLORS.add(new Proposal("mediumaquamarine"));

		PREDEFINED_COLORS.add(new Proposal("mediumblue"));
		PREDEFINED_COLORS.add(new Proposal("mediumorchid"));
		PREDEFINED_COLORS.add(new Proposal("mediumpurple"));
		PREDEFINED_COLORS.add(new Proposal("mediumseagreen"));

		PREDEFINED_COLORS.add(new Proposal("mediumslateblue"));
		PREDEFINED_COLORS.add(new Proposal("mediumspringgreen"));
		PREDEFINED_COLORS.add(new Proposal("mediumturquoise"));
		PREDEFINED_COLORS.add(new Proposal("mediumvioletred"));

		PREDEFINED_COLORS.add(new Proposal("midnightblue"));
		PREDEFINED_COLORS.add(new Proposal("mintcream"));
		PREDEFINED_COLORS.add(new Proposal("mistyrose"));
		PREDEFINED_COLORS.add(new Proposal("moccasin"));

		PREDEFINED_COLORS.add(new Proposal("navajowhite"));
		PREDEFINED_COLORS.add(new Proposal("navy"));
		PREDEFINED_COLORS.add(new Proposal("oldlace"));
		PREDEFINED_COLORS.add(new Proposal("olive"));

		PREDEFINED_COLORS.add(new Proposal("olivedrab"));
		PREDEFINED_COLORS.add(new Proposal("orange"));
		PREDEFINED_COLORS.add(new Proposal("orangered"));
		PREDEFINED_COLORS.add(new Proposal("orchid"));

		PREDEFINED_COLORS.add(new Proposal("palegoldenrod"));
		PREDEFINED_COLORS.add(new Proposal("palegreen"));
		PREDEFINED_COLORS.add(new Proposal("paleturquoise"));
		PREDEFINED_COLORS.add(new Proposal("palevioletred"));

		PREDEFINED_COLORS.add(new Proposal("papayawhip"));
		PREDEFINED_COLORS.add(new Proposal("peachpuff"));
		PREDEFINED_COLORS.add(new Proposal("peru"));
		PREDEFINED_COLORS.add(new Proposal("pink"));

		PREDEFINED_COLORS.add(new Proposal("plum"));
		PREDEFINED_COLORS.add(new Proposal("powderblue"));
		PREDEFINED_COLORS.add(new Proposal("purple"));
		PREDEFINED_COLORS.add(new Proposal("red"));

		PREDEFINED_COLORS.add(new Proposal("rosybrown"));
		PREDEFINED_COLORS.add(new Proposal("royalblue"));
		PREDEFINED_COLORS.add(new Proposal("saddlebrown"));
		PREDEFINED_COLORS.add(new Proposal("salmon"));

		PREDEFINED_COLORS.add(new Proposal("sandybrown"));
		PREDEFINED_COLORS.add(new Proposal("seagreen"));
		PREDEFINED_COLORS.add(new Proposal("seashell"));
		PREDEFINED_COLORS.add(new Proposal("sienna"));

		PREDEFINED_COLORS.add(new Proposal("silver"));
		PREDEFINED_COLORS.add(new Proposal("skyblue"));
		PREDEFINED_COLORS.add(new Proposal("slateblue"));
		PREDEFINED_COLORS.add(new Proposal("slategray"));

		PREDEFINED_COLORS.add(new Proposal("slategrey"));
		PREDEFINED_COLORS.add(new Proposal("snow"));
		PREDEFINED_COLORS.add(new Proposal("springgreen"));
		PREDEFINED_COLORS.add(new Proposal("steelblue"));

		PREDEFINED_COLORS.add(new Proposal("tan"));
		PREDEFINED_COLORS.add(new Proposal("teal"));
		PREDEFINED_COLORS.add(new Proposal("thistle"));
		PREDEFINED_COLORS.add(new Proposal("tomato"));

		PREDEFINED_COLORS.add(new Proposal("turquoise"));
		PREDEFINED_COLORS.add(new Proposal("violet"));
		PREDEFINED_COLORS.add(new Proposal("wheat"));
		PREDEFINED_COLORS.add(new Proposal("white"));

		PREDEFINED_COLORS.add(new Proposal("whitesmoke"));
		PREDEFINED_COLORS.add(new Proposal("yellow"));
		PREDEFINED_COLORS.add(new Proposal("yellowgreen"));
		PREDEFINED_COLORS.add(new Proposal("transparent"));
	}
	
	@Override
	public List<Property> getProperties() {
		return PROPERTIES;
	}
	
	public static class SizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public SizeProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple groups", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					termGroup g = dec.getExpression().getTermGroups().get(0);
					if( g.getTerms().size() == 1 ) {
						List<ValidationResult> rv = new ArrayList<ValidationResult>();
						for( term t : g.getTerms() ) {
							if( t.getNumber() == null ) {
								rv.add(new ValidationResult(ValidationStatus.ERROR, "The value must be a size", t, null, -1));
								continue;
							}
							
							// Number with units
							if( ! Pattern.matches(".*\\d+$",t.getNumber()) ) {
								for( String u : sizeUnits() ) {
									if( t.getNumber().endsWith(u) ) {
										return super.validate(dec);
									}
								}
								
								StringBuilder b = new StringBuilder();
								b.append("- <none>\n");
								for( String p: sizeUnits() ) {
									b.append("- " + p + "\n");
								}
								rv.add(new ValidationResult(ValidationStatus.ERROR, "Supported units are:\n"+b, t, CssDslPackage.Literals.TERM__NUMBER, -1));
							}
						}
						
						if( rv.size() != 0 ) {
							return rv.toArray(new ValidationResult[0]);
						}
					} else if( g.getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute only supports one size value", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
					}
				}
			}
			return super.validate(dec);
		}
	}
	
	public static class Size4TimesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public Size4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("1 1 1 1"));
			
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
				proposals.add(new Proposal("1"+u+" 1"+u+" 1"+u+" 1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple groups", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					termGroup g = dec.getExpression().getTermGroups().get(0);
					if( g.getTerms().size() == 1 || g.getTerms().size() == 4 ) {
						List<ValidationResult> rv = new ArrayList<ValidationResult>();
						for( term t : g.getTerms() ) {
							if( t.getNumber() == null ) {
								rv.add(new ValidationResult(ValidationStatus.ERROR, "The value must be a size", t, null, -1));
								continue;
							}
							
							// Number with units
							if( ! Pattern.matches(".*\\d+$",t.getNumber()) ) {
								for( String u : sizeUnits() ) {
									if( t.getNumber().endsWith(u) ) {
										return super.validate(dec);
									}
								}
								
								StringBuilder b = new StringBuilder();
								b.append("- <none>\n");
								for( String p: sizeUnits() ) {
									b.append("- " + p + "\n");
								}
								rv.add(new ValidationResult(ValidationStatus.ERROR, "Supported units are:\n"+b, t, CssDslPackage.Literals.TERM__NUMBER, -1));
							}
						}
						
						if( rv.size() != 0 ) {
							return rv.toArray(new ValidationResult[0]);
						}
					} else if( g.getTerms().size() > 1 && g.getTerms().size() != 4 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute only supports 1 or 4 sizes", g, null, -1) };
					}
				}
			}
			return super.validate(dec);
		}
	}
	
	public static class MultiSize4TimesProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<Proposal> singleTerm = new ArrayList<Proposal>();
		
		public MultiSize4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			singleTerm.add(new Proposal("1"));
			proposals.add(new Proposal("1 1 1 1"));
			
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
				singleTerm.add(new Proposal("1"+u));
				proposals.add(new Proposal("1"+u+" 1"+u+" 1"+u+" 1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup group, term term) {
			if( index < 4 ) {
				return singleTerm;
			}
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( dec.getExpression() != null ) {
				for( termGroup g : dec.getExpression().getTermGroups() ) {
					if( g.getTerms().size() == 1 || g.getTerms().size() == 4 ) {
						List<ValidationResult> rv = new ArrayList<ValidationResult>();
						for( term t : g.getTerms() ) {
							if( t.getNumber() == null ) {
								rv.add(new ValidationResult(ValidationStatus.ERROR, "The value must be a size", t, null, -1));
								continue;
							}
							
							// Number with units
							if( ! Pattern.matches(".*\\d+$",t.getNumber()) ) {
								for( String u : sizeUnits() ) {
									if( t.getNumber().endsWith(u) ) {
										return super.validate(dec);
									}
								}
								
								StringBuilder b = new StringBuilder();
								b.append("- <none>\n");
								for( String p: sizeUnits() ) {
									b.append("- " + p + "\n");
								}
								rv.add(new ValidationResult(ValidationStatus.ERROR, "Supported units are:\n"+b, t, CssDslPackage.Literals.TERM__NUMBER, -1));
							}
						}
						
						if( rv.size() != 0 ) {
							return rv.toArray(new ValidationResult[0]);
						}
					} else if( g.getTerms().size() > 1 && g.getTerms().size() != 4 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute only supports 1 or 4 sizes", g, null, -1) };
					}
				}
			}
			return super.validate(dec);
		}
	}
	
	public static class PaintProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public PaintProperty(String name) {
			super(name);
			// color stuff
			proposals.addAll(PREDEFINED_COLORS);
			proposals.add(new Proposal(2,"#000"));
			proposals.add(new Proposal(2,"#00000"));
			proposals.add(new Proposal(2,"rgb(0,0,0)"));
			proposals.add(new Proposal(2,"rgba(0,0,0,0)"));
			proposals.add(new Proposal(2,"hsb(0,0%,0%)"));
			proposals.add(new Proposal(2,"hsba(0,0%,0%,0)"));
			proposals.add(new Proposal(2,"derive(<color>,0%)"));
			proposals.add(new Proposal(2,"ladder(<color>) stops (0, <color>)"));
			
			// gradient
			proposals.add(new Proposal(2,"linear-gradient( from 0% 0% to 100% 100%, repeat, 0% red, 100% black )"));
			proposals.add(new Proposal(2,"radial <size> stops ( <number> , <color> )"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple groups", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					List<ValidationResult> list = new ArrayList<ValidationResult>();
					if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
						if( isGradient(dec.getExpression().getTermGroups().get(0).getTerms().get(0), list) ) {
							return list.toArray(new ValidationResult[0]);
						} else {
							validateColor(dec.getExpression().getTermGroups().get(0).getTerms().get(0),list);
							if( list.size() > 0 ) {
								return list.toArray(new ValidationResult[0]);
							}
						}
					}
					
				}
			}
			return super.validate(dec);
		}
	}
	
	public static class MultiPaintProperty extends Property implements MultiTermGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MultiPaintProperty(String name) {
			super(name);
			
			proposals.addAll(PREDEFINED_COLORS);
			proposals.add(new Proposal(2,"#000"));
			proposals.add(new Proposal(2,"#00000"));
			proposals.add(new Proposal(2,"rgb(0,0,0)"));
			proposals.add(new Proposal(2,"rgba(0,0,0,0)"));
			proposals.add(new Proposal(2,"hsb(0,0%,0%)"));
			proposals.add(new Proposal(2,"hsb(0,0%,0%,0)"));
			proposals.add(new Proposal(2,"derive(<color>,0%)"));
			proposals.add(new Proposal(2,"ladder(<color>) stops (0, <color>)"));
			
			// gradient
			proposals.add(new Proposal(2,"linear-gradient( from 0% 0% to 100% 100%, repeat, red 0%, black 100% )"));
			proposals.add(new Proposal(2,"radial <size> stops ( <number> , <color> )"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			List<ValidationResult> rv = new ArrayList<CssDialectExtension.ValidationResult>();
			if( dec.getExpression() != null ) {
				for( termGroup g : dec.getExpression().getTermGroups() ) {
					if( g.getTerms().size() == 1 ) {
						if( ! isGradient(g.getTerms().get(0), rv) ) {
							validateColor(g.getTerms().get(0), rv);
						}
					} else {
						rv.add(new ValidationResult(ValidationStatus.ERROR, "The property allows only one term", g, null, -1));
					}
				}
			}
			
			return rv.toArray(new ValidationResult[0]);
		}
	}
	
	public static class MultiPaint4TimesProperty extends Property implements MultiValuesGroupProperty, MultiTermGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MultiPaint4TimesProperty(String name) {
			super(name);
			
			proposals.addAll(PREDEFINED_COLORS);
			proposals.add(new Proposal(2,"#000"));
			proposals.add(new Proposal(2,"#00000"));
			proposals.add(new Proposal(2,"rgb(0,0,0)"));
			proposals.add(new Proposal(2,"rgba(0,0,0,0)"));
			proposals.add(new Proposal(2,"hsb(0,0%,0%)"));
			proposals.add(new Proposal(2,"hsb(0,0%,0%,0)"));
			proposals.add(new Proposal(2,"derive(<color>,0%)"));
			proposals.add(new Proposal(2,"ladder(<color>) stops (0, <color>)"));
			
			// gradient
			proposals.add(new Proposal(2,"linear-gradient( from 0% 0% to 100% 100%, repeat, 0% red, 100% black )"));
//			proposals.add(new Proposal(2,"radial <size> stops ( <number> , <color> )"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup group, term term) {
			return proposals;
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			List<ValidationResult> rv = new ArrayList<CssDialectExtension.ValidationResult>();
			
			if( dec.getExpression() != null ) {
				for( termGroup g : dec.getExpression().getTermGroups() ) {
					if( g.getTerms().size() == 1 || g.getTerms().size() == 4 ) {
						for( term t : g.getTerms() ) {
							if( ! isGradient(t, rv) ) {
								validateColor(g.getTerms().get(0), rv);
							}
						}
					} else {
						rv.add(new ValidationResult(ValidationStatus.ERROR, "The group has to have 1 or 4 values", g, null, -1));
					}
				}
			}
			
			return rv.toArray(new ValidationResult[0]);
		}
	}
	
	public static class Number4TimesProperty extends Property implements MultiValuesGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public Number4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("10"));
			proposals.add(new Proposal("10 10 10 10"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index < 4 ) {
				return Util.fromList("0");
			}
			return Collections.emptyList();
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple groups", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					termGroup g = dec.getExpression().getTermGroups().get(0);
					if( g.getTerms().size() == 1 ) {
						ValidationResult r = Util.checkNumber(g.getTerms().get(0), "The attribute has to be a number");
						if( r == null ) {
							return super.validate(dec);
						}
					} else if( g.getTerms().size() == 4 ) {
						List<ValidationResult> rList = new ArrayList<ValidationResult>();
						for( term t : g.getTerms() ) {
							ValidationResult r = Util.checkNumber(t, "The attribute has to be a number");
							if( r == null ) {
								rList.add(r);
							}
						}
						
						if( ! rList.isEmpty() ) {
							return rList.toArray(new ValidationResult[0]);
						}
					} else {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute has to be 1 or 4 value", dec, CssDslPackage.Literals.CSS_DECLARATION__EXPRESSION, -1) };
					}
				}
			}
			return super.validate(dec);
		}
	}
	
	public static class FontProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class FontFamilyProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontFamilyProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class FontSizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontSizeProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class FontStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontStyleProperty(String name) {
			super(name);
			proposals.addAll(CssDialectExtension.Util.fromList("normal","italic","oblique"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class FontWeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontWeightProperty(String name) {
			super(name);
			proposals.addAll(CssDialectExtension.Util.fromList("normal","bold","bolder","lighter","100","200","300","400","500","600","700","800","900"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class FxNumberProperty extends NumberPropery {
		public FxNumberProperty(String name) {
			super(name);
		}
		
		@Override
		public ValidationResult[] validate(css_declaration dec) {
			if( isReference(dec) ) {
				return new ValidationResult[0];
			}
			return super.validate(dec);
		}
	}
	
	public static List<String> sizeUnits() {
		return Arrays.asList("px","mm","cm","in","pt","pc","em","ex");
	}
	
	public static List<String> angles() {
		return Arrays.asList("grad","deg","rad"); // order is important!!!
	}
	
	public static boolean isReference(css_declaration dec) {
		if( dec.getExpression().getTermGroups().size() == 1 ) {
			termGroup g = dec.getExpression().getTermGroups().get(0);
			if( g.getTerms().size() == 1 ) {
				String identifier = g.getTerms().get(0).getIdentifier();
				
				//TODO We should get smarter in future and check the referenced value
				if( identifier != null && identifier.startsWith("-fx-") ) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isGradient(term t, List<ValidationResult> list) {
		if( t.getFunction() != null && "linear-gradient".equals(t.getFunction().getName()) ) {
			LinearGradientValidator.validateLinearGradient(t.getFunction(), list);
			return true;
		} else if( t.getFunction() != null && "radial-gradient".equals(t.getFunction().getName()) ) {
			RadialGradientValidator.validateRadialGradient(t.getFunction(), list);
			return true;
		}
		return false;
	}
	
	public static void validateSize(term term, List<ValidationResult> list) {
		if( term.getNumber() == null ) {
			list.add(new ValidationResult(ValidationStatus.ERROR, "The value must be a size", term, null, -1));
			return;
		}
		
		if( term.getNumber().trim().endsWith("%") ) {
			validatePercentage(term, list);
		} else if( ! Pattern.matches(".*\\d+$",term.getNumber()) ) {
			// Number with units
			for( String u : sizeUnits() ) {
				if( term.getNumber().endsWith(u) ) {
					String num = term.getNumber().substring(0,term.getNumber().length() - u.length());
					try {
						Double.parseDouble(num);	
					} catch (NumberFormatException e) {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The angle is not a valid number", term, CssDslPackage.Literals.TERM__NUMBER, 0));
					}
					
					return;
				}
			}
			
			StringBuilder b = new StringBuilder();
			b.append("- <none>\n");
			for( String p: sizeUnits() ) {
				b.append("- " + p + "\n");
			}
			list.add(new ValidationResult(ValidationStatus.ERROR, "Supported units are:\n"+b, term, CssDslPackage.Literals.TERM__NUMBER, -1));
		}
	}
	
	private static boolean isHexDigit(char c) {
		return (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || (c >= '0' && c <= '9');
	}
	
	public static void validateColor(term t, List<ValidationResult> list) {
			if( t.getIdentifier() != null ) {
				for( Proposal color: PREDEFINED_COLORS ) {
					if( t.getIdentifier().equalsIgnoreCase(color.getProposal()) ) {
						return;
					}
				}
//				if( ! t.getIdentifier().startsWith("-") ) {
//					list.add(new ValidationResult(ValidationStatus.ERROR, "'"+t.getIdentifier()+"' is not a known color", t, CssDslPackage.Literals.TERM__IDENTIFIER, 0));	
//				}
			} else if( t.getHexColor() != null ) {
				if( !(t.getHexColor().length() == 4 || t.getHexColor().length() == 7 || t.getHexColor().length() == 9) ) {
					list.add(new ValidationResult(ValidationStatus.ERROR, "A hex-color definition has to have 3, 6 or 9 hex-digits", t, CssDslPackage.Literals.TERM__HEX_COLOR, -1));
				} else {
					for( char c : t.getHexColor().substring(1).toCharArray() ) {
						if( ! isHexDigit(c) ) {
							list.add(new ValidationResult(ValidationStatus.ERROR, "'"+c+"' is not a valid digit in hexcolors", t, CssDslPackage.Literals.TERM__HEX_COLOR, -1));
							break;
						}
					}
				}
				return;
			} else if( t.getFunction() != null ) {
				if( "rgb".equals(t.getFunction().getName()) ) {
					expr e = t.getFunction().getExpression();
					if( e != null && e.getTermGroups().size() == 3 ) {
						for( termGroup g : e.getTermGroups() ) {
							if( g.getTerms().size() == 1 ) {
								term colorterm = g.getTerms().get(0);
								if( colorterm.getNumber() != null ) {
									if( colorterm.getNumber().matches("^\\d+$") ) {
										int v = Integer.parseInt(colorterm.getNumber());
										if( v < 0 || v > 255 ) {
											list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be an integer between 0 and 255", colorterm, null, -1));
										}
									} else {
										list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be an integer between 0 and 255", colorterm, null, -1));
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single number", colorterm, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single number", g, null, -1));
							}
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "A RGB value has to be defined with 3 values (red,green,blue)", t.getFunction(), null, -1));
					}
				} else if( "rgba".equals(t.getFunction().getName()) ) {
					expr e = t.getFunction().getExpression();
					if( e != null && e.getTermGroups().size() == 4 ) {
						for( int i = 0; i < 3; i++ ) {
							termGroup g = e.getTermGroups().get(i);
							if( g.getTerms().size() == 1 ) {
								term colorterm = g.getTerms().get(0);
								if( colorterm.getNumber() != null ) {
									if( colorterm.getNumber().matches("^\\d+$") ) {
										int v = Integer.parseInt(colorterm.getNumber());
										if( v < 0 || v > 255 ) {
											list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be an integer between 0 and 255", colorterm, null, -1));
										}
									} else {
										list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be an integer between 0 and 255", colorterm, null, -1));
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single number", colorterm, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single number", g, null, -1));
							}
						}
						
						termGroup g = e.getTermGroups().get(3);
						if( g.getTerms().size() == 1 ) {
							try {
								double v = Double.parseDouble(g.getTerms().get(0).getNumber());
								if( v < 0 || v > 1.0 ) {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
								}
							} catch (Exception ex) {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
							}
						} else {
							list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "A RGB value has to be defined with 3 values (red,green,blue)", t.getFunction(), null, -1));
					}
				} else if( "hsb".equals(t.getFunction().getName()) || "hsba".equals(t.getFunction().getName()) ) {
					expr e = t.getFunction().getExpression();
					if( e != null && (( e.getTermGroups().size() == 3 && "hsb".equals(t.getFunction().getName()) || 
							( e.getTermGroups().size() == 4 && "hsba".equals(t.getFunction().getName())) ))) {
						{
							termGroup g = e.getTermGroups().get(0);
							if( g.getTerms().size() == 1 ) {
								term term = g.getTerms().get(0);
								if( term.getNumber() != null ) {
									if( term.getNumber().matches("^\\d+$") ) {
										int v = Integer.parseInt(term.getNumber());
										if( v < 0 || v > 360 ) {
											list.add(new ValidationResult(ValidationStatus.ERROR, "The hue value has to be an integer between 0 and 360", term, null, -1));
										}
									} else {
										list.add(new ValidationResult(ValidationStatus.ERROR, "The hue value has to be an integer between 0 and 360", term, null, -1));
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The hue value has to be an integer number", term, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The hue value has to be a single number", g, null, -1));
							}	
						}
						
						{
							termGroup g = e.getTermGroups().get(1);
							if( g.getTerms().size() == 1 ) {
								term term = g.getTerms().get(0);
								if( term.getNumber() != null ) {
									ValidationResult res = Util.checkPercentage(term, "The saturation value has to be an integer between 0% and 100%",0,100);
									if( res != null ) {
										list.add(res);
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The saturation value has to be an integer number", term, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The saturation value has to be a single number", g, null, -1));
							}	
						}
						
						{
							termGroup g = e.getTermGroups().get(2);
							if( g.getTerms().size() == 1 ) {
								term term = g.getTerms().get(0);
								if( term.getNumber() != null ) {
									ValidationResult res = Util.checkPercentage(term, "The brightness value has to be an integer between 0% and 100%",0,100);
									if( res != null ) {
										list.add(res);
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The brightness value has to be an integer number", term, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The brightness value has to be a single number", g, null, -1));
							}	
						}
						
						if( "hsba".equals(t.getFunction().getName()) ) {
							termGroup g = e.getTermGroups().get(3);
							if( g.getTerms().size() == 1 ) {
								if( g.getTerms().get(0).getNumber().matches(".+\\d$") ) {
									double v = Double.parseDouble(g.getTerms().get(0).getNumber());
									if( v < 0 || v > 1.0 ) {
										list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be a single floating point number between 0.0 (=transparent) and 1.0 (=opaque)", g, null, -1));
							}
						}
					} else {
						if( "hsb".equals(t.getFunction().getName()) ) {
							list.add(new ValidationResult(ValidationStatus.ERROR, "A HSB value has to be defined with 3 values (hue,saturation,brightness)", t.getFunction(), null, -1));
						} else {
							list.add(new ValidationResult(ValidationStatus.ERROR, "A HSB value has to be defined with 4 values (hue,saturation,brightness,alpha)", t.getFunction(), null, -1));
						}
					}
				} else if( "derive".equals(t.getFunction().getName()) ) {
					expr e = t.getFunction().getExpression();
					if( e.getTermGroups().size() == 2 ) {
						if( e.getTermGroups().get(0).getTerms().size() == 1 ) {
							validateColor(e.getTermGroups().get(0).getTerms().get(0), list);
							
							termGroup g = e.getTermGroups().get(1);
							if( g.getTerms().size() == 1 ) {
								term term = g.getTerms().get(0);
								if( term.getNumber() != null ) {
									ValidationResult res = Util.checkPercentage(term, "The brightness value has to be an integer between -"+Integer.MIN_VALUE+"% and "+Integer.MAX_VALUE+"%",Integer.MIN_VALUE,Integer.MAX_VALUE);
									if( res != null ) {
										list.add(res);
									}
								} else {
									list.add(new ValidationResult(ValidationStatus.ERROR, "The brightness value has to be an integer number", term, null, -1));
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The brightness value has to be a single number", g, null, -1));
							}
						} else {
							list.add(new ValidationResult(ValidationStatus.ERROR, "The brightness-color has to be a single color", e.getTermGroups().get(0), null, -1));
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The derive function has to be passed 2 arguments (color,brightness)", t.getFunction(), null, -1));
					}
				} else if( "ladder".equals(t.getFunction().getName()) ) {
					expr e = t.getFunction().getExpression();
					if( e.getTermGroups().size() >= 2 ) {
						termGroup colorGroup = e.getTermGroups().get(0);
						validateColor(colorGroup.getTerms().get(0), list);
						for( int i = 1; i < e.getTermGroups().size(); i++ ) {
							GradientValidator.validateColorStop(e.getTermGroups().get(i), list);	
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The ladder function needs at least 2 arguments. A color and color-stop", e.eContainer(), CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
					}
				} else {
					list.add(new ValidationResult(ValidationStatus.ERROR, "Unsupported color function", t.getFunction(), null, -1));
				}
			} else {
				list.add(new ValidationResult(ValidationStatus.ERROR, "Unsupported color definition", t, null, -1));
			}
	}
	
	public static void validateAngle(term term, List<ValidationResult> list) {
		if( term.getNumber() == null ) {
			list.add(new ValidationResult(ValidationStatus.ERROR, "The value must be an angle", term, null, -1));
			return;
		}
		
		for( String a : angles() ) {
			if( term.getNumber().endsWith(a) ) {
				String num = term.getNumber().substring(0,term.getNumber().length() - a.length());
				try {
					Double.parseDouble(num);
				} catch (NumberFormatException e) {
					list.add(new ValidationResult(ValidationStatus.ERROR, "The angle is not a valid number", term, CssDslPackage.Literals.TERM__NUMBER, -1));
				}
				return;
			}
		}
		
		StringBuilder b = new StringBuilder();
		for( String a: angles() ) {
			b.append("- " + a + "\n");
		}
		list.add(new ValidationResult(ValidationStatus.ERROR, "Supported angle units are:\n"+b, term, CssDslPackage.Literals.TERM__NUMBER, -1));
	}
	
	public static void validatePercentage(term term, List<ValidationResult> list) {
		if( term.getNumber() == null || ! term.getNumber().endsWith("%") ) {
			list.add(new ValidationResult(ValidationStatus.ERROR, "The value must be a percentage", term, CssDslPackage.Literals.TERM__NUMBER, -1));
			return;
		}
		
//		double i = 
		Double.parseDouble(term.getNumber().substring(0,term.getNumber().length()-1));
// Percentage can be any value		
//		if( i < 0 || i > 100 ) {
//			list.add(new ValidationResult(ValidationStatus.ERROR, "Percentage has to be between 0% and 100%", term, CssDslPackage.Literals.TERM__NUMBER, -1));
//		}
	}
	
	public boolean isActive(URI uri) {
		return uri.toString().endsWith(".css"); 
	};
}