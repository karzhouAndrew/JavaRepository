package lab7JD2;

/**
 * Created by PC on 24.06.2015.
 */
public class Point {
    private int pointX;
    private int pointY;
    private String unit;

    public Point() {
    }

    public Point(int pointX, int pointY, String unit) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.unit = unit;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                ", unit='" + unit + '\'' +
                '}';
    }
}
