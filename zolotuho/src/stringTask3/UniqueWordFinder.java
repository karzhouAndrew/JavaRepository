package stringTask3;

//3.Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
public class UniqueWordFinder {
    public String[] splitToSentence(String string) {
        return string.split("[.!?]");
    }

    public String[] splitToWord(String string) {
        return string.split("[ ,.;:]+");
    }

    public String findUniqueWords(String sentence, String string) {
        String[] words = splitToWord(sentence);
        string = string.replace(sentence, "");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            boolean wordCases = string.contains(" " + words[i] + " ") ||
                    string.contains(" " + words[i] + ",") ||
                    string.contains(" " + words[i] + ":") ||
                    string.contains(" " + words[i] + ";") ||
                    string.contains(" " + words[i] + ".") ||
                    string.contains(" " + words[i] + "?") ||
                    string.contains(" " + words[i] + "!");
            if (wordCases == false) {
                stringBuilder.append(words[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string = "qqq, www, rrr. kjhkhj ,jnjnn hbhbhh bmhmbh. hbb wwwttt, rrr jbjb, qqq.";
        System.out.println("original text");
        System.out.println(string);
        System.out.println("unique words in the first sentence");
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String[] sentence = uniqueWordFinder.splitToSentence(string);
        String uniqueWords = uniqueWordFinder.findUniqueWords(sentence[0], string);
        System.out.println(uniqueWords);
    }
}