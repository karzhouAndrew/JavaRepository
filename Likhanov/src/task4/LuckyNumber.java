package task4;

/**
 * Determine if the random number is lucky, magic or unlucky.
 */
public class LuckyNumber {
    public static void main(String[] args) {
        int decade, fivescore, unit;
        int randNum = (int) ((Math.random() * 1000) + (Math.random() * 100) + (Math.random() * 10));
        if (randNum < 100) {
            randNum += 100;
        } else if (randNum > 999) {
            randNum -= 100;
        }
        System.out.println(randNum);
        fivescore = randNum / 100;
        decade = (randNum / 10) % 10;
        unit = randNum % 10;
        if ((fivescore == decade && decade == unit) || (unit - decade == 1 && decade - fivescore == 1)) {
            System.out.println(randNum + " is lucky number!");
        } else if ((randNum == 781) || (randNum == 302) || (randNum == 409) || (randNum == 941)) {
            System.out.println(randNum + " is magic number!");
        } else System.out.println("Sorry, " + randNum + " is unlucky number...");
    }
}
