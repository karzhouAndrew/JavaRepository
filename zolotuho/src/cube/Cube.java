package cube;

public class Cube {
    private double size;
    private String color;

    public Cube(double size, String color) {
        this.size = size;
        this.color = color;
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

    public double calculateVolume() {
        return Math.pow(size, 3);
    }

    public double calculateArea() {
        return 6 * Math.pow(size, 2);
    }
}
