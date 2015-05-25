package task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsList {
    private List<Student> studentsList;

    class Student {
        private final String name;
        private int mark;

        public Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }

        @Override
        public String toString() {
            return name + " - " + mark;
        }

        public int getMark() {
            return mark;
        }
    }

    public StudentsList(int marksQuantity) {
        studentsList = new ArrayList<Student>(marksQuantity);
        for (int i = 0; i < marksQuantity; i++) {
            studentsList.add(new Student("Student" + (i + 1), (int) (Math.random() * 10 + 1)));
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Student student : studentsList) {
            text.append(student).append("\n");
        }
        return new String(text);
    }

    public int getMaxMarks() {
        Iterator<Student> marksIterator = studentsList.iterator();
        int maxMark = studentsList.get(0).getMark();
        while (marksIterator.hasNext()) {
            int mark = marksIterator.next().getMark();
            if (mark > maxMark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }
}