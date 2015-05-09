package laba18;

//проверка класса GetWordFromLastLeter
public class TestGetWord {
    public static void main(String[] args) {
        String str = "This text help us to check class GetWord.";
        GetWordFromLastLetter objectExample = new GetWordFromLastLetter(str);
        System.out.println(objectExample.getWord());
    }
}
