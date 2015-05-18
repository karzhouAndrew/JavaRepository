package task24;

public abstract class HouseholdAppliances {
    private String includedInSocket;
    private String brand;

    public HouseholdAppliances(String brand) {
        includedInSocket = "OFF";
        this.brand = brand;
    }

    public void includeInSocket() {
        includedInSocket = "ON";
    }

    public void switchOffFromSocket() {
        includedInSocket = "OFF";
    }

    public String getIncludedInSocket() {
        return includedInSocket;
    }

    public String getBrand() {
        return brand;
    }
}
