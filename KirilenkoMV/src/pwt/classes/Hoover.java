package pwt.classes;

/**
 * Created by asus on 15.05.2015.
 */
public class Hoover extends Technics {
    @Override
    public void repair() {
        System.out.println("Пылесос ремонту не подлежит");
    }

    @Override
    public void destruction() {
        System.out.println("Удалили пылесос :((((");
    }

    public void clean() {
        System.out.println("Моя обязанность - пылесосить ковры.");
    }
}
