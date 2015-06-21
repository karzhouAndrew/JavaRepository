package lab41;

public class Point {
    String x;
    String y;
    String unit;

    public Point() {

    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + " " + unit + ", " + "y=" + y + " " + unit + '}';
    }
}

