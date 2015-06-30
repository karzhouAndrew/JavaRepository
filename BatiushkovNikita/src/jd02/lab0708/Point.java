package jd02.lab0708;

public class Point {
    private String units;
    private int x;
    private int y;

    public Point(String units, int x, int y) {
        this.units = units;
        this.x = x;
        this.y = y;
    }

    public String getUnits() {
        return units;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
