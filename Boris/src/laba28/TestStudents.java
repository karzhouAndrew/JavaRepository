package laba28;


public class TestStudents {
    public static void main(String[] args) {

        ClassList students = new ClassList();
        students.addStudent("Kolya");
        students.addStudent("Peter");
        students.addStudent("Vasya");
        students.addStudent("Kate");
        students.addStudent("Tanya");
        students.addStudent("Mike");
        students.addStudent("Nataly");
        students.addStudent("Jenya");
        students.addStudent("Bob");
        System.out.println(students);
        System.out.println(students.findMaxMark());

    }
}
