package lab28;

import java.util.*;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку
 * с использованием итератора.
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<Student>();
        student.add(new Student("Max", 0));
        student.add(new Student("Helen", 5));
        student.add(new Student("Alex", 9));
        student.add(new Student("David", 4));
        student.add(new Student("Nick", 6));
        student.add(new Student("Julia", 4));
        Iterator<Student> iterator = student.iterator();

        int maxMark = student.get(0).getMark();
        while (iterator.hasNext()) {
            if (iterator.next().getMark() > maxMark) {
                maxMark = iterator.next().getMark();
            }
        }
        System.out.println("Максимальная оценка maxMark = " + maxMark);
    }
}
