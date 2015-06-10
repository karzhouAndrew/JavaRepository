package lab24;

public class KaraokeHomeSystem extends HomeAudioVideoEquipment {

    private int disksChangerCapacity;

    public KaraokeHomeSystem(String brandName, String model, double powerConsumption, boolean USBPortPresence, int disksChangerCapacity) {
        super(brandName, model, powerConsumption, USBPortPresence);
        this.disksChangerCapacity = disksChangerCapacity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("караоке-систему. Сейчас спою...");
    }

    @Override
    public String toString() {
        return super.toString() + ", вместимость диск-чейнджера = " + disksChangerCapacity;
    }

    public int getDisksChangerCapacity() {
        return disksChangerCapacity;
    }
}
