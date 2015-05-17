package laba24.house.kitchen;

import laba24.house.AppliancesForCooking;

//Электрическая плита
public class ElectricKettler extends AppliancesForCooking {

    private int litreWater;
    private final String START = "Boil";

    public ElectricKettler(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int temperatureLevel, int litreWater) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, temperatureLevel);
        this.litreWater = litreWater;
    }

    public ElectricKettler(int temperatureLevel, int litreWater) {
        super(temperatureLevel);
        this.litreWater = litreWater;
    }

    public ElectricKettler(int litreWater) {
        super();
        this.litreWater = litreWater;
    }

    public ElectricKettler(){
        this(0);
    }

    public boolean boiling (String start){
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getLitreWater() {
        return litreWater;
    }

    public void setLitreWater(int litreWater) {
        this.litreWater = litreWater;
    }
}
