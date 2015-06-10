package lab24;

public class Refrigerator extends FoodStorageEquipment implements DoorControllable {

    private boolean freezerIsEmbedded;
    private boolean doorIsOpen = false;

    public Refrigerator(String brandName, String model, double powerConsumption, boolean pluggable, double foodCapacity, int defaultTargetTemperature, boolean freezerIsEmbedded) {
        super(brandName, model, powerConsumption, pluggable, foodCapacity, defaultTargetTemperature);
        this.freezerIsEmbedded = freezerIsEmbedded;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("холодильник.");
    }

    @Override
    public void changeDoorState() {
        System.out.print("Дверь холодильника была " + (doorIsOpen ? "открыта" : "закрыта"));
        doorIsOpen = !doorIsOpen;
        System.out.println(", а стала " + (doorIsOpen ? "открыта." : "закрыта."));
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие встроенной морозилки = " + freezerIsEmbedded;
    }

    public boolean isFreezerEmbedded() {
        return freezerIsEmbedded;
    }

    public boolean isDoorOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }
}
