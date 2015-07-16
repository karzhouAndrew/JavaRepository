package task29;


public class Pupil {
    private String name;
    private float mark;

    public Pupil(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }

    public Pupil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}' + "\n";
    }
}
