package laba24.house.measurement;

import laba24.house.MachineWorkingAppliance;

public class WeightingMachine extends MachineWorkingAppliance {

    private static int generateId = 1;
    private final int idWeightingMachine;

    public WeightingMachine(String brand, String price, boolean isTurnOn, String maxVelocity) {
        super(brand, price, isTurnOn, maxVelocity);
        idWeightingMachine = generateId;
    }

    public WeightingMachine(String brand, String maxVelocity) {
        super(brand, maxVelocity);
        idWeightingMachine = generateId;
    }

    public WeightingMachine(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idWeightingMachine = generateId;
    }

    public WeightingMachine(String brand) {
        super(brand);
        idWeightingMachine = generateId;
    }

    public int getIdWeightingMachine() {
        return idWeightingMachine;
    }
}
