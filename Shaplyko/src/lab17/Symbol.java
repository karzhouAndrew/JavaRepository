package lab17;

/**
 * Created by Константин on 06.05.2015.
 */
public class Symbol {
    public int word(String strEnter) {
        int n = 0;
        if (strEnter.charAt(0) == ' ') {
            n--;
        }
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == ' ' && i != strEnter.length() - 1) {
                char symbol2 = strEnter.charAt(i + 1);
                if (symbol2 != ' ') {
                    n++;
                }
            }
        }
        return (n + 1);
    }
}
