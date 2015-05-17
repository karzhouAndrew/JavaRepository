package lab7;

/**
 * Задание 7
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
 */
public class DifferentNumber {

    public static void main(String[] args) {
        int number = 782512;
        int tempNumber = number;
        boolean flag = false;

        while (tempNumber > 0) {
            int num = tempNumber % 10;
            tempNumber = tempNumber / 10;
            int tempNum = tempNumber;
            while (tempNum > 0) {
                if (num == tempNum % 10) {
                    System.out.println("В числе " + number + " находятся одинаковые цифры " + num);
                    flag = true;
                }
                tempNum = tempNum / 10;
            }
        }
        if (!flag) {
            System.out.println("В числе " + number + " находятся разные цифры");
        }
    }

}
