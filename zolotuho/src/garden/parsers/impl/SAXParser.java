package garden.parsers.impl;


import garden.parsers.Parser;
import garden.plants.Bush;
import garden.plants.Plant;
import garden.plants.Tree;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXParser extends DefaultHandler implements Parser {
    private List<Plant> plants = new ArrayList<>();
    private String currentTag;

    @Override
    public List<Plant> parseXMLFile(File path) {
        List<Plant> plants = null;
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SAXParser parser = new SAXParser();
            reader.setContentHandler(parser);
            reader.parse(path.toString());
            plants = new ArrayList<>(parser.getPlants());
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return plants;
    }

    @Override
    public void startDocument() {
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        currentTag = localName;
        if (currentTag.equals("tree")) {
            plants.add(new Tree());
        }
        if (currentTag.equals("bush")) {
            plants.add(new Bush());
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String text = new String(ch, start, length);
        int lastPlantIndex = plants.size() - 1;
        if (text.trim().isEmpty()) {
            return;
        }
        if (currentTag.equals("name")) {
            plants.get(lastPlantIndex).setName(text.trim());
        }
        if (currentTag.equals("age")) {
            plants.get(lastPlantIndex).setAge(Integer.parseInt(text));
        }
        if (currentTag.equals("height")) {
            plants.get(lastPlantIndex).setHeight(Integer.parseInt(text));
        }
        if (currentTag.equals("trunkWidth")) {
            ((Tree) plants.get(lastPlantIndex)).setTrunkWidth(Integer.parseInt(text));
        }
        if (currentTag.equals("trunkQuantity")) {
            ((Bush) plants.get(lastPlantIndex)).setTrunksQuantity(Integer.parseInt(text));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
    }

    @Override
    public void endDocument() {
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
