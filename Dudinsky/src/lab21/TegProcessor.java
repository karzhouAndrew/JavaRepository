package lab21;

public class TegProcessor {
    public String removeAllPTegsParams(String givenStr) {
        return givenStr.replaceAll("<p[^>]+>", "<p>").replaceAll("<P[^>]+>", "<P>");
    }
}