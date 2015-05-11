package laba21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс для замены существущих тегов <P ... > на обычный без стилей <P>
public class ReplaceTagP {
    private final Pattern pattern = Pattern.compile/*("<p.*?>");*/("<[pP] [^>]*>");
    private String str;

    public ReplaceTagP(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void replaceP() {
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.replaceAll("<p>"));
    }
//        str = str.replaceAll("<[pP] [^>]*>", "<p>");
//        System.out.println(str);
//    }


}
