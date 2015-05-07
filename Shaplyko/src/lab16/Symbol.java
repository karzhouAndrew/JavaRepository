package lab16;

public class Symbol {
    public int comma(String strEnter) {
        int n = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == ',') {
                n++;
            }
        }
        return (n);
    }
    public int point(String strEnter) {
        int n = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == '.') {
                n++;
            }
        }
        return (n);
    }
    public int colon(String strEnter) {
        int n = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == ':') {
                n++;
            }
        }
        return (n);
    }
    public int semicolon(String strEnter) {
        int n = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == ';') {
                n++;
            }
        }
        return (n);
    }
    public int dash(String strEnter) {
        int n = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == '-') {
                n++;
            }
        }
        return (n);
    }
}

