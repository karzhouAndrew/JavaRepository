package lab9;

/**
 * Найти и вывести натбольшее число из последовательности случайных чисел.
 */
public class TheBiggestNumber {

    public static void main(String[] args) {
        int randomValueNumber = 10;
        int valuesArray[] = new int[randomValueNumber];
        System.out.println("The row of " + randomValueNumber + " random values:");
        for (int i = 0; i < valuesArray.length; i++) {
            valuesArray[i] = (int) (Math.random() * 100);
            System.out.print(valuesArray[i] + "  ");
        }
        System.out.println();
        int maxNumber = valuesArray[0];
        for (int i = 1; i < valuesArray.length; i++) {
            if (valuesArray[i] > maxNumber) {
                maxNumber = valuesArray[i];
            }
        }
        System.out.println("The biggest number is: " + maxNumber);
    }
}


