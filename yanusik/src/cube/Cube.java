package cube;

/**
 * Описать класс куб.
 * 1) Найти площадь куба
 * 2) Найти объем куба
 * 3) Покрасить куб в определенный цвет.
 */
public class Cube {
    int width;
    String color;

    public Cube(int width) {
        this.width = width;
    }

    public int square() {
        return 6 * this.width * this.width;
    }

    public int volume() {
        return this.width * this.width * this.width;
    }

    public String getCubeColor() {
        return color;
    }

    public void setCubeColor(String color) {
        this.color = color;
    }
}
