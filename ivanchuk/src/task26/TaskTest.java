package task26;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Удалить неудовлетворительные оценки из списка.

public class TaskTest {
    public static void main(String[] args) {
        MarksList marksList = new MarksList(10);
        System.out.println("Исходный список оценок:");
        System.out.println(marksList);
        marksList.deleteBadMarks();
        System.out.println("После удаления неудовлетворительных оценок:");
        System.out.println(marksList);
    }
}
