package lab41and42;

public class Point {
    private int x;
    private int y;
    private String unit;

    public Point(int x, int y, String unit) {
        this.x = x;
        this.y = y;
        this.unit = unit;
    }

    public Point() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "x=" + x + unit +
                ", y=" + y + unit;
    }
}

