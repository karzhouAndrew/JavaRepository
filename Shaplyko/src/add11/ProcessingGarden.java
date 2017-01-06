package add11;

import java.util.List;

public class ProcessingGarden {
    public int amountTrees(List<Plant> listPlant) {
        int count = 0;
        for (int i = 0; i < listPlant.size(); i++) {
            if (listPlant.get(i) instanceof Tree) {
                count++;
            }
        }


        return count;
    }

    public int amountBushes(List<Plant> listPlant) {
        int count = 0;
        for (int i = 0; i < listPlant.size(); i++) {
            if (listPlant.get(i) instanceof Bush) {
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


    public void printPlant(List<Plant> listPlant) {
        for (Plant plant : listPlant) {
            System.out.println(plant);
        }
    }
}
