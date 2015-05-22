package lab26;

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
        while (iterator.hasNext()) {
            if (iterator.next() <= 3) {
                iterator.remove();
            }
        }
        System.out.println("Список оценок после редактирования " + listMark);
    }
}
