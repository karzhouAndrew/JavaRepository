package Lab16;

public class Lab16 {

    private String str = "  Тестовая, строка,! с несколькими,!, запятыми:   ";
    private int n = 0;
    private char symbol;

    public void search() {
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '!')
                n++;
        }
        System.out.println("У нас есть " + n + " знаков ");
    }
}
