package xml;

/**
 * Created by asus on 21.06.2015.
 */
public class Point {
    private Integer x;
    private Integer y;
    private String units;

    public Point(Integer x, Integer y, String units) {
        this.x = x;
        this.y = y;
        this.units = units;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
