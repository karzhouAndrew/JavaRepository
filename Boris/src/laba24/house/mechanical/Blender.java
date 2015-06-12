package laba24.house.mechanical;

import laba24.house.MeasurementAppliance;

//Эдектрическая плита
public class Blender extends MeasurementAppliance {

    private static int generateId = 1;
    private final int idBlender;

    public Blender(String brand, String price, boolean isTurnOn, int maxMeasurableValue) {
        super(brand, price, isTurnOn, maxMeasurableValue);
        idBlender = generateId++;
    }

    public Blender(String brand, int maxMeasurableValue) {
        super(brand, maxMeasurableValue);
        idBlender = generateId++;
    }

    public Blender(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idBlender = generateId++;
    }

    public Blender(String brand) {
        super(brand);
        idBlender = generateId++;
    }

    public int getIdBlender() {
        return idBlender;
    }
}

