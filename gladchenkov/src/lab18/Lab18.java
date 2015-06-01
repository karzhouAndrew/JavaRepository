package lab18;

public class Lab18 {
    public String lastLetter(String str) {
        String strNoSpace = str.trim();

        if (strNoSpace.length() > 0) {
            String lastSymbol = "";
            for (int i = 0; i < strNoSpace.length(); i++) {
                char symbol = strNoSpace.charAt(i);
                if (symbol == ' ') {
                    lastSymbol += strNoSpace.charAt(i - 1);
                }
            }

            lastSymbol += strNoSpace.charAt(strNoSpace.length() - 1);
            return lastSymbol;
        } else {
            System.out.print("в тексте нет слов ");
            return null;
        }
    }
}