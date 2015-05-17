package laba24.house.kitchen;

import laba24.house.AppliancesForCooking;

//Блендер

public class Blender extends AppliancesForCooking {

    private int frequency;
    private final String START = "Rotate";

    public Blender(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int temperatureLevel, int frequency) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, temperatureLevel);
        this.frequency = frequency;
    }

    public Blender(int temperatureLevel, int frequency) {
        super(temperatureLevel);
        this.frequency = frequency;
    }

    public Blender(int frequency) {
        super();
        this.frequency = frequency;
    }

    public Blender (){
        this(0);
    }

    public boolean rotate (String start){
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
