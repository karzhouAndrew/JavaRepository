package classWork;

//Вывести все предложения заданного текста в порядке
//возрастания количества слов в каждом из них
public class TestTextSplitter {
    public static void main(String[] args) {

        String string = "i like an ice-cream. There is not any table! no?   My car would be repaired if i had known.";
        TextSplitter textSplitter = new TextSplitter();
        System.out.println("Original text :");
        System.out.println(string);
        int numberSentences = textSplitter.countSentences(string);
        String[] sentence = textSplitter.obtainSentences(string);
        int[] wordsNumber = new int[numberSentences];
        for (int i = 0; i < wordsNumber.length; i++) {
            wordsNumber[i] = textSplitter.countWords(sentence[i]);
        }
        int[] indexOrder = new int[wordsNumber.length];
        for (int i = 0; i < indexOrder.length; i++) {
            indexOrder[i] = i;
        }
        int temp = 0;
        for (int i = wordsNumber.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (wordsNumber[j] > wordsNumber[i]) {
                    temp = wordsNumber[j];
                    wordsNumber[j] = wordsNumber[i];
                    wordsNumber[i] = temp;
                    temp = indexOrder[j];
                    indexOrder[j] = indexOrder[i];
                    indexOrder[i] = temp;
                }
            }
        }
        for (int i = 0; i < wordsNumber.length; i++) {
            System.out.println(sentence[indexOrder[i]] + "  " + (wordsNumber[i]));
        }
    }
}