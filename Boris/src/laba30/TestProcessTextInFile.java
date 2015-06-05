package laba30;


public class TestProcessTextInFile {
    public static void main(String[] args) {

        ProcessTextInFile text = new ProcessTextInFile();
        text.addTextFromFile("textForTesting.txt");
        System.out.println(text.getText());
        System.out.println("Punctuation quantity is " + text.getPunctuationQuantity() + ".");
        System.out.println("Word quantity is " + text.getWordQuantity() + ".");
    }
}
