package cube;

/**
 * Описать класс куб.
 * 1) Найти площадь куба
 * 2) Найти объем куба
 * 3) Покрасить куб в определенный цвет
 */
public class Cube {
    private int width;
    private String color;

    public Cube(int width) {
        this.width = width;
    }

    public int squareFigure() {
        return 6 * width * width;
    }

    public int volumeFigure() {
        return width * width * width;
    }

    public String getCubeColor() {
        return color;
    }

    public void setCubeColor(String color) {
        this.color = color;
    }
}
