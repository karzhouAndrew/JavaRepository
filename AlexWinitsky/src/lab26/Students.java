package lab26;

/**
 * Created by Master on 21.05.2015.
 */
public class Students {
    private String studentName;
    private int mark;

    public Students(String studentName, int mark) {
        this.studentName = studentName;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", mark=" + mark +
                '}';
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMark() {
        return mark;
    }


}
