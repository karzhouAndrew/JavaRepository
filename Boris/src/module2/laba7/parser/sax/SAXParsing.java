package module2.laba7.parser.sax;


import module2.laba7.other.Point;
import module2.laba7.other.Tags;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXParsing extends DefaultHandler {

    private List<Point> points;
    private Point point;
    private Tags currentElement;


    @Override
    public void startDocument() throws SAXException {
        points = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
            case POINT:
                point = new Point();
                point.setUnits(attributes.getValue(0));
                break;
            case X:
                break;
            case Y:
                break;
            default:
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String element = new String(ch, start, length);
        if (currentElement == null) {
            return;
        }
        switch (currentElement) {
            case POINT:
                break;
            case X:
                point.setX(Integer.parseInt(element));
                break;
            case Y:
                point.setY(Integer.parseInt(element));
                break;
            default:
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
            case POINT:
                points.add(point);
                point = null;
                break;
            case X:
                break;
            case Y:
                break;
            default:
        }
        currentElement = null;
    }

    public List<Point> getPoints() {
        return points;
    }
}
