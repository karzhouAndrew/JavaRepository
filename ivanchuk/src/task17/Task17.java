package task17;

public class Task17 {
    public static int wordsQuantity(String text) {
        String textWithoutSpace = text.trim();
        int quantity = 1;
        int currentSearchPosition = 0;
        while (currentSearchPosition != -1) {
            int lastSearchPosition = currentSearchPosition;
            currentSearchPosition = textWithoutSpace.indexOf(' ', lastSearchPosition);
            if (currentSearchPosition != -1) {
                if (currentSearchPosition - lastSearchPosition > 0) {
                    quantity++;
                }
                currentSearchPosition++;
            }
        }
        return quantity;
    }
}
