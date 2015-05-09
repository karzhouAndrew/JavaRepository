package Lab18;

public class Lab18 {
    private int count = 1;

    public void lastLetter(String str) {
        String strNoSpace = str.trim();
        if (strNoSpace.length() > 0) {
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    char lastSymbol = strNoSpace.charAt(i - 1);
                    count++;
                    System.out.print(lastSymbol);
                }
            }
            System.out.print(strNoSpace.charAt(strNoSpace.length() - 1));
            System.out.println();

            System.out.println("У нас есть " + count + " слов ");
        } else {
            System.out.println("В нашей строке нет слов");
        }
    }

}

