package task24;

public class Laptop extends ComputerFacilities {
    private int batteryCapacity;

    public Laptop(String brand, double processorPower, int batteryCapacity) {
        super(brand, processorPower);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
