package lab7;

//Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?

public class Equalnum {
    static int finalnum3 = 0;

    public static void main(String[] args) {

        int number = 12345678;
        int digit1;
        int digit2;
        while (number > 0) {
            int x;
            digit1 = number % 10;
            number = number / 10;
            digit2 = number % 10;
            if (digit1 != digit2) {
                x = 0;
            } else {
                x = 1;
            }
            finalnum3 = finalnum3 + x;
        }
        if (finalnum3 == 0) {
            System.out.println("All the digits are different.");
        } else {
            System.out.println("All the digits ain't different");
        }
    }
}
