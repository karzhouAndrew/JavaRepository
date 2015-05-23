package lab21;

public class RegularExpressions {
    public String replacingParagraphP(String textWithParagraphs) {
        String str = textWithParagraphs.replaceAll("<p.+?>", "<p>");
        return str;
    }
}
