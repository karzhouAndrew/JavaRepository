package lab26;

/**
 * Задание 26
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные
 * оценки из списка.
 */
public class Lab26 {
    public static void main(String[] args) {
        int lengthList = 10;
        Processing processing = new Processing();
        processing.generationMark(lengthList);
        processing.processingMark();
    }
}
