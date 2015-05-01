package task15;

import java.util.Scanner;

//    Создать двухмерный квадратный массив, и заполнить его «бабочкой»
public class ButterflyMatrix {

    public static void main(String[] args) {
        System.out.print("enter odd dimension : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int dim = sc.nextInt();
            int[][] array = new int[dim][dim];
            for (int i = 0; i < array.length; i++) {
                int decrement = array.length - 1 - i;
                if (i <= array.length / 2) {
                    for (int j = i; j < array.length - i; j++) {
                        array[i][j] = 1;
                    }
                } else {
                    for (int j = decrement; j < array.length - decrement; j++) {
                        array[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(" " + array[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Incorrect number is entered");
        }

    }

}


