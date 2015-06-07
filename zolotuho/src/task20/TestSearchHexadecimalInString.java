package task20;

public class TestSearchHexadecimalInString {

    public static void main(String[] args) {
        String string = "dgfdfgdf 0xab4 0x2d3498 fdgsgsg 0x90993d 0njvfk";
        SearchHexadecimalInString searchHexadecimal = new SearchHexadecimalInString();
        System.out.println(searchHexadecimal.obtainHexadecimalFromString(string));
    }
}
