package lab16;

/**
 * Created by Константин on 06.05.2015.
 */
public class Symbol {
    public int comma(String a) {
        int n = 0;
        char symbol;
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == ',') {
                n++;
            }
        }
        return (n);
    }
    public int point(String a) {
        int n = 0;
        char symbol;
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == '.') {
                n++;
            }
        }
        return (n);
    }
    public int colon(String a) {
        int n = 0;
        char symbol;
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == ':') {
                n++;
            }
        }
        return (n);
    }
    public int semicolon(String a) {
        int n = 0;
        char symbol;
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == ';') {
                n++;
            }
        }
        return (n);
    }
    public int dash(String a) {
        int n = 0;
        char symbol;
        for (int i = 0; i < a.length(); i++) {
            symbol = a.charAt(i);
            if (symbol == '-') {
                n++;
            }
        }
        return (n);
    }
}

