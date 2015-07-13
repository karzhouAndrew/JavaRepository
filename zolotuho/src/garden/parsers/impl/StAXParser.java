package garden.parsers.impl;


import garden.parsers.Parser;
import garden.plants.Bush;
import garden.plants.Plant;
import garden.plants.Tree;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StAXParser implements Parser {

    @Override
    public List<Plant> parseXMLFile(File path) {
        XMLInputFactory inputFactory = XMLInputFactory.newFactory();
        List<Plant> plants = new ArrayList<>();
        try {
            XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileInputStream(path));
            plants = doParse(reader);
        } catch (IOException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (XMLStreamException e) {
            System.err.println("Exception occurred during parsing");
            e.printStackTrace();
        }
        return plants;
    }

    private List<Plant> doParse(XMLStreamReader reader) throws XMLStreamException {

        boolean isValueName = false;
        boolean isValueAge = false;
        boolean isValueHeight = false;
        boolean isValueTrunkWidth = false;
        boolean isValueTrunkQuantity = false;

        List<Plant> plants = new ArrayList<>();
        while (reader.hasNext()) {
            int res = reader.next();
            if (res == XMLStreamReader.START_ELEMENT) {
                if (isTree(reader)) {
                    plants.add(new Tree());
                }
                if (isBush(reader)) {
                    plants.add(new Bush());
                }
                if (isName(reader)) {
                    isValueName = true;
                }
                if (isAge(reader)) {
                    isValueAge = true;
                }
                if (isHeight(reader)) {
                    isValueHeight = true;
                }
                if (isTrunkWidth(reader)) {
                    isValueTrunkWidth = true;
                }
                if (isTrunkQuantity(reader)) {
                    isValueTrunkQuantity = true;
                }

            } else if (res == XMLStreamReader.CHARACTERS) {
                if (isValueName) {
                    fillName(reader, plants);
                    isValueName = false;
                }
                if (isValueAge) {
                    fillAge(reader, plants);
                    isValueAge = false;
                }
                if (isValueHeight) {
                    fillHeight(reader, plants);
                    isValueHeight = false;
                }
                if (isValueTrunkWidth) {
                    fillTrunkWidth(reader, plants);
                    isValueTrunkWidth = false;
                }
                if (isValueTrunkQuantity) {
                    fillTrunkQuantity(reader, plants);
                    isValueTrunkQuantity = false;
                }
            }
        }
        return plants;
    }

    private void fillName(XMLStreamReader reader, List<Plant> plants) {
        int lastPlantIndex = plants.size() - 1;
        plants.get(lastPlantIndex).setName(reader.getText());
    }

    private void fillAge(XMLStreamReader reader, List<Plant> plants) {
        int lastPlantIndex = plants.size() - 1;
        plants.get(lastPlantIndex).setAge(Integer.parseInt(reader.getText()));
    }

    private void fillHeight(XMLStreamReader reader, List<Plant> plants) {
        int lastPlantIndex = plants.size() - 1;
        plants.get(lastPlantIndex).setHeight(Integer.parseInt(reader.getText()));
    }

    private void fillTrunkWidth(XMLStreamReader reader, List<Plant> plants) {
        int lastPlantIndex = plants.size() - 1;
        ((Tree) (plants.get(lastPlantIndex))).setTrunkWidth(Integer.parseInt(reader.getText()));
    }

    private void fillTrunkQuantity(XMLStreamReader reader, List<Plant> plants) {
        int lastPlantIndex = plants.size() - 1;
        ((Bush) (plants.get(lastPlantIndex))).setTrunksQuantity(Integer.parseInt(reader.getText()));
    }


    private boolean isTree(XMLStreamReader reader) {
        return reader.getLocalName().equals("tree");
    }

    private boolean isBush(XMLStreamReader reader) {
        return reader.getLocalName().equals("bush");
    }

    private boolean isName(XMLStreamReader reader) {
        return reader.getLocalName().equals("name");
    }

    private boolean isAge(XMLStreamReader reader) {
        return reader.getLocalName().equals("age");
    }

    private boolean isHeight(XMLStreamReader reader) {
        return reader.getLocalName().equals("height");
    }

    private boolean isTrunkWidth(XMLStreamReader reader) {
        return reader.getLocalName().equals("trunkWidth");
    }

    private boolean isTrunkQuantity(XMLStreamReader reader) {
        return reader.getLocalName().equals("trunkQuantity");
    }
}
