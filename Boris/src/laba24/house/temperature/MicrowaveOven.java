package laba24.house.temperature;

import laba24.house.TemperatureTreatmentAppliance;

//Блендер

public class MicrowaveOven extends TemperatureTreatmentAppliance {

    private static int generateId = 1;
    private final int idMicrowaveOven;

    public MicrowaveOven(String brand, String price, boolean isTurnOn, int maxTemperature) {
        super(brand, price, isTurnOn, maxTemperature);
        idMicrowaveOven = generateId++;
    }

    public MicrowaveOven(String brand, int maxTemperature) {
        super(brand, maxTemperature);
        idMicrowaveOven = generateId++;
    }

    public MicrowaveOven(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idMicrowaveOven = generateId++;
    }

    public MicrowaveOven(String brand) {
        super(brand);
        idMicrowaveOven = generateId++;
    }

    public int getIdMicrowaveOven() {
        return idMicrowaveOven;
    }
}
