package lab28;


public class Student {
    private String name;
    private int mark;

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public Student(String name, int mark) {
        this.name = name;
        mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Mark=" + mark +
                '}';
    }
}

