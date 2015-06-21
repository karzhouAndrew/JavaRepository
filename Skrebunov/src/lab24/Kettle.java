package lab24;

/**
 * Created by PC on 17.06.2015.
 */
public class Kettle extends HouseholdAppliances {
    private String typeOfHeatingElement;
    private int temperature;

    public Kettle() {
    }

    public Kettle(String brandName, int weight, String typeOfHeatingElement, int temperature) {
        super(brandName, weight);
        this.typeOfHeatingElement = typeOfHeatingElement;
        this.temperature = temperature;
    }

    public String getTypeOfHeatingElement() {
        return typeOfHeatingElement;
    }

    public void setTypeOfHeatingElement(String typeOfHeatingElement) {
        this.typeOfHeatingElement = typeOfHeatingElement;
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
    protected boolean statusOfDevice() {
        return super.isStatus();
    }

    @Override
    public String toString() {
        return super.toString() + "Kettle{" +
                "typeOfHeatingElement='" + typeOfHeatingElement + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}