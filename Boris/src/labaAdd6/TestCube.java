package labaAdd6;

//Test class Cube
public class TestCube {
    public static void main(String[] args) {
        int sideCube = 5;
        String colorCube = "Green";
        Cube modelCube1 = new Cube(sideCube, colorCube);
        System.out.println(
                "Площадь куба равна " + modelCube1.getArea() + ".\nОбъем куба равен " + modelCube1.getCapacity() +
                        ".\nЦвет куба равен " + modelCube1.getColor() + ".\nСторона равна " + modelCube1.getSide() + ".");
        modelCube1.setSide(-3);
        modelCube1.setSide(3.5);
        modelCube1.setColor("Red");
        System.out.println(
                "\nПлощадь куба равна " + modelCube1.getArea() + ".\nОбъем куба равен " + modelCube1.getCapacity() +
                        ".\nЦвет куба равен " + modelCube1.getColor() + ".\nСторона равна " + modelCube1.getSide() + ".");
        Cube modelCube2 = new Cube(0);
        System.out.println(
                "\nПлощадь куба равна " + modelCube2.getArea() + ".\nОбъем куба равен " + modelCube2.getCapacity() +
                        ".\nЦвет куба равен " + modelCube2.getColor() + ".\nСторона равна " + modelCube2.getSide() + ".");
    }
}
