package jd03lab05;

/* Задание  5. Напишите программу получающую данные о расходе в качестве исходных параметров main,
и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран. */

import java.util.Scanner;

public class DBManager {

    private static final String MYSQL_DRIVER_CLASS_PATH = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/listexpenses";
    private static final String DB_TABLE_NAME = "expenses";
    private static final String TABLE_HEADER = "\nnum\t\tpaydate\t\treceiver\tvalue\n";
    private static final String QUERY_TEMPLATE = "INSERT INTO expenses (num, paydate, receiver, value) VALUES(";
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        DBProcessor dbProcessor = new DBProcessor(MYSQL_DRIVER_CLASS_PATH, DB_URL);
        String readDBTableResult = dbProcessor.readDBTable(DB_TABLE_NAME);
        System.out.println("Результат чтения исходной таблицы '" + DB_TABLE_NAME + "':\n" + TABLE_HEADER + readDBTableResult);

        StringBuilder query = new StringBuilder(QUERY_TEMPLATE);
        if (args.length == 4) {
            query.append(args[0]).append(",'").append(args[1]).append("',").append(args[2]).append(',').append(args[3]).append(");");
        } else {
            System.out.println("Вызывайте программу с 4 аргументами командной строки: num (тип INT), paydate (тип DATE), receiver (тип INT), value (тип DEC), либо введите значения здесь:");
            System.out.println("Введите num (тип INT): ");
            query.append(scan.nextLine()).append(",'");
            System.out.println("Введите paydate (тип DATE в формате ГГГГ-ММ-ДД): ");
            query.append(scan.nextLine()).append("',");
            System.out.println("Введите receiver (тип INT): ");
            query.append(scan.nextLine()).append(',');
            System.out.println("Введите value (тип DEC): ");
            query.append(scan.nextLine()).append(");");
        }

        System.out.println("Выполняем добавление информации о расходе запросом: \n" + query);
        int rowsAffected = dbProcessor.addExpenseRecord(query.toString());
        System.out.println("Количество добавленных в базу строк: " + rowsAffected);
        readDBTableResult = dbProcessor.readDBTable(DB_TABLE_NAME);
        System.out.println("Результат повторного чтения таблицы '" + DB_TABLE_NAME + "':\n" + TABLE_HEADER + readDBTableResult);
        scan.close();
    }
}