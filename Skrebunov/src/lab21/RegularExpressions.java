package lab21;

/**
 * Created by PC on 20.05.2015.
 */
public class RegularExpressions {
    public String replacingParagraphP(String textWithParagraphs) {
        String str = textWithParagraphs.replaceAll("<p.+?>", "<p>");
        return str;
    }
}
