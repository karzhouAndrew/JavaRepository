package lab28;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Processing {
    List<Integer> listMark = new ArrayList<Integer>();

    public void generationMark(int lengthList) {
        for (int i = 0; i < lengthList; i++) {
            listMark.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println("Список оценок " + listMark);
    }

    public void processingMark() {
        ListIterator<Integer> iterator = listMark.listIterator();
        int maxMark = listMark.get(0);
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > maxMark) {
                maxMark = temp;
            }
        }
        System.out.println("Самая высокая оценка в списке =  " + maxMark);
    }
}
