package jd03lab06;

/* Задание  6. Измените предыдущую задачу таким образом, чтобы она использовала прекомпилированные запросы. */

import java.sql.Date;
import java.util.Scanner;

public class DBManager {

    private static final String MYSQL_DRIVER_CLASS_PATH = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/listexpenses";
    private static final String DB_TABLE_NAME = "expenses";
    private static final String TABLE_HEADER = "\nnum\t\tpaydate\t\treceiver\tvalue\n";
    private static final String QUERY_TEMPLATE = "INSERT INTO expenses (num, paydate, receiver, value) VALUES(?,?,?,?)";
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        DBProcessor dbProcessor = new DBProcessor(MYSQL_DRIVER_CLASS_PATH, DB_URL);
        String readDBTableResult = dbProcessor.readDBTable(DB_TABLE_NAME);
        System.out.println("Результат чтения исходной таблицы '" + DB_TABLE_NAME + "':\n" + TABLE_HEADER + readDBTableResult);

        System.out.println("Выполняем добавление информации о расходе запросом: \n" + QUERY_TEMPLATE);
        int rowsAffected = 0;
        if (args.length == 4) {
            rowsAffected = dbProcessor.addExpenseRecord(QUERY_TEMPLATE, Integer.parseInt(args[0]), Date.valueOf(args[1]), Integer.parseInt(args[2]), Double.parseDouble(args[3]));
        } else {
            System.out.println("Вызывайте программу с 4 аргументами командной строки: num (тип INT), paydate (тип DATE), receiver (тип INT), value (тип DEC), либо введите значения здесь:");
            System.out.println("Введите num (тип INT): ");
            int num = scan.nextInt();
            System.out.println("Введите paydate (тип DATE в формате ГГГГ-ММ-ДД): ");
            Date paydate = Date.valueOf(scan.next());
            System.out.println("Введите receiver (тип INT): ");
            int receiver = scan.nextInt();
            System.out.println("Введите value (тип DEC): ");
            double value = scan.nextDouble();
            rowsAffected = dbProcessor.addExpenseRecord(QUERY_TEMPLATE, num, paydate, receiver, value);
        }

        System.out.println("Количество добавленных в базу строк: " + rowsAffected);
        readDBTableResult = dbProcessor.readDBTable(DB_TABLE_NAME);
        System.out.println("Результат повторного чтения таблицы '" + DB_TABLE_NAME + "':\n" + TABLE_HEADER + readDBTableResult);
        scan.close();
    }
}