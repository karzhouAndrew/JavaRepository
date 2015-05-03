package additionalTask6;

public class Cube {
    int edgeLength;
    String color;

    public Cube(int edgeLength, String color) {
        this.edgeLength = edgeLength;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    void paint(String color) {
        this.color = color;
    }

    int area() {
        return 6 * edgeLength * edgeLength;
    }

    int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
}
