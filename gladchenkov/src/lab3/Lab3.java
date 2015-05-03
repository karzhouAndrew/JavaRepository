package lab3;

/**
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class Lab3 {
    public static void main(String[] args) {
        int a = 204678;
        if (a % 10 == 7) {
            System.out.println("Псоледняя цифра числа равна 7");
        } else {
            System.out.println("Последняя цифра числа не равна 7");
        }
    }
}

