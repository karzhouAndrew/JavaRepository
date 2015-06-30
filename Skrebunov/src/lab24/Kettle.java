package lab24;

/**
 * Created by PC on 24.06.2015.
 */
public class Kettle extends HouseholdAppliances {
    private String heatingElementType;
    private int temperature;

    public Kettle() {
    }

    public Kettle(String brandName, int weight, String heatingElementType, int temperature) {
        super(brandName, weight);
        this.heatingElementType = heatingElementType;
        this.temperature = temperature;
    }

    public String getHeatingElementType() {
        return heatingElementType;
    }

    public void setTypeOfHeatingElement(String typeOfHeatingElement) {
        this.heatingElementType = heatingElementType;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    protected void switchOn() {
        setStatus(true);
    }

    @Override
    protected void switchOff() {
        setStatus(false);
    }

    @Override
    protected boolean isDeviceSwitched() {
        return super.isStatus();
    }

    @Override
    public String toString() {
        return super.toString() + "Kettle{" +
                "typeOfHeatingElement='" + heatingElementType + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}