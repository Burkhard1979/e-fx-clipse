/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.formats.svg.handler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.zip.GZIPInputStream;

import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import at.bestsolution.efxclipse.formats.svg.converter.FXMLConverter;
import at.bestsolution.efxclipse.formats.svg.svg.ContentElement;
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPackage;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;

public class XMLLoader {
	private static final Map<String, String> SUFFIXMAP = new HashMap<String, String>();
	
	{
		SUFFIXMAP.put("image/png", "png");
		SUFFIXMAP.put("image/jpeg", "jpg");
		SUFFIXMAP.put("image/jpg", "jpg");
		SUFFIXMAP.put("image/gif", "gif");
	}
	
	public static void main(String[] args) {
		XMLLoader l = new XMLLoader();
		try {
			// TODO use workspace file
			File f = new File("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.formats.svg/samples/player.svg");
			InputStream in;
			
			if( f.getName().endsWith("svgz") ) {
				in = new GZIPInputStream(f.toURI().toURL().openStream());
			} else {
				in = f.toURI().toURL().openStream();
			}
			
			
			// TODO use workspace file
			SvgSvgElement g = l.loadDocument("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.formats.svg/samples/test.fxml",in);
//			SvgSvgElement g = l.loadDocument(new File("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.formats.svg/samples/w3/images/shapes/rect01.svg").toURL().openStream());
//			SvgSvgElement g = l.loadDocument(new File("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.formats.svg/samples/w3/images/filters/filters01.svg").toURL().openStream());
			FXMLConverter c = new FXMLConverter(g);
			String fxmlData = c.generate().toString();
			// TODO use workspace file
			File outFile = new File("/Users/tomschindl/git/e-fx-clipse/at.bestsolution.efxclipse.formats.svg/samples/test.fxml");
			FileOutputStream out = new FileOutputStream(outFile);
			out.write(fxmlData.getBytes());
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SvgSvgElement loadDocument(String outFile, InputStream in) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			SAXParser parser = factory.newSAXParser();
			Handler handler = new Handler();
			parser.parse(in, handler);
			postProcess(outFile, handler.cssString, handler.root);
			return handler.root;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	private void postProcess(String outFile, StringBuilder cssString, SvgSvgElement root) throws IOException {
		int imageCount = 0;
		TreeIterator<EObject> it = EcoreUtil.getAllContents(root, true);

		if( cssString != null ) {
			File outCssFile;
			if( outFile == null ) {
				outCssFile = File.createTempFile("conversion", ".css");
				outCssFile.deleteOnExit();
			} else {
				outCssFile = new File(outFile+".css");	
			}
			
			try {
				FileOutputStream out = new FileOutputStream(outCssFile);
				out.write(cssString.toString().getBytes());
				out.close();
				root.setStyleSheet("@"+outCssFile.getName());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while( it.hasNext() ) {
			EObject o = it.next();
			EStructuralFeature f = o.eClass().getEStructuralFeature("style");
			if( f != null ) {
				String s = (String) o.eGet(f);
				if( s != null && s.trim().length() > 0 ) {
					for( Entry<String, String> e : valueMap(s).entrySet() ) {
						String name = e.getKey().replaceAll("-", "_");
						EStructuralFeature styleFeature = o.eClass().getEStructuralFeature(name.trim());
						if( styleFeature != null ) {
							Object value = EcoreUtil.createFromString((EDataType) styleFeature.getEType(), e.getValue());
							o.eSet(styleFeature, value);
						} else {
							System.err.println("Could not find style attribute: " + name + " on " + o.eClass());
						}
					}
				}
			}
			
			f = o.eClass().getEStructuralFeature("xlink__href");
			if( f != null ) {
				EStructuralFeature instanceFeature = o.eClass().getEStructuralFeature("resolvedInstance");
				String link = (String) o.eGet(f);
				if( link != null && link.startsWith("data:") ) {
					String type = link.substring(0,link.indexOf(';'));
//					String encoding = link.substring(link.indexOf(';')+1,link.indexOf(','));
					String data = link.substring(link.indexOf(',')+1);
					byte[] b = DatatypeConverter.parseBase64Binary(data);
					try {
						String suffix = SUFFIXMAP.get(type.toLowerCase());
						if( suffix == null ) {
							suffix = type.substring(type.indexOf('/')+1);
						}
						
						File outDir;
						
						if( outFile == null ) {
							outDir  = File.createTempFile("conversion", "_img");
							outDir.delete();
						} else {
							outDir = new File(outFile+"img");
						}
						
						File outF = new File(outDir, "img_"+(imageCount++)+"."+suffix);
						outDir.mkdirs();
						FileOutputStream out = new FileOutputStream(outF);
						out.write(b);
						out.close();
						o.eSet(f, "@" + outDir.getName() + "/" + outF.getName());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					if( link != null && link.trim().length() > 0 ) {
						link = link.substring(1);
						TreeIterator<EObject> internalIt = EcoreUtil.getAllContents(root, true);
						while( internalIt.hasNext() ) {
							EObject internalO = internalIt.next();
							if( internalO instanceof CoreAttributes ) {
								if( link.equals(internalO.eGet(SvgPackage.Literals.CORE_ATTRIBUTES__ID))) {
									o.eSet(instanceFeature, internalO);
									break;
								}
							}
						}
					}					
				}
			}
		}		
	}
	
	private Map<String, String> valueMap(String styleString) {
		//TODO This is a very very poor algorithm
		Map<String,String> map = new HashMap<String, String>();
		for( String o : styleString.split(";") ) {
			String k = o.substring(0,o.indexOf(":"));
			String v = o.substring(o.indexOf(":")+1,o.length());
			map.put(k, v);
		}
		return map;
	}
	
	static class Handler extends DefaultHandler {
		private SvgSvgElement root;
		
		private Stack<SvgElement> elementStack = new Stack<SvgElement>();
		
		private boolean inCSS;
		private StringBuilder cssString;
		
		private static final String SVG_NS = "http://www.w3.org/2000/svg";
		private static final String XLINK_NS = "http://www.w3.org/1999/xlink";
		
		@SuppressWarnings("unchecked")
		@Override
		public InputSource resolveEntity(String arg0, String arg1) throws IOException, SAXException {
			return new InputSource(new StringReader(""));
		}
		
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if( SVG_NS.equals(uri) ) {
				if( localName.equals("style") ) {
					inCSS = true;
					cssString = new StringBuilder();
					return;
				}
				
				EClass ec = (EClass) SvgPackage.eINSTANCE.getEClassifier("Svg"+Character.toUpperCase(localName.charAt(0))+ localName.substring(1) + "Element");
				if( ec != null ) {
					SvgElement e = (SvgElement) EcoreUtil.create(ec);
					
					for (int i = 0; i < attributes.getLength(); i++) {
						if (SVG_NS.equals(attributes.getURI(i)) || "".equals(attributes.getURI(i))) {
							String name = attributes.getLocalName(i).replaceAll("-", "_");
							EStructuralFeature f = e.eClass().getEStructuralFeature(name);
							if (f != null) {
								Object o = EcoreUtil.createFromString((EDataType) f.getEType(), attributes.getValue(i));
								e.eSet(f, o);
							} else {
								System.err.println("Could not find feature '" + name + "' in " + e.eClass().getName());
							}
						} else if( XLINK_NS.equals(attributes.getURI(i)) ) {
							String name = "xlink__" + attributes.getLocalName(i).replaceAll("-", "_");
							EStructuralFeature f = e.eClass().getEStructuralFeature(name);
							if( f != null ) {
								Object o = EcoreUtil.createFromString((EDataType) f.getEType(), attributes.getValue(i));
								e.eSet(f, o);
							} else {
								System.err.println("Could not find feature '" + name + "' in " + e.eClass().getName());
							}
						}
					}
					
					if( elementStack.isEmpty() ) {
						root = (SvgSvgElement) e;
					} else {
						((ContentElement<SvgElement>)elementStack.peek()).getChildren().add(e);
					}
					
					elementStack.push(e);
					
				} else {
					throw new IllegalStateException("Unable to find element '"+localName+"'");
				}
			}
		}
		
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			if( inCSS ) {
				cssString.append(ch, start, length);
			}
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			if( localName.equals("style") ) {
				inCSS = false;
			} else if( SVG_NS.equals(uri) && ! localName.equals("svg") ) {
				elementStack.pop();
			}
		}
	}
}
