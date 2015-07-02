package module3.laba6;

//Напишите программу получающую данные о расходе в качестве исходных параметров main, и добавляющую этот расход в базу,
// после чего выводящую таблицу расходов на экран.
//Измените предыдущую задачу, чтобы она использовала прекомпилированные запросы

import java.sql.Date;

public class Test {
    public static void main(String[] args) {
        WorkWithDB workWithDB = new WorkWithDB("root", "admin123", "jdbc:mysql://localhost:3306/test_database");
        workWithDB.addRecording(Date.valueOf("2011-05-11"), 3, 55200);
        System.out.println(workWithDB.seeTable());
        workWithDB.deleteLastRecording();
    }
}
