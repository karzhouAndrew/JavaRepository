package laba8;

//Find factorial natural number.
public class MultiplySequence {
    public static void main(String[] args) {
        int randomValue = (int) (Math.random() * 10);
        int multiply = 1;
        if (randomValue==0){
            multiply=0;
        }
        while (randomValue != 0) {
            System.out.print(" "+randomValue);
            multiply *= randomValue;
            randomValue = (int) (Math.random() * 10);
        }
        System.out.println("\n Произведение чисел последовательности равна "+multiply);
    }
}
