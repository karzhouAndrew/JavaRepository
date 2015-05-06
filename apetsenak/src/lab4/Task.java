package lab4;

/**
 * Created by Виталий on 06.05.2015.
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
