package lab24;

/**
 Задание 24
 Создать иерархию классов, описывающих бытовую технику.
 Со-здать несколько объектов описанных классов, часть из них включить в ро-зетку.
 Иерархия должна иметь хотя бы три уровня.

 */
public class TestDomesticAppliance {
    public static void main(String[] args) {
        Fridges fridge = new Fridges(2, 5, "одна камера", 20, "Сенсорный", "A++");
        fridge.setBrandName("Атлант");
        fridge.setPower(150);
        System.out.println("Холодильник = " + fridge);
        System.out.println("Производитель = " + fridge.getBrandName());
        System.out.println("Мощность = " + fridge.getPower());
        fridge.switchEquipment();

        Ovens ovens = new Ovens(8, "ДА", "НЕТ", 18, "Механический", "A+");
        System.out.println("Духовой шкаф = " + ovens);
        ovens.setBrandName("Samsung");
        ovens.setColor("Белый");
        ovens.setPower(100);
        System.out.println("Производитель = " + ovens.getBrandName());
        System.out.println("Мощность = " + ovens.getPower());
        System.out.println("Цвет = " + ovens.getColor());
        ovens.offEquipment();


    }
}
