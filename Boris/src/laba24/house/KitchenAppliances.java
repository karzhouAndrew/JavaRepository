package laba24.house;

import laba24.HouseAppliances;

//Кухонная техника
public class KitchenAppliances extends HouseAppliances {
    protected int temperatureLevel;
    private final static int ROOM_TEMPERATURE = 25;

    public KitchenAppliances(boolean isTurnOn, int frequencyUseInMonth, String manufacturer, int temperatureLevel) {
        super(isTurnOn, frequencyUseInMonth, manufacturer);
        this.temperatureLevel = temperatureLevel;
    }

    public KitchenAppliances(int temperatureLevel) {
        super();
        this.temperatureLevel = temperatureLevel;
    }

    public KitchenAppliances() {
        this(ROOM_TEMPERATURE);
    }


}
