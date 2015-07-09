package task18;

public class TestLastWordsSymbols {
    public static void main(String[] args) {
        String text = " bhvbhsb. jsbvk!    sd  hvv csc jsffbd. sdvnknv";
        System.out.println("Original string :");
        System.out.println(text);
        LastWordsSymbols word = new LastWordsSymbols();
        System.out.println("Word = " + word.createLastCharWord(text));
    }
}
