package dopLab8;

public class DopLab8 {
    public String replaceWord(String str) {
        return str.replaceAll("[Cc]hild", "children");
    }

    public String replaceNumbers(String str) {
        return str.replaceAll("\\d", "");
    }
}
