package lab24;


public class KitchenAppliances extends Appliances {
    private String dimensions;

    public KitchenAppliances() {
        dimensions = "0x0";
    }

    public KitchenAppliances(String brandName, String name, String dimensions) {
        super(brandName, name);
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + dimensions;
    }

    @Override
    public void turnOn() {
        System.out.println("Включить. Техника для кухни.");
    }
}
