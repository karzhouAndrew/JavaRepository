package lab8;

/**
 * Задание 8
 * Изменить пример с суммой чисел таким образом, чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 */
public class Lab8 {
    public static void main(String[] args) {
        double averagemultiplication = 0;
        double multiplication = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            multiplication *= x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            averagemultiplication = multiplication / n;
        } else {
            averagemultiplication = 0;
        }
        System.out.println("среднее:" + averagemultiplication + " Произведение: " + multiplication);
    }
}

