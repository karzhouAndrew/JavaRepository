package lab24;

public abstract class HomeAppliance {
    private String brandName;
    private int weight;
    private int cost;
    private String color;

    public HomeAppliance(String brandName, int weight, int cost, String color) {
        this.brandName = brandName;
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }


}
