package lab28;

/* Задание 28. Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.

УТОЧНЯЮ ЗАДАНИЕ: Вывести ПОЛНЫЙ список учеников, имеющих максимальную оценку. */

import java.util.ArrayList;
import java.util.List;

public class Task28 {
    public static void main(String[] args) {

        String[] pupilNames = {"Иван", "Сергей", "Елена", "Владимир", "Ольга", "Степан", "Николай", "Артем", "Леонид", "Тамара", "Тимофей"};
        final int MAX_MARK = 10;

        List<PupilMark> pupilMarkList = new ArrayList<>();
        ListProcessor pupilMarkListProcessor = new ListProcessor(pupilMarkList);
        pupilMarkListProcessor.addPupilNames(pupilNames);
        pupilMarkListProcessor.fillUpWithRandomMarksUpTo(MAX_MARK);
        System.out.println("Результат заполнения случайными оценками (по " + MAX_MARK + "-бальной шкале):\n" + pupilMarkList);
        int maxMark = pupilMarkListProcessor.getMaximumMark();
        System.out.println("Максимальная оценка в списке: " + maxMark);
        System.out.println("Список всех учеников с оценками, равными максимальной:\n" + pupilMarkListProcessor.getAllMarksListEqualTo(maxMark));
    }
}