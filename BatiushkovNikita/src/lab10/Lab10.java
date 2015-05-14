package lab10;

// Prime or not

public class Lab10 {
    public static void main(String[] args) {
        int number = 43;
        int divider = 2;
        boolean answer = true;
        if (number == 1) {
            answer = false;
        }
        for (int i = divider; i * i <= number; i++) {
            if (number % i == 0) {
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
