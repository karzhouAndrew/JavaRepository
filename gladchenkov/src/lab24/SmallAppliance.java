package lab24;

public abstract class SmallAppliance extends HomeAppliance {
    private int volume;

    public SmallAppliance(String brandName, String color, int weight, int volume) {
        super(brandName, color, weight);
        this.volume = volume;

    }

    @Override
    public String toString() {
        return super.toString() + ", " + volume;
    }
}
