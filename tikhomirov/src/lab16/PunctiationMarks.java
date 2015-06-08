package lab16;

/**
 * Найти в строке все знаки  препинания и вывести их общее количество
 */

public class PunctiationMarks {

    public static void main(String[] args) {
        String sentence = "Something written...";
        char[] punctuationMarksArray = new char[]{'.', ',', '!', '?', ';', ':', '(', ')', '-'};
        int markNumber = 0;
        int multiDotsMarkNumber = 0;
        for (int i : punctuationMarksArray) {
            for (int j = 0; j < sentence.length(); j++) {
                if (i == sentence.charAt(j)) {
                    markNumber++;
                }
            }
        }
        //поиск многоточий в тексте
        int charPosition = 0;
        while (charPosition != -1) {
            charPosition = sentence.indexOf("...", charPosition);
            if (charPosition != -1) {
                charPosition++;
                multiDotsMarkNumber++;
            }
        }
        System.out.println("Number of punctuation marks is: " + (markNumber - multiDotsMarkNumber * 2));
    }
}


