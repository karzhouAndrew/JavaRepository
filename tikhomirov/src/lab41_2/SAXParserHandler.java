package lab41_2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXParserHandler extends DefaultHandler {
    private Point point = null;
    private List<Point> points = new ArrayList<>();
    private String element = "";

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing: \n");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        element = qName;
        if (element.equals("point")) {
            point = new Point();
            point.setUnit(atts.getValue("unit"));
        }
    }

    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        element = " ";
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        if (element.equals("x")) {
            point.setX(new String(ch, start, length));
        }
        if (element.equals("y")) {
            point.setY(new String(ch, start, length));
            points.add(point);
        }
    }

    public List<Point> returnPoints() {
        return points;
    }
}
