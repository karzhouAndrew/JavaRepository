package lab5jd3;

/**
 * Напишите программу получающую данные о расходе в качестве исходных параметров main,
 * и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
 */
public class Task {
    public static void main(String[] args) {
        DBWork dbWork = new DBWork("root", "admin123", "jdbc:mysql://localhost:3306/testdatabase");
        System.out.println(dbWork.showTable());
        dbWork.addRecord(5, "2011-05-12", 1, 50000);
        System.out.println(dbWork.showTable());
    }
}
