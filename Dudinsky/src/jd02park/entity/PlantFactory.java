package jd02park.entity;

public class PlantFactory {

    public static Plant getPlant(PlantKindEnum plantKind, double plantHeight) {
        return plantKind.createPlant(plantKind, plantHeight);
    }

}
