package lab19;

/**
 * Задание 19
 * Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class StringAndStringBuilder {
    public static void main(String[] args) {
        String str = "Мама мыла раму";

        AdditionString addStr=new AdditionString();
        System.out.println("Время сложение строк с помощью String " + addStr.addString(str));
        System.out.println("Время сложение строк с помощью StringBuilder " + addStr.addStringBuilder(str));




    }


}

