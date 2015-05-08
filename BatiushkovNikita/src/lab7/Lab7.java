package lab7;

// Different digits in number.

public class Lab7 {
    public static void main(String[] args) {
        int number = 120456780;
        boolean answer = false;
        while (number != 0) {
            int testNum = number % 10;
            int interimNum = number - number % 10;
            interimNum /= 10;
            while (interimNum != 0) {
                if (testNum == interimNum % 10) {
                    answer = true;
                    break;
                }
                interimNum /= 10;
            }
            number /= 10;
        }
        System.out.println(answer);
    }
}
