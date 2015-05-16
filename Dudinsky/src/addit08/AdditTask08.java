package addit08;

/* 8. Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами. */
public class AdditTask08 {
    public static void main(String[] args) {
        String givenStr = "Every child has a right 123 to freedom from forced and exploitative labour.\n" +
                "In the fight to eliminate all 5 forms of child labour it is important to understand 486 that not all work done by children is classified as child labour.\n" +
                "Child 01 labour should be differentiated from child work.\n" +
                "The term \"child labour\" is often defined as work that deprives 012 children of their childhood, their potential and their dignity, and that is harmful to physical and mental development.";
        System.out.println("Заданный текст: {\n" + givenStr + "\n}.\n\nРезультат замены \'child\' на \'children\' и удаления цифр из текста:\n");
        System.out.println(givenStr.replaceAll("child", "children").replaceAll("Child", "Children").replaceAll("\\d", "").replaceAll("  ", " "));
    }
}
