package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab20 {
    public void searchNumbers(String str) {
        Pattern p = Pattern.compile("0x[0-9a-fA-F]+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println("Содержит: " + m.group());
        }
    }
}