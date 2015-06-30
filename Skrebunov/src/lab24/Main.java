package lab24;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        HouseholdAppliances monitorSamsung = new Monitor("Samsung", 6, "zxc456", 40);
        HouseholdAppliances kettleVitek = new Kettle("Vitek", 1, "disc", 100);
        HouseholdAppliances kettleVityaz = new Kettle("Vityaz", 1, "spiral", 100);
        monitorSamsung.switchOn();
        kettleVitek.switchOn();
        kettleVitek.switchOff();
        kettleVityaz.switchOn();
        System.out.println(monitorSamsung.toString() + " включен? " + monitorSamsung.isDeviceSwitched());
        System.out.println(kettleVitek + " включен? " + kettleVitek.isDeviceSwitched());
        System.out.println(kettleVityaz + " включен? " + kettleVityaz.isDeviceSwitched());
    }
}
