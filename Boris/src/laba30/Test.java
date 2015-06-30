package laba30;


public class Test {
    public static void main(String[] args) {

        WorkingWithFile text = new WorkingWithFile();
        text.addTextFromFile("textForTesting.txt");
        System.out.println(text.getText());
        System.out.println("Punctuation quantity is " + text.countPunctuationQuantity() + ".");
        System.out.println("Word quantity is " + text.countWordQuantity() + ".");
    }
}
