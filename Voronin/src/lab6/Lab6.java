package lab6;

//написать число наоборот
public class Lab6 {
    public static void main(String[] args) {
        int number = 235731;
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }
}
