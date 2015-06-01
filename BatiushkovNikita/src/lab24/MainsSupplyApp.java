package lab24;

public abstract class MainsSupplyApp extends HomeAppliance {
    private int wireLength;
    private String plugType;

    public MainsSupplyApp(String brandName, int weight, int cost, String color, int wireLength, String plugType) {
        super(brandName, weight, cost, color);
        this.wireLength = wireLength;
        this.plugType = plugType;
    }

    public boolean pluggedIn() {
        return true;
    }
}
