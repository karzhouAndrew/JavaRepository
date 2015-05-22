package lab27;

/**
 * Задание 27
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class Lab27 {
    public static void main(String[] args) {
        int lengthList = 15;
        Processing processing = new Processing();
        processing.generationNumber(lengthList);
        processing.processingNumber();
    }
}

