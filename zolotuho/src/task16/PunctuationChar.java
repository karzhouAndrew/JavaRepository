package task16;
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationChar {

    public int calculatePunctuationMarks(String str) {
        char symbol;
        int counter = 0;
        Pattern pattern = Pattern.compile("[.,!?[-];:]");
        Matcher matcher = pattern.matcher(str);
        int currentPosition = 0;
        while (matcher.find(currentPosition)) {
            counter++;
            currentPosition = matcher.end();
        }
        return counter;
    }
}
