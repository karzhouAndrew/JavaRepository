package task11;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class SumNumDividedBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter : ");
        if (sc.hasNext()) {
            int quantityNumbers = sc.nextInt();
            int counter = 0;
            int currentNumber = 3;
            int sum = 0;
            while (counter < quantityNumbers) {
                if (currentNumber % 3 == 0) {
                    sum += currentNumber;
                    counter++;
                }
                currentNumber++;
            }
            System.out.printf("Sum numbers which can be divided by three = " + sum);
        } else {
            System.out.println("Incorrect number");
        }
        sc.close();
    }
}
