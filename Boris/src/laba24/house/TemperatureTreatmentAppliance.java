package laba24.house;

import laba24.HouseAppliances;

public abstract class TemperatureTreatmentAppliance extends HouseAppliances {
    private int maxTemperature;

    public TemperatureTreatmentAppliance(String brand, String price, boolean isTurnOn, int maxTemperature) {
        super(brand, price, isTurnOn);
        this.maxTemperature = maxTemperature;
    }

    public TemperatureTreatmentAppliance(String brand, int maxTemperature) {
        super(brand);
        this.maxTemperature = maxTemperature;
    }

    public TemperatureTreatmentAppliance(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
    }

    public TemperatureTreatmentAppliance(String brand) {
        super(brand);
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
