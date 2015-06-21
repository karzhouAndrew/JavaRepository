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

    public int calculateCubeArea() {
        return 6 * side * side;
    }

    public int calculateCubeVolume() {
        return side * side * side;
    }

    public void changeCubeColor(String newColor) {
        color = newColor;
        System.out.println("Установлен новый цвет куба " + color);
    }
}
