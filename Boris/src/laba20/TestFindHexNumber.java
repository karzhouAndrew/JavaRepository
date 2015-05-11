package laba20;

//Проверка класса.
public class TestFindHexNumber {
    public static void main(String[] args) {
        String str = "There are two hex numbers 0x123 and 0xabf 0x4jf";
        FindHexNumber objectFindHex = new FindHexNumber(str);
        objectFindHex.HexOut();
    }
}
