package park.parser.sax;


import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import park.parser.Parser;
import park.plant.Plant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SAXParser extends Parser {

    @Override
    public void parseXML(File file) throws FileNotFoundException {
        if (super.isXML(file)) {
            super.plants = getPlants(file);
            return;
        }
        throw new FileNotFoundException(file.getPath());
    }

    private List<Plant> getPlants(File file) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParsing saxParsing = new SAXParsing();
            reader.setContentHandler(saxParsing);
            InputSource source = new InputSource(file.getCanonicalPath());
            reader.parse(source);
            plants = saxParsing.getPlants();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plants;
    }
}
