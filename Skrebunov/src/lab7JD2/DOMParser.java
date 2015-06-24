package lab7JD2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by PC on 24.06.2015.
 */
public class DOMParser {
    public PointList parseXML() {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder documentBuilder = null;
        Document document = null;
        try {
            documentBuilder = builderFactory.newDocumentBuilder();
            document = (Document) documentBuilder.parse(".\\Skrebunov\\lab7JD2\\src\\pl.xml");
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
        PointList points = doParsing(document);
        return points;
    }

    public PointList doParsing(Document document) {
        PointList points = new PointList();
        Element root = document.getDocumentElement();
        NodeList childCategories = root.getChildNodes();
        for (int i = 0; i < childCategories.getLength(); i++) {
            Node pointNode = childCategories.item(i);
            if (isPointNode(pointNode)) {
                Point pointList = createPoints(pointNode);
                points.addPoint(pointList);
            }
        }
        return points;
    }

    public Point createPoints(Node pointNode) {
        Point point = new Point();
        org.w3c.dom.NamedNodeMap attribute = pointNode.getAttributes();
        point.setUnit(attribute.getNamedItem("unit").getTextContent());
        NodeList childNodes = pointNode.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node name = childNodes.item(i);
            if (isXNode(name)) {
                point.setPointX(Integer.parseInt(name.getTextContent()));
            } else if (isYNode(name)) {
                point.setPointY(Integer.parseInt(name.getTextContent()));
            }
        }
        return point;
    }

    private boolean isPointNode(Node node) {
        return "point".equals(node.getNodeName());
    }

    private boolean isXNode(Node pointNode) {
        return "x".equals(pointNode.getNodeName());
    }

    private boolean isYNode(Node pointNode) {
        return "y".equals(pointNode.getNodeName());
    }

    private boolean isUnitNode(Node pointNode) {
        return "unit".equals(pointNode.getNodeName());
    }
}
