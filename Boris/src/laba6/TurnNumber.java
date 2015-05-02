package laba6;

//Define number obtained by writing out in the revers order of numerals natural number.
public class TurnNumber {
    public static void main(String[] args) {
        int number = 12345;
        int turnNumber = 0;
        while (number != 0) {
            turnNumber = turnNumber * 10 + number % 10;
            number -= number % 10;
            number /= 10;
        }
        System.out.println(turnNumber);
    }
}
