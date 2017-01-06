package add11;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class StAXParser implements Parser {

    public List<Plant> parser() {
        List<Plant> listPlant = new ArrayList<>();
        Plant plant = null;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(XML_FILE));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    Label currentElement = Label.valueOf(reader.getLocalName().toUpperCase());
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
                            ((Bush) plant).setAmountTrunk(Integer.valueOf(reader.getElementText()));
                            break;
                    }
                }
                if (res == reader.END_ELEMENT) {
                    Label currentElement = Label.valueOf(reader.getLocalName().toUpperCase());
                    switch (currentElement) {
                        case TREE:
                            listPlant.add(plant);
                            break;
                        case BUSH:
                            listPlant.add(plant);
                            break;
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return listPlant;
    }
}
