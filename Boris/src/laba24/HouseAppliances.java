package laba24;

//Бытовая техника
public class HouseAppliances {
    protected boolean isTurnOn;
    protected int frequencyUseInMonth;
    protected String manufacturer;

    public HouseAppliances(boolean isTurnOn, int frequencyUseInMonth, String manufacturer) {
        this.isTurnOn = isTurnOn;
        this.frequencyUseInMonth = frequencyUseInMonth;
        this.manufacturer = manufacturer;
    }

    public HouseAppliances() {
        this(false, 0, "Unknone");
    }

    public void switcher() {
        if (this.isTurnOn) {
            this.isTurnOn = false;
        } else {
            this.isTurnOn = true;
        }
    }
}
