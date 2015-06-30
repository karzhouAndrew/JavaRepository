package laba.add6_2;

//Test class Cube
public class TestCube {
    public static void main(String[] args) {
        int sideCube = 5;
        String colorCube = "Green";
        Cube modelCube1 = new Cube(sideCube, colorCube);
        System.out.println(
                "Площадь куба равна " + modelCube1.calculateArea() + ".\nОбъем куба равен "
                        + modelCube1.calculateCapacity() + ".\nЦвет куба равен " + modelCube1.getColor()
                        + ".\nСторона равна " + modelCube1.getLengthSide() + ".");
        modelCube1.setLengthSide(-3);
        modelCube1.setLengthSide(3.5);
        modelCube1.setColor("Red");
        System.out.println("" +
                "\nПлощадь куба равна " + modelCube1.calculateArea() + ".\nОбъем куба равен "
                + modelCube1.calculateCapacity() + ".\nЦвет куба равен " + modelCube1.getColor()
                + ".\nСторона равна " + modelCube1.getLengthSide() + ".");
        Cube modelCube2 = new Cube(0);
        System.out.println(
                "\nПлощадь куба равна " + modelCube2.calculateArea() + ".\nОбъем куба равен "
                        + modelCube2.calculateCapacity() + ".\nЦвет куба равен " + modelCube2.getColor() +
                        ".\nСторона равна " + modelCube2.getLengthSide() + ".");
    }
}

