package laba26;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cleaning {
    private List<Integer> markArray = new ArrayList<Integer>();
    private List<String> nameArray = new ArrayList<String>();

    public void addStudentAndMark(String name, Integer mark) {
        if (mark < 1) {
            System.out.println("Exception");
            mark = 3;
        }
        markArray.add(mark);
        nameArray.add(name);
    }

    @Override
    public void deleteBadMarks() {
        int indexIteration = markArray.size() - 1;
        while (indexIteration >= 0) {
            if (markArray.get(indexIteration) <= BAD_MARK) {
                markArray.remove(indexIteration);
                nameArray.remove(indexIteration);
            }
            indexIteration--;
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + " {" +
                "markArray=" + markArray.toString() +
                ", nameArray=" + nameArray.toString() +
                '}';
    }
}
