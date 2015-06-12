package lab26;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListProcessor {

    private List<PupilMark> processingList;

    public ListProcessor(List<PupilMark> processingList) {
        this.processingList = processingList;
    }

    public void addPupilNames(String[] pupilNames) {
        for (String currentPupilName : pupilNames) {
            processingList.add(new PupilMark(currentPupilName, -1));
        }
    }

    public void addPupilMark(String name, int mark) {
        processingList.add(new PupilMark(name, mark));
    }

    public void fillUpWithRandomMarksUpTo(final int MAX_MARK) {
        Random rand = new Random();
        Iterator<PupilMark> pupilMarkListIterator = processingList.listIterator();
        while (pupilMarkListIterator.hasNext()) {
            pupilMarkListIterator.next().setMark(rand.nextInt(MAX_MARK) + 1);
        }
    }

    public void deleteAllPupilMarksUnder(final int BOUND_MARK) {
        Iterator<PupilMark> pupilMarkListIterator = processingList.listIterator();
        while (pupilMarkListIterator.hasNext()) {
            if (pupilMarkListIterator.next().getMark() < BOUND_MARK) {
                pupilMarkListIterator.remove();
            }
        }
    }
}
