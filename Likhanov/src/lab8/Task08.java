package lab8;

/**
 * Задание 8. Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
 */
public class Task08 {
    public static void main(String [] args){
        long randomNumber = (long)(Math.random() * 20);
        long factorial = 1;
        for(long i = 1; i <= randomNumber; i++){
        factorial = factorial * i;
        }
        System.out.println("The factorial of " + randomNumber + " is: " + factorial + ".");
    }
}
