package laba24.house.mechanical;

import laba24.house.MeasurementAppliance;

//Стиральная машина
public class MeatGrinder extends MeasurementAppliance {

    private static int generateId = 1;
    private final int idMeatGrinder;

    public MeatGrinder(String brand, String price, boolean isTurnOn, int maxMeasurableValue) {
        super(brand, price, isTurnOn, maxMeasurableValue);
        idMeatGrinder = generateId++;
    }

    public MeatGrinder(String brand, int maxMeasurableValue) {
        super(brand, maxMeasurableValue);
        idMeatGrinder = generateId++;
    }

    public MeatGrinder(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
        idMeatGrinder = generateId++;
    }

    public MeatGrinder(String brand) {
        super(brand);
        idMeatGrinder = generateId++;
    }

    public int getIdMeatGrinder() {
        return idMeatGrinder;
    }
}
