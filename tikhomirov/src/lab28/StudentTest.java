package lab28;

import java.util.*;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку
 * с использованием итератора.
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Max", 0));
        students.add(new Student("Helen", 5));
        students.add(new Student("Alex", 9));
        students.add(new Student("David", 4));
        students.add(new Student("Nick", 6));
        students.add(new Student("Julia", 4));
        Iterator<Student> iterator = students.iterator();

        int maxMark = students.get(0).getMark();
        while (iterator.hasNext()) {
            if (iterator.next().getMark() > maxMark) {
                maxMark = iterator.next().getMark();
            }
        }
        System.out.println("Максимальная оценка maxMark = " + maxMark);
    }
}
