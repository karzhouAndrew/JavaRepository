package lab19;


public class Calculation {
    public long methodString(String str, String strPlus) {
        long timeout = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            str += strPlus;
        }
        return (System.nanoTime() - timeout);
    }

    public long methodBuilder(String str, String strPlus) {
        StringBuilder strBuilder = new StringBuilder(str);
        long timeout = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            strBuilder.append(strPlus);
        }
        return (System.nanoTime() - timeout);
    }
}


