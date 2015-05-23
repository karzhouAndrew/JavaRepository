package additionalTask6;

import java.util.Scanner;

// Описать класс куб, найти площадь и объем куба, покрасить куб в определенный цвет.

public class CubeTest {
    public static void main(String[] args) {
        System.out.println("Введите длину ребра куба.");
        Scanner in = new Scanner(System.in);
        Cube cube = new Cube(in.nextInt());
        int cubeArea = cube.area();
        System.out.println("Площадь куба с ребром " + cube.getEdgeLength() + " равна " + cubeArea);
        int cubeVolume = cube.volume();
        System.out.println("Объем куба с ребром " + cube.getEdgeLength() + " равен " + cubeVolume);
        System.out.println("Введите цвет, в который хотите перекрасить куб.");
        String oldColor = cube.getColor();
        cube.repaint(in.next());
        in.close();
        System.out.println(oldColor + " куб вы перекрасили в " + cube.getColor());
    }
}
