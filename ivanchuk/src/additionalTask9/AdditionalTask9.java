package additionalTask9;

public class AdditionalTask9 {
    private static final char[] NUMBERS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static String replaceChild(String text) {
        return text.replaceAll("child", "children");
    }

    public static StringBuilder deleteNumbers(StringBuilder text) {
        StringBuilder textWithoutNumbers = new StringBuilder(text);
        int numbersQuantity = 0;
        for (int i = 0; i < text.length(); i++) {
            for (char number : NUMBERS) {
                if (text.charAt(i) == number) {
                    textWithoutNumbers.delete(i - numbersQuantity, i - numbersQuantity + 1);
                    numbersQuantity++;
                }
            }
        }
        return textWithoutNumbers;
    }
}

