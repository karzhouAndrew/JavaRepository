package lab4;

// Square hole & round cardboard

public class Lab4 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double r = 1.5;
        if (r * 2 * r * 2 <= a * a + b * b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}