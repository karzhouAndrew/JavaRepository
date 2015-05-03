package lab08;

/* Задание 8. Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа. */
public class Task08 {
    public static void main(String[] args) {
        double factorial = 1;
        int x = (int) (Math.random() * 20);
        System.out.print("Факториал числа " + x);
        while (x != 0) {
            factorial *= x;
            x--;
        }
        System.out.println(" имеет значение = " + factorial);
    }
}
