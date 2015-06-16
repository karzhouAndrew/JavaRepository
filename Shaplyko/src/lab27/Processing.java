package lab27;

import java.util.ArrayList;
import java.util.List;

public class Processing {
    private List<Integer> listNumber = new ArrayList<Integer>();

    public void generationNumber(int lengthList) {
        for (int i = 0; i < lengthList; i++) {
            listNumber.add(i, (int) (Math.random() * 10 + 1));
            System.out.print(listNumber.get(i));
        }
    }

    public void processingNumber() {
        for (int i = 0; i < listNumber.size(); i++) {
            for (int j = 0; j < listNumber.size(); j++) {
                if (listNumber.get(i) == listNumber.get(j) && i != j) {
                    listNumber.remove(j);
                }
            }
        }
        System.out.println("Список чисел после редактирования " + listNumber);
    }
}
