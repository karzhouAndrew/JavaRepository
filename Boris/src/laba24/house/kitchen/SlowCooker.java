package laba24.house.kitchen;

import laba24.house.AppliancesForCooking;

// Мультиварка
public class SlowCooker extends AppliancesForCooking {

    private int timeAutoCooking;
    private final String START = "Cook";

    public SlowCooker(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int temperatureLevel, int timeAutoCooking) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, temperatureLevel);
        this.timeAutoCooking = timeAutoCooking;
    }

    public SlowCooker(int temperatureLevel, int timeAutoCooking) {
        super(temperatureLevel);
        this.timeAutoCooking = timeAutoCooking;
    }

    public SlowCooker(int timeAutoCooking) {
        super();
        this.timeAutoCooking = timeAutoCooking;
    }

    public SlowCooker() {
        this(0);
    }

    public boolean cook(String start) {
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getTimeAutoCooking() {
        return timeAutoCooking;
    }

    public void setTimeAutoCooking(int timeAutoCooking) {
        this.timeAutoCooking = timeAutoCooking;
    }
}
