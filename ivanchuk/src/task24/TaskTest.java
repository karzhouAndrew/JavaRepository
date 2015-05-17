package task24;

//Создать иерархию классов, описывающих бытовую технику.
//Создать несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class TaskTest {
    public static void main(String[] args) {
        HouseholdAppliances laptop = new Laptop("Apple", 2.4, 2300);
        HouseholdAppliances personalComputer = new PersonalComputer("Asus", 3.0, "Lg");
        HouseholdAppliances dvdPlayer = new DVDPlayer("Lg", "DVD", "HDMI");
        HouseholdAppliances homeTheater = new HomeTheater("Sony", "DVD", "Sony");
        personalComputer.includeInSocket();
        homeTheater.includeInSocket();
        System.out.println("Laptop: " + laptop.getIncludedInSocket() + " " + laptop.getBrand() + " "
                + ((Laptop) laptop).getProcessorPower() + " " + ((Laptop) laptop).getBatteryCapacity());
        System.out.println("PC: " + personalComputer.getIncludedInSocket() + " "
                + personalComputer.getBrand() + " " + ((PersonalComputer) personalComputer).getProcessorPower() + " "
                + ((PersonalComputer) personalComputer).getMonitorBrand());
        System.out.println("DVD player: " + dvdPlayer.getIncludedInSocket() + " " + dvdPlayer.getBrand() + " "
                + ((DVDPlayer) dvdPlayer).getSupportedFormats() + " " + ((DVDPlayer) dvdPlayer).getInterfaces());
        System.out.println("Home theater: " + homeTheater.getIncludedInSocket() + " " + homeTheater.getBrand() + " "
                + ((HomeTheater) homeTheater).getSupportedFormats() + " " + ((HomeTheater) homeTheater).getProjectorBrand());
    }
}
