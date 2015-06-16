package lab28;

/**
 * Задание 28
 * Создать список оценок учеников с помощью ArryList, заполнить случайными оценками. Найти самую высокую
 * оценку с использованием итератора.
 */
public class Lab28 {
    public static void main(String[] args) {
        int lengthList = 10;
        Processing processing = new Processing();
        processing.generationMark(lengthList);
        processing.processingMark();
    }
}
