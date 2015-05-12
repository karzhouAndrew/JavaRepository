package lab19;

/**
 * Created by Master on 08.05.2015.
 */
public class AdditionString {

    long addString(String str) {
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            str = str + str;
        }
        return (System.nanoTime() - start);
    }

    long addStringBuilder(String str) {
        StringBuilder strbuild = new StringBuilder(str);
        long start1 = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            strbuild.append(str);
        }
        return (System.nanoTime() - start1);
    }
}


