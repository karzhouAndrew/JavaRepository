package jd03lab07.entities;

public class Expense {

    private int num;
    private String paydate;
    private int receiverNum;
    private double value;

    public Expense() {
    }

    public Expense(int num, String paydate, int receiverNum, double value) {
        this.num = num;
        this.paydate = paydate;
        this.receiverNum = receiverNum;
        this.value = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public int getReceiverNum() {
        return receiverNum;
    }

    public void setReceiverNum(int receiverNum) {
        this.receiverNum = receiverNum;
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
                "num=" + num +
                ", paydate='" + paydate + '\'' +
                ", receiverNum=" + receiverNum +
                ", value=" + value +
                '}';
    }
}