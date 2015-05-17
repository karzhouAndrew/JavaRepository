package lab24;

/**
 *Общий класс для бытовой техники
 */
public abstract class DomesticAppliances {
    protected String brandName;
    protected int power;
    protected String color;

    protected void switchEquipment() {
        System.out.println("Бытовая техника включена");
    }

    protected void offEquipment() {
        System.out.println("Бытовая техника выключена");
    }
}
