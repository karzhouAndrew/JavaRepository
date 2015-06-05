package lab25;


public enum CardType {
    VISA("v"),
    MAESTRO("m"),
    MASTERCARD("mc"),
    BELCARD("b");

    private String typeValue;

    private CardType(String type) {
        typeValue = type;
    }

    static public CardType getType(String type) {
        for (CardType cardType : CardType.values()) {
            if (cardType.getTypeValue().equals(type)) {
                return cardType;
            }
        }
        return CardType.VISA;
    }

    private String getTypeValue() {
        return typeValue;
    }
}
