package lab24;

/**
 * Задание 24
 Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
 часть из них включить в розетку.
 Иерархия должна иметь хотя бы три уровня.

 */
public class Lab24 {
    public static void main(String[] args) {
        Washer washer = new Washer("LG", 5);
        washer.pluggedIn("LG");
        System.out.println(washer.getBrandName() + " Включен в розетку: " + washer.getPlugged());
        Microwave microwave = new Microwave("Samsung",500);
        microwave.pluggedIn("Samsung");
        System.out.println(microwave.getBrandName() + " Включен в розетку: " + microwave.getPlugged());
        Tv tv = new Tv("Горизонт",100);
        tv.unplugged("Горизонт");
        System.out.println(tv.getBrandName() + " Включен в розетку: " + tv.getPlugged());
    }
}

