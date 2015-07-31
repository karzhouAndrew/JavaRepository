package lab28;

public class Student {
    private String secondName;
    private int mark;

    public Student(String secondName, int mark) {
        this.secondName = secondName;
        this.mark = mark;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "secondName='" + secondName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
