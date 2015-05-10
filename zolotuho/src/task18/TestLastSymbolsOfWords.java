package task18;


public class TestLastSymbolsOfWords {
    public static void main(String[] args) {
        String string = new String(" bhvbhsb. jsbvk!    sdcsc jsbd. sdvnknv");
        System.out.println("Original string :");
        System.out.println(string);
        LastSymbolsOfWords word = new LastSymbolsOfWords();
        System.out.println("Word = " + word.createWordOfLastChar(string));
    }
}
