package lab41;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Распарсить с помощью STAX, каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
 * при этом должна выводиться единица измерения
 */
public class STAXParser {
    public static void main(String[] args) {
        boolean isX = false;
        boolean isY = false;
        List<Point> pointsList = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(
                    new FileInputStream("D:\\env\\Java\\JavaRepository_1\\tikhomirov\\src\\lab41\\PointsList.xml"));
            int i = 0;
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("point")) {
                        pointsList.add(new Point());
                        pointsList.get(i).setUnit(reader.getAttributeValue(0));
                    } else if (reader.getLocalName().equals("x")) {
                        isX = true;
                    } else if (reader.getLocalName().equals("y")) {
                        isY = true;
                    }
                } else if (res == reader.CHARACTERS) {
                    if (isX) {
                        pointsList.get(i).setX(reader.getText());
                        isX = false;
                    } else if (isY) {
                        pointsList.get(i).setY(reader.getText());
                        isY = false;
                        i++;
                    }
                }
            }
            System.out.println("The structure of the document:");
            for (Point p : pointsList) {
                System.out.println(p);
            }
        } catch (FileNotFoundException |
                XMLStreamException e) {
            e.printStackTrace();
        }
    }
}





