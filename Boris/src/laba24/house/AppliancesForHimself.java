package laba24.house;

import laba24.HouseAppliances;

//Техника для развлечения.
public abstract class AppliancesForHimself extends HouseAppliances {
    protected String cleaningThing;

    public AppliancesForHimself(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer);
    }

    public AppliancesForHimself(String cleaningThing) {
        super();
        this.cleaningThing = cleaningThing;
    }

    public AppliancesForHimself(){
        this("No determine");
    }
}
