package Lab14;

/**
 * Определите сумму элементов одномерного массива, расположен-ных между минимальным и максимальным значениями.
 */
public class Lab14 {
    public static void main(String[] args) {
        int marks[] = {2, 1, 2, 2, 15, 7, 8, 3, 21, 20};
        int maxMark = marks[0];
        int minMark = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;


        for (int i = 0; i < marks.length; i++) {
            System.out.println("Ученик № " + i + " = " + marks[i]);
        }
        for (int i = 0; i < marks.length; i++) {  //поиск максимального числа в массиве
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < marks.length; i++) {  //поиск минимального числа в массиве
            if (minMark > marks[i]) {
                minMark = marks[i];
                minIndex = i;
            }
        }

        for (int i = minIndex + 1; i < maxIndex; i++) { //сумма между минимальным значением и максимальным
            sum = sum + marks[i];
        }
        System.out.println("Сумма чисел между минимальным индексом " + minIndex + " и максимальным " + maxIndex + " = " + +sum);

    }
}