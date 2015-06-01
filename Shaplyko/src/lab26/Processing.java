package lab26;

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
        while (iterator.hasNext()) {
            if (iterator.next().getMark() <= 3) {
                iterator.remove();
            }
        }
        System.out.println("Список оценок после редактирования " + listMark);
    }
}
