package laba28;


public class Student {
    private String name;
    private int mark;

    public Student(String name) {
        this.name = name;
        this.mark = (int) (Math.random() * 10 + 1);
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}
