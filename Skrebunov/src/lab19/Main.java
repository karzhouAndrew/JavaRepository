package lab19;

/*Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Main {
    public static void main(String[] args) {
        Addition object = new Addition("String");
        System.out.println(object.additionStringOne("String"));
        StringBuilder objectTwo = new StringBuilder("String");
        System.out.println(object.additionStringTwo(objectTwo));
        StringBuffer objectThree = new StringBuffer("String");
        System.out.println(object.additionStringBuffer(objectThree));
    }
}
