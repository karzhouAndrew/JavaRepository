package task40_41;

import java.util.ArrayList;
import java.util.List;

public class PointsList {
    private List<String> attributes;
    private List<Point> points;

    public void addAttribute(String attribute) {
        attributes.add(attribute);
    }

    public PointsList() {
        attributes = new ArrayList<String>();
        points = new ArrayList<Point>();
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public PointsList(String name) {
        attributes = new ArrayList<String>();
        points = new ArrayList<Point>();
    }

    public PointsList(String name, List<String> attributes, List<Point> points) {
        this.attributes = attributes;
        this.points = points;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "PointsList{" +
                "attributes=" + attributes + "\n" +
                ", points=" + points +
                '}';
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public void printPoints() {
        for (Point point : points) {
            System.out.println(point);
        }
    }
}

