package JD3_lab6.entity;

public class Expense {
    private int ID;
    private String paydate;
    private int receiver;
    private int value;

    public Expense() {
    }

    public Expense(int ID, String paydate, int receiver, int value) {
        this.ID = ID;
        this.paydate = paydate;
        this.receiver = receiver;
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense expense = (Expense) o;

        if (ID != expense.ID) return false;
        if (receiver != expense.receiver) return false;
        if (value != expense.value) return false;
        if (paydate != null ? !paydate.equals(expense.paydate) : expense.paydate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (paydate != null ? paydate.hashCode() : 0);
        result = 31 * result + receiver;
        result = 31 * result + value;
        return result;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "ID=" + ID +
                ", paydate='" + paydate + '\'' +
                ", receiver=" + receiver +
                ", value=" + value +
                '}';
    }
}
