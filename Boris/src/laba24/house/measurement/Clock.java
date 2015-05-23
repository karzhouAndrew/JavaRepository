package laba24.house.measurement;

import laba24.house.MachineWorkingAppliance;

//Утюг
public class Clock extends MachineWorkingAppliance {

    private static int generateId = 1;
    private final int idClock;

    public Clock(String brand, String price, boolean isTurnOn, String maxVelocity) {
        super(brand, price, isTurnOn, maxVelocity);
        idClock = generateId++;
    }

    public Clock(String brand, String maxVelocity) {
        super(brand, maxVelocity);
        idClock = generateId++;
    }

    public Clock(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idClock = generateId++;
    }

    public Clock(String brand) {
        super(brand);
        idClock = generateId++;
    }

    public int getIdClock() {
        return idClock;
    }
}
