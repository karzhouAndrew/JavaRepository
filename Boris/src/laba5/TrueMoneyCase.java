package laba5;

///There is integer number. It's quantity money in roubles. Take out this number and add right case word "rouble".
public class TrueMoneyCase {
    public static void main(String[] args) {
        int quantityMoney = 111;
        int lastNumber = quantityMoney % 10;
        int lastNextNumber = (quantityMoney % 100 - lastNumber) / 10;
        String rublsCase = "рубл";
        if (lastNextNumber == 1) {
            rublsCase += "ей";
        } else if (lastNumber == 1) {
            rublsCase += "ь";
        } else if (lastNumber == 2 || lastNumber == 3 || lastNumber == 4) {
            rublsCase += "я";
        } else {
            rublsCase += "ей";
        }
        System.out.println(quantityMoney + " " + rublsCase);
    }
}