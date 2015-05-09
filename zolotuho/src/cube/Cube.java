package cube;

public class Cube {
    private double size;
    private String color;

    public Cube(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public Cube(Cube ex) {
        this.size = ex.size;
        this.color = ex.color;
    }

    public Cube() {
        size = 0;
        color = "white";
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return Math.pow(size, 3);
    }

    public double getArea() {
        return 6 * Math.pow(size, 2);
    }

    public void copyCube(Cube ex) {
        this.size = ex.size;
        this.color = ex.color;
    }
}
