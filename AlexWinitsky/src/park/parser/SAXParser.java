package park.parser;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import park.plant.Plant;

import java.io.IOException;
import java.util.List;

/**
 * Created by Master on 22.06.2015.
 */
public class SAXParser implements Parser {
    public List<Plant> parser() {
        List<Plant> listPlant = null;
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParserHandler saxParserHandler = new SAXParserHandler();
            reader.setContentHandler(saxParserHandler);
            InputSource source = new InputSource(XML_FILE_NAME);
            reader.parse(source);
            listPlant = saxParserHandler.getListPlant();

        } catch (SAXException e) {
            System.out.println("ParsingException");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ParsingException");
            e.printStackTrace();
        }
        return listPlant;
    }

}
