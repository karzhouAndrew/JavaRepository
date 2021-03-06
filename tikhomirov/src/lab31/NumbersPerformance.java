package lab31;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersPerformance {
    private List<String> numbers;

    public List<String> printNumbers(String str) {
        numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher((str));
        while (matcher.find()) {
            numbers.add(str.substring(matcher.start(), matcher.end()));
        }
        return numbers;
    }

    public int sumNumbers() {
        int sum = 0;
        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            sum += Integer.parseInt(iterator.next());
        }
        return sum;
    }

    public List<String> deleteDuplicateNumbers() {
        Set<String> noDuplicateNumbers = new HashSet<String>(numbers);
        numbers.clear();
        numbers.addAll(noDuplicateNumbers);
        return numbers;
    }
}
