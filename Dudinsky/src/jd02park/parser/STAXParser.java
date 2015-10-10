package jd02park.parser;

import jd02park.entity.Plant;
import jd02park.entity.PlantFactory;
import jd02park.entity.PlantKindEnum;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class STAXParser implements Parser {

    private List<Plant> plantsList;
    private PlantKindEnum kind;
    private double height;
    private Tags currentElement;

    @Override
    public List<Plant> displantParkFromXML(String inputXmlFilePath) {
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(inputXmlFilePath))) {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);
            doParsing(reader);
        } catch (XMLStreamException e) {
            System.err.println("Error occurred during parsing XML: " + inputXmlFilePath);
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + inputXmlFilePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Exception while working with file " + inputXmlFilePath);
            e.printStackTrace();
        }
        return plantsList;
    }

    private void doParsing(XMLStreamReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            int currentNodeType = reader.next();
            if (currentNodeType == XMLStreamConstants.START_ELEMENT) {
                processStartElement(reader);
            } else if (currentNodeType == XMLStreamConstants.CHARACTERS) {
                processCharacters(reader);
            } else if (currentNodeType == XMLStreamConstants.END_ELEMENT) {
                processEndElement(reader);
            }
        }
    }

    private void processStartElement(XMLStreamReader reader) {
        currentElement = Tags.valueOf(reader.getLocalName().toUpperCase());
        if (currentElement == Tags.PLANTSLIST) {
            plantsList = new ArrayList<>();
        }
    }

    private void processCharacters(XMLStreamReader reader) {
        if (reader.isWhiteSpace()) {
            return;
        }
        if (currentElement == Tags.KIND) {
            kind = PlantKindEnum.valueOf(reader.getText().toUpperCase());
        } else if (currentElement == Tags.HEIGHT) {
            height = Double.parseDouble(reader.getText());
        }
    }

    private void processEndElement(XMLStreamReader reader) {
        currentElement = Tags.valueOf(reader.getLocalName().toUpperCase());
        if (currentElement == Tags.TREE || currentElement == Tags.SHRUB) {
            plantsList.add(PlantFactory.getPlant(kind, height));
        }
    }
}