package lab25;

/**
 * Класс для корпоративных карт.
 */
public class CorparateCard extends BankCard {
    private String nameOfOrganization;
    private int countOfOrganization;

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public int getCountOfOrganization() {
        return countOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public void setCountOfOrganization(int countOfOrganization) {
        this.countOfOrganization = countOfOrganization;
    }
}
