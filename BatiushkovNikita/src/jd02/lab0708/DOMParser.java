package jd02.lab0708;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParser implements Parser {

    @Override
    public void parsePoints(PointsList points, String path) {
        createPoints(points, getDocument(path));
    }

    public void createPoints(PointsList pointsList, Document doc) {
        NodeList nodeList = doc.getElementsByTagName("point");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            int x = Integer.parseInt(element.getElementsByTagName("x").item(0).getTextContent());
            int y = Integer.parseInt(element.getElementsByTagName("y").item(0).getTextContent());
            String unit = nodeList.item(i).getAttributes().item(0).getNodeValue();
            pointsList.addPoint(new Point(unit, x, y));
        }
    }

    public Document getDocument(String path) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document document = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            document = documentBuilder.parse(new File(path));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
