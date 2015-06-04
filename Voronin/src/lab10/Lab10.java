package lab10;

//является ли число простым
public class Lab10 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int number = 5;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println(number + " является простым числом");
        } else {
            System.out.println(number + " не является простым числом");
        }
    }
}
