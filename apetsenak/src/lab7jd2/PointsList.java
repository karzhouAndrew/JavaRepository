package lab7jd2;


import java.util.ArrayList;
import java.util.List;

public class PointsList {
    private List<Point> points;

    public PointsList() {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < points.size(); i++) {
            output.append(points.get(i));
            output.append("\n");
        }
        return output.toString();
    }
}
