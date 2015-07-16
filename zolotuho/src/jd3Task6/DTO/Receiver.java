package jd3Task6.DTO;


public class Receiver {
    private int ID;
    private String name;

    public int getID() {
        return ID;
    }

    public Receiver() {
    }

    public Receiver(String name) {
        this.name = name;
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
