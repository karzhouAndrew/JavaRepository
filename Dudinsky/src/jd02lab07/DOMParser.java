package jd02lab07;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParser {

    final String CHILD_TAG_NAME = "point";
    final String CHILD_ATTRIBUTE_NAME = "unit";
    final String FIRST_GRANDCHILD = "x";
    final String SECOND_GRANDCHILD = "y";

    public PointsList parseXML(String inputXmlFilePath) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = null;
        Document document = null;
        try {
            documentBuilder = builderFactory.newDocumentBuilder();
            document = documentBuilder.parse(inputXmlFilePath);
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
        return doParsing(document);
    }

    private PointsList doParsing(Document document) {
        PointsList pointsList = new PointsList(new ArrayList<Point>());
        Element pointsListRoot = document.getDocumentElement();
        NodeList childNodes = pointsListRoot.getElementsByTagName(CHILD_TAG_NAME);
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node currentChild = childNodes.item(i);
            Point currentPoint = createPoint(currentChild);
            pointsList.add(currentPoint);
        }
        return pointsList;
    }

    private Point createPoint(Node pointNode) {
        Point point = new Point();
        Element pointElement = (Element) pointNode;
        point.setUnit(pointElement.getAttribute(CHILD_ATTRIBUTE_NAME));
        NodeList grandChildNodes = pointNode.getChildNodes();
        for (int i = 0; i < grandChildNodes.getLength(); i++) {
            Node currentGrandChild = grandChildNodes.item(i);
            if (isXNode(currentGrandChild)) {
                point.setX(Double.parseDouble(currentGrandChild.getTextContent()));
            }
            if (isYNode(currentGrandChild)) {
                point.setY(Double.parseDouble(currentGrandChild.getTextContent()));
            }
        }
        return point;
    }

    private boolean isXNode(Node grandChild) {
        return FIRST_GRANDCHILD.equals(grandChild.getNodeName());
    }

    private boolean isYNode(Node grandChild) {
        return SECOND_GRANDCHILD.equals(grandChild.getNodeName());
    }
}