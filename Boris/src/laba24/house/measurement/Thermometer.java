package laba24.house.measurement;

import laba24.house.MachineWorkingAppliance;

//Телевизор
public class Thermometer extends MachineWorkingAppliance {

    private static int generateId = 1;
    private final int idThermometer;

    public Thermometer(String brand, String price, boolean isTurnOn, String maxVelocity) {
        super(brand, price, isTurnOn, maxVelocity);
        idThermometer = generateId++;
    }

    public Thermometer(String brand, String maxVelocity) {
        super(brand, maxVelocity);
        idThermometer = generateId++;
    }

    public Thermometer(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idThermometer = generateId++;
    }

    public Thermometer(String brand) {
        super(brand);
        idThermometer = generateId++;
    }

    public int getIdThermometer() {
        return idThermometer;
    }


}
