package lab19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Print down two loops of performing multiple addition of strings, one by adding operator and String,
and another by using StringBuilder and method append. Compare the speed of their implementation.
 */
public class Task19 {
    public static void main(String[] args) throws IOException {
        System.out.println(" Enter the text: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println("If you want to use adding operator and String, press \"1\"");
        System.out.println("or if you want to use StringBuilder and method append, press \"2\"");
        int n = Integer.parseInt(reader.readLine());
        if (n == 1) {
            System.out.println("Here is the result: " + stringAdder(text) + ".");
        } else if (n == 2) {
            System.out.println("Here is the result: " + stringBuilder(text) + ".");
        } else {
            System.out.println("You have entered the wrong number. ERROR!!!");
        }
    }

    private static String stringAdder(String txt) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            txt += " " + txt;
        }
        long after = System.currentTimeMillis();
        System.out.println("It took " + (after- before)  + " ms.");
        return txt;
    }

    private static StringBuilder stringBuilder(String txt) {
        StringBuilder builder = new StringBuilder();
        StringBuilder str = new StringBuilder();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            str = builder.append(" " + txt);
        }
        long after = System.currentTimeMillis();
        System.out.println("It took " + (after- before)  + " ms.");
        return str;
    }
}
