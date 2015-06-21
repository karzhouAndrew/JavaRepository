package lab16;


public class Punctuation {
    public int punctuationNumber(String text) {
        int number = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == ',' || symbol == ';' || symbol == '.' || symbol == '!' || symbol == '?' || symbol == ':') {
                number++;
            }
        }
        return number;
    }
}
