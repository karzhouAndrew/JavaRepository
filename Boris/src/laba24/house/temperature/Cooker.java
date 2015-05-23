package laba24.house.temperature;

import laba24.house.TemperatureTreatmentAppliance;

// Мультиварка
public class Cooker extends TemperatureTreatmentAppliance {
    private static int generateId = 1;
    private final int idCooker;

    public Cooker(String brand, String price, boolean isTurnOn, int maxTemperature) {
        super(brand, price, isTurnOn, maxTemperature);
        idCooker = generateId++;
    }

    public Cooker(String brand, int maxTemperature) {
        super(brand, maxTemperature);
        idCooker = generateId++;
    }

    public Cooker(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idCooker = generateId++;
    }

    public Cooker(String brand) {
        super(brand);
        idCooker = generateId++;
    }

    public int getIdCooker() {
        return idCooker;
    }
}
