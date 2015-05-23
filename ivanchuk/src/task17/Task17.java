package task17;

public class Task17 {
    public static int wordsQuantity(String text) {
        String textWithoutSpace = text.trim();
        int quantity = 1;
        int currentPositionOfSearch = 0;
        int lastPositionOfSearch;
        while (currentPositionOfSearch != -1) {
            lastPositionOfSearch = currentPositionOfSearch;
            currentPositionOfSearch = textWithoutSpace.indexOf(' ', lastPositionOfSearch);
            if (currentPositionOfSearch != -1) {
                if (currentPositionOfSearch - lastPositionOfSearch > 0) {
                    quantity++;
                }
                currentPositionOfSearch++;
            }
        }
        return quantity;
    }
}
