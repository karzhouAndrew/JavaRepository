package cube;

public class TestCube {
    public static void main(String[] args) {
        Cube cube1 = new Cube(20, "black");
        Cube cube2 = new Cube(6, "green");
        Cube cube3;
        double vol = cube1.calculateVolume();
        System.out.println("Volume of the cube1 = " + vol);
        double area = cube2.calculateArea();
        System.out.println("Area of the cube2 = " + area);
        cube3 = cube1.clone();
        double size = cube3.getSize();
        System.out.println("Size of the cube3 = " + size);
        cube3.setColor("red");
        System.out.println(cube3.getColor());
    }
}
