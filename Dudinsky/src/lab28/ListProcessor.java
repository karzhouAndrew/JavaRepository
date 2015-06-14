package lab28;

import java.util.ArrayList;
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

    public void fillUpWithRandomMarksUpTo(final int MAX_MARK) {
        Random rand = new Random();
        Iterator<PupilMark> pupilMarkListIterator = processingList.listIterator();
        while (pupilMarkListIterator.hasNext()) {
            pupilMarkListIterator.next().setMark(rand.nextInt(MAX_MARK) + 1);
        }
    }

    public int getMaximumMark() {
        Iterator<PupilMark> pupilMarkListIterator = processingList.listIterator();
        int maxMark = pupilMarkListIterator.next().getMark();
        while (pupilMarkListIterator.hasNext()) {
            int currentMark = pupilMarkListIterator.next().getMark();
            if (currentMark > maxMark) {
                maxMark = currentMark;
            }
        }
        return maxMark;
    }

    public List<PupilMark> getAllMarksListEqualTo(int maxMark) {
        List<PupilMark> resultMarksList = new ArrayList<>();
        Iterator<PupilMark> pupilMarkListIterator = processingList.listIterator();
        while (pupilMarkListIterator.hasNext()) {
            PupilMark currentMark = pupilMarkListIterator.next();
            if (currentMark.getMark() == maxMark) {
                resultMarksList.add(currentMark);
            }
        }
        return resultMarksList;
    }
}