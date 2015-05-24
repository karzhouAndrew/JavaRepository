package task26;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Удалить неудовлетворительные оценки из списка.

public class TaskTest {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList(10);
        System.out.println("Исходный список оценок:");
        System.out.println(studentsList);
        studentsList.deleteBadMarks();
        System.out.println("После удаления неудовлетворительных оценок:");
        System.out.println(studentsList);
    }
}
