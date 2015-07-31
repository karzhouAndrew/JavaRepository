package stringTask6;

public class TestPalindromeFinder {

    public static void main(String[] args) {
        String text = "ksdffc kjsdbcks!  awenewa jsdbk jdjbcks, dbks. hhabahh ksdbksbd";
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        String palindromes = palindromeFinder.findPalindromes(text);
        System.out.println("original string");
        System.out.println(text);
        System.out.println("palindromes");
        System.out.println(palindromes);
    }
}
