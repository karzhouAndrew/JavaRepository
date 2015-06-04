package lab28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Journal {
    private List<Pupil> pupils = new ArrayList<Pupil>();

    public void fillJournal(int length) {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            pupils.add(new Pupil("Pupil " + (i + 1), random.nextInt(10) + 1));
        }
    }

    public int findMaxMark() {
        int maxMark = 0;
        ListIterator<Pupil> iterator = pupils.listIterator();
        while (iterator.hasNext()) {
            int mark = iterator.next().getMark();
            if (mark > maxMark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }

    @Override
    public String toString() {
        StringBuilder journal = new StringBuilder();
        for (int i = 0; i < pupils.size(); i++) {
            journal.append(pupils.get(i));
            journal.append("\n");
        }
        return journal.toString();
    }
}
