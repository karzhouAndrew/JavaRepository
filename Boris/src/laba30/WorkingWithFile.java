package laba30;


import java.io.*;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class WorkingWithFile {
    private final String WORD_REGEX = "\\w+";
    private final String PUNCTUATION_REGEX = "\\p{Punct}";
    private String text;

    public void addTextFromFile(String file) {
        BufferedReader inputText = null;
        try {
            inputText = new BufferedReader(new FileReader(file));
            String readLine = inputText.readLine();
            StringBuilder outputBuffer = new StringBuilder();
            while (readLine != null) {
                outputBuffer.append(readLine);
                readLine = inputText.readLine();
                if (readLine != null) {
                    outputBuffer.append("\n");
                }
            }
            this.text = outputBuffer.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputText != null) {
                try {
                    inputText.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int countPunctuationQuantity() {
        return text.split(PUNCTUATION_REGEX).length - 1;

    }

    public int countWordQuantity() {
        return text.split(WORD_REGEX).length - 1;
    }

    public String getText() {
        return text;
    }
}
