package lab24;

public class Flashlight extends BatteryPoweredApp implements Light {
    private String lens;

    public Flashlight(String brandName, int weight, int cost, String color, String batteryType, int charge, String lightBulb) {
        super(brandName, weight, cost, color, batteryType, charge);
        this.lens = lightBulb;
    }

    @Override
    public boolean shine() {
        return false;
    }
}
