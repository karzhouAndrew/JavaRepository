package laba27;

//Создать коллекцию. Наполнить ее случайными числами. Удалить повторяющиеся числа.

public class TestNumbers {

    public static void main(String[] args) {

        Numbers numbersCollection = new Numbers();
        AddRandomNumber fillCollection = numbersCollection;
        fillCollection.addRandomNumbers(20);
        System.out.println(numbersCollection);
        ClearDuplicates uniqueCollection = numbersCollection;
        uniqueCollection.clearDuplicates();
        System.out.println(numbersCollection);
    }
}
