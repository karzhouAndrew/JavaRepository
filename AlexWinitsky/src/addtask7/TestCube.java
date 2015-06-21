package addtask7;

/**
 * Доп.задание №7. Описать класс куб.  1) Найти площадь куба 2) Найти объем куба
 * 3) Покрасить куб в определенный цвет.
 */
public class TestCube {
    public static void main(String[] args) {
        Cube cube = new Cube(2, "red");
        System.out.println("Объем куба = " + cube.calculateCubeVolume());
        System.out.println("Площадь куба = " + cube.calculateCubeArea());
        cube.changeCubeColor("blue");

    }
}
