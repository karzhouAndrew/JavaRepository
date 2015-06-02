package lab28;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 28
 * Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */
public class BestStudent {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<Students>();
        students.add(new Students("Ivan", ((int) (Math.random() * 10))));
        students.add(new Students("Miron", ((int) (Math.random() * 10))));
        students.add(new Students("Petr", ((int) (Math.random() * 10))));
        students.add(new Students("Vasily", ((int) (Math.random() * 10))));
        students.add(new Students("Maxim", ((int) (Math.random() * 10))));
        students.add(new Students("Alexandr", ((int) (Math.random() * 10))));
        students.add(new Students("Feofan", ((int) (Math.random() * 10))));
        students.add(new Students("Denis", ((int) (Math.random() * 10))));
        students.add(new Students("Vitaly", ((int) (Math.random() * 10))));

        StudentsList studentsList = new StudentsList();
        System.out.println("Список студентов");
        studentsList.printStudentsList(students);
        System.out.println("\n" + "Лучший студент " + studentsList.bestStudent(students));

    }
}
