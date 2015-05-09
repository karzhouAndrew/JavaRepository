package lab9;

// Maximum value of digits in the sequence

public class Lab9 {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 10);
        int maxValue = 0;
        while (randNum != 0) {
            randNum = (int) (Math.random() * 10);
            System.out.println("Random x = " + randNum);
            if (maxValue <= randNum) {
                maxValue = randNum;
            }
        }
        System.out.println("Maximum value of x: " + maxValue);
    }
}
