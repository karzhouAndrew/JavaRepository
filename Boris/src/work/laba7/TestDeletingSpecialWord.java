package work.laba7;


public class TestDeletingSpecialWord {
    public static void main(String[] args) {
        int lengthDeletingWord = 4;
        String testString = "If you give a man a fish, he eats for a day.\n" +
                "If you teach a man to fish, he can always eat.\n" +
                "If you give a man a fire, he's warm for a day.\n" +
                "If you light a man on fire, he is warm for the rest of his life.\n";
        System.out.println(testString + "\n");
        System.out.println(
                DeletingWordWithSpecialLength.getTextWithoutWordStartingConsonantAndSpecifiedLength(testString, lengthDeletingWord));
    }
}
