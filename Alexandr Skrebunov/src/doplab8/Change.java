package doplab8;


public class Change {
    public String changeChildren(String text) {
        String replaceChildren;
        String deleteFigures;
        replaceChildren = text.replaceAll("Child", "Children");
        deleteFigures = replaceChildren.replaceAll("\\d", "");
        return deleteFigures;
    }
}
