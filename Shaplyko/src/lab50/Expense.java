package lab50;

public class Expense {
    private int num;
    private String date;
    private int receiver;
    private int sum;

    public Expense() {
    }

    public Expense(int num, String date, int receiver, int sum) {
        this.num = num;
        this.date = date;
        this.receiver = receiver;
        this.sum = sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "num=" + num +
                ", date='" + date + '\'' +
                ", receiver=" + receiver +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Expense expense = (Expense) o;

        if (num != expense.num) return false;
        if (receiver != expense.receiver) return false;
        if (sum != expense.sum) return false;
        if (date != null ? !date.equals(expense.date) : expense.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + receiver;
        result = 31 * result + sum;
        return result;
    }
}
