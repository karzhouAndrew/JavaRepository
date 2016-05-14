package golovach;

/**
 * Created by NotePad.by on 11.05.2016.
 */
public class Recursion {
    public static void main(String[] args) {
    Holder h = new Holder(0, 1);
        h = f(h);
        System.out.println(h.field0[0] + " " + h.field1[0]);
}

private static Holder f(Holder arg){
arg.field0 = null;
    arg.field1[0] = 100;
    arg = new Holder(-1, -2);
    arg.field0 = new int[]{1, 2, 3};
arg.field1[0] = 100;
    return arg;
}
}

class Holder{
    int[] field0;
    int[] field1;

    Holder(int x, int y){
        this.field0 = new int []{x};
        this.field1 = new int []{y};
    }
}
