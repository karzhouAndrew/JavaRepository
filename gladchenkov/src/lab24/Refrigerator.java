package lab24;

public class Refrigerator extends MajorAppliance {
    private String locationFreezer;
    private boolean noFrost;

    public Refrigerator(String brandName, String color, int weight, int highVoltage, String dimensions, String locationFreezer, boolean noFrost) {
        super(brandName, color, weight, highVoltage, dimensions);
        this.locationFreezer = locationFreezer;
        this.noFrost = noFrost;
    }

    @Override
    public boolean pluggedIn() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + locationFreezer + ", " + noFrost;
    }
}
