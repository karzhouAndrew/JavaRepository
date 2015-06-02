package addtask7;

/**
 * Created by Master on 04.05.2015.
 */
public class Cube {
    private int side;
    private String color;

    public Cube(int side, String color) {
        this.side = side;
        this.color = color;
        System.out.println("Создан объект куб, с стороной = " + this.side + " и цветом =  " + this.color);
    }

    public int cubeArea() {
        return 6 * side * side;
    }

    public int cubeVolume() {
        return side * side * side;
    }

    public void cubeColor(String newColor) {
        color = newColor;
        System.out.println("Установлен новый цвет куба " + color);
    }
}
