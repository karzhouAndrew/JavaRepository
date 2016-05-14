package lab9;

/**
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Task09 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20);
        System.out.println(number);
        int maxNumber = number;
        while (number != 0) {
            number = (int) (Math.random() * 20);
            System.out.println(number);
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        System.out.println("The biggest number is " + maxNumber + ".");
    }
}
