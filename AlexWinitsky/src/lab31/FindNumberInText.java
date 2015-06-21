package lab31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Master on 07.06.2015.
 */
public class FindNumberInText {
    public StringBuilder readFile() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./AlexWinitsky/src/lab31/Text.txt"))) {
            String str = bufferedReader.readLine();
            while (str != null) {
                text.append(str);
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public void findNumber(StringBuilder text) {
        String str = text.toString();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        int number = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (matcher.find()) {
            number = Integer.valueOf(matcher.group());
            arrayList.add(number);
            sum = sum + number;
        }
        System.out.println("Цифры в тексте " + arrayList);
        System.out.println("Сумма цифр из текста " + sum);
        System.out.println("Набор цифр после удаления повторяющихся" + deleteRepeatNumber(arrayList));
    }


    public List<Integer> deleteRepeatNumber(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            Integer element = collection.get(i);
            for (int j = i + 1; j < collection.size(); j++) {
                if (element == collection.get(j)) {
                    collection.remove(j);
                    j--;
                }
            }
        }
        return collection;
    }

}
