package laba.add5_1;

//Есть строка со скобками. Определить: нет ли скобок, не имеющих пары, кол-во скобок.
public class FindBrackets {
    public static void main(String[] args) {
        String sentence = "sd)((f) ((sdf))(sfdsf))(";
        char[] arrayLetters = sentence.toCharArray();
        int equalityBracket = 0;
        int quantityOpenBracket = 0;
        int quantityCloseBracket = 0;
        boolean correctPosition = true;
        for (int i = 0; i < sentence.length(); i++) {
            if (arrayLetters[i] == '(') {
                quantityOpenBracket++;
                equalityBracket++;
            }
            if (arrayLetters[i] == ')') {
                quantityCloseBracket++;
                equalityBracket--;
            }
            if (equalityBracket < 0) {
                correctPosition = false;
            }
        }
        if (equalityBracket == 0) {
            if (quantityCloseBracket == 0) {
                System.out.println("Скобок нет.");
            } else {
                if (correctPosition) {
                    System.out.println("Скобки рассположены правильно.");

                } else {
                    System.out.println("Скобки рассположены не правильно.");
                }
                System.out.println("По " + quantityOpenBracket + " открытых и закрытых скобок.");
            }
        } else {
            System.out.println("Кол-во скобок не одинаковое.");
            System.out.printf("%d открытых скобок и %d закрытых скобок.", quantityOpenBracket, quantityCloseBracket);
        }
    }
}
