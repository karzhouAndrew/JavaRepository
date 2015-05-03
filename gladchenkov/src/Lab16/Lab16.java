package Lab16;

public class Lab16 {

    public void search(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '!') {
                counter++;
            }
        }
        System.out.println("У нас есть " + counter + " знаков ");
    }
}
