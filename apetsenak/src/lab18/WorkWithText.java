package lab18;

public class WorkWithText {
    public String createNewText(String oldText) {
        String newText = "";
        for (int i = 0; i < oldText.length(); i++) {
            if (i != 0 && (oldText.charAt(i) == ' ' || oldText.charAt(i) == '.' || oldText.charAt(i) == ',')) {
                if (oldText.charAt(i - 1) != ' ' && oldText.charAt(i - 1) != '.' && oldText.charAt(i - 1) != ',') {
                    newText += oldText.substring(i - 1, i);
                }
            } else if (i + 1 == oldText.length()) {
                newText += oldText.substring(i, i + 1);
            }
        }
        return newText;
    }
}
