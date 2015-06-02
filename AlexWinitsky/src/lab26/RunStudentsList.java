package lab26;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 26
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */
public class RunStudentsList {
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

        System.out.println("Список студентов");
        StudentsList studentsList = new StudentsList();
        studentsList.printStudentsList(students);
        System.out.println("\n" + "Отличники и хорошисты ");
        studentsList.printStudentsList(studentsList.bestStudents(students));
        System.out.println("\n" + "Отличники и хорошисты (версия с итерратором)");
        studentsList.printStudentsList(studentsList.bestMark(students));
    }
}
