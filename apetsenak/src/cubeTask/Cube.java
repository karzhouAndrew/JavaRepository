package cubeTask;

public class Cube {
    private int edgeLenght;
    private String color;

    public Cube(int edgeLenght) {
        this.edgeLenght = edgeLenght;
        color = "Black";
    }

    public Cube(int edgeLenght, String color) {
        this.edgeLenght = edgeLenght;
        this.color = color;
    }

    public int getEdgeLenght() {
        return edgeLenght;
    }

    public void setEdgeLenght(int edgeLenght) {
        this.edgeLenght = edgeLenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSquare() {
        return edgeLenght * edgeLenght;
    }

    public int getVolume() {
        return getSquare() * edgeLenght;
    }

    public void showCubeFeatures() {
        System.out.println("Длина грани: " + getEdgeLenght() + ". Цвет: " + getColor());
        System.out.println("Площадь: " + getSquare() + ". Объём: " + getVolume());
        System.out.println();
    }
}
