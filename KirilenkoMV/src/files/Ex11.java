package files;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asus on 08.06.2015.
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class Ex11 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        try {
            fileWriter = new FileWriter("file.txt");
            fileWriter.write("Тестовый файл,\n");
            fileWriter.write("с тестовым текстом,\n");
            fileWriter.write("записанным в файл при помощи FileWriter, а затем \n");
            fileWriter.write("прочитанным из файла при помощи BufferedInputStream. ");
            fileWriter.close();

            bufferedReader = new BufferedReader(new FileReader("file.txt"));
            String res = bufferedReader.readLine();
            int wordCounter = 0;
            int punctualCounter = 0;
            Pattern patternPunct = Pattern.compile("\\p{Punct}");
            Pattern patternWord = Pattern.compile("\\s+");
            Matcher matcher;
            while (res != null) {

                matcher = patternPunct.matcher(res);
                while (matcher.find()) {
                    punctualCounter++;
                }
                matcher = patternWord.matcher(res);
                while (matcher.find()) {
                    wordCounter++;
                }
                res = bufferedReader.readLine();
            }
            System.out.println("Знаков препинания = " + punctualCounter);
            System.out.println("Слов = " + wordCounter);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
