package cubeTask;

/**
 * Создать цветной куб, посчитать объём и площадь.
 */
public class Task {
    public static void main(String[] args) {
        Cube firstCube = new Cube(3);
        Cube secondCube = new Cube(4, "Red");
        System.out.println("Первый куб");
        firstCube.showCubeFeatures();
        System.out.println("Второй куб");
        secondCube.showCubeFeatures();
        System.out.println("Изменим цвет первого куба на синий.");
        firstCube.setColor("Blue");
        System.out.println("Установим длину грани второго куба равной 5.\n");
        secondCube.setEdgeLenght(5);
        System.out.println("Первый куб");
        firstCube.showCubeFeatures();
        System.out.println("Второй куб");
        secondCube.showCubeFeatures();
    }
}
