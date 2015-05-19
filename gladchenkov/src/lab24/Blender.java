package lab24;

public class Blender extends SmallAppliance {
    private int numbersOfSpeeds;

    public Blender(String brandName, String color, int weight, int volume, int numbersOfSpeeds) {
        super(brandName, color, weight, volume);
        this.numbersOfSpeeds = numbersOfSpeeds;
    }

    @Override
    public boolean pluggedIn() {
        return false;

    }
}
