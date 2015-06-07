package stringTask5;


public class TestBorderWordsExchange {
    public static void main(String[] args) {
        String string = "  qqqffff rrr ttt. yy.   ggg, bbb    sss! lll jjj kkk. rr.  ";
        BorderWordsExchange borderWordsExchange = new BorderWordsExchange();
        String modifiedString = borderWordsExchange.exchangeWordsInSentence(string);
        System.out.println("original string");
        System.out.println(string);
        System.out.println("modified string");
        System.out.println(modifiedString);
    }
}
