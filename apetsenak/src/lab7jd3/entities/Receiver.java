package lab7jd3.entities;


public class Receiver {
    private int ID;
    private String name;

    public Receiver() {
    }

    public Receiver(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
