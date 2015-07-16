package add11;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


import java.io.IOException;
import java.util.List;

public class SAXParser implements Parser {
    public List<Plant> parser() {
        List<Plant> listPlant = null;
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParserHandler saxParserHandler = new SAXParserHandler();
            reader.setContentHandler(saxParserHandler);
            InputSource source = new InputSource(XML_FILE);
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
