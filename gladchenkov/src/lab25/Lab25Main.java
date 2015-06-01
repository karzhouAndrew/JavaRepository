package lab25;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 */

public class Lab25Main {
    public static void main(String[] args) {
        BankCards cards = new BankCards("Gladchenkov Sergey", "Priorbank", " 2222 3333 4444 5555", "07/16");
        MasterCardElectronic masterCard = new MasterCardElectronic("Gladchenkov Sergey", "Priorbank", " 2222 3333 4444 5555", "07/16", "Yes");
        VisaElectron visaElectronCard = new VisaElectron("Gladchenkov Sergey", "Priorbank", " 2222 3333 4444 5555", "07/16", "Yes");
        VisaInfinite visaInfiniteCard = new VisaInfinite("Gladchenkov Sergey", "Priorbank", " 2222 3333 4444 5555", "07/16", "Yes", "5 years", "24/7");

        System.out.println(cards);
        System.out.println(masterCard);
        System.out.println(visaElectronCard);
        System.out.println(visaInfiniteCard);
    }
}
