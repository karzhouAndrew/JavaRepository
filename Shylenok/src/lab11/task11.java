package lab11;

/**
 * Created by USER on 11.05.2015.
 */
public class task11 {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        int sum = 0;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                k++;
                sum += i;
            }
        }
        System.out.println(sum);
    }
}