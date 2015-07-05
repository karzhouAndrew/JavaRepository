package lab7jd3.entities;


public class Expense {
    private int ID;
    private String payDate;
    private int receiverID;
    private double value;

    public Expense() {
    }

    public Expense(int ID, String payDate, int receiverID, double value) {
        this.ID = ID;
        this.payDate = payDate;
        this.receiverID = receiverID;
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "ID=" + ID +
                ", payDate='" + payDate + '\'' +
                ", receiverID=" + receiverID +
                ", value=" + value +
                '}';
    }
}

