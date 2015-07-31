package lab41and42;

import java.util.ArrayList;
import java.util.List;

public class ProcessingPoint {
    private List<Point> point = new ArrayList<Point>();

    public void addPoint(Point points) {
        point.add(points);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < point.size(); i++) {
            output.append(point.get(i));
            output.append(", ");
        }
        return output.toString();
    }
}
