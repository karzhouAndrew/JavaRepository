package Lab16;

public class Lab16 {

    private String str = "  Тестовая, строка,! с несколькими,!, запятыми:   ";
    private int counter = 0;
    private char symbol;

    public void search() {
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '!')
                counter++;
        }
        System.out.println("У нас есть " + counter + " знаков ");
    }
}
