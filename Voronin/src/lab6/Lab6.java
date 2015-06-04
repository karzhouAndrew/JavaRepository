package lab6;

//написать число наоборот
public class Lab6 {
    public static void main(String[] args) {
        int number = 235731;
        int invertNumber = 0;
        System.out.println(number);
        while (number != 0) {
            invertNumber *= 10;
            invertNumber += number % 10;
            number /= 10;
        }
        System.out.println(invertNumber);
    }
}
