package lab24;

public abstract class FoodHeatingEquipment extends KitchenEquipment {

    private boolean timerPresence;

    public FoodHeatingEquipment(String brandName, String model, double powerConsumption, boolean pluggable, boolean timerPresence) {
        super(brandName, model, powerConsumption, pluggable);
        this.timerPresence = timerPresence;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {
        return super.toString() + ", наличие функции автоматического отключения = " + timerPresence;
    }

    public boolean isTimerPresent() {
        return timerPresence;
    }
}
