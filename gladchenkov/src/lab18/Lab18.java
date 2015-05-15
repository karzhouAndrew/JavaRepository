package lab18;

public class Lab18 {


    public void lastLetter(String str) {
        String strNoSpace = str.trim();
        if (strNoSpace.length() > 0) {
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    char lastSymbol = strNoSpace.charAt(i - 1);
                    System.out.print(lastSymbol);
                }
            }
            System.out.print(strNoSpace.charAt(strNoSpace.length() - 1));

        } else {
            System.out.print("в тексте нет слов");
        }
    }
}