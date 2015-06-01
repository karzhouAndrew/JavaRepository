package lab24;

public class Jambox extends BatteryPoweredApp {
    private int soundPower;
    private String charger;

    public Jambox(String brandName, int weight, int cost, String color, String batteryType, int charge, int soundPower, String charger) {
        super(brandName, weight, cost, color, batteryType, charge);
        this.soundPower = soundPower;
        this.charger = charger;
    }
}
