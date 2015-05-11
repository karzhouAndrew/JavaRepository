package laba21;

// Проверка класса ReplaceTagP
public class TestReplaceTagP {
    public static void main(String[] args) {
        String strExample = "  <p id> It's ok. </p> <P >. <pattern> This is <p> Example </p>string</p> </p>";
        ReplaceTagP objectExample = new ReplaceTagP(strExample);
        objectExample.replaceP();
        System.out.println(objectExample.getStr());
    }
}
