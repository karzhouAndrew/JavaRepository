package task30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
public class TextFileAnalyzer {

    public static void main(String[] args) {
        File path = new File("./src/task30/task30.txt");
        TextFileAnalyzer textFileAnalyzer = new TextFileAnalyzer();
        try {
            textFileAnalyzer.printOnConsole(path);
            System.out.print("Punctuation marks quantity :");
            System.out.println(textFileAnalyzer.countPunctuations(path));
            System.out.print("Words quantity :");
            System.out.println(textFileAnalyzer.countWords(path));
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }

    public int countWords(File path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path.getCanonicalPath()));
        String string = bufferedReader.readLine();
        int wordsCounter = 0;
        while (string != null) {
            String[] strings = string.split("[ ]+");
            wordsCounter += strings.length;
            string = bufferedReader.readLine();
        }
        bufferedReader.close();
        return wordsCounter;
    }

    public int countPunctuations(File path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path.getCanonicalPath()));
        int res = bufferedReader.read();
        int punctuationCounter = 0;
        while (res != -1) {
            res = bufferedReader.read();
            boolean isPunctuation = res == '.' || res == ',' || res == '?' || res == '!' || res == ';' || res == ':' || res == '-';
            if (isPunctuation == true) {
                punctuationCounter++;
            }
        }
        bufferedReader.close();
        return punctuationCounter;
    }

    public void printOnConsole(File path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path.getCanonicalPath()));
        int res = bufferedReader.read();
        while (res != -1) {
            System.out.print((char) res);
            res = bufferedReader.read();
        }
        System.out.println();
        bufferedReader.close();
    }
}
