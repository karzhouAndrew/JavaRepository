package work.laba6;


public class TestFindPalindrome {
    public static void main(String[] args) {
        String testString1 = "A roza ypala na lapy Azora. And another mam shalahs . Or something else aa!";
        String testString2 = ". Mam And another shalahs mam. Or  aa something else!";
        String testString3 = " Or something else aa!";
        System.out.println(FindPalindrome.findMaxPalindrome(testString1));
        System.out.println(FindPalindrome.findMaxPalindrome(testString2));
        System.out.println(FindPalindrome.findMaxPalindrome(testString3));
    }
}
