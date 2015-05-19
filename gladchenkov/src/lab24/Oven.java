package lab24;

public class Oven extends MajorAppliance implements LedDisplay {
    private String type;

    public Oven(String brandName, String color, int weight, int highVoltage, String dimensions, String type) {
        super(brandName, color, weight, highVoltage, dimensions);
        this.type = type;
    }


    @Override
    public boolean pluggedIn() {
        return false;
    }


    @Override
    public boolean ledDisplay() {
        return true;
    }

    @Override
    public boolean timeIndicator() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }
}
