package add12;

public class Berth {
    private int berthId;

    public Berth(int id) {
        super();
        this.berthId = id;
    }

    public int getBerthId() {
        return berthId;
    }

    public void setBerthId(int id) {
        this.berthId = id;
    }

    public void using() {
        try {
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}