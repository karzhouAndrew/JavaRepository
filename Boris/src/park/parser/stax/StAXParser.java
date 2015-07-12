//package park.parser.stax;
//
//
//import com.sun.org.apache.xerces.internal.impl.dv.dtd.XML11DTDDVFactoryImpl;
//import module2.laba7.other.Point;
//import module2.laba7.other.Tags;
//import module2.laba7.parser.Parser;
//
//import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamConstants;
//import javax.xml.stream.XMLStreamException;
//import javax.xml.stream.XMLStreamReader;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class StAXParser extends Parser {
//    private List<Point> points;
//    private boolean isXTagNow;
//    private boolean isYTagNow;
//    private Point point;
//
//
//    @Override
//    public void parseXML(File file) throws FileNotFoundException {
//        points = null;
//        InputStream inputStream = null;
//        XMLStreamReader xmlStreamReader;
//        try {
//            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
//            inputStream = new FileInputStream(file);
//            xmlStreamReader = xmlInputFactory.createXMLStreamReader(inputStream);
//            parsing(xmlStreamReader);
//        } catch (XMLStreamException e) {
//            e.printStackTrace();
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    System.out.println("IO exception");
//                }
//            }
//        }
//        super.points = points;
//    }
//
//    private void parsing(XMLStreamReader xmlStreamReader) throws XMLStreamException {
//        while (xmlStreamReader.hasNext()) {
//            int nodeType = xmlStreamReader.next();
//            switch (nodeType) {
//                case XMLStreamConstants.START_ELEMENT:
//                    processStartElement(xmlStreamReader);
//                    break;
//                case XMLStreamConstants.CHARACTERS:
//                    processSet(xmlStreamReader);
//                    break;
//                case XMLStreamConstants.END_ELEMENT:
//                    processEndElement(xmlStreamReader);
//                    break;
//                case XMLStreamConstants.ATTRIBUTE:
//                    processAttribute(xmlStreamReader);
//                default:
//            }
//        }
//    }
//
//    private void processAttribute(XMLStreamReader xmlStreamReader) {
//        if (xmlStreamReader.isWhiteSpace()) {
//            return;
//        }
//        Tags currentElement = Tags.valueOf(xmlStreamReader.getLocalName().toUpperCase());
//    }
//
//    private void processEndElement(XMLStreamReader xmlStreamReader) {
//        if (xmlStreamReader.isWhiteSpace()) {
//            return;
//        }
//        Tags currentElement = Tags.valueOf(xmlStreamReader.getLocalName().toUpperCase());
//        switch (currentElement) {
//            case X:
//                isXTagNow = false;
//                break;
//            case Y:
//                isYTagNow = false;
//                break;
//            case POINT:
//                points.add(point);
//                point = null;
//                break;
//            case POINTLIST:
//                break;
//            default:
//        }
//    }
//
//    private void processSet(XMLStreamReader xmlStreamReader) throws XMLStreamException {
//        if (xmlStreamReader.isWhiteSpace()) {
//            return;
//        }
//        if (isXTagNow) {
//            point.setX(Integer.valueOf(xmlStreamReader.getText()));
//        } else if (isYTagNow) {
//            point.setY(Integer.valueOf(xmlStreamReader.getText()));
//        }
//    }
//
//    private void processStartElement(XMLStreamReader xmlStreamReader) {
//        if (xmlStreamReader.isWhiteSpace()) {
//            return;
//        }
//        Tags currentElement = Tags.valueOf(xmlStreamReader.getLocalName().toUpperCase());
//        switch (currentElement) {
//            case X:
//                isXTagNow = true;
//                break;
//            case Y:
//                isYTagNow = true;
//                break;
//            case POINT:
//                point = new Point();
//                point.setUnits(xmlStreamReader.getAttributeValue(0));
//                break;
//            case POINTLIST:
//                points = new ArrayList<>();
//                break;
//            default:
//        }
//    }
//}
