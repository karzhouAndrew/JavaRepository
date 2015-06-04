package additionalTask6;

public class Cube {
    private int edgeLength;
    private String color = "Черный";

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getColor() {
        return color;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void repaint(String color) {
        this.color = color;
    }

    public int calculateArea() {
        return 6 * edgeLength * edgeLength;
    }

    public int calculateVolume() {
        return edgeLength * edgeLength * edgeLength;
    }
}
