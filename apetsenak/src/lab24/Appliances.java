package lab24;


public abstract class Appliances {
    private String brandName;
    private String name;

    public Appliances() {
        brandName = "Unknown";
        name = "Unknown";
    }

    public Appliances(String brandName, String name) {
        this.brandName = brandName;
        this.name = name;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return name + ", " + brandName;
    }
}
