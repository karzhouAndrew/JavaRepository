package pwt.strings;

/**
 * Created by Kirilenko_MV on 11.05.2015.
 * Написать два цикла многократного сложения строк и сравнить производительность обычного сложения и StringBuilder
 */
public class Ex19 {
    public static void main(String[] args) {
        int appendCounter = 1000;
        String appendString = "Hello world! ";
        System.out.println("String sum = " + addStringMillis(appendCounter, appendString));
        System.out.println("StringBuilder = " + addStringBuilderMillis(appendCounter, appendString));
    }

    private static long addStringMillis(int appendCounter, String appendString) {
        String result = "";
        Long startTime = System.nanoTime();
        while (appendCounter > 0) {
            appendCounter--;
            result += appendString;
        }
        return System.nanoTime() - startTime;
    }

    private static long addStringBuilderMillis(int appendCounter, String appendString) {
        Long startTime = System.nanoTime();
        StringBuilder str = new StringBuilder();
        while (appendCounter > 0) {
            appendCounter--;
            str.append(appendString);
        }
        return System.nanoTime() - startTime;
    }
}
