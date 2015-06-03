package lab11;

/**
 * Найти сумму первых n чисел которые делятся на 3.
 */
public class DivisionIntoThree {
    public static void main(String[] args) {
        int valuesSumm = 0;
        int valuesNumber = (int) (Math.random() * 10);
        for (int i = 1; i <= valuesNumber; i++) {
            if (i % 3 == 0) {
                valuesSumm += i;
            }
        }
        System.out.println("Среди первых " + valuesNumber + " чисел сумма чисел, делящихся на 3,  равна " + valuesSumm);
    }
}


