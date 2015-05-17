package lab24;

/**
 * Класс описывающий технику для кухни
 */
public class EquipmentForKitchen extends DomesticAppliances {
    protected int value;
    protected String typeOfControl;
    protected String classOfEnergy;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getColor() {
        return this.color;
    }
}
