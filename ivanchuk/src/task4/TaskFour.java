package task4;

import java.util.Scanner;

//Имеется прямоугольное отверстие размерами a и b, определить,
//можно ли его полностью закрыть круглой картонкой радиусом r.

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину и высоту прямоугольного отвестия.");
        int width = in.nextInt();
        int height = in.nextInt();
        System.out.println("Введите радиус картонки");
        int radius = in.nextInt();
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        if (2 * radius > hypotenuse) {
            System.out.println("Да, отверстие можно закрыть картонкой радиусом " + radius);
        } else {
            System.out.println("Нет, отверстие нельзя закрыть картонкой радиусом " + radius);
        }
    }
}

