package cube;

import cube.Cube;

/**
 * Created by dmitry on 7.6.15.
 */
public class Figure {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        System.out.println("Площадь куба = " + cube.square());
        System.out.println("Объем куба равен = " + cube.volume());
        cube.setCubeColor("blue");
        System.out.println("Цвет куба -- " + cube.getCubeColor());
    }
}
