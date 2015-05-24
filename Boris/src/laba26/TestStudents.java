package laba26;

//Создать список учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные
// оценки из списка.

public class TestStudents {
    public static void main(String[] args) {
        Students students = new Students();
        students.addStudent("Vasya", 2);
        students.addStudent("Kolya", 7);
        students.addStudent("Peter", 9);
        students.addStudent("Boris", 1);
        students.addStudent("Andrew", 4);
        students.addStudent("Dmitry", 6);
        students.addStudent("Ilia", 3);
        students.addStudent("Marysya", 4);
        students.addStudent("Katya", 9);
        students.addStudent("Jenya", 6);
        students.addStudent("Vera", 5);
        students.addStudent("Tanya", 1);
        System.out.println(students);
        students.deleteBadStudyingStudents(4);
        System.out.println(students);
    }
}
