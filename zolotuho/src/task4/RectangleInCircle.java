package task4;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//Имеется прямоугольное отверстие размерами a и b,
// определить, можно ли его полностью закрыть круглой картонкой радиусом r
public class RectangleInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double radius = 0;
        System.out.print("Enter size a = ");
        if (sc.hasNextDouble()) {
            sideA = sc.nextDouble();
        } else {
            System.out.println("Incorrect Number!!");
        }

        System.out.print("Enter size b = ");
        if (sc.hasNextDouble()) {
            sideB = sc.nextDouble();
        } else {
            System.out.println("Incorrect Number!!");
        }

        System.out.print("Enter r = ");
        if (sc.hasNextDouble()) {
            radius = sc.nextDouble();

        } else {
            System.out.println("Incorrect Number!!");
        }
        if (2 * radius >= sqrt(pow(sideA, 2) + pow(sideB, 2))) {
            System.out.println("Rectangular can be covered by Circle");
        } else {
            System.out.println("Rectangular can NOT be covered  Circle");
        }
        sc.close();
    }
}
