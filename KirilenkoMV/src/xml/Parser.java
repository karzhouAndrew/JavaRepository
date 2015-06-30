package xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by asus on 21.06.2015.
 * Написать программу, котрая будет разбирать xml файл при помощи DOM, StAX
 */
public class Parser {
    public static void main(String[] args) {
        File file = new File("KirilenkoMV\\src\\xml\\Ex4.xml");
        PointList points = domParser(file);
        points.print();
        points.clear();
        System.out.println();
        points = staxParse(file);
        points.print();

    }

    public static PointList domParser(File file) {
        PointList points = new PointList();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document document = null;

        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        try {
            document = documentBuilder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NodeList nodeList = document.getElementsByTagName("point");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element pointDetail = (Element) nodeList.item(i);
            Integer x = Integer.parseInt(pointDetail.getElementsByTagName("x").item(0).getTextContent());
            Integer y = Integer.parseInt(pointDetail.getElementsByTagName("y").item(0).getTextContent());
            String unit = nodeList.item(i).getAttributes().item(0).getNodeValue();
            points.put(new Point(x, y, unit));
        }
        return points;
    }

    public static PointList staxParse(File file) {
        PointList points = new PointList();
        Integer x = null;
        Integer y = null;
        String unit = null;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(file));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("x")) {
                        x = Integer.parseInt(reader.getElementText());
                    }
                    if (reader.getLocalName().equals("y")) {
                        y = Integer.parseInt(reader.getElementText());
                    }
                    if (reader.getLocalName().equals("point")) {
                        unit = reader.getAttributeValue(0);
                    }
                }
                if (x != null && y != null && unit != null) {
                    points.put(new Point(x, y, unit));
                    x = null;
                    y = null;
                    unit = null;
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return points;
    }
}
