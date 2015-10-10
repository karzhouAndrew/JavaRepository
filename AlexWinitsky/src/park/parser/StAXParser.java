package park.parser;

import park.plant.Plant;
import park.plant.Bush;
import park.plant.Tree;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Master on 19.06.2015.
 */
public class StAXParser implements Parser {

    public List<Plant> parser() {
        List<Plant> listPlant = new ArrayList<>();
        Plant plant = null;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(XML_FILE_NAME));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    Tags currentElement = Tags.valueOf(reader.getLocalName().toUpperCase());
                    switch (currentElement) {
                        case TREE:
                            plant = new Tree();
                            break;
                        case BUSH:
                            plant = new Bush();
                            break;
                        case NAME:
                            plant.setName(reader.getElementText());
                            break;
                        case HEIGHT:
                            plant.setHeight(Double.valueOf(reader.getElementText()));
                            break;
                        case AGE:
                            plant.setAge(Integer.valueOf(reader.getElementText()));
                            break;
                        case SPEEDGROW:
                            plant.setSpeedGrow(Double.valueOf(reader.getElementText()));
                            break;
                        case NUMBERTRUNK:
                            ((Bush) plant).setNumberTrunk(Integer.valueOf(reader.getElementText()));
                            break;
                        default:
                    }
                }
                if (res == reader.END_ELEMENT) {
                    Tags currentElement = Tags.valueOf(reader.getLocalName().toUpperCase());
                    switch (currentElement) {
                        case TREE:
                            listPlant.add(plant);
                            break;
                        case BUSH:
                            listPlant.add(plant);
                            break;
                        default:
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return listPlant;
    }

}
