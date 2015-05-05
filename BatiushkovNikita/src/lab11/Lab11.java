package lab11;

// The amount of numbers that are divisible by 3

public class Lab11 {
    public static void main(String[] args) {
        int firstNNumbers = 9;
        int sum = 0;
        for (int i = 0; i <= firstNNumbers; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of numbers divisible by '3' is " + sum + ".");
    }
}
