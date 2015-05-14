package lab10;

// Prime or not

public class Lab10 {

    final static int NUM = 43;

    public static void main(String[] args) {
        System.out.println(primeSimple(NUM));
    }

    private static boolean primeSimple(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
