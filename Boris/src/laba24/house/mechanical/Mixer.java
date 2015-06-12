package laba24.house.mechanical;

import laba24.house.MeasurementAppliance;

//Холодильник
public class Mixer extends MeasurementAppliance {

    private static int generateId = 1;
    private final int idMixer;

    public Mixer(String brand, String price, boolean isTurnOn, int maxMeasurableValue) {
        super(brand, price, isTurnOn, maxMeasurableValue);
        idMixer = generateId++;
    }

    public Mixer(String brand, int maxMeasurableValue) {
        super(brand, maxMeasurableValue);
        idMixer = generateId++;
    }

    public Mixer(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idMixer = generateId++;
    }

    public Mixer(String brand) {
        super(brand);
        idMixer = generateId++;
    }
}
