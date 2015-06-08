package laba26;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int mark) {
        students.add(new Student(name, mark));
    }

    public void deleteBadStudyingStudents(int acceptedMark) {
        int studentIndex = students.size() - 1;
        while (studentIndex > -1) {
            if (students.get(studentIndex).getMark() < acceptedMark) {
                students.remove(studentIndex);
            }
            studentIndex--;
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "students = " + students +
                '}';
    }
}
