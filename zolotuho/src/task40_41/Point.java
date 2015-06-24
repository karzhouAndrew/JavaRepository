package task40_41;


public class Point {
    private String units;
    private int x;
    private int y;

    public Point() {
    }

    public Point(String units, int x, int y) {
        this.units = units;
        this.x = x;
        this.y = y;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + units +
                ", y=" + y + units;
    }
}
