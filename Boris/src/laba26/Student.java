package laba26;


public class Student {

    private int mark;
    private String name;

    public Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", mark = " + mark +
                '}';
    }
}
