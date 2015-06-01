package stringTask1;

public class TestEqualWordCounter {
    public static void main(String[] args) {
        String string = "  aaa, aaa aaa,  aaa! qqq qqq qww. ttt uuu ttt ttt! aaa, aaa aaa  aaa!  ";
        EqualWordCounter equalWordCounter = new EqualWordCounter();
        String[] sentences = equalWordCounter.splitToSentences(string.trim());
        int[] maxEqualWordsInSentence = equalWordCounter.calculateMaxEqualWordInSentence(string);
        int maxWords = equalWordCounter.findMax(maxEqualWordsInSentence);

        System.out.println("original text: ");
        System.out.println(string);
        System.out.println("sentences which contain max equal words:");
        for (int i = 0; i < maxEqualWordsInSentence.length; i++) {
            if (maxWords == maxEqualWordsInSentence[i]) {
                System.out.println(sentences[i].trim());
            }
        }
    }
}
