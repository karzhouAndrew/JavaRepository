package lab24;

public class TableLamp extends MainsSupplyApp implements Light {
    private String lightBulb;

    public TableLamp(String brandName, int weight, int cost, String color, int wireLength, String plugType, String lightBulb) {
        super(brandName, weight, cost, color, wireLength, plugType);
        this.lightBulb = lightBulb;
    }

    @Override
    public boolean pluggedIn() {
        return super.pluggedIn();
    }

    @Override
    public boolean shine() {
        return false;
    }
}
