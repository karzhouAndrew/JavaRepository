package task26;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Удалить неудовлетворительные оценки из списка.

import java.util.List;

public class TaskTest {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList(10);
        System.out.println("Исходный список оценок:");
        System.out.println(studentsList);
        List<StudentsList.Student> studentsWithoutBadMarks = studentsList.deleteBadMarks();
        System.out.println("После удаления неудовлетворительных оценок:");
        for (StudentsList.Student student : studentsWithoutBadMarks) {
            System.out.println(student);
        }
    }
}
