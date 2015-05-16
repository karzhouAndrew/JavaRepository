package pwt.atm;

/**
 * Created by asus on 16.05.2015.
 */
public class BankomatTest {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(100, 100, 100);
        System.out.println(bankomat.dispenseMoney(3170));
    }
}
