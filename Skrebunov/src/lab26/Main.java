package lab26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Students student = new Students();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Vasiliy", 0));
        students.add(new Student("Ivan", 0));
        students.add(new Student("Petr", 0));
        students.add(new Student("Pavel", 0));
        students.add(new Student("Kolya", 0));
        students.add(new Student("Igor", 0));
        students.add(new Student("Oleg", 0));
        students.add(new Student("Artem", 0));
        students.add(new Student("Alexandr", 0));
        students.add(new Student("Vitaliy", 0));
        System.out.println(student.createScores(students));
        System.out.println(student.deleteScores(students));
    }
}
