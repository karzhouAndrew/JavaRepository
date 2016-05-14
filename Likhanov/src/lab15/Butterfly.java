package lab15;

import java.util.*;

/*
  Create two dimensional square array and fill it in a butterfly style.
 1 1 1 1 1
 0 1 1 1 0
 0 0 1 0 0
 0 1 1 1 0
 1 1 1 1 1
 */
public class Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextByte();
        int[][] butterfly = new int[size][size];
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = i; j < butterfly[i].length -i; j++) {
                butterfly[i][j] = 1;
                butterfly[butterfly.length - 1 - i][j] = 1;
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            System.out.println(Arrays.toString(butterfly[i]));
        }
    }
}


