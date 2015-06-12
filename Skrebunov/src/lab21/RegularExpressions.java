package lab21;

public class RegularExpressions {
    public String replacingParagraphP(String textWithParagraphs) {
        return textWithParagraphs.replaceAll("<p.+?>", "<p>");
    }
}
