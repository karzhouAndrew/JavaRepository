package park;


import park.plant.Plant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrowPark {
    private List<Plant> plants;

    public GrowPark() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
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
