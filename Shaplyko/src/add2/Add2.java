package add2;

/**
 * 2.	Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим,  если  a > b > c > d,
 * то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class Add2 {
    public static void main(String[] args) {
        double[] array = {2, 4, 4, 7};
        double maxArray = array[0];
        int n = 0;
        int i = 0;
        while (i < array.length) {
            if (maxArray <= array[i]) {
                maxArray = array[i];
                n++;
            }
            i++;
        }
        if ((n) == array.length) {
            i = 0;
            while (i < array.length) {
                array[i] = maxArray;
                i++;
            }
        } else {
            i = 0;
            n = 0;
            double minArray = array[0];
            while (i < array.length) {
                if (minArray > array[i]) {
                    minArray = array[i];
                    n++;
                }
                i++;
            }
            if ((n + 1) == array.length) {
            } else {
                i = 0;
                while (i < array.length) {
                    array[i] = Math.pow(array[i], 2);
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
