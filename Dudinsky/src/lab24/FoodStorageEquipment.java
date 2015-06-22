package lab24;

public abstract class FoodStorageEquipment extends KitchenEquipment {

    private double foodCapacity;
    private int targetTemperature;

    public FoodStorageEquipment(String brandName, String model, double powerConsumption, boolean pluggable, double foodCapacity, int targetTemperature) {
        super(brandName, model, powerConsumption, pluggable);
        this.foodCapacity = foodCapacity;
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public String toString() {
        return super.toString() + ", вместимость продуктов = " + foodCapacity + ", поддерживаемая температура хранения = " + targetTemperature;
    }

    public double getFoodCapacity() {
        return foodCapacity;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(int targetTemperature) {
        this.targetTemperature = targetTemperature;
    }
}
