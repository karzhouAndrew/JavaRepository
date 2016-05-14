package lab2;

import java.util.Arrays;
import java.util.Scanner;

//task 2
public class HellowWorld {
    public static void main(String[] args) {

    }
}





        /*int[] array = {10, 20, 30, 40, 50};
        int[] array2 = {11, 12, 19, 38, 39};
        int aIndex = 0;
        int bIndex = 0;
        int[] result = new int[array.length + array2.length];
        for(int i = 0; i < array.length + array2.length - 2; i++){
            System.out.println(i);
            if(array[aIndex] < array2[bIndex]){
                result[i] = array[aIndex];
                if(aIndex < array.length - 1){
                    aIndex++;
                }
                else{
                    System.arraycopy(array2, bIndex, result, i + 1, array2.length - bIndex);
                }
            } else{
                result[i] = array2[bIndex];
                if(bIndex < array2.length - 1){
                    bIndex++;
                } else {
                    System.arraycopy(array, aIndex, result, i + 1, array.length - aIndex);
                }
            }
        }


        System.out.println(Arrays.toString(result));
    }

}*/



/* System.out.println("Enter the time:");
        Scanner scnanner  = new Scanner(System.in);
        int time = scnanner.nextInt();
        int sec = time % 60;
        int m = (time - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int weeks = (d - days) / 7;
        System.out.println("There are " + weeks + " weeks " + days + " days " + hours + " hours " + min + " minutes " + sec + " seconds.");
        */