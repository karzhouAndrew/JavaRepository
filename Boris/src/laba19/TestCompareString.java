package laba19;

//Проверка класса. Сравнение времени выролнения.

public class TestCompareString {
    public static void main(String[] args) {
        String str = "It's difficult to invent this sentence. ";
        int quantityIteration = 1000;
        CompareStringAppend.timeLoopString(str, quantityIteration);
    }
}
