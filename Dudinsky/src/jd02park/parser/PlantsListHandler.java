package jd02park.parser;

import jd02park.entity.Plant;
import jd02park.entity.PlantFactory;
import jd02park.entity.PlantKindEnum;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class PlantsListHandler extends DefaultHandler {

    private List<Plant> plantsList;
    private PlantKindEnum kind;
    private double height;
    private Tags currentElement;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentElement = Tags.valueOf(localName.toUpperCase());
        if (currentElement == Tags.PLANTSLIST) {
            plantsList = new ArrayList<>();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String tegBody = new String(ch, start, length).trim();
        if (tegBody.isEmpty()) {
            return;
        }
        if (currentElement == Tags.KIND) {
            kind = PlantKindEnum.valueOf(tegBody.toUpperCase());
        } else if (currentElement == Tags.HEIGHT) {
            height = Double.parseDouble(tegBody);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        currentElement = Tags.valueOf(localName.toUpperCase());
        if (currentElement == Tags.TREE || currentElement == Tags.SHRUB) {
            plantsList.add(PlantFactory.getPlant(kind, height));
        }
    }

    public List<Plant> getPlantsList() {
        return plantsList;
    }
}
