package lab17;

/**
 * Created by Константин on 06.05.2015.
 */
public class Symbol {
    public int word(String a) {
        int n = 0;
        char symbol;
        if (a.charAt(0) == ' ') {
            n = n - 1;
        }
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == ' ' && i != a.length() - 1) {
                char symbol2 = a.charAt(i + 1);
                if (symbol2 != ' ') {
                    n++;
                }
            }
        }
        return (n + 1);
    }
}
