package additionalTask7;

import java.util.Scanner;

//Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число.

public class TaskTest {
    public static void main(String[] args) {
        System.out.println("Введите х");
        Scanner in = new Scanner(System.in);
        int numberX = in.nextInt();
        System.out.println("Введите t");
        int numberT = in.nextInt();
        System.out.println("Введите s");
        int numberS = in.nextInt();
        in.close();
        System.out.println("y1 = " + AdditionalTask7.firstFunction(numberX));
        System.out.println("y2 = " + AdditionalTask7.secondFunction(numberX, numberT, numberS));
    }
}