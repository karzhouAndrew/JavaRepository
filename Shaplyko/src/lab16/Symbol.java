package lab16;

public class Symbol {
    public int sumPunctuationMark(String strEnter) {
        int sumPunctuationMark = 0;
        for (int i = 0; i < strEnter.length(); i++) {
            char symbol = strEnter.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == ':' || symbol == ';' || symbol == '-') {
                sumPunctuationMark++;
            }
        }
        return sumPunctuationMark;
    }
}
