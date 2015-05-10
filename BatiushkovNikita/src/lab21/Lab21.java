package lab21;

// Find <p parameters> and replaced by <p>

public class Lab21 {
    public static void main(String[] args) {
        String testString = "<p>eddsds <p id=\\\"p1\\\">re may <pppp/> c>ause<p align=\\\"left\\\"> the resu<p/>lts <p ement s <p>";
        String regEx = "<p.*?>";
        String replaceBy = "<p>";
        System.out.println(testString);
        System.out.println(getString(testString, regEx, replaceBy));
    }

    private static String getString(String testString, String regEx, String replaceBy) {
        return testString.replaceAll(regEx, replaceBy);
    }
}

