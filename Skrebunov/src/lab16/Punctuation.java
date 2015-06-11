package lab16;


public class Punctuation {
    public int punctuationNumber(String text) {
        int number = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == ',' || symbol == ';' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == ':') {
                number++;
            }
        }
        return number;
    }
}
