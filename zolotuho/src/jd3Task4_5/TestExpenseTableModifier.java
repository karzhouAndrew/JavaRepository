package jd3Task4_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//4Напишите  программу  получающую  данные  о  расходе  в  качестве исходных параметров main, и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран
//5Измените   предыдущую   задачу   таким   образом,   чтобы   онаиспользовала прекомпилированные запросы.
public class TestExpenseTableModifier {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("error loading driver");
        }
        String dbURL = "jdbc:mysql://localhost:3306/zoltan";
        String userName = "root";
        String password = "Zoltan85";

        Connection connection = null;
        ExpenseTableModifier modifier = new ExpenseTableModifier();
        try {
            connection = DriverManager.getConnection(dbURL, userName, password);
            Expense expense = new Expense();
            expense.setPayDate("20151111");
            expense.setReceiverID(2);
            expense.setValue(12800);
            modifier.insertDataByStatement(connection, expense);
            modifier.insertDataByPreparedStatement(connection, expense);
            modifier.printTable(connection);
            connection.close();
        } catch (SQLException e) {
            System.out.println("connection error");
            e.printStackTrace();
        }
    }
}
