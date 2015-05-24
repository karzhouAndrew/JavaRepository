package task26;

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

    public void deleteBadMarks() {
        Iterator<Student> marksIterator = studentsList.iterator();
        while (marksIterator.hasNext()) {
            if (marksIterator.next().getMark() <= 5) {
                marksIterator.remove();
            }
        }
    }
}


