package task28;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Найти самую высокую оценку с использованием итератора.

public class TaskTest {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList(10);
        System.out.println("Исходный список оценок:");
        System.out.println(studentsList);
        System.out.println("Наибольшая оценка: " + studentsList.getMaxMarks());
    }
}
