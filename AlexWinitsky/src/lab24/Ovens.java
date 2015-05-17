package lab24;

/**
 * Класс описывающий духовые шкафы
 */
public class Ovens extends EquipmentForKitchen {
    int numberOfRate;
    String convection;
    String boiler;

    public Ovens(int numberOfRate, String convection, String boiler, int value, String typeOfControl, String classOfEnergy) {
        this.numberOfRate = numberOfRate;
        this.convection = convection;
        this.boiler = boiler;
        this.value = value;
        this.typeOfControl = typeOfControl;
        this.classOfEnergy = classOfEnergy;
    }

    @Override
    public String toString() {
        return "Ovens{" +
                "Количество режимов=" + numberOfRate +
                ", Режим конвекции=" + convection +
                ", Гриль=" + boiler +
                ", Объем=" + value + '\'' +
                ", Тип управления=" + typeOfControl + '\'' +
                ", Класс энергопотребления=" + classOfEnergy + '\'' +
                '}';
    }


}
