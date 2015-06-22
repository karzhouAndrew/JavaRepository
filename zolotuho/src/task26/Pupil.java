package task26;

public class Pupil {
    private String name;
    private int age;
    private float averageMark;

    public Pupil(String name, int age, float averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }
}
