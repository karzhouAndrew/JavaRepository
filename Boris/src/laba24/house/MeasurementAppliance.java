package laba24.house;

import laba24.HouseAppliances;

public abstract class MeasurementAppliance extends HouseAppliances {
    private int maxMeasurableValue;


    public MeasurementAppliance(String brand, String price, boolean isTurnOn, int maxMeasurableValue) {
        super(brand, price, isTurnOn);
        this.maxMeasurableValue = maxMeasurableValue;
    }

    public MeasurementAppliance(String brand, int maxMeasurableValue) {
        super(brand);
        this.maxMeasurableValue = maxMeasurableValue;
    }

    public MeasurementAppliance(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
    }

    public MeasurementAppliance(String brand) {
        super(brand);
    }

    public int getMaxMeasurableValue() {
        return maxMeasurableValue;
    }

    public void setMaxMeasurableValue(int maxMeasurableValue) {
        this.maxMeasurableValue = maxMeasurableValue;
    }


}
