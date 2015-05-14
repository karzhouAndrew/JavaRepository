package lab10;

// Prime or not

public class Lab10 {

    final static int NUM = 2147483647;

    public static void main(String[] args) {
        long startPrimeSimple = System.nanoTime();
        System.out.println(primeSimple(NUM));
        long stopPrimeSimple = System.nanoTime();
        System.out.println("primeSimple performance: " + (stopPrimeSimple - startPrimeSimple) + " ns.");

        long startPrimeFerma = System.nanoTime();
        System.out.println(primeFerma(NUM));
        long stopPrimeFerma = System.nanoTime();
        System.out.println("primeFerma performance: " + (stopPrimeFerma - startPrimeFerma) + " ns.");
        System.out.println();
        System.out.println("primeFerma " + (stopPrimeSimple - startPrimeSimple) / (stopPrimeFerma - startPrimeFerma) + " times faster.");
    }

    private static boolean primeSimple(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
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

    private static boolean primeFerma(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 0; i < 100; i++) {
            double a = ((Math.random() * 10 + 1) % (num - 2)) + 2;
            int h = (int) a;
            if (gcd(h, num) != 1) {
                return false;
            }
        }
        return true;
    }
}
