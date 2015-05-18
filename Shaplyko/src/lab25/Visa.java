package lab25;

public class Visa extends CreditCard {
    private int amountCashDollar;
    private String countryService;

    public Visa(int identificationNumber, String personalData, int amountCash, String countryService) {
        super(identificationNumber, personalData);
        this.amountCashDollar = amountCash;
        this.countryService = countryService;
    }

    public int getAmountCash() {
        return amountCashDollar;
    }

    public String getCountryService() {
        return countryService;
    }

    public void setAmountCash(int amountCash) {
        this.amountCashDollar = amountCash;
    }

    public void setCountryService(String countryService) {
        this.countryService = countryService;
    }
}


