package jd3task7.entity;

/**
 * Created by Master on 01.07.2015.
 */
public class Receiver {
    private int num;
    private String name;

    public Receiver() {
    }

    public Receiver(int num, String name) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "receiver{" +
                "num=" + num +
                "name='" + name + '\'' +
                '}';
    }
}
