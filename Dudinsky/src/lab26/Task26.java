package lab26;

/* Задание 26.
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка. */

import java.util.ArrayList;
import java.util.List;

public class Task26 {
    public static void main(String[] args) {

        String[] pupilNames = {"Иван", "Сергей", "Елена", "Владимир", "Ольга", "Степан", "Николай", "Артем", "Леонид", "Тамара", "Тимофей"};
        final int MAX_MARK = 10;
        final int BOUND_MARK = 4;

        List<PupilMark> pupilMarkList = new ArrayList<>();
        ListProcessor pupilMarkListProcessor = new ListProcessor(pupilMarkList);
        System.out.println("Исходный список при создании:\n" + pupilMarkList);
        pupilMarkListProcessor.addPupilNames(pupilNames);
        System.out.println("Тот же список после заполнения именами из заданного массива:\n" + pupilMarkList);
        pupilMarkListProcessor.fillUpWithRandomMarksUpTo(MAX_MARK);
        System.out.println("После заполнения случайными оценками (по " + MAX_MARK + "-бальной шкале):\n" + pupilMarkList);
        pupilMarkListProcessor.addPupilMark("Александр", 8);
        System.out.println("Результат добавления в список объекта c полями {\"Александр\", 8}:\n" + pupilMarkList);
        pupilMarkListProcessor.deleteAllPupilMarksUnder(BOUND_MARK);
        System.out.println("После удаления объектов с оценками ниже " + BOUND_MARK + " баллов:\n" + pupilMarkList);
    }
}