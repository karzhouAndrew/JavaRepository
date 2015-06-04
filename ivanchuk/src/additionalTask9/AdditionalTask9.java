package additionalTask9;

public class AdditionalTask9 {
    private static final String NUMBERS_PATTERN = "\\d+";

    public static String replaceChild(String text) {
        return text.replaceAll("child", "children");
    }

    public static String deleteNumbers(String text) {
        return text.replaceAll(NUMBERS_PATTERN, "");
    }
}

