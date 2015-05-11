package lab3;

/**
 * The task is to find out is the last digit of a number  equal to 7.
 */
public class lab3 {
    public static void main(String[] args) {
        int number = 817;
        if  (number % 10 == 7) {
            System.out.println("Last digit of a number " + number + " is 7");
        }
        else {
            System.out.println("Last digit of a number " + number + " isn't 7");
        }
    }
}
