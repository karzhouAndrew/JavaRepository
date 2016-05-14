package lab4;

import java.util.Scanner;

/* Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"a\" side of the rectangle:");
        int a = scanner.nextInt();
        System.out.println("Enter \"b\" side of the rectangle:");
        int b = scanner.nextInt();
        System.out.println("Enter \"r\" radius of the circle:");
        int r = scanner.nextInt();
        if ((a * a) + (b * b) <= (r * r * 4)) {
            System.out.println("Yes, it can.");
        }else{
            System.out.println("No, it cann't.");
        }
    }
}
