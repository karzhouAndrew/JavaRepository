package lab4;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить,
 * можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class CircleRectangle {
    public static void main(String[] args) {
        int height = 5;
        int width = 6;
        int radius = 5;
        if (radius >= Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2))) {
            System.out.println("Картонка радиуса r закроет отверстие.");
        } else {
            System.out.println("Картонка радиуса r не закроет отверстие.");
        }
    }
}
