package additionalTask4;

import java.util.Scanner;

//найти счастливые числа
public class HappyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three-digit number : ");
        int number = sc.nextInt();
        sc.close();
        boolean magicNumberPresence = number == 781 || number == 302 || number == 409 || number == 941;
        boolean happyNumberPresence = number == 111 || number == 222 || number == 333 || number == 444 ||
                number == 555 || number == 666 || number == 777 || number == 888 || number == 999 ||
                number == 123 || number == 234 || number == 345 || number == 456 || number == 567 ||
                number == 678 || number == 789;
        if (happyNumberPresence == true) {
            System.out.println("Happy");
        } else if (magicNumberPresence == true) {
            System.out.println("Magic");
        } else {
            System.out.println("Not happy");
        }
    }
}