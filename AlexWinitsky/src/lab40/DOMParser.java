package lab40;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser {
    public List<Coordinates> creatParser() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        List<Coordinates> coordinatesList = new ArrayList<>();
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File("./src/lab40/point.xml");
        try {
            doc = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element root = doc.getDocumentElement();
        NodeList nList = root.getChildNodes();

        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i) instanceof Element) {
                NodeList subList = nList.item(i).getChildNodes();
                int x = Integer.valueOf(subList.item(1).getTextContent());
                int y = Integer.valueOf(subList.item(3).getTextContent());
                Coordinates coordinate = new Coordinates(x, y, ((Element) nList.item(i)).getAttribute("units"));
                coordinatesList.add(coordinate);
            }
        }
        return coordinatesList;
    }

    public void printCoordinates(List<Coordinates> coordinates) {
        for (Coordinates coordinate : coordinates) {
            System.out.println("Координаты точки");
            System.out.println("Коордитана Х = " + coordinate.getX());
            System.out.println("Коордитана У = " + coordinate.getY());
            System.out.println("Единица измерения = " + coordinate.getUnit());
        }
    }
}
