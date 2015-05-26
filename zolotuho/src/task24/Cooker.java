package task24;

public abstract class Cooker extends LargeHouseHold {
    private int numberCookerPlates;
    private double temperature;

    public Cooker(String serialNumber, String vendorName, double weight, double width, double height, double length, int numberCookerPlates) {
        super(serialNumber, vendorName, weight, width, height, length);
        this.numberCookerPlates = numberCookerPlates;
    }

    public Cooker(double weight, double width, double height, double length, int numberCookerPlates, double temperature) {
        super(weight, width, height, length);
        this.numberCookerPlates = 4;
        this.temperature = 0;
    }

    public int getNumberCookerPlates() {
        return numberCookerPlates;
    }

    public void setNumberCookerPlates(int numberCookerPlates) {
        this.numberCookerPlates = numberCookerPlates;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Cooker() {
        super();
        this.numberCookerPlates = 4;
        this.temperature = 0;
    }

    public void switchOn() {
        state = true;
        this.temperature = 100;
    }

    public void switchOff() {
        state = false;
        this.temperature = 0;
    }
}