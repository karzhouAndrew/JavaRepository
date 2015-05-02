package workGroup;

/**
 * Created by User on 02.05.2015.
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class HomeWorkNumber3 {
    public static void main(String[] args) {
        int number = 1999345;
        System.out.println(number % 10 == 7 ? "Является 7" : "Не является 7");
    }
}
