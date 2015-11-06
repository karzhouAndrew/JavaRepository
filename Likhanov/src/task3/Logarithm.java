package task3;

/**
 * Determine what is the max degree of 100 can be calculated using the type int
 */
public class Logarithm {
    public static void main(String[] args) {
        int degree;
        int result = 0;
        for (degree = 0; result < Integer.MAX_VALUE; degree++) {
            result = (int) Math.pow(100, degree);
        }
        System.out.println("The max degree is " + degree);
    }
}
