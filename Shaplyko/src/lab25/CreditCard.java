package lab25;

public class CreditCard extends Card {
    private String personalData;

    public CreditCard(int identificationNumber, String personalData) {
        super(identificationNumber);
        this.personalData = personalData;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }
}

