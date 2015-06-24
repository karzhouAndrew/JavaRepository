package task40_41;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParser implements Parser {
    @Override
    public PointsList parseXMLFile(File path) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        PointsList pointsList = null;
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(path);
            Element root = document.getDocumentElement();
            DOMParser parser = new DOMParser();
            pointsList = parser.doParse(root);
        } catch (ParserConfigurationException e) {
            System.out.println("Exception during configuration parser");
            e.printStackTrace();
        } catch (SAXException e) {
            System.out.println("Exception occurred during parsing");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return pointsList;
    }

    private PointsList doParse(Node root) {
        PointsList pointsList = new PointsList();
        if (isPointsList(root)) {
            if (root.hasAttributes()) {
                for (int i = 0; i < root.getAttributes().getLength(); i++) {
                    pointsList.addAttribute(root.getAttributes().item(i).toString());
                }
                if (root.hasChildNodes()) {
                    NodeList pointsListsNodes = root.getChildNodes();
                    for (int i = 0; i < pointsListsNodes.getLength(); i++) {
                        Node pointsListsNode = pointsListsNodes.item(i);
                        if (isPoint(pointsListsNode)) {
                            pointsList.addPoint(createPoint(pointsListsNode));
                        }
                    }
                }
            }
        }
        return pointsList;
    }

    private Point createPoint(Node node) {
        Point point = new Point();
        if (node.hasAttributes()) {
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                point.setUnits(node.getAttributes().item(i).getNodeValue());
            }
        }
        if (node.hasChildNodes()) {
            NodeList pointNodes = node.getChildNodes();
            for (int j = 0; j < pointNodes.getLength(); j++) {
                if (isX(pointNodes.item(j))) {
                    point.setX(Integer.parseInt(pointNodes.item(j).getTextContent()));
                }
                if (isY(pointNodes.item(j))) {
                    point.setY(Integer.parseInt(pointNodes.item(j).getTextContent()));
                }
            }
        }
        return point;
    }

    private boolean isPointsList(Node node) {
        return node.getNodeName().equals("pointsList");
    }

    private boolean isPoint(Node node) {
        return node.getNodeName().equals("point");
    }

    private boolean isX(Node node) {
        return node.getNodeName().equals("x");
    }

    private boolean isY(Node node) {
        return node.getNodeName().equals("y");
    }
}
