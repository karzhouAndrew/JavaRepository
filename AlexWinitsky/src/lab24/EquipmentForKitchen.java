package lab24;

/**
 * Класс описывающий технику для кухни
 */
public class EquipmentForKitchen extends DomesticAppliances {
    private int value;
    private String controlType;
    private String classOfEnergy;

    public void setValue(int value) {
        this.value = value;
    }

    public void setControlType(String typeOfControl) {
        this.controlType = typeOfControl;
    }

    public void setClassOfEnergy(String classOfEnergy) {
        this.classOfEnergy = classOfEnergy;
    }

    public int getValue() {
        return value;
    }

    public String getControlType() {
        return controlType;
    }

    public String getClassOfEnergy() {
        return classOfEnergy;
    }
}
