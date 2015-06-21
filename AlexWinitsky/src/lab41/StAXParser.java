package lab41;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Master on 19.06.2015.
 */
public class StAXParser {
    public List<Coordinates> createStAXparser() {
        int x = 0;
        int y = 0;
        String unit = "";
        Coordinates coordinate;
        List<Coordinates> coordinatesList = new ArrayList<>();

        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader =
                    factory.createXMLStreamReader(new FileInputStream("./src/lab41/point.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("point")) {
                        unit = reader.getAttributeValue(0);
                    }
                    if (reader.getLocalName().equals("x")) {
                        x = Integer.valueOf(reader.getElementText());
                    }
                    if (reader.getLocalName().equals("y")) {
                        y = Integer.valueOf(reader.getElementText());
                        coordinate = new Coordinates(x, y, unit);
                        coordinatesList.add(coordinate);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
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
