package lab3;

/*Задание №3 - определение является ли полседняя цифра числа семеркой
 * Created by Master on 24.04.2015.
 */
public class Seven {
    public static void main(String[] args) {
        int number = 277;
        if (number % 10 == 7) {
            System.out.println("полседняя цифра числа " + number + " семь");
        } else {
            System.out.println("полседняя цифра числа " + number + " не семь");
        }

    }
}