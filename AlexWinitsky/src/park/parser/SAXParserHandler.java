package park.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import park.plant.Plant;
import park.plant.Bush;
import park.plant.Tree;

import java.util.ArrayList;
import java.util.List;

class SAXParserHandler extends DefaultHandler {

    private List<Plant> listPlant = new ArrayList<>();
    private Plant plant;
    private Tags currentElement;


    @Override
    public void startDocument() throws SAXException {
        listPlant.clear();
    }

    @Override
    public void startElement(String nsURI, String localName, String qName,
                             Attributes attrs) throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
            case TREE:
                plant = new Tree();
                break;

            case BUSH:
                plant = new Bush();
                break;
            default:
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        String value = new String(ch, start, length);
        if (currentElement == null) {
            return;
        }
        switch (currentElement) {
            case NAME:
                plant.setName(value);
                break;
            case HEIGHT:
                plant.setHeight(Double.valueOf(value));
                break;
            case AGE:
                plant.setAge(Integer.valueOf(value));
                break;
            case SPEEDGROW:
                plant.setSpeedGrow(Double.valueOf(value));
                break;
            case NUMBERTRUNK:
                ((Bush) plant).setNumberTrunk(Integer.valueOf(value));
                break;
            default:
        }
    }

    @Override
    public void endElement(String nsURI, String localName, String qName)
            throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
            case TREE:
                listPlant.add(plant);
                break;

            case BUSH:
                listPlant.add(plant);
                break;
            default:
        }
        currentElement = null;
    }

    public List<Plant> getListPlant() {
        return listPlant;
    }

}