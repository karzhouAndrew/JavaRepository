package module2.laba7.parser.sax;


import module2.laba7.other.Point;
import module2.laba7.parser.Parser;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SAXParser extends Parser {
    private List<Point> points;

    @Override
    public List<Point> parseXML(File file) throws FileNotFoundException {
        if (super.isXML(file)) {
            return getPoints(file);
        }
        throw new FileNotFoundException(file.getPath());
    }

    private List<Point> getPoints(File file) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParsing saxParsing = new SAXParsing();
            reader.setContentHandler(saxParsing);
            InputSource source = new InputSource(file.getCanonicalPath());
            reader.parse(source);
            points = saxParsing.getPoints();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return points;
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "SAXParser{" +
                "points=" + points +
                '}';
    }
}
