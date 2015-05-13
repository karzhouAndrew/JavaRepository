package lab8;

//найти факториал числа
public class Lab8 {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;
        int fact = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("Факториал числа " + number + " = " + fact);
    }
}
