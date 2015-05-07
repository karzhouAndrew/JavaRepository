package cube;

public class TestCube {
    public static void main(String[] args) {
        Cube cube1 = new Cube(20, "black");
        Cube cube2 = new Cube(6, "green");
        Cube cube3 = new Cube();
        double vol = cube1.getVolume();
        System.out.println("Volume of the cube1 = " + vol);
        double area = cube2.getArea();
        System.out.println("Area of the cube2 = " + area);
        cube3.copyCube(cube1);
        double size = cube3.getSize();
        System.out.println("Size of the cube3 = " + size);
        cube3.setColor("red");
        System.out.println(cube3.getColor());
    }
}
