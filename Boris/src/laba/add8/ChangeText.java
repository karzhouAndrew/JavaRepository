package laba.add8;

//Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
public class ChangeText {
    private String str;

    public ChangeText(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void Change (){
        str = str.replaceAll("child","children");
        str = str.replaceAll("Child","Children");
        str = str.replaceAll("\\d+","");
    }
}
