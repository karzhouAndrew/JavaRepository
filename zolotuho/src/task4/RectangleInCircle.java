package task4;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//Имеется прямоугольное отверстие размерами a и b,
// определить, можно ли его полностью закрыть круглой картонкой радиусом r
public class RectangleInCircle {
    public double enterNumber(Scanner sc) {
        return sc.hasNextDouble() ? sc.nextDouble() : 0;
    }

    public boolean ableRectangleInCircle(double sideA, double sideB, double radius) {
        return 2 * radius >= sqrt(pow(sideA, 2) + pow(sideB, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleInCircle rectangleInCircle = new RectangleInCircle();
        System.out.print("Enter size a = ");
        double sideA = rectangleInCircle.enterNumber(sc);
        System.out.print("Enter size b = ");
        double sideB = rectangleInCircle.enterNumber(sc);
        System.out.print("Enter r = ");
        double radius = rectangleInCircle.enterNumber(sc);
        sc.close();
        if (rectangleInCircle.ableRectangleInCircle(sideA, sideB, radius)) {
            System.out.println("Rectangle can be covered circle");
        } else {
            System.out.println("Rectangle can NOT be covered circle");
        }
    }
}
