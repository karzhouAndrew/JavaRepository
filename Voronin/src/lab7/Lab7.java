package lab7;

//Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны
public class Lab7 {
    public static void main(String[] args) {
        int number = 123456;
        int j = 0;
        for (int i = 0; i < 10 && j < 2; i++) {
            int temp = number % 10;
            if (temp == i) {
                j++;
            }
            number /= 10;
        }
        if (j == 2) {
            System.out.println("Не все цифры числа различны");
        } else System.out.println("Все цифры числа различны");
    }
}
