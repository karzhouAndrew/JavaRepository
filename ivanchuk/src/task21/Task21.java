package task21;

public class Task21 {
    private static final String PARAGRAPH_PATTERN = "<[pP] .*?>";

    public static String replaceWithSimpleParagraph(String text) {
        return text.replaceAll(PARAGRAPH_PATTERN, "<p>");
    }
}