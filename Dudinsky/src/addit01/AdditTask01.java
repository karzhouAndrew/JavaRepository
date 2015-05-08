package addit01;

/* Определить сумму первых трех цифр дробной части заданного положительного вещественного числа */
public class AdditTask01 {
    public static void main(String[] args) {
        double givenNumber = 253.7145864;
        int digitsQuantity = 3;
        int sumOfDigits = 0;
        System.out.print("Сумма первых " + digitsQuantity + " цифр заданного положительного вещественного числа " + givenNumber + " равняется: ");
        for (int i = 0; i < digitsQuantity; i++) {
            givenNumber *= 10;
            sumOfDigits += (int) givenNumber % 10;
        }
        System.out.println(sumOfDigits);
    }
}