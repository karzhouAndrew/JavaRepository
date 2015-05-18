package work.laba5;

//


public class TestReplace {
    public static void main(String[] args) {
        String strExample = "1A Scotsman who was driving home one night, ran into a car driven by an Englishman1. " +
                "2The Scotsman got out of the car to apologize and offered the Englishman a drink from a bottle of " +
                "whisky2. 3The Englishman was glad to have a drink3.\n" +
                "\"4Go on,\" said the Scot, \"have another drink4.\"\n" +
                "5The Englishman drank gratefully5. \"6But don't you want one, too?\" he asked the Scotsman6. \n" +
                "\"7Perhaps,\" replied the Scotsman, \"after the police have gone7.\" ";
        System.out.println(ReplaceFirstAndLastWordInSentence.replaceWordInSentence(strExample));
    }
}
