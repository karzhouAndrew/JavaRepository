package jd02.lab0708;

import java.util.ArrayList;
import java.util.List;

public class PointsList {
    private List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public void viewPoints() {
        for (Point point : points) {
            System.out.println(point.getX() + point.getUnits() + ", " + point.getY() + point.getUnits());
        }
    }
}
