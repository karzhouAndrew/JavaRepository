package lab7;

/**
 * Задание 7
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
 *
 */
public class Lab7 {
    public static void main(String[] args) {
        int number = 12306;
        String str = Integer.toString(number);
        Set<Integer> set = new HashSet<Integer>();
        while (number > 0) {
            set.add(number % 10);
            number /= 10;
        }
        if (set.size() == str.length()){
            System.out.println("Нет, они различны");
        } else {
            System.out.println("Да, совпадение");
        }
    }
}




