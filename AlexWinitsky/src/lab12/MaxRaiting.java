package lab12;

/**
 * Задание 12
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class MaxRaiting {
    public static void main(String[] args) {
        int raiting[] = {7, 8, 9, 10, 5, 6, 8, 5, 3, 4, 5, 6, 8, 7};
        int maxId = 0;
        int max = raiting[0];
        for (int i = 0; i < raiting.length; i++) {
            if (max < raiting[i]) {
                max = raiting[i];
                maxId = i;
            }
        }
        System.out.println("мaксимальную оценку  " + max + " имеет элемент с индексом " + maxId);
    }
}

