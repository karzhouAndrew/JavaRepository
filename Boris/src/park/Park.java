package park;


import park.parser.Parser;
import park.parser.dom.DOMParser;
import park.plant.Plant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Park {
    private List<Plant> plants;

    public Park() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void growParkFromXML(File file) {
        Parser parser = new DOMParser();
        try {
            parser.parseXML(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        plants.addAll(parser.getPlants());
    }

    public void grow() {
        for (Plant plant : plants) {
            plant.grow();
        }
    }

    public String seePlantsInPark() {
        return Arrays.toString(plants.toArray());
    }
}
