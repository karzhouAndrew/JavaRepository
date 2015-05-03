package lab06;

/* Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n. */
public class Task06 {
    public static void main(String[] args) {
        long givenNumber = 1908417453;
        System.out.println("Заданное число = " + givenNumber);
        long resultNumber = givenNumber % 10;
        while (givenNumber > 9) {
            givenNumber /= 10;
            resultNumber = resultNumber * 10 + givenNumber % 10;
        }
        System.out.println("Число, полученное выписыванием его в обратном порядке = " + resultNumber);
    }
}
