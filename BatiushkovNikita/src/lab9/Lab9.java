package lab9;

// Maximum value of digits in the sequence

public class Lab9 {
    public static void main(String[] args) {
        int randNum = (int) (Math.random() * 10);
        int maxValue = 0;
        do {
            randNum = (int) (Math.random() * 10);
            System.out.println("Random x = " + randNum);
            if (maxValue <= randNum) {
                maxValue = randNum;
            }
        } while (randNum != 0);
        System.out.println("Maximum value of x: " + maxValue);
    }
}
