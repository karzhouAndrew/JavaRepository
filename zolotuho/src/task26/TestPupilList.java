package task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestPupilList {
    public static void main(String[] args) {

        Random random = new Random();
        List<Pupil> pupilList = new ArrayList<Pupil>();
        pupilList.add(0, new Pupil("Makar", 13, random.nextFloat() * 10));
        pupilList.add(1, new Pupil("Philip", 5, random.nextFloat() * 10));
        pupilList.add(2, new Pupil("Demyan", 8, random.nextFloat() * 10));
        pupilList.add(3, new Pupil("Ivan", 6, random.nextFloat() * 10));
        pupilList.add(4, new Pupil("Pofistal", 15, random.nextFloat() * 10));
        pupilList.add(5, new Pupil("Vladlen", 5, random.nextFloat() * 10));
        Iterator<Pupil> iterator = pupilList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAverageMark() <= 3) {
                iterator.remove();
            }
        }

        for (Pupil pupil : pupilList) {
            System.out.println(pupil);
        }
    }
}
