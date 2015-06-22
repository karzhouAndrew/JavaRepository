package lab24;

public abstract class KitchenEquipment extends DomesticEquipment {

    private boolean pluggable;

    public KitchenEquipment(String brandName, String model, double powerConsumption, boolean pluggable) {
        super(brandName, model, powerConsumption);
        this.pluggable = pluggable;
    }

    @Override
    public void turnOn() {
        System.out.print("На кухне включили ");
    }

    @Override
    public String toString() {
        return super.toString() + ", возможность встраивания = " + pluggable;
    }

    public boolean isPluggable() {
        return pluggable;
    }
}
