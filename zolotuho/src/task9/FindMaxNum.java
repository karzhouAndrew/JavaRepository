package task9;

//Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
public class FindMaxNum {
    public static void main(String[] args) {
        int numbers = (int) (Math.random() * 10);
        int max = 0;
        while (numbers != 0) {
            System.out.print(numbers + " ");
            if (max < numbers) {
                max = numbers;
            }
            numbers = (int) (Math.random() * 10);
        }
        System.out.println();
        System.out.println("Max number = " + max);
    }
}
