package lab8;

// Factorial

public class Lab8 {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 20);
        int factorial = 1;
        int num = randNum;
        while (num > 1) {
            factorial *= num;
            num--;
        }
        System.out.println("Random number = " + randNum);
        System.out.println("Factorial = " + factorial);
    }
}