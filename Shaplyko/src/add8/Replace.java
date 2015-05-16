package add8;

public class Replace {
    public void childReplace(String str) {
        System.out.println(str.replaceAll("child", "children"));
    }
    public void numberReplace(String str) {
        System.out.println(str.replaceAll("\\d", ""));
    }
}