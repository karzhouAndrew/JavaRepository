package doplab8ver2;


public class Change {
    public String changeChildren(String text) {
        String replaceChildren = text.replaceAll("Child", "Children");
        String deleteFigures = replaceChildren.replaceAll("\\d", "");
        return deleteFigures;
    }
}
