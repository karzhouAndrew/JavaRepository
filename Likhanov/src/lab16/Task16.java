package lab16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  Find in a string not only commas but other punctuation marks. Count the total number of them.
 */
public class Task16 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        System.out.println("The number of punct marks in the string " + string + " is " + punctCount(string) + ".");
    }

    private static int punctCount(String str) {
        int number = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',' || symbol == ':' || symbol == ';') {
                number++;
            }
        }
        return number;
    }

    private static int commaCount(String str) {
        int number = 0;
        int p = 0;
        while (p != -1) {
            p = str.indexOf(',', p);
            System.out.println(p);
            if (p != -1) {
                p++;
                number++;
            }
        }
        return number;
    }
}