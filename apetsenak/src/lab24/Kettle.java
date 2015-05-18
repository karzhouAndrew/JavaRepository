package lab24;


public class Kettle extends KitchenAppliances {
    private String housingMaterial;

    public Kettle() {
        housingMaterial = "plastic";
    }

    public Kettle(String brandName, String name, String dimensions, String housingMaterial) {
        super(brandName, name, dimensions);
        this.housingMaterial = housingMaterial;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + housingMaterial;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(this);
    }
}
