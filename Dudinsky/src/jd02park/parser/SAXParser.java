package jd02park.parser;

import jd02park.entity.Plant;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SAXParser implements Parser {

    @Override
    public List<Plant> displantParkFromXML(String inputXmlFilePath) {
        PlantsListHandler handler = new PlantsListHandler();
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(inputXmlFilePath))) {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(handler);
            reader.parse(new InputSource(inputStream));
        } catch (SAXException e) {
            System.err.println("SAX Parser exception occurred");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Exception while working with file " + inputXmlFilePath);
            e.printStackTrace();
        }
        return handler.getPlantsList();
    }
}
