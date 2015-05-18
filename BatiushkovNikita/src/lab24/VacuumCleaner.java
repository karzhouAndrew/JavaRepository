package lab24;

public class VacuumCleaner extends MainsSupplyApp {
    private int suctionPower;
    private String filter;

    public VacuumCleaner(String brandName, int weight, int cost, String color, int wireLength, String plugType, int suctionPower, String filter) {
        super(brandName, weight, cost, color, wireLength, plugType);
        this.suctionPower = suctionPower;
        this.filter = filter;
    }

    @Override
    public boolean pluggedIn() {
        return super.pluggedIn();
    }
}
