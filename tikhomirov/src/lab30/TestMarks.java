package lab30;

import java.io.*;

// Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
public class TestMarks {
    public static void main(String[] args) throws IOException {
        int wordsNumber = 0;
        int marksNumber = 0;
        BufferedReader fileReader = new BufferedReader(new FileReader("D:\\env\\Java\\JavaRepository_1\\" +
                "tikhomirov\\src\\lab30\\example.txt"));
        String str = fileReader.readLine();
        MarksCounter marksCounter = new MarksCounter();
        WordsCounter wordsCounter = new WordsCounter();
        while (str != null) {
            System.out.println(str);
            wordsNumber += wordsCounter.wordsCounter(str);
            marksNumber += marksCounter.marksCounter(str);
            str = fileReader.readLine();
        }
        fileReader.close();
        System.out.println("marksNumber = " + marksNumber);
        System.out.println("wordsNumber = " + wordsNumber);
    }
}