package laba24.house.clean;

import laba24.house.AppliancesForHimself;

//Телевизор
public class Hairdryer extends AppliancesForHimself {

    private int temperatureOfFlow;

    public Hairdryer(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int temperatureOfFlow) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer);
        this.temperatureOfFlow = temperatureOfFlow;
    }

    public Hairdryer(String cleaningThing, int temperatureOfFlow) {
        super(cleaningThing);
        this.temperatureOfFlow = temperatureOfFlow;
    }

    public Hairdryer(int temperatureOfFlow) {
        super();
        this.temperatureOfFlow = temperatureOfFlow;
    }

    public Hairdryer(){
        this(25);
    }

    public int getTemperatureOfFlow() {
        return temperatureOfFlow;
    }

    public void setTemperatureOfFlow(int temperatureOfFlow) {
        this.temperatureOfFlow = temperatureOfFlow;
    }
}
