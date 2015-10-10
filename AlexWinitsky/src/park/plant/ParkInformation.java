package park.plant;

import park.plant.Plant;

import java.util.List;

/**
 * Created by Master on 22.06.2015.
 */
public class ParkInformation {
    public int calculateTrees(List<Plant> listPlant) {
        int count = 0;
        for (Plant plant : listPlant) {
            if (plant.getAge() > 30) {
                count++;
            }
        }
        return count;
    }

    public int calculateBushes(List<Plant> listPlant) {
        int count = 0;
        for (Plant plant : listPlant) {
            if (plant.getAge() < 50) {
                count++;
            }
        }
        return count;
    }

    public double calculateHeightPlants(List<Plant> listPlant) {
        double height = 0;
        for (Plant plant : listPlant) {
            height = height + plant.getHeight();
        }
        return height;
    }


    public void printListPalnt(List<Plant> listPlant) {
        for (Plant plant : listPlant) {
            System.out.println(plant);
        }
    }
}

