package lab41and42;

import org.w3c.dom.*;
import org.xml.sax.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class DOMParser {


    public ProcessingPoint parseXML(String fileName) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = null;
        Document document = null;
        File file = new File(fileName);
        try {
            documentBuilder = factory.newDocumentBuilder();
            document = documentBuilder.parse(file);
        } catch (ParserConfigurationException e) {
            System.out.println("Error during configuration parser");
            e.printStackTrace();
        } catch (SAXException e) {
            System.out.println("Error occurred during parsing XML");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        ProcessingPoint processingPoint = doParsing(document);
        return processingPoint;
    }

    public ProcessingPoint doParsing(Document document) {
        ProcessingPoint processingPoint = new ProcessingPoint();
        Element element = document.getDocumentElement();
        NodeList points = element.getChildNodes();
        for (int i = 0; i < points.getLength(); i++) {
            Node node = points.item(i);
            if (isPointNode(node)) {
                Point point = createPoint(node);
                processingPoint.addPoint(point);
            }
        }
        return processingPoint;
    }

    private boolean isPointNode(Node node) {
        return "point".equals(node.getNodeName());
    }

    private boolean isXNode(Node node) {
        return "x".equals(node.getNodeName());
    }

    private boolean isYNode(Node node) {
        return "y".equals(node.getNodeName());
    }

    public Point createPoint(Node node) {
        Point point = new Point();
        NamedNodeMap attribute = node.getAttributes();
        point.setUnit(attribute.getNamedItem("unit").getTextContent());
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node tag = childNodes.item(i);
            if (isXNode(tag)) {
                point.setX(Integer.parseInt(tag.getTextContent()));
            } else if (isYNode(tag)) {
                point.setY(Integer.parseInt(tag.getTextContent()));
            }
        }
        return point;
    }
}