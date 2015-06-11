package task19;

public class Task19 {
    private static final int NUMBER_OF_ITERATIONS = 10000;

    public static void stringCompose(String text, String word) {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            text += word;
        }
    }

    public static void stringBuilderAppend(StringBuilder text, String word) {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            text.append(word);
        }
    }

    public static void stringBufferAppend(StringBuffer text, String word) {
        for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
            text.append(word);
        }
    }
}
