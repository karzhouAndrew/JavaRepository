package lab26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юленька on 22.05.2015.
 */
public class StudentTest {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<Student>();
        student.add(new Student("Stepan", 5));
        student.add(new Student("Romuald", 2));
        student.add(new Student("James", 1));
        student.add(new Student("Alex", 10));
        student.add(new Student("Max", 9));
        student.add(new Student("Yuliya", 3));
        System.out.println("Полный список студентов:");
        System.out.println("student = " + student);
        for (int i = 0; i < student.size(); i++) {
            if ((student.get(i).getMark()) < 4) {
                student.remove(i);
                i--;
            }
        }
        System.out.println("Список студентов после удаления неудовлетворительных оценок");
        System.out.println("student = " + student);
    }
}

