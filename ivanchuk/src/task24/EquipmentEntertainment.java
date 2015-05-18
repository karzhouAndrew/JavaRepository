package task24;

public abstract class EquipmentEntertainment extends HouseholdAppliances {
    private String supportedFormats;

    public EquipmentEntertainment(String brand, String supportedFormats) {
        super(brand);
        this.supportedFormats = supportedFormats;
    }

    public String getSupportedFormats() {
        return supportedFormats;
    }
}
