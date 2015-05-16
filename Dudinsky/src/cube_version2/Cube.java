package cube_version2;

public class Cube {
    private final int FACES_QUANTITY = 6;
    private double сubeSize;
    private String cubeColor;

    public Cube() {
    }

    public Cube(double сubeSize) {
        this.сubeSize = сubeSize;
    }

    public Cube(double сubeSize, String cubeColor) {
        this.сubeSize = сubeSize;
        this.cubeColor = cubeColor;
    }

    public double calcVolume() {
        return this.сubeSize * this.сubeSize * this.сubeSize;
    }

    public double calcSurfaceArea() {
        return this.FACES_QUANTITY * this.сubeSize * this.сubeSize;
    }

    public double getСubeSize() {
        return сubeSize;
    }

    public void setСubeSize(double сubeSize) {
        this.сubeSize = сubeSize;
    }

    public String getCubeColor() {
        return cubeColor;
    }

    public void setCubeColor(String cubeColor) {
        this.cubeColor = cubeColor;
        System.out.println(" покрашен в цвет: " + cubeColor);
    }
}
