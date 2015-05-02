package workGroup;

/**
 * Created by User on 02.05.2015.
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class HomeWorkNumber5 {
    public static void main(String[] args) {
        int ruble = 112;
        String result = "";
        if ((ruble % 100 == 11) || (ruble % 100 == 12) || (ruble % 100 == 13) || (ruble % 100 == 14)) {
            result = " рублей";
        } else if (ruble % 10 == 1) {
            result = " рубль";
        } else if ((ruble % 10 == 2) || (ruble % 10 == 3) || (ruble % 10 == 4)) {
            result = " рубля";
        } else {
            result = " рублей";
        }
        System.out.println(ruble + result);
    }
}
