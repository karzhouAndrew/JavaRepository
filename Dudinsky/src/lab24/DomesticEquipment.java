package lab24;

public abstract class DomesticEquipment {

    private String brandName;
    private String model;

    private double powerConsumption;

    public DomesticEquipment(String brandName, String model, double powerConsumption) {
        this.brandName = brandName;
        this.model = model;
        this.powerConsumption = powerConsumption;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Сведения о данном устройстве:" +
                " марка = '" + brandName + '\'' +
                ", модель = '" + model + '\'' +
                ", потребляемая мощность = " + powerConsumption;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
}
