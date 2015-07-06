package jd3Task4_5;

public class Expense {
    private String payDate;
    private int receiverID;
    private double value;

    public String getPayDate() {
        return payDate.toString();
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
}
