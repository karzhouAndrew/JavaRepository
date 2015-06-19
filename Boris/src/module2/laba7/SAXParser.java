package module2.laba7;


import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SAXParser extends Parser {

    @Override
    public List<Point> parseXML(File file) throws FileNotFoundException {
        if (super.isXML(file)) {
            return getPoints(file);
        }
        throw new FileNotFoundException(file.getPath());
    }

    private List<Point> getPoints(File file) {
        List<Point> points = null;
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParsing saxParsing = new SAXParsing();
            reader.setContentHandler(saxParsing);
            InputSource source = new InputSource(file);
            reader.parse(source);
            points = saxParsing.getPoints();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return points;
    }
}
