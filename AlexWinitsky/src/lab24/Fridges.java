package lab24;

/**
 *Класс описывающий холодильники
 */
public class Fridges extends EquipmentForKitchen {
    private int numbersOfCompressor;
    private int numberOfShelfs;
    private String construction;


    public Fridges(int numbersOfCompressor, int numberOfShelfs, String construction, int value, String typeOfControl, String classOfEnergy) {
        this.numbersOfCompressor = numbersOfCompressor;
        this.numberOfShelfs = numberOfShelfs;
        this.construction = construction;
        this.value = value;
        this.typeOfControl = typeOfControl;
        this.classOfEnergy = classOfEnergy;


    }


    @Override
    public String toString() {
        return "Fridges{" +
                "Количество компресооров=" + numbersOfCompressor +
                ", Количество полок=" + numberOfShelfs +
                ", Конструкция=" + construction + '\'' +
                ", Объем=" + value + '\'' +
                ", Тип управления=" + typeOfControl + '\'' +
                ", Класс энергопотребления=" + classOfEnergy + '\'' +
                '}';
    }


}
