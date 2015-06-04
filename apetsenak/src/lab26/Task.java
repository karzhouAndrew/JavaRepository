package lab26;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */
public class Task {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.fillJournal(10);
        System.out.println(journal);
        journal.removeDissatisfyMarks();
        System.out.println(journal);
    }
}
