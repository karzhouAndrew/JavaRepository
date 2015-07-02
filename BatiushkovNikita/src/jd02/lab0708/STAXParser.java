package jd02.lab0708;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class STAXParser implements Parser {

    @Override
    public void parsePoints(PointsList pointsList, String path) {
        String unit = "";
        int x = 0;
        int y = 0;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(path));
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("point")) {
                        unit = reader.getAttributeValue(0);
                    }
                    if (reader.getLocalName().equals("x")) {
                        x = Integer.parseInt(reader.getElementText());
                    }
                    if (reader.getLocalName().equals("y")) {
                        y = Integer.parseInt(reader.getElementText());
                        pointsList.addPoint(new Point(unit, x, y));
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}