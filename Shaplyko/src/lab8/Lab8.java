package lab8;

/**
 * Задание 8
 * Изменить пример с суммой чисел таким образом, чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 */
public class Lab8 {
    public static void main(String[] args) {
        double multiplication = 1;
        int quantityRepeat = 2;
        int x = 4;
        while (x >= quantityRepeat) {
            multiplication *= quantityRepeat;
            quantityRepeat++;
        }
        System.out.println("Факториал числа " + x + " равен: " + multiplication);
    }
}

