package laba28;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую
//оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {
    private List<Student> listingStudents;

    public Students() {
        this.listingStudents = new ArrayList<Student>();
    }

    private class Student {
        private String name;
        private int mark;

        private Student(String name) {
            this.name = name;
            this.mark = (int) (Math.random() * 10 + 1);
        }

        @Override
        public String toString() {
            return "\n" + "Student{" +
                    "name='" + name + '\'' +
                    ", mark=" + mark +
                    '}';
        }
    }

    public void addStudent(String name) {
        listingStudents.add(new Student(name));
    }

    @Override
    public String toString() {
        return "Students{" +
                "listingStudents=" + listingStudents +
                '}';
    }

    public List<Student> getListingStudents() {
        return listingStudents;
    }

    public int getMaxMark() {
        Iterator iterator = listingStudents.iterator();
        int maxMark = 0;
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.mark > maxMark) {
                maxMark = student.mark;
            }
        }
        return maxMark;
    }
}
