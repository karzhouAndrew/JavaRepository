package workGroup;

/**
 * Created by User on 02.05.2015.
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class HomeWorkNumber6 {
    public static void main(String[] args) {
        int number = 34356968;
        int antiNumber = 0;
        for (; number > 0; antiNumber = 10 * antiNumber + number % 10, number /= 10) ;
        System.out.println(antiNumber);
    }
}
