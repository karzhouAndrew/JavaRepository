package laba24;

//Бытовая техника
public abstract class HouseAppliances {
    protected boolean isSwitchOn;
    protected int frequencyUseInMonth;
    protected String manufacturer;

    public HouseAppliances(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer) {
        this.isSwitchOn = isSwitchOn;
        this.frequencyUseInMonth = frequencyUseInMonth;
        this.manufacturer = manufacturer;
    }

    public HouseAppliances() {
        this(false, 0, "Unknone");
    }

    public void switcher() {
        if (this.isSwitchOn) {
            this.isSwitchOn = false;
        } else {
            this.isSwitchOn = true;
        }
    }
}
