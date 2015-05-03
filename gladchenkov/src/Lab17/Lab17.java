package Lab17;

public class Lab17 {

    private String str = " Тестовая, строка,! с несколькими,!, запятыми или не только запятыми:  ";
    private int count = 1;
    private char symbol;
    private String strNoSpace = str.trim();

    public void countWords() {
        if (strNoSpace.length() > 0) {  //проверка, пустая ли строка
            for (int i = 0; i < strNoSpace.length(); i++) {  //перебор строки и поиск пробелов
                symbol = strNoSpace.charAt(i);
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

