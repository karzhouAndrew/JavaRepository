package lab3;

//Создайте число. Определите, является ли последняя цифра числа семеркой.
public class Seven {
    public static void main(String[] args) {
        int value = 21321367;
        if (value % 10 == 7) {
            System.out.printf("Число заканчивается на 7");
        } else {
            System.out.printf("Число не заканчивается на 7");
        }
    }
}
