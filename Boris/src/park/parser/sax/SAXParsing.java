package park.parser.sax;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import park.parser.Tags;
import park.plant.Plant;
import park.plant.bush.Bush;
import park.plant.bush.BushEnum;
import park.plant.tree.Tree;
import park.plant.tree.TreeEnum;

import java.util.ArrayList;
import java.util.List;

public class SAXParsing extends DefaultHandler {

    private List<Plant> plants;
    private Bush bush;
    private Tree tree;
    private Tags currentElement;
    private boolean isBushTagNow;
    private boolean isTreeTagNow;


    @Override
    public void startDocument() throws SAXException {
        plants = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
//            case SORT:
//                break;
//            case HEIGHT:
//                break;
//            case THICKNESS:
//                break;
//            case THUNKSQUANTITY:
//                break;
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

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String element = new String(ch, start, length);
        if (currentElement == null) {
            return;
        }
        switch (currentElement) {
            case SORT:
                if (isBushTagNow) {
                    bush = BushEnum.valueOf(element.toUpperCase()).getBush();
                } else if (isTreeTagNow) {
                    tree = TreeEnum.valueOf(element.toUpperCase()).getTree();
                }
                break;
            case HEIGHT:
                if (isBushTagNow) {
                    bush.setHeight(Double.parseDouble(element));
                } else if (isTreeTagNow) {
                    tree.setHeight(Double.parseDouble(element));
                }
                break;
            case THICKNESS:
                tree.setThickness(Double.parseDouble(element));
                break;
            case THUNKSQUANTITY:
                bush.setThunksQuantity(Integer.parseInt(element));
                break;
//            case BUSH:
//                isBushTagNow = true;
//                break;
//            case TREE:
//                isTreeTagNow = true;
//                break;
//            case PLANTS:
//                plants = new ArrayList<>();
//                break;
            default:
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentElement = Tags.valueOf(localName.toUpperCase());
        switch (currentElement) {
//            case SORT:
//                break;
//            case HEIGHT:
//                break;
//            case THICKNESS:
//                break;
//            case THUNKSQUANTITY:
//                break;
            case BUSH:
                plants.add(bush);
                isBushTagNow = false;
                break;
            case TREE:
                plants.add(tree);
                isTreeTagNow = false;
                break;
//            case PLANTS:
//                break;
            default:
                break;
        }
        currentElement = null;
    }

    public List<Plant> getPlants() {
        return plants;
    }
}
