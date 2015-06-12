package lab19;


public class Addition {
    String str;

    public Addition() {

    }

    public Addition(String str) {
        this.str = str;
    }

    public int additionStringOne(String str) {
        int startTimeMethod1 = (int) System.nanoTime();
        int count = 0;
        while (count < 100) {
            str += "+Java";
            count++;
        }
        return (int) System.nanoTime() - startTimeMethod1;
    }

    public int additionStringTwo(StringBuilder str) {
        int startTimeMethod1 = (int) System.nanoTime();
        int count = 0;
        while (count < 100) {
            str.append("+Java");
            str.append(" ");
            count++;
        }
        return (int) System.nanoTime() - startTimeMethod1;
    }
}
