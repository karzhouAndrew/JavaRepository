package add11;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserDOM implements Parser {
    public Document createParser() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        File file = new File(XML_FILE);
        try {
            doc = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public List<Plant> parser() {
        Document doc = createParser();
        Element root = doc.getDocumentElement();
        NodeList nList = root.getChildNodes();
        Plant plant = null;
        List<Plant> listPlant = new ArrayList<>();

        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i) instanceof Element) {
                NodeList subList = nList.item(i).getChildNodes();
                if (((Element) nList.item(i)).getTagName().compareTo("bush") == 0) {
                    plant = new Bush();
                }
                if (((Element) nList.item(i)).getTagName().compareTo("tree") == 0) {
                    plant = new Tree();
                }
                for (int j = 0; j < subList.getLength(); j++) {
                    if (subList.item(j) instanceof Element) {
                        if (((Element) subList.item(j)).getTagName().compareTo("name") == 0) {
                            plant.setName(subList.item(j).getTextContent());
                        }
                        if (((Element) subList.item(j)).getTagName().compareTo("height") == 0) {
                            plant.setHeight(Double.valueOf(subList.item(j).getTextContent()));
                        }
                        if (((Element) subList.item(j)).getTagName().compareTo("age") == 0) {
                            plant.setAge(Integer.valueOf(subList.item(j).getTextContent()));
                        }
                        if (((Element) subList.item(j)).getTagName().compareTo("speedGrow") == 0) {
                            plant.setSpeedGrow(Double.valueOf(subList.item(j).getTextContent()));
                        }
                        if (((Element) subList.item(j)).getTagName().compareTo("numberTrunk") == 0) {
                            ((Bush) plant).setAmountTrunk(Integer.valueOf(subList.item(j).getTextContent()));
                        }
                    }
                }
                listPlant.add(plant);
            }
        }
        return listPlant;
    }
}
