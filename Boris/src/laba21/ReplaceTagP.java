package laba21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Класс для замены существущих тегов <P ... > на обычный без стилей <P>
public class ReplaceTagP {
    private final static Pattern pattern = Pattern.compile("<[pP] [^>]*>");

    public static String replaceP(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("<p>");
//        return str.replaceAll("<[pP] [^>]*>", "<p>");
    }


}
