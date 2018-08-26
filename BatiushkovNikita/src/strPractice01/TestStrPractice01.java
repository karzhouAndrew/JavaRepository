package strPractice01;

// Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов
// Попытка модульного тестирования ;)

public class TestStrPractice01 {
    public static void main(String[] args) {
        testMethodGetNumMaxSameWords();
        testMethodGetSentenceMaxSameWords();
    }

    private static void testMethodGetSentenceMaxSameWords() {
        String testCase01 = "A1 A2 A3 A1. Жили-были мужик да баба. Оба были такие ленивые. Так и норовят дело на чужие плечи столкнуть, самим бы только не делать... Трям, трям;; нетрям утрям трям трям. И дверь-то в избу никогда на крюк не закладывали: утром-де вставай да руки протягивай, да опять крюк скидывай... И так проживем. Вот раз баба и свари каши? А уж и каша сварилась! Румяна рассыпчата, крупина жжош от крупины так и отваливается?";
        String testCase02 = "AA AA BB AA. C C D. E F F.";
        System.out.println("Testing method getSentenceMaxSameWords()");
        System.out.printf("testCase01 ");
        System.out.println(StrPractice01.getSentenceMaxSameWords(testCase01).equals("Трям, трям;; нетрям утрям трям трям.") ? "PASSED" : "ERROR");
        System.out.printf("testCase02 ");
        System.out.println(StrPractice01.getSentenceMaxSameWords(testCase02).equals("AA AA BB AA.") ? "PASSED" : "ERROR");
    }

    private static void testMethodGetNumMaxSameWords() {
        String[] testCase01 = {""};
        String[] testCase02 = {"AAA", "BBB", "AAA", "BBB", "AAA", "BBB", "AAA"};
        String[] testCase03 = {"AAA", "B", "C", "D", "E", "F", "AAA"};
        String[] testCase04 = {"A", "B", "C", "AAA", "AAA", "F", "G"};
        System.out.println("Testing method getNumMaxSameWords()");
        System.out.printf("testCase01 ");
        System.out.println((StrPractice01.getNumMaxSameWords(testCase01) == 0) ? "PASSED" : "ERROR");
        System.out.printf("testCase02 ");
        System.out.println((StrPractice01.getNumMaxSameWords(testCase02) == 4) ? "PASSED" : "ERROR");
        System.out.printf("testCase03 ");
        System.out.println((StrPractice01.getNumMaxSameWords(testCase03) == 2) ? "PASSED" : "ERROR");
        System.out.printf("testCase04 ");
        System.out.println((StrPractice01.getNumMaxSameWords(testCase04) == 2) ? "PASSED" : "ERROR");
    }
}
