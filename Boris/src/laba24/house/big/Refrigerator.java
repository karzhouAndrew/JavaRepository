package laba24.house.big;

import laba24.house.BigAppliances;

//Холодильник
public class Refrigerator extends BigAppliances {

    private int volume;
    private final String START = "Freeze";

    public Refrigerator(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int weight, int volume) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, weight);
        this.volume = volume;
    }

    public Refrigerator(int weight, int volume) {
        super(weight);
        this.volume = volume;
    }

    public Refrigerator(int volume) {
        super();
        this.volume = volume;
    }

    public Refrigerator() {
        this(0);
    }

    public boolean freeze(String start) {
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
