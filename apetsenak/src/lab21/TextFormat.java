package lab21;


public class TextFormat {
    public String replaceTag(String text) {
        return text.replaceAll("<[pP]\\s[^>]*>", "<p>");
    }
}
