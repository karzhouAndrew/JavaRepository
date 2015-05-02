package workGroup;

/**
 * Created by User on 02.05.2015.
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class HomeWorkNumber11 {
    public static void main(String[] args) {
        int sum = 0, n = 4, del = 3;
        for (int i = 0; i < n; sum += i * del, i++) ;
        System.out.println("Сумма " + n + " первых целых чисел, делящихся на " + del + " = " + sum);
    }
}
