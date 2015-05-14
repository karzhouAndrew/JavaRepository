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

    public int calcSquare() {
        return edgeLenght * edgeLenght;
    }

    public int calcVolume() {
        return calcSquare() * edgeLenght;
    }

    @Override
    public String toString() {
        return "Длина грани: " + getEdgeLenght() + ". Цвет: " + getColor() + "\n" +
                "Площадь: " + calcSquare() + ". Объём: " + calcVolume();
    }
}
