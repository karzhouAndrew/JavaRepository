package work.laba3;

//

public class TestFindWord {
    public static void main(String[] args) {
        String strExample = "A man was crossing a road one day when a frog called out to him and said," +
                " \"If you kiss me, I'll turn into a beautiful princess.\" He bent over, picked up the " +
                "frog, and put it in his pocket.\n" +
                "\n" +
                "The frog spoke up again and said, \"If you kiss me and turn me back into a beautiful princess, " +
                "I will tell everyone how smart and brave you are and how you are my hero\" The man took the frog " +
                "out of his pocket, smiled at it, and returned it to his pocket.\n" +
                "\n" +
                "The frog spoke up again and said, \"If you kiss me and turn me back into a beautiful princess, I " +
                "will be your loving companion for an entire week.\" The man took the frog out of his pocket, smiled " +
                "at it, and returned it to his pocket.\n" +
                "\n" +
                "The frog then cried out, \"If you kiss me and turn me back into a princess, I'll stay with you for " +
                "a year and do ANYTHING you want.\" Again the man took the frog out, smiled at it, and put it back " +
                "into his pocket.\n" +
                "\n" +
                "Finally, the frog asked, \"What is the matter? I've told you I'm a beautiful princess, that I'll stay " +
                "with you for a year and do anything you want. Why won't you kiss me?\"\n" +
                "\n" +
                "The man said, \"Look, I'm a computer programmer. I don't have time for a girlfriend, but a talking " +
                "frog is cool.\"";
        FindWordIsNotAnotherSentence testObject = new FindWordIsNotAnotherSentence();
        System.out.println(testObject.getWord(strExample));

    }
}
