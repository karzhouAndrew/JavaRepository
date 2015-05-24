package lab24;


public class Blender extends KitchenAppliances {
    private int cupVolume;

    public Blender() {
        cupVolume = 1;
    }

    public Blender(String brandName, String name, String dimensions, int cupVolume) {
        super(brandName, name, dimensions);
        this.cupVolume = cupVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cupVolume;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this);
    }
}
