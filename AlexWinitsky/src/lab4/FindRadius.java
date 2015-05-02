package lab4;

/**
 * Задание 4 Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r
 * Created by Master on 24.04.2015.
 */
public class FindRadius {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int r = 15;
        double radius;
        radius = Math.sqrt((a * a + b * b)) / 2;
        if (r >= radius) {
            System.out.println("Окружностью радиусом " + r + " можно закрыть прямоугольник со сторонами " + a + " " + b);
        } else {
            System.out.println("Окружностью радиусом " + r + " не возможно закрыть прямоугольник со сторонами " + a + " " + b);
        }
    }
}