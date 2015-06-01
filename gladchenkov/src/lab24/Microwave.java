package lab24;

public class Microwave extends SmallAppliance implements LedDisplay {
    private int microwavePower;

    public Microwave(String brandName, String color, int weight, int volume, int microwavePower) {
        super(brandName, color, weight, volume);
        this.microwavePower = microwavePower;
    }


    @Override
    public boolean pluggedIn() {
        return true;

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
        return super.toString() + ", " + microwavePower;
    }
}
