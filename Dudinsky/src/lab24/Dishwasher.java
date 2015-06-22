package lab24;

public class Dishwasher extends KitchenEquipment implements DoorControllable {

    private double washProductivity;
    private boolean doorIsOpen = false;

    public Dishwasher(String brandName, String model, double powerConsumption, boolean pluggable, double washProductivity) {
        super(brandName, model, powerConsumption, pluggable);
        this.washProductivity = washProductivity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("посудомойку.");
    }

    @Override
    public void changeDoorState() {
        System.out.print("Дверь посудомойки была " + (doorIsOpen ? "открыта" : "закрыта"));
        doorIsOpen = !doorIsOpen;
        System.out.println(", а стала " + (doorIsOpen ? "открыта." : "закрыта."));
    }

    @Override
    public String toString() {
        return super.toString() + ", производительность мытья посуды = " + washProductivity;
    }

    public double getWashProductivity() {
        return washProductivity;
    }

    public boolean isDoorOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }
}
