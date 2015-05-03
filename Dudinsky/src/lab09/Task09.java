package lab09;

/* Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них. */
public class Task09 {
    public static void main(String[] args) {
        int inputNumber = (int) (Math.random() * 20);
        int maxNumber = inputNumber;
        System.out.println("Последовательность случайных чисел от 0 до 19 (генерируется пока не попадется нуль):");
        System.out.print(inputNumber + " ");
        while (inputNumber != 0) {
            inputNumber = (int) (Math.random() * 20);
            System.out.print(inputNumber + " ");
            if (inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.println();
        System.out.println("Наибольшее число в последовательности: " + maxNumber);
    }
}