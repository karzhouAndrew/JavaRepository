package lab24;

public abstract class HomeAudioVideoEquipment extends DomesticEquipment {

    private boolean USBPortPresence;

    public HomeAudioVideoEquipment(String brandName, String model, double powerConsumption, boolean USBPortPresence) {
        super(brandName, model, powerConsumption);
        this.USBPortPresence = USBPortPresence;
    }

    @Override
    public void turnOn() {
        System.out.print("Дома включили ");
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие USB-порта = " + USBPortPresence;
    }

    public boolean isUSBPortPresent() {
        return USBPortPresence;
    }
}
