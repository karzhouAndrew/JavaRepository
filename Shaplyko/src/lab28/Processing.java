package lab28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Processing {
  private List<Student> listMark = new ArrayList<Student>();

    public void generationMark(int lengthList) {
        for (int i = 0; i < lengthList; i++) {
            listMark.add(i, new Student("Ученик" + i, (int) (Math.random() * 10 + 1)));
        }
        System.out.println("Список оценок " + listMark);
    }

    public void processingMark() {
        ListIterator<Student> iterator = listMark.listIterator();
       int maxMark = listMark.get(0).getMark();
        while (iterator.hasNext()) {
            int temp = iterator.next().getMark();
            if (temp > maxMark) {
                maxMark = temp;
            }
        }
        System.out.println("Самая высокая оценка в списке =  " + maxMark);
    }
}
