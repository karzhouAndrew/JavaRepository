package lab11;

//Найдите сумму первых n целых чисел, которые делятся на 3
public class Lab11 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        int sum = 0;
        for (i = 1; i <= n * 3; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
