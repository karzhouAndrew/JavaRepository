package lab24;

public abstract class HomeAppliance {
    private String brandName;
    private String color;
    private int weight;

    public HomeAppliance(String brandName, String color, int weight) {
        this.brandName = brandName;
        this.color = color;
        this.weight = weight;
    }

    public abstract boolean pluggedIn();

    @Override
    public String toString() {
        return brandName + ", " + color + ", " + weight;
    }
}
