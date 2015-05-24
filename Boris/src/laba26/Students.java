package laba26;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> listing;

    public Students() {
        listing = new ArrayList<Student>();
    }

    public void addStudent (String name, int mark){
        listing.add(new Student(name, mark));
    }

    private class Student {
        private int mark;
        private String name;

        public Student(String name,int mark) {
            this.mark = mark;
            this.name = name;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name +'\'' +
                    ", mark=" + mark  +
                    '}';
        }
    }

    public void deleteBadStudyingStudents (int acceptedMark){
        int studentIndex = listing.size() - 1;
        while (studentIndex > -1){
            if (listing.get(studentIndex).mark < acceptedMark){
                listing.remove(studentIndex);
            }
            studentIndex--;
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "listing=" + listing +
                '}';
    }
}
