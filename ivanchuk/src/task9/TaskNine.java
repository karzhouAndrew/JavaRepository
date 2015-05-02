package task9;

// Имеется последовательность случайных чисел, найти и вывести наибольшее из них.

public class TaskNine {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20);
        int numberMax = number;
        while (number != 0) {
            System.out.print(number + "; ");
            if (number > numberMax) {
                numberMax = number;
            }
            number = (int) (Math.random() * 20);
        }
        System.out.println("\n" + "Наибольшее число: " + numberMax);
    }
}
