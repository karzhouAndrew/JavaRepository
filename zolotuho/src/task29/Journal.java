package task29;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Journal {
    private List<Pupil> pupils = new ArrayList<>();

    public Journal(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    public Journal(String[] names) {
        for (String name : names) {
            pupils.add(new Pupil(name));
        }
    }

    public void generateRandomMarks() {
        Random rand = new Random();
        for (int i = 0; i < pupils.size(); i++) {
            pupils.get(i).setMark(rand.nextFloat() * 10);
        }
    }

    public float findMaxMark() {
        float max = 0;
        Iterator<Pupil> iterator = pupils.iterator();
        while (iterator.hasNext()) {
            float currentMark = iterator.next().getMark();
            if (currentMark > max) {
                max = currentMark;
            }
        }
        return max;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }
}
