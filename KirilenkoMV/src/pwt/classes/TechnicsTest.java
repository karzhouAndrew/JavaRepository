package pwt.classes;

/**
 * Created by asus on 15.05.2015.
 * Создать иерархию классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в разетку.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class TechnicsTest {
    public static void main(String[] args) {
        Technics computer = new Computer("Mac book");
        Technics hoover = new Hoover();
        computer.socketTurnOn();
    }
}
