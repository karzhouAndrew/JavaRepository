package doptask8;

public class Change {
    public void changeChildren(String o) {
        String t;
        String s;
        t = o.replaceAll("Child", "Children");
        s = t.replaceAll("\\d", "");
        System.out.println(s);
    }
}
