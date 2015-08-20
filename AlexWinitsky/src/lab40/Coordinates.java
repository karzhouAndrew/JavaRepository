package lab40;

/**
 * Created by Master on 19.06.2015.
 */
public class Coordinates {
    private int x;
    private int y;
    private String unit;

    public Coordinates(int x, int y, String unit) {
        this.x = x;
        this.y = y;
        this.unit = unit;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getUnit() {
        return unit;
    }
}
