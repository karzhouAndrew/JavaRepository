package cube;

/* Описать класс Cube, реализовать методы, которые: красят куб, вычисляют объем, площадь поверхности. Реализовать конструкторы, геттеры и сеттеры */
public class TaskCube {
    public static void main(String[] args) {
        Cube cubeFirst = new Cube(3.2);
        System.out.print("Первый экземпляр куба c размером (заданным в параметрах при создании) и равным " + cubeFirst.getSizeOfCube() + " имел цвет " + cubeFirst.getColorOfCube() + ", а теперь");
        cubeFirst.setColorOfCube("белый");
        System.out.println("Его объем: " + cubeFirst.calcVolume() + ", площадь поверхности: " + cubeFirst.calcSurfaceArea());
        System.out.println("Цвет первого куба (значения полей были переданы через геттер): " + cubeFirst.getColorOfCube());

        Cube cubeSecond = new Cube();
        System.out.println("\nВторой экземпляр куба (создан конструктором по умолчанию, без параметров) имеет после создания размер " + cubeSecond.getSizeOfCube() + " и цвет " + cubeSecond.getColorOfCube());
        System.out.print("Устанавливаем (через сеттер) размер второго куба: ");
        cubeSecond.setSizeOfCube(2.4);
        System.out.print(cubeSecond.getSizeOfCube() + " , также (сеттером) красим и его:");
        cubeSecond.setColorOfCube("оранжевый");
        System.out.print("Новый размер второго куба, полученный через геттер: " + cubeSecond.getSizeOfCube());
        System.out.println(". Новый цвет второго куба, полученный через геттер: " + cubeSecond.getColorOfCube());
        System.out.println("Его объем: " + cubeSecond.calcVolume() + ", площадь поверхности: " + cubeSecond.calcSurfaceArea());

        Cube cubeThird = new Cube(4.8, "зеленый");
        System.out.println("\nТретий экземпляр куба создан конструктором с двумя параметрами и сразу имеет размер " + cubeThird.getSizeOfCube() + " и цвет: " + cubeThird.getColorOfCube() + " (значения получены через геттеры)");
        System.out.println("Его объем: " + cubeThird.calcVolume() + ", площадь поверхности третьего куба: " + cubeThird.calcSurfaceArea());
    }
}