package lab28;

import java.util.List;

/*Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора
 */
public class Main {
    public static void main(String[] args) {
        MaxScore emppty = new MaxScore();
        List<Integer> numbers = emppty.createList(10);
        System.out.println(numbers);
        int maxScore = emppty.maxScore(numbers);
        System.out.println(maxScore);
    }
}
