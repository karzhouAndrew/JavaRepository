package laba24.house;

import laba24.HouseAppliances;

//Кухонная техника
public class AppliancesForCooking extends HouseAppliances {
    protected int temperatureLevel;
    private final static int ROOM_TEMPERATURE = 25;

    public AppliancesForCooking(boolean isTurnOn, int frequencyUseInMonth, String manufacturer, int temperatureLevel) {
        super(isTurnOn, frequencyUseInMonth, manufacturer);
        this.temperatureLevel = temperatureLevel;
    }

    public AppliancesForCooking(int temperatureLevel) {
        super();
        this.temperatureLevel = temperatureLevel;
    }

    public AppliancesForCooking() {
        this(ROOM_TEMPERATURE);
    }


}
