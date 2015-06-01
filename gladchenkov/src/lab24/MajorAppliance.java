package lab24;

public abstract class MajorAppliance extends HomeAppliance {
    private int highVoltage;
    private String dimensions;

    public MajorAppliance(String brandName, String color, int weight, int highVoltage, String dimensions) {
        super(brandName, color, weight);
        this.highVoltage = highVoltage;
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + highVoltage + ", " + dimensions;
    }
}
