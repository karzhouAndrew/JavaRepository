package cube_version2;

/* Описать класс Cube, реализовать методы, которые: красят куб, вычисляют объем, площадь поверхности. Реализовать конструкторы, геттеры и сеттеры */
public class TaskCube {
    public static void main(String[] args) {
        Cube cubeFirst = new Cube(3.2);
        System.out.print("Первый экземпляр куба c размером (заданным в параметрах при создании) и равным " + cubeFirst.getСubeSize() + " имел цвет " + cubeFirst.getCubeColor() + ", а теперь");
        cubeFirst.setCubeColor("белый");
        System.out.println("Его объем: " + cubeFirst.calcVolume() + ", площадь поверхности: " + cubeFirst.calcSurfaceArea());
        System.out.println("Цвет первого куба (значения полей были переданы через геттер): " + cubeFirst.getCubeColor());

        Cube cubeSecond = new Cube();
        System.out.println("\nВторой экземпляр куба (создан конструктором по умолчанию, без параметров) имеет после создания размер " + cubeSecond.getСubeSize() + " и цвет " + cubeSecond.getCubeColor());
        System.out.print("Устанавливаем (через сеттер) размер второго куба: ");
        cubeSecond.setСubeSize(2.4);
        System.out.print(cubeSecond.getСubeSize() + " , также (сеттером) красим и его:");
        cubeSecond.setCubeColor("оранжевый");
        System.out.print("Новый размер второго куба, полученный через геттер: " + cubeSecond.getСubeSize());
        System.out.println(". Новый цвет второго куба, полученный через геттер: " + cubeSecond.getCubeColor());
        System.out.println("Его объем: " + cubeSecond.calcVolume() + ", площадь поверхности: " + cubeSecond.calcSurfaceArea());

        Cube cubeThird = new Cube(4.8, "зеленый");
        System.out.println("\nТретий экземпляр куба создан конструктором с двумя параметрами и сразу имеет размер " + cubeThird.getСubeSize() + " и цвет: " + cubeThird.getCubeColor() + " (значения получены через геттеры)");
        System.out.println("Его объем: " + cubeThird.calcVolume() + ", площадь поверхности третьего куба: " + cubeThird.calcSurfaceArea());
    }
}
