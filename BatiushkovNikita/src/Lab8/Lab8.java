package Lab8;

// Factorial

public class Lab8 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        int factorial = 1;
        if (x != 0) {
            int num = x;
            while (num >= 1) {
                factorial *= num;
                num--;
            }
        }
        System.out.println("Random number = " + x);
        System.out.println("Factorial = " + factorial);
    }
}
