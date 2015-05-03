package Lab16;

public class Lab16 {
    private int counter = 0;

    public void search(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '!') {
                counter++;
            }
        }
        System.out.println("У нас есть " + counter + " знаков ");
    }
}
