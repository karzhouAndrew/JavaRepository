package lab26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юленька on 22.05.2015.
 */
public class StudentTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Stepan", 5));
        students.add(new Student("Romuald", 2));
        students.add(new Student("James", 1));
        students.add(new Student("Alex", 10));
        students.add(new Student("Max", 9));
        students.add(new Student("Yuliya", 3));
        System.out.println("Полный список студентов:");
        System.out.println("student = " + students);
        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i).getMark()) < 4) {
                students.remove(i);
                i--;
            }
        }
        System.out.println("Список студентов после удаления неудовлетворительных оценок");
        System.out.println("student = " + students);
    }
}

