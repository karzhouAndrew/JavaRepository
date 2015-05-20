package classWork;

//Вывести все предложения заданного текста в порядке
//возрастания количества слов в каждом из них
public class TestTextSplitter {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("i like an ice-cream. There is not any table! no? My car would be repaired if i had known.");
        TextSplitter textSplitter = new TextSplitter();
        System.out.println("Original text :");
        System.out.println(stringBuilder);
        int numberSentences = textSplitter.countSentences(stringBuilder);
        StringBuilder[] sentence = new StringBuilder[numberSentences];

        for (int i = 0; i < numberSentences; i++) {
            sentence[i] = new StringBuilder("");
        }

        for (int i = 0; i < numberSentences; i++) {
            textSplitter.obtainSentence(stringBuilder, sentence[i], i);
        }

        int[] numberOfWords = new int[numberSentences];
        for (int i = 0; i < numberOfWords.length; i++) {
            numberOfWords[i] = textSplitter.countWords(sentence[i]);
        }

        int[] indexOrder = new int[numberOfWords.length];
        for (int i = 0; i < indexOrder.length; i++) {
            indexOrder[i] = i;
        }

        int temp = 0;
        for (int i = numberOfWords.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numberOfWords[j] > numberOfWords[i]) {
                    temp = numberOfWords[j];
                    numberOfWords[j] = numberOfWords[i];
                    numberOfWords[i] = temp;
                    temp = indexOrder[j];
                    indexOrder[j] = indexOrder[i];
                    indexOrder[i] = temp;
                }
            }
        }

        for (int i = 0; i < numberOfWords.length; i++) {
            System.out.println(sentence[indexOrder[i]] + "  " + (numberOfWords[i]));
        }
    }
}