package jd3Task4_5;

import java.sql.*;

//Напишите  программу  получающую  данные  о  расходе  в  качестве исходных параметров main, и добавляющую этот расход в базу,
// после чего выводящую таблицу расходов на экран.
//Измените   предыдущую   задачу   таким   образом,   чтобы   онаиспользовала прекомпилированные запросы.
public class ExpenseTableModifier {
    public static final String SQL_INSERT_TEMPLATE = "INSERT INTO EXPENSES (PAYDATE,RECEIVER_ID,VALUE) VALUES (?,?,?);";
    public static final String SQL_SELECT = "SELECT * FROM EXPENSES";

    public void printTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(SQL_SELECT);
        while (result.next()) {
            System.out.println(result.getString("ID") + " " + result.getString("PAYDATE") + " " + result.getString("RECEIVER_ID") + " " + result.getString("VALUE"));
        }
    }

    public void insertDataByStatement(Connection connection, Expense expense) throws SQLException {
        Statement statement = connection.createStatement();
        final String SQL_INSERT = "INSERT INTO EXPENSES (PAYDATE,RECEIVER_ID,VALUE)" +
                " VALUES " + "(" + expense.getPayDate() + "," + expense.getReceiverID() + "," + expense.getValue() + ")";
        statement.executeUpdate(SQL_INSERT);
    }

    public void insertDataByPreparedStatement(Connection connection, Expense expense) throws SQLException {
        PreparedStatement prStatement = connection.prepareStatement(SQL_INSERT_TEMPLATE);
        prStatement.setString(1, expense.getPayDate());
        prStatement.setInt(2, expense.getReceiverID());
        prStatement.setDouble(3, expense.getValue());
        prStatement.executeUpdate();
    }
}