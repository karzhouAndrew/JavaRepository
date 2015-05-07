package task15;

import java.util.Arrays;
import java.util.Scanner;

public class ButterflyMatrix {
    public static void main(String[] args) {
        System.out.print("enter odd dimension : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int dim = sc.nextInt();
            sc.close();
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
            for (int[] ints : array) {
                System.out.println(Arrays.toString(ints));
            }
        } else {
            System.out.println("Incorrect number is entered");
        }
    }
}
