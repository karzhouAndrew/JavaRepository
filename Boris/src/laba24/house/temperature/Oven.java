package laba24.house.temperature;

import laba24.house.TemperatureTreatmentAppliance;

//Электрическая плита
public class Oven extends TemperatureTreatmentAppliance {
    private static int generateId = 1;
    private final int idOven;

    public Oven(String brand, String price, boolean isTurnOn, int maxTemperature) {
        super(brand, price, isTurnOn, maxTemperature);
        idOven = generateId++;
    }

    public Oven(String brand, int maxTemperature) {
        super(brand, maxTemperature);
        idOven = generateId++;
    }

    public Oven(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idOven = generateId++;
    }

    public Oven(String brand) {
        super(brand);
        idOven = generateId++;
    }

    public int getIdOven() {
        return idOven;
    }
}
