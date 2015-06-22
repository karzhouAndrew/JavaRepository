package lab24;

public class Multicooker extends FoodHeatingEquipment {

    public double potCapacity;

    public Multicooker(String brandName, String model, double powerConsumption, boolean pluggable, boolean timerPresence, double potCapacity) {
        super(brandName, model, powerConsumption, pluggable, timerPresence);
        this.potCapacity = potCapacity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("мультиварку. Что-то готовят...");
    }

    @Override
    public String toString() {
        return super.toString() + ", объем емкости = " + potCapacity;
    }

    public double getPotCapacity() {
        return potCapacity;
    }
}
