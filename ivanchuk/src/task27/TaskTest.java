package task27;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

public class TaskTest {
    public static void main(String[] args) {
        NumbersList numbersList = new NumbersList(10);
        System.out.println("Исходный список чисел:");
        System.out.println(numbersList);
        numbersList.deleteRepeatingNumbers();
        System.out.println("После удаления повторяющихся чисел:");
        System.out.println(numbersList);
    }
}
