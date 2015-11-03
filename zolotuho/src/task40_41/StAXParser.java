package task40_41;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StAXParser implements Parser {
    @Override
    public PointsList parseXMLFile(File path) {
        XMLInputFactory inputFactory = XMLInputFactory.newFactory();
        PointsList pointsList = null;
        try {
            XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileInputStream(path));
            pointsList = doParse(reader);
        } catch (IOException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (XMLStreamException e) {
            System.err.println("Exception occurred during parsing");
            e.printStackTrace();
        }
        return pointsList;
    }

    private PointsList doParse(XMLStreamReader reader) throws XMLStreamException {
        boolean isValueX = false;
        boolean isValueY = false;
        PointsList pointsList = new PointsList();
        while (reader.hasNext()) {
            int res = reader.next();
            if (res == XMLStreamReader.START_ELEMENT) {
                if (isPoint(reader)) {
                    Point point = new Point();
                    fillPointsAttributes(reader, point);
                    pointsList.addPoint(point);
                }
                if (isX(reader)) {
                    isValueX = true;
                }
                if (isY(reader)) {
                    isValueY = true;
                }
            } else if (res == XMLStreamReader.CHARACTERS) {
                if (isValueX) {
                    fillX(reader, pointsList);
                    isValueX = false;
                }
                if (isValueY) {
                    fillY(reader, pointsList);
                    isValueY = false;
                }
            }
        }
        return pointsList;
    }

    private void fillPointsAttributes(XMLStreamReader reader, Point point) {
        for (int i = 0; i < reader.getAttributeCount(); i++) {
            if (isUnits(reader, i)) {
                point.setUnits(reader.getAttributeValue(i));
            }
        }
    }

    private void fillX(XMLStreamReader reader, PointsList pointsList) {
        int lastPointsIndex = pointsList.getPoints().size() - 1;
        pointsList.getPoints().get(lastPointsIndex).setX(Integer.parseInt(reader.getText()));
    }

    private void fillY(XMLStreamReader reader, PointsList pointsList) {
        int lastPointsIndex = pointsList.getPoints().size() - 1;
        pointsList.getPoints().get(lastPointsIndex).setY(Integer.parseInt(reader.getText()));
    }

    private boolean isUnits(XMLStreamReader reader, int index) {
        return reader.getAttributeLocalName(index).equals("units");
    }

    private boolean isPoint(XMLStreamReader reader) {
        return reader.getLocalName().equals("point");
    }

    private boolean isX(XMLStreamReader reader) {
        return reader.getLocalName().equals("x");
    }

    private boolean isY(XMLStreamReader reader) {
        return reader.getLocalName().equals("y");
    }
}