package lab50;

public class Receiver {
    private int num;
    private String receiver;

    public Receiver() {
    }

    public Receiver(int num, String receiver) {
        this.num = num;
        this.receiver = receiver;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "num=" + num +
                ", receiver='" + receiver + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Receiver receiver1 = (Receiver) o;

        if (num != receiver1.num) return false;
        if (receiver != null ? !receiver.equals(receiver1.receiver) : receiver1.receiver != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        return result;
    }
}
