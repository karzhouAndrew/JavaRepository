package laba3;

//To create the number. To take out "Is the last numeral '7'?".
public class CheckLastNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 999);
        System.out.println("Рандомное число равно " + number);
        if (number % 10 == 7) {
            System.out.println("Последняя цифра введенного числа 7");
        } else {
            System.out.println("Последняя  цифра числа не равна 7");
        }
    }
}