package lab24;

// Создать иерархию классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
// Иерархия должна иметь хотя бы три уровня.

public class TestHomeApp {
    public static void main(String[] args) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Karcher", 7, 300, "White", 10, "Normal", 2000, "Hepa");
        TableLamp tableLamp = new TableLamp("Noname", 1, 10, "Red", 1, "Normal", "E75");
        vacuumCleaner.pluggedIn();
        tableLamp.pluggedIn();

        Flashlight flashlight = new Flashlight("Kitay", 2, 5, "Black", "LiIon", 99, "Big");
        flashlight.shine();
        tableLamp.shine();
    }
}
