package add9;

public class CheckAnnotation {
    private int number;

    public CheckAnnotation() {
    }

    public CheckAnnotation(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Transaction(info = "1")
    public void setNumber(int number) {
        this.number = number;
    }
}
