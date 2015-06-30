package stringTask6;

public  class TestPalindromeFinder {

    public static void main(String[] args) {
        String string = "ksdffc kjsdbcks!  awenewa jsdbk jdjbcks, dbks. hhabahh ksdbksbd";
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        String palindromes = palindromeFinder.findPalindromes(string);
        System.out.println("original string");
        System.out.println(string);
        System.out.println("palindromes");
        System.out.println(palindromes);
    }
}
