package module2.laba7.other;


public class Point {
    private int x;
    private int y;
    private String units;

    @Override
    public String toString() {
        return "\nPoint{" +
                "x=" + x + units +
                ", y=" + y + units +
                "}";
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

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
