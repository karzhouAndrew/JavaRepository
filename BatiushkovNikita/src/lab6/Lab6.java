package lab6;

// Reverse number

public class Lab6 {
    public static void main(String[] args) {
        int number = 1234;
        int reverseNum = 0;
        while (number != 0) {
            reverseNum = reverseNum * 10 + number % 10;
            number -= number % 10;
            number /= 10;
        }
        System.out.printf("Reverse number = " + reverseNum);
    }
}
