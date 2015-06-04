package lab27;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class Task {
    public static void main(String[] args) {
        NumbersCollection numbersCollection = new NumbersCollection();
        numbersCollection.fillList(20);
        System.out.println("numbersCollection : \n" + numbersCollection);
        numbersCollection.removeSameNumbers();
        System.out.println("numbersCollection : \n" + numbersCollection);
    }
}
