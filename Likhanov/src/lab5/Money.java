package lab5;

//write "rubles" in a proper form in addition to sum of money
public class Money {
    public static void main(String[] args) {
        int n = 5;
        if (0 == n || n >= 5) {
            System.out.println(n + " ryblei");
        } else if (n == 1) {
            System.out.println(n + " rybl\'");
        } else if (2 <= n && n <= 5) {
            System.out.println(n + " ryblia");
        }
    }
}
