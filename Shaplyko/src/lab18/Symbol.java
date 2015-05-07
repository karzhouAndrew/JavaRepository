package lab18;

/**
 * Created by Константин on 06.05.2015.
 */
public class Symbol {
    public void word(String a) {
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ') {
                System.out.print(a.charAt(i - 1));
            }
        }
    }
}
