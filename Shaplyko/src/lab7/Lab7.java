package lab7;

/**
 * Задание 7
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
 * Для шестизначного числа
 */
public class Lab7 {
    public static void main(String[] args) {
        int number = 12306;
        int i = 0;   //  количество повторений цикла 1
        int n = 0;    //  количество совпадений (равенство) цифр
        int numberLoop1 = number;
        do {
            int numberDigitLoop1 = numberLoop1 % 10;
            int numberShortLoop1 = (numberLoop1 - numberLoop1 % 10) / 10;
            numberLoop1 = numberShortLoop1;
            int numberLoop2 = number;
            while (numberLoop2 > 0) {
                int numberDigitLoop2 = numberLoop2 % 10;
                int numberShortLoop2 = (numberLoop2 - numberLoop2 % 10) / 10;
                numberLoop2 = numberShortLoop2;
                if (numberDigitLoop1 == numberDigitLoop2) {
                    n++;
                }
            }
            i++;
        } while (numberLoop1 > 0);
        if (i == 1) {
            System.out.println("У вас число, состоящее из одной цифры");
        } else {
            if (n > i) {
                System.out.println("Да, совпадение");
            } else {
                System.out.println("Нет, они различны");
            }
        }
    }
}


