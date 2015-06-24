package lab27;

import java.util.List;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Repeats repeats = new Repeats();
        List<Integer> numbers = repeats.createList(10);
        System.out.println(numbers);
        List<Integer> uniqueNumbers = repeats.deleteRepeats(numbers);
        System.out.println(uniqueNumbers);
    }
}

