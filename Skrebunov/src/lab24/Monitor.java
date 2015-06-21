package lab24;

/**
 * Created by PC on 17.06.2015.
 */
public class Monitor extends HouseholdAppliances {

    private String modification;
    private int diagonal;

    public Monitor() {
    }

    public Monitor(String brandName, int weight, String modification, int diagonal) {
        super(brandName, weight);
        this.modification = modification;
        this.diagonal = diagonal;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    protected void switchOn() {
        setStatus(true);
    }

    @Override
    protected void switchOff() {
        setStatus(false);
    }

    @Override
    protected boolean statusOfDevice() {
        return super.isStatus();
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Monitor{" +
                "modification='" + modification + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}