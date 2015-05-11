package laba.add5_1;

//Есть строка со скобками. Определить: нет ли скобок, не имеющих пары, кол-во скобок.
public class FindBrackets {
    public static void main(String[] args) {
        String sentence = "sd)((f) ((sdf))(sfdsf))(";
        char[] arrayLetters = sentence.toCharArray();
        char openBracket = '(';
        char closeBracket = ')';
        int flagPairsBracket = 0;
        int quantityOpenBracket = 0;
        int quantityCloseBracket = 0;
        boolean flagMinus = true;
        for (int i = 0; i < sentence.length(); i++) {
            if (arrayLetters[i] == openBracket) {
                quantityOpenBracket++;
                flagPairsBracket++;
            }
            if (arrayLetters[i] == closeBracket) {
                quantityCloseBracket++;
                flagPairsBracket--;
            }
            if (flagPairsBracket < 0) {
                flagMinus = false;
            }
        }
        if (flagPairsBracket == 0) {
            if (quantityCloseBracket == 0 && quantityOpenBracket == 0) {
                System.out.println("Скобок нет.");
            } else {
                if (flagMinus) {
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
