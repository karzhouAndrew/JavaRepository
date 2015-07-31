package ex6.components;

/**
 * Created by champion on 06.07.15.
 */
public class Expense {
    private int num;
    private String paydate;
    private Float value;
    private  int receiver;

    public Expense(int num, String paydate, Float value, int receiver) {
        this.num = num;
        this.paydate = paydate;
        this.value= value;
        this.receiver = receiver;
    }

    public Expense() {
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

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
}
