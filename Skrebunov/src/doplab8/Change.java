package doplab8;

//исправленная
public class Change {
    public String changeChildren(String text) {
        String replaceChildren = text.replaceAll("Child", "Children");
        String deleteFigures = replaceChildren.replaceAll("\\d", "");
        return deleteFigures;
    }
}
