package mathExpression;

import java.util.Scanner;

public class TestExpression {
    public static double getNumFromConsole(boolean b, double realNumber) {
        if (b) {
            return realNumber;
        } else {
            return 0;
        }
    }

    public static void ExceptionTestExpr() {
        System.err.println("Incorrect enter");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x = ");
            double x = getNumFromConsole(sc.hasNextDouble(), sc.nextDouble());
            System.out.print("Enter t = ");
            double t = getNumFromConsole(sc.hasNextDouble(), sc.nextDouble());
            System.out.print("Enter s = ");
            double s = getNumFromConsole(sc.hasNextDouble(), sc.nextDouble());
            double y = Expression.longExpression(x);
            System.out.println("y1 = " + y);
            y = Expression.shortExpression(x, t, s);
            System.out.println("y2 = " + y);
        } catch (Exception e) {
            ExceptionTestExpr();
        }
        sc.close();
    }
}
