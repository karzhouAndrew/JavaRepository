package lab5;

/**
 * Created by USER on 04.05.2015.
 */
/*Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.*/
public class task5 {
    public static void main(String[] args) {
        int a = 5890;
        if (a % 100 == 11) {
            System.out.println(a + " рублей");
        } else if (a % 100 == 12) {
            System.out.println(a + " рублей");
        } else if (a % 100 == 13) {
            System.out.println(a + " рублей");
        } else if (a % 100 == 14) {
            System.out.println(a + " рублей");
        } else if (a % 100 == 15) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 1) {
            System.out.println(a + " рубль");
        } else if (a % 10 == 2) {
            System.out.println(a + " рубля");
        } else if (a % 10 == 3) {
            System.out.println(a + " рубля");
        } else if (a % 10 == 4) {
            System.out.println(a + " рубля");
        } else if (a % 10 == 5) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 6) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 7) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 8) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 9) {
            System.out.println(a + " рублей");
        } else if (a % 10 == 0) {
            System.out.println(a + " рублей");
        }
    }
}




    /*public class task3 {
    public static void main(String[] args) {
        int[] array = {40, 20, 10, 30, 60, 50};
        for (int k = 0; k < array.length - 1; k++)
            if (array [k]> array[k+1]){
                swap(array, k, k + 1);
            }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j)

    {int tmp = array[i];
        array[i]=array[j];
        array[j]=tmp;}

}*/
/*
public class task3 {
    public static void main(String[] args) {
        int[] array = {40, 20, 10, 60, 30, 50};
        for (int k = 0; k < array.length-1 ; k++)
            if (array[k] > array[k + 1]) {
                int tmp = array[k];
                array[k] = array [k+1];
                array[k+1] = tmp;
            }
        System.out.println(array[array.length-1]);

    }
}*/

