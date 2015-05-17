package task24;

public class DVDPlayer extends EquipmentEntertainment {
    private String interfaces;

    public DVDPlayer(String brand, String supportedFormats, String interfaces) {
        super(brand, supportedFormats);
        this.interfaces = interfaces;
    }

    public String getInterfaces() {
        return interfaces;
    }
}
