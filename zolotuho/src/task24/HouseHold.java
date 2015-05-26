package task24;

public abstract class HouseHold {
    private final String serialNumber;
    private final String vendorName;
    private String color;
    protected boolean state;

    public abstract void switchOn();

    public abstract void switchOff();

    public abstract void showState();

    public HouseHold(String serialNumber, String vendorName) {
        this.serialNumber = serialNumber;
        this.vendorName = vendorName;
        this.color = "";
        this.state = false;
    }

    public HouseHold(String serialNumber, String vendorName, String color, boolean state) {
        this.serialNumber = serialNumber;
        this.vendorName = vendorName;
        this.color = color;
        this.state = state;
    }

    public HouseHold() {
        this.serialNumber = "00000000";
        this.vendorName = "unknown";
        this.color = "";
        this.state = false;
    }
}
