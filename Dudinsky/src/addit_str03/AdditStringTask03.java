package addit_str03;

/* Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений. */
public class AdditStringTask03 {
    public static void main(String[] args) {
        String givenStr = "!  Это предложение   уникальное  тестовое  первое! Это предложение тестовое второе? Это предложение тестовое третье.";
        TextAnalyser textAnalyser = new TextAnalyser();
        System.out.println("Слова первого предложения, которых нет ни в одном из остальных предложений:");
        System.out.println(textAnalyser.findFirstSentUniqueWords(givenStr));
    }
}
