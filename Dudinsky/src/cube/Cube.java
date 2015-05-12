package cube;

public class Cube {
    private double sizeOfCube;
    private String colorOfCube;

    public Cube() {
    }

    public Cube(double sizeOfCube) {
        this.sizeOfCube = sizeOfCube;
    }

    public Cube(double sizeOfCube, String colorOfCube) {
        this.sizeOfCube = sizeOfCube;
        this.colorOfCube = colorOfCube;
    }

    public double calcVolume() {
        return this.sizeOfCube * this.sizeOfCube * this.sizeOfCube;
    }

    public double calcSurfaceArea() {
        return 6 * this.sizeOfCube * this.sizeOfCube;
    }

    public double getSizeOfCube() {
        return sizeOfCube;
    }

    public void setSizeOfCube(double sizeOfCube) {
        this.sizeOfCube = sizeOfCube;
    }

    public String getColorOfCube() {
        return colorOfCube;
    }

    public void setColorOfCube(String colorOfCube) {
        this.colorOfCube = colorOfCube;
        System.out.println(" покрашен в цвет: " + colorOfCube);
    }
}