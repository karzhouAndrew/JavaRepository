package lab05;

// Add world in the correct case

public class Lab05 {
    public static void main(String[] args) {
        int number = 102;
        if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            System.out.println(number + " рубля");
        } else if (number % 10 == 1 && number % 100 != 11) {
            System.out.println(number + " рубль");
        } else {
            System.out.println(number + " рублей");
        }
    }
}
