package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asus on 08.06.2015.
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
 * распечатать, посчитать сумму, убрать все повторяющиеся числа и сново распечатать.
 */
public class Ex12 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("./KirilenkoMV/src/files/file with digits.txt"));
            String res = bufferedReader.readLine();
            int summa = 0;
            Pattern patternPunct = Pattern.compile("\\d+");
            List<Integer> allDigits = new ArrayList<Integer>();
            Set<Integer> uniqDigits = new HashSet<Integer>();
            while (res != null) {
                Matcher matcher = patternPunct.matcher(res);
                while (matcher.find()) {
                    allDigits.add(Integer.parseInt(matcher.group()));
                }
                res = bufferedReader.readLine();
            }

            for (Integer digit : allDigits) {
                System.out.print(digit + " ");
                summa += digit;
            }
            System.out.println("    summa = " + summa);

            uniqDigits.addAll(allDigits);
            for (Integer digit : uniqDigits) {
                System.out.print(digit + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
