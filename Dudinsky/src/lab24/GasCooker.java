package lab24;

public class GasCooker extends FoodHeatingEquipment implements DoorControllable {

    private int burnerQuantity;
    private boolean ovenPresence;
    private boolean doorIsOpen = false;

    public GasCooker(String brandName, String model, double powerConsumption, boolean pluggable, boolean timerPresence, int burnerQuantity, boolean ovenPresence) {
        super(brandName, model, powerConsumption, pluggable, timerPresence);
        this.burnerQuantity = burnerQuantity;
        this.ovenPresence = ovenPresence;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("газовую плиту. Что-то готовят...");
    }

    @Override
    public void changeDoorState() {
        if (ovenPresence) {
            System.out.print("Дверь духовки была " + (doorIsOpen ? "открыта" : "закрыта"));
            doorIsOpen = !doorIsOpen;
            System.out.println(", а стала " + (doorIsOpen ? "открыта." : "закрыта."));
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", количество конфорок = " + burnerQuantity + ", наличие внутренней духовки = " + ovenPresence;
    }

    public int getBurnerQuantity() {
        return burnerQuantity;
    }

    public boolean isOvenPresent() {
        return ovenPresence;
    }

    public boolean isDoorOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }
}
