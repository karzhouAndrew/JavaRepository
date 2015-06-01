package lab10;

//является ли число простым
public class Lab10 {
    public static void main(String[] args) {
        int number = 13;
        for (int i = 2; i < number; i++) {
            if ((number == 1) || (number == 2) || (number == 3)) {
                System.out.println(number + " является простым числом");
            } else if (number % i == 0) {
                System.out.println(number + " не является простым числом");
                break;
            } else {
                System.out.println(number + " является простым числом");
                break;
            }
        }
    }
}
