package lab26;

public class PupilMark {
    private String name;
    private int mark;

    public PupilMark(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark > 0) {
            this.mark = mark;
        }
    }

    @Override
    public String toString() {
        return name + ": " + mark;
    }
}
