package jd3task7.entity;

/**
 * Created by Master on 01.07.2015.
 */
public class Expense {
    private int num;
    private String paydata;
    private int reciver;
    private double value;


    public Expense() {
    }

    public Expense(String paydata, int reciver, double value) {
        this.paydata = paydata;
        this.reciver = reciver;
        this.value = value;
    }

    public String getPaydata() {
        return paydata;
    }

    public void setPaydata(String paydata) {
        this.paydata = paydata;
    }

    public int getReciver() {
        return reciver;
    }

    public void setReciver(int reciver) {
        this.reciver = reciver;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "num='" + num + '\'' +
                "paydata='" + paydata + '\'' +
                ", reciver=" + reciver +
                ", value=" + value +
                '}';
    }
}
