package lab20;

public class RegularExpressions {

    public void replacingParagraphP(String o) {
        String t;
        t = o.replaceAll("<p.+?>", "<p>");
        System.out.println(t);
    }
}
