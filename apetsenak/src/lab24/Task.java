package lab24;


public class Task {
    public static void main(String[] args) {
        Blender blender = new Blender("Scarlet", "blender", "10x10", 4);
        Iron iron = new Iron();
        Kettle kettle = new Kettle("Vitek", "kettle", "15x10", "plastic");
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Samsung", "vacuumcleaner", 8, "aquafiltering");
        vacuumCleaner.turnOn();
        blender.turnOn();
        iron.turnOn();
        kettle.turnOn();
    }
}
