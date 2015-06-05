package lab28;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */
public class Task {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.fillJournal(15);
        System.out.println("journal = \n" + journal);
        System.out.println("MaxMark = " + journal.findMaxMark());
    }
}
