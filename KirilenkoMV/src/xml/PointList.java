package xml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 21.06.2015.
 */
public class PointList {
    private List<Point> points = new ArrayList<Point>();

    public void put(Point point) {
        points.add(point);
    }

    public void print() {
        for (Point point : points) {
            System.out.println(point.getX() + point.getUnits() + ", " + point.getY() + point.getUnits());
        }
    }

    public void clear() {
        points.clear();
    }
}
