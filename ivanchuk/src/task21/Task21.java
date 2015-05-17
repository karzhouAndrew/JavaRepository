package task21;

public class Task21 {
    private static final String patternParagraph = "<[pP] .*?>";

    public static String simpleParagraph(String text) {
        return text.replaceAll(patternParagraph, "<p>");
    }
}