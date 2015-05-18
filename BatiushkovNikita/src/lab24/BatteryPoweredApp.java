package lab24;

public abstract class BatteryPoweredApp extends HomeAppliance {
    private String batteryType;
    private int charge;

    public BatteryPoweredApp(String brandName, int weight, int cost, String color, String batteryType, int charge) {
        super(brandName, weight, cost, color);
        this.batteryType = batteryType;
        this.charge = charge;
    }
}
