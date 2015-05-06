package lab4;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить,
 * можно ли его полностью закрыть круглой картонкой радиусом r
 */
public class Task {
    public static void main(String[] args) {
        int height = 3;
        int width = 4;
        int radius = 5;
        if (radius >= Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2))) {
            System.out.println("Картонка заданного радиуса закроет отверстие.");
        } else {
            System.out.println("Картонка заданного радиуса не закроет отверстие.");
        }

    }
}
