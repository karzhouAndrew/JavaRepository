package task16;
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

public class PunctuationChar {

    public int calculateDots(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '.') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateCommas(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateColons(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ':') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateSemicolons(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ';') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateExclamations(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '!') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateQuestions(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '?') {
                counter++;
            }
        }
        return counter;
    }

    public int calculateDashes(String str) {
        char symbol;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '-') {
                counter++;
            }
        }
        return counter;
    }
}
