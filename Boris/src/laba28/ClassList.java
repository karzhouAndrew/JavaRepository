package laba28;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую
//оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassList {
    private List<Student> students;

    public ClassList() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    @Override
    public String toString() {
        return "Students{" +
                "listingStudents=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public int findMaxMark() {
        Iterator iterator = students.iterator();
        int maxMark = 0;
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getMark() > maxMark) {
                maxMark = student.getMark();
            }
        }
        return maxMark;
    }
}
