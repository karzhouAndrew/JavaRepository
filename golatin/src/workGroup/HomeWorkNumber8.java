package workGroup;

/**
 * Created by User on 02.05.2015.
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
 */
public class HomeWorkNumber8 {
    public static void main(String[] args) {
        int mul = 1;
        int i = 1;
        while (i < 10) {
            mul *= i;
            i++;
        }
        System.out.println(mul);
    }
}
