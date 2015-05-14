package lab10;

// Prime or not

public class Lab10 {

    public final static int NUM = 2147483647;

    public static void main(String[] args) {
        long startPrimeSimple = System.nanoTime();
        System.out.println(isPrime(NUM));
        long stopPrimeSimple = System.nanoTime();
        System.out.println("isPrime performance: " + (stopPrimeSimple - startPrimeSimple) + " ns.");

        long startPrimeFerma = System.nanoTime();
        System.out.println(isPrimeFerma(NUM));
        long stopPrimeFerma = System.nanoTime();
        System.out.println("isPrimeFerma performance: " + (stopPrimeFerma - startPrimeFerma) + " ns.");
        System.out.println();
        System.out.println("isPrimeFerma " + (stopPrimeSimple - startPrimeSimple) / (stopPrimeFerma - startPrimeFerma) + " times faster.");
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int greatestCommonDivisor(int numA, int numB) {
        if (numB == 0) {
            return numA;
        }
        return greatestCommonDivisor(numB, numA % numB);
    }

    private static boolean isPrimeFerma(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 0; i < 100; i++) {
            double a = ((Math.random() * 10 + 1) % (num - 2)) + 2;
            int intA = (int) a;
            if (greatestCommonDivisor(intA, num) != 1) {
                return false;
            }
        }
        return true;
    }
}
