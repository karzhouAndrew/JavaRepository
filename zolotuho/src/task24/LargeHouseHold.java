package task24;

public abstract class LargeHouseHold extends HouseHold {
    private final double weight;
    private final double width;
    private final double height;
    private final double length;

    public LargeHouseHold(String serialNumber, String vendorName, double weight, double width, double height, double length) {
        super(serialNumber, vendorName);
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public LargeHouseHold(String serialNumber, String vendorName) {
        super(serialNumber, vendorName);
        this.weight = 0;
        this.width = 0;
        this.height = 0;
        this.length = 0;

    }

    public LargeHouseHold(double weight, double width, double height, double length) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public LargeHouseHold() {
        this.weight = 0;
        this.width = 0;
        this.height = 0;
        this.length = 0;
    }
}
