package additionalTask8;

public class AdditionalTask8 {
    private static final char[] CONSONANT = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
    private static final char[] VOWELS = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р',
            'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    private static final String OFFERS_PATTERN = "[!?\\.]+ ";

    public static int calcConsonantQuantity(String text) {
        int quantity = 0;
        String textLowerCase = text.toLowerCase();
        for (int i = 0; i < textLowerCase.length(); i++) {
            for (char consonant : CONSONANT) {
                if (textLowerCase.charAt(i) == consonant) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity;
    }

    public static int calcVowelsQuantity(String text) {
        int quantity = 0;
        String textLowerCase = text.toLowerCase();
        for (int i = 0; i < textLowerCase.length(); i++) {
            for (char vowels : VOWELS) {
                if (textLowerCase.charAt(i) == vowels) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity;
    }

    public static StringBuilder[] findOffers(String text) {
        String[] offers = text.split(OFFERS_PATTERN);
        StringBuilder[] newOffers = new StringBuilder[offers.length];
        for (int i = 0; i < newOffers.length; i++) {
            newOffers[i] = new StringBuilder(offers[i].replaceAll("\n", ""));
            newOffers[i].append(" - ").append(newOffers[i].length()).append(" символов.");
        }
        return newOffers;
    }

    public static int calcSpaceQuantity(String text) {
        int quantity = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                quantity++;
            }
        }
        return quantity;
    }

    public static int calcParagraphsQuantity(String text) {
        int quantity = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\n') {
                quantity++;
            }
        }
        return quantity;
    }

    public static String getTextWithoutSpace(String text) {
        return text.replaceAll(" +", "");
    }
}
