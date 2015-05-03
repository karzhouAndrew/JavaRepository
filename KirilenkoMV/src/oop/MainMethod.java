package oop;

/**
 * Created by asus on 03.05.2015.
 */
public class MainMethod {
    public static void main(String[] args) {
        Cube cube = new Cube(20.0, 10.0, 30.0);
        double s = cube.CalulateS();
        System.out.println("Площадь " + s);
        double v = cube.CalulateV();
        System.out.println("Объем " + v);
        cube.setColor("Red");
    }
}
