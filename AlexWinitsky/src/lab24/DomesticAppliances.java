package lab24;

/**
 * Общий класс для бытовой техники
 */
public abstract class DomesticAppliances {
    private String brandName;
    private int power;
    private String color;

    protected void switchEquipment() {
        System.out.println("Бытовая техника включена");
    }

    protected void offEquipment() {
        System.out.println("Бытовая техника выключена");
    }

    public String getBrandName() {
        return brandName;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
