package lab24;

/**
 * Класс описывающий духовые шкафы
 */
public class Ovens extends EquipmentForKitchen {
    private int numberOfRate;
    private String convection;
    private String boiler;

    public Ovens(int numberOfRate, String convection, String boiler, int value, String typeOfControl, String classOfEnergy) {
        this.numberOfRate = numberOfRate;
        this.convection = convection;
        this.boiler = boiler;
        setValue(value);
        setControlType(typeOfControl);
        setClassOfEnergy(classOfEnergy);
    }

    @Override
    public String toString() {
        return "Ovens{" +
                "Количество режимов=" + numberOfRate +
                ", Режим конвекции=" + convection +
                ", Гриль=" + boiler +
                ", Объем=" + getValue() + '\'' +
                ", Тип управления=" + getControlType() + '\'' +
                ", Класс энергопотребления=" + getClassOfEnergy() + '\'' +
                '}';
    }


}
