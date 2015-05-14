package task20;


public class TestSearchHexadecimalInString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("dgfdfgdf 0xab4 0x2d3498 fdgsgsg 0x90993d 0njvfk");
        SearchHexadecimalInString searchHexadecimal = new SearchHexadecimalInString();
        System.out.println(searchHexadecimal.obtainEndPosition(stringBuilder, 0));

        int position = 0;
        while (searchHexadecimal.obtainHexadecimalFromString(stringBuilder, position) != null) {
            System.out.println(searchHexadecimal.obtainHexadecimalFromString(stringBuilder, position));
            position = searchHexadecimal.obtainEndPosition(stringBuilder, position);
        }
    }
}
