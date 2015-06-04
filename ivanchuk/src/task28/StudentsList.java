package task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsList {
    private List<Student> students;

    class Student {
        private final String NAME;
        private int mark;

        public Student(String name, int mark) {
            NAME = name;
            this.mark = mark;
        }

        @Override
        public String toString() {
            return NAME + " - " + mark;
        }

        public int getMark() {
            return mark;
        }
    }

    public StudentsList(int marksQuantity) {
        students = new ArrayList<Student>(marksQuantity);
        for (int i = 0; i < marksQuantity; i++) {
            students.add(new Student("Student" + (i + 1), (int) (Math.random() * 10 + 1)));
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Student student : students) {
            text.append(student).append("\n");
        }
        return new String(text);
    }

    public int calculateMaxMarks() {
        Iterator<Student> marksIterator = students.iterator();
        int maxMark = students.get(0).getMark();
        while (marksIterator.hasNext()) {
            int mark = marksIterator.next().getMark();
            if (mark > maxMark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }
}