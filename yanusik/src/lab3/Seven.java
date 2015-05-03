package lab3;

//Создайте число. Определите, является ли последняя цифра числа семеркой.
public class Seven {
    public static void main(String[] args) {
        int value = 21321367;
        if (value % 10 == 7) {
            System.out.printf("число заканчивается на 7");
        } else {
            System.out.printf("число не заканчивается на 7");
        }
    }
}
