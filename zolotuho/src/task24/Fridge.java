package task24;

public class Fridge extends LargeHouseHold implements ControlTemperature {
    private double volume;
    private double freezingTemperature;
    private double coolingTemperature;

    public Fridge(String serialNumber, String vendorName, double weight, double width, double height, double length, double volume) {
        super(serialNumber, vendorName, weight, width, height, length);
        this.volume = volume;
    }

    @Override
    public void showState() {
        if (state) {
            System.out.println("Fridge switched On");
        } else {
            System.out.println("Fridge switched off");
        }
    }

    @Override
    public void setTemperature(double temperature) {

    }

    @Override
    public void setTemperature(double freezingTemperature, double coolingTemperature) {
        this.freezingTemperature = freezingTemperature;
        this.coolingTemperature = coolingTemperature;
    }

    public void increaseByOneDegree() {
        this.freezingTemperature++;
    }

    public void decreaseByOneDegree() {
        this.freezingTemperature--;
    }

    public boolean warningInformation() {
        if (this.freezingTemperature > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isState() {
        return state;
    }

    public double getFreezingTemperature() {
        return freezingTemperature;
    }

    public void setFreezingTemperature(double freezingTemperature) {
        freezingTemperature = freezingTemperature;
    }

    public double getCoolingTemperature() {
        return coolingTemperature;
    }

    public void setCoolingTemperature(double coolingTemperature) {
        coolingTemperature = coolingTemperature;
    }

    public void switchOn() {
        state = true;
        this.freezingTemperature = -1;
        this.coolingTemperature = 6;
    }

    public void switchOff() {
        state = false;
        this.freezingTemperature = 0;
        this.coolingTemperature = 0;
    }
}