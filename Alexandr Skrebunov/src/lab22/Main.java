package lab22;

/**
 * Created by PC on 17.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Period firstPeriod = new Period(3, 20, 15);
        Period secondPeriod = new Period(4, 28, 1);
        String result = firstPeriod.compareOfTime(secondPeriod);
        System.out.println(result);
    }
}
