package lab7JD2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 24.06.2015.
 */
public class PointList {
    private List<Point> points;

    public PointList() {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        return "PointList{" +
                "points=" + points +
                '}';
    }
}
