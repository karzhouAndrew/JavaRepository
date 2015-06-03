package task26;

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

    public List<Student> deleteBadMarks() {
        List<Student> studentsWithoutBadMarks = new ArrayList<Student>(students);
        Iterator<Student> marksIterator = studentsWithoutBadMarks.iterator();
        while (marksIterator.hasNext()) {
            if (marksIterator.next().getMark() <= 5) {
                marksIterator.remove();
            }
        }
        return studentsWithoutBadMarks;
    }
}


