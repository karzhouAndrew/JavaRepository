package park.parser.stax;


import park.parser.Parser;
import park.parser.Tags;
import park.plant.Plant;
import park.plant.bush.Bush;
import park.plant.bush.BushEnum;
import park.plant.tree.Tree;
import park.plant.tree.TreeEnum;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StAXParser extends Parser {
    private List<Plant> plants;
    private boolean isBushTagNow;
    private boolean isTreeTagNow;
    private boolean isSortTagNow;
    private boolean isHeightTagNow;
    private boolean isThicknessTagNow;
    private boolean isThunksQuantityTagNow;
    private Bush bush;
    private Tree tree;


    @Override
    public void parseXML(File file) throws FileNotFoundException {
        plants = null;
        InputStream inputStream = null;
        XMLStreamReader xmlStreamReader;
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            inputStream = new FileInputStream(file);
            xmlStreamReader = xmlInputFactory.createXMLStreamReader(inputStream);
            parsing(xmlStreamReader);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("IO exception");
                }
            }
        }
    }

    private void parsing(XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            int nodeType = xmlStreamReader.next();
            switch (nodeType) {
                case XMLStreamConstants.START_ELEMENT:
                    processStartElement(xmlStreamReader);
                    break;
                case XMLStreamConstants.CHARACTERS:
                    processSet(xmlStreamReader);
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    processEndElement(xmlStreamReader);
                    break;
                default:
                    break;
            }
        }
    }


    private void processEndElement(XMLStreamReader xmlStreamReader) {
        if (xmlStreamReader.isWhiteSpace()) {
            return;
        }
        Tags currentElement = Tags.valueOf(xmlStreamReader.getLocalName().toUpperCase());
        switch (currentElement) {
            case SORT:
                isSortTagNow = false;
                break;
            case HEIGHT:
                isHeightTagNow = false;
                break;
            case THICKNESS:
                isThicknessTagNow = false;
                break;
            case THUNKSQUANTITY:
                isThunksQuantityTagNow = false;
                break;
            case BUSH:
                isBushTagNow = false;
                plants.add(bush);
                break;
            case TREE:
                isTreeTagNow = false;
                plants.add(tree);
                break;
            case PLANTS:
                super.plants = plants;
                break;
            default:
                break;
        }
    }

    private void processSet(XMLStreamReader xmlStreamReader) throws XMLStreamException {
        if (xmlStreamReader.isWhiteSpace()) {
            return;
        }
        if (isSortTagNow) {
            if (isBushTagNow) {
                bush = BushEnum.valueOf(xmlStreamReader.getText().toUpperCase()).getBush();
            } else if (isTreeTagNow) {
                tree = TreeEnum.valueOf(xmlStreamReader.getText().toUpperCase()).getTree();
            }
        }
        if (isHeightTagNow) {
            if (isBushTagNow) {
                bush.setHeight(Double.parseDouble(xmlStreamReader.getText()));
            } else if (isTreeTagNow) {
                tree.setHeight(Double.parseDouble(xmlStreamReader.getText()));
            }
        }
        if (isThunksQuantityTagNow) {
            bush.setThunksQuantity(Integer.parseInt(xmlStreamReader.getText()));
        }
        if (isThicknessTagNow) {
            tree.setThickness(Integer.parseInt(xmlStreamReader.getText()));
        }
    }

    private void processStartElement(XMLStreamReader xmlStreamReader) {
        if (xmlStreamReader.isWhiteSpace()) {
            return;
        }
        Tags currentElement = Tags.valueOf(xmlStreamReader.getLocalName().toUpperCase());
        switch (currentElement) {
            case SORT:
                isSortTagNow = true;
                break;
            case HEIGHT:
                isHeightTagNow = true;
                break;
            case THICKNESS:
                isThicknessTagNow = true;
                break;
            case THUNKSQUANTITY:
                isThunksQuantityTagNow = true;
                break;
            case BUSH:
                isBushTagNow = true;
                break;
            case TREE:
                isTreeTagNow = true;
                break;
            case PLANTS:
                plants = new ArrayList<>();
                break;
            default:
                break;
        }
    }
}
