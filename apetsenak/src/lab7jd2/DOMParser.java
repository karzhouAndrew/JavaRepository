package lab7jd2;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParser {
    public PointsList parseXML(String fileName) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            File file = new File(fileName);
            document = builder.parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PointsList pointsList = doParsing(document);
        return pointsList;
    }

    public PointsList doParsing(Document document) {
        PointsList pointsList = new PointsList();
        Element root = document.getDocumentElement();
        NodeList points = root.getChildNodes();
        for (int i = 0; i < points.getLength(); i++) {
            Node node = points.item(i);
            if (isPointNode(node)) {
                Point point = readPoint(node);
                pointsList.addPoint(point);
            }
        }
        return pointsList;
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

    public Point readPoint(Node node) {
        Point point = new Point();
        NamedNodeMap attribute = node.getAttributes();
        point.setUnit(attribute.getNamedItem("units").getTextContent());
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
