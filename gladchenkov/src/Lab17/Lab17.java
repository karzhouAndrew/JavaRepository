package Lab17;

public class Lab17 {
    public void countWords(String str) {
        int count = 1;
        String strNoSpace = str.trim();
        if (strNoSpace.length() > 0) {
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    count++;
                }
            }
            System.out.println("У нас есть " + count + " слов ");
        } else {
            System.out.println("В нашей строке нет слов");
        }
    }
}

