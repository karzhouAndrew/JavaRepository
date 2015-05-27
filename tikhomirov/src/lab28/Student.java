package lab28;


public class Student {
    private String name;
    private int Mark;

    public String getName() {
        return name;
    }

    public int getMark() {
        return Mark;
    }

    public Student(String name, int mark) {
        this.name = name;
        Mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Mark=" + Mark +
                '}';
    }
}

