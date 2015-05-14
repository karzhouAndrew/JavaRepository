package addLab8;


public class TextEditor {
    public String replaceWords(String str) {
        return str.replaceAll("\\bchild\\b", "children");
    }

    public String delDigits(String str) {
        return str.replaceAll("\\d", "");
    }
}
