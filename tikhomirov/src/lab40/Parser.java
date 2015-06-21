package lab40;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Распарсить с помощью DOM, каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных
 * запятой, при этом должна выводиться единица измерения.
 */
public class Parser {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File("D:\\env\\Java\\JavaRepository_1\\tikhomirov\\src\\lab40\\PointsList.xml");
        try {
            document = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element root = document.getDocumentElement();
        System.out.println("The document " + root.getTagName() + " structure:");
        NodeList nodeList = root.getElementsByTagName("point");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodePoints = nodeList.item(i);
            if (nodePoints.getNodeType() == Node.ELEMENT_NODE) {
                Element ePoint = (Element) nodePoints;
                pointList.add(new Point());
                pointList.get(i).setX(ePoint.getElementsByTagName("x").item(0).getTextContent());
                pointList.get(i).setY(ePoint.getElementsByTagName("y").item(0).getTextContent());
                pointList.get(i).setUnit(ePoint.getAttribute("unit"));
            }
        }
        Iterator<Point> iterator = pointList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
