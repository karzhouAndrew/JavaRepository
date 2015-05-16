package task16;

public class Task16 {
    private static final char[] PUNCTUATION_MARK = {'.', ',', ':', ';', '!', '?', '-'};

    public static int quantityOfPunctuation(String text) {
        int quantity = 0;
        for (int i = 0; i < text.length(); i++) {
            for (char punctuationMark : PUNCTUATION_MARK) {
                if (text.charAt(i) == punctuationMark) {
                    quantity++;
                }
            }
        }
        return quantity;
    }
}