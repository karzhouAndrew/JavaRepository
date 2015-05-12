package lab17;

public class NumberOfWords {

    private String str;

    NumberOfWords(String str) {
        this.str = str;
    }

    int calculateWords() {
        int number = 0;
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String array[] = str.split(" +");
        for (int i = 0; i < array.length; i++) {
            number++;
        }
        return number;
    }


}

