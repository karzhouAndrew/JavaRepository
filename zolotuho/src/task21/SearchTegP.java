package task21;


public class SearchTegP {
    public String modifyToSimpleP(String string) {
        return string.replaceAll("<[pP][\\s]?[^<]*>", "<p>");
    }

    public static void main(String[] args) {
        String string = "dscdku  <P  index-1> sdhbsbks hsbdjhsd <p fjkd<>k'dd'> pid= sjd>jnjns";
        SearchTegP searchTegP = new SearchTegP();
        System.out.println(string);
        System.out.println(searchTegP.modifyToSimpleP(string));
    }
}
