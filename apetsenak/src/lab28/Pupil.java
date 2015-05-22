package lab28;


public class Pupil {
    private String name;
    private int mark;

    public Pupil(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", mark = " + mark;
    }
}
