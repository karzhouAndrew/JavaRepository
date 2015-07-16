package task29;
//Создать список оценок учеников с помощью ArrayList,
// заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
public class TestJournal {
    public static void main(String[] args) {
        String[] names = new String[]{"anton", "vasya", "denis", "katya", "lena", "masha", "gleb", "sergei", "andrei", "lada"};
        Journal journal = new Journal(names);
        journal.generateRandomMarks();
        System.out.println(journal.getPupils());
        System.out.println(journal.findMaxMark());
    }
}
