package module2.laba7.parser.dom;


import module2.laba7.parser.Parser;
import module2.laba7.other.Point;
import module2.laba7.other.Tags;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser extends Parser {

    @Override
    public List<Point> parseXML(File file) throws FileNotFoundException {
        if (super.isXML(file)) {
            return getPoints(file);
        }
        throw new FileNotFoundException(file.getPath());
    }

    private List<Point> getPoints(File file) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        Document document = null;
        try {
            document = builderFactory.newDocumentBuilder().parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getPointFromDocument(document);
    }

    private List<Point> getPointFromDocument(Document document) {
        List<Point> points = new ArrayList<>();
        Element rootElement = document.getDocumentElement();
        NodeList childNodes = rootElement.getElementsByTagName(Tags.POINT.getName());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            points.add(createPoint((Element) node));
        }
        return points;
    }

    private Point createPoint(Element element) {
        Point point = new Point();
        point.setUnits(element.getAttribute(Tags.UNITS.getName()));
        setPoint(element, point);
        return point;
    }

    private void setPoint(Element element, Point point) {
        point.setX(getX(element.getElementsByTagName(Tags.X.getName()).item(0)));
        point.setY(getY(element.getElementsByTagName(Tags.Y.getName()).item(0)));
    }

    private int getX(Node node) {
        return Integer.parseInt(node.getTextContent());
    }

    private int getY(Node node) {
        return Integer.parseInt(node.getLastChild().getTextContent());
    }

}
