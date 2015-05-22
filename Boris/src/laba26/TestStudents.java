package laba26;


public class TestStudents {
    public static void main(String[] args) {
        Students students = new Students();
        students.addStudentAndMark("Vasya", 2);
        students.addStudentAndMark("Kolya", 7);
        students.addStudentAndMark("Peter", 9);
        students.addStudentAndMark("Boris", 5);
        students.addStudentAndMark("Andrew", 4);
        students.addStudentAndMark("Dmitry", 6);
        students.addStudentAndMark("Ilia", 2);
        students.addStudentAndMark("Marysya", 4);
        students.addStudentAndMark("Katya", 9);
        students.addStudentAndMark("Jenya", 6);
        students.addStudentAndMark("Vera", 5);
        students.addStudentAndMark("Tanya", 8);
        System.out.println(students);
        Cleaning cleaningList = students;
        cleaningList.deleteBadMarks();
        System.out.println(students);
    }
}
