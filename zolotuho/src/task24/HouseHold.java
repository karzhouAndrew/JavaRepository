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
        color = "";
        state = false;
    }

    public HouseHold(String serialNumber, String vendorName, String color, boolean state) {
        this.serialNumber = serialNumber;
        this.vendorName = vendorName;
        this.color = color;
        this.state = state;
    }

    public HouseHold() {
        serialNumber = "00000000";
        vendorName = "unknown";
        color = "";
        state = false;
    }
}
