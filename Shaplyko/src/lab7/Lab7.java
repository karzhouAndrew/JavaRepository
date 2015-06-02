package lab7;

/**
 * Задание 7
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
 */
public class Lab7 {
    public static void main(String[] args) {
        int number = 12306;
        int numberModification = number;
        boolean agreement = false;
        while (numberModification > 10) {
            int numberDigitLoop1 = numberModification % 10;
            int numberDigitLoop2 = numberModification / 10;
            while (numberDigitLoop2 > 0) {
                if (numberDigitLoop1 == numberDigitLoop2 % 10) {
                    agreement = true;
                    break;
                }
                numberDigitLoop2 /= 10;
            }
            numberModification /= 10;
            if (agreement) {
                System.out.println("Да, совпадение");
                break;
            } else if (numberModification < 10) {
                System.out.println("Нет, они различны");
                break;
            }
        }
    }
}




