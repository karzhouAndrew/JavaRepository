package lab19;

/*Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition("String");
        System.out.println(addition.additionStringOne("String"));
        StringBuilder objectTwo = new StringBuilder("String");
        System.out.println(addition.additionStringTwo(objectTwo));
        StringBuffer objectThree = new StringBuffer("String");
        System.out.println(addition.additionStringBuffer(objectThree));
    }
}
