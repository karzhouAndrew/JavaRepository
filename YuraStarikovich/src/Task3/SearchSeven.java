package Task3;
//Создайте число. Определите, является ли последняя цифра числа семеркой

import java.util.Scanner;

public class SearchSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Введите число");
            number = sc.nextInt();
            if (number % 10 == 7) {
                System.out.println("Последняя цифра числа равна семи");
                break;
            } else System.out.println("Последняя цифра числа не равна семи");
        }
    }
}
