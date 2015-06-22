package lab24;

/* Задание 24. Создать иерархию классов, описывающих бытовую технику.
Создать несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня. */
public class Task24 {
    public static void main(String[] args) {

        Dishwasher dishwasher = new Dishwasher("Electrolux", "ESL6381RA", 1200, true, 90);
        System.out.println("Включаем посудомойку:");
        dishwasher.turnOn();
        System.out.println("Меняем положение двери:");
        dishwasher.changeDoorState();
        System.out.println(dishwasher);
        dishwasher.changeDoorState();

        KaraokeHomeSystem karaokeHomeSystem = new KaraokeHomeSystem("LG", "MDD64K", 30, true, 3);
        System.out.println("Включаем караоке-систему:");
        karaokeHomeSystem.turnOn();
        System.out.println(karaokeHomeSystem);

        GasCooker gasCooker = new GasCooker("Mastercook", "MPW6E", 2200, true, true, 4, true);
        System.out.println("Включаем плиту:");
        gasCooker.turnOn();
        System.out.println(gasCooker);
        System.out.println("В плите при условии наличия духовки имеется управляемая дверца:");
        gasCooker.changeDoorState();
        gasCooker.changeDoorState();
    }
}
