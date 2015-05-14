package lab07;

// Different digits in number.

public class Lab07 {
    public static void main(String[] args) {
        int number = 120456780;
        boolean answer = false;
        while (number != 0) {
            int interimNumber = (number - number % 10) / 10;
            while (interimNumber != 0) {
                if (number % 10 == interimNumber % 10) {
                    answer = true;
                    break;
                }
                interimNumber /= 10;
            }
            number /= 10;
        }
        System.out.println(answer);
    }
}
