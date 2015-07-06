package jd03.lab07.entity;

public class Expense {
    int num;
    String paydate;
    int value;
    int receiver;

    public Expense() {
    }

    public Expense(int num, String paydate, int value, int receiver) {
        this.num = num;
        this.paydate = paydate;
        this.value = value;
        this.receiver = receiver;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "num=" + num +
                ", paydate='" + paydate + '\'' +
                ", value=" + value +
                ", receiver=" + receiver +
                '}';
    }
}
