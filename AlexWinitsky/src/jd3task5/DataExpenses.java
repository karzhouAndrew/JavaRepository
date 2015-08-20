package jd3task5;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 01.07.2015.
 */
public class DataExpenses {
    private static final String SQL_GET_EXPENSES = "SELECT * FROM expenses";


    public List<Expense> getExpenses() throws ClassNotFoundException {
        List<Expense> expenses = null;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbase", "root", "admin123");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_EXPENSES);
            expenses = initClients(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return expenses;
    }

    private List<Expense> initClients(ResultSet resultSet) throws SQLException {
        List<Expense> expenses = new ArrayList<Expense>();
        while (resultSet.next()) {
            Expense expense = new Expense();
            expense.setNum(resultSet.getInt(1));
            expense.setPaydata(resultSet.getString(2));
            expense.setReciver(resultSet.getInt(3));
            expense.setValue(resultSet.getInt(4));
            expenses.add(expense);
        }
        return expenses;
    }

    public void addExpense(String paydate, int receiver, double value) throws ClassNotFoundException, ParseException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = format.parse(paydate);
        java.sql.Date data = new java.sql.Date(parsed.getTime());

        String sql_insert_expense = " INSERT INTO expenses (paydate,receiver,value) values (" + "\"" + data + "\"" + "," + receiver + "," + value + ")";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbase", "root", "admin123");
            statement = connection.createStatement();
            statement.executeUpdate(sql_insert_expense);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, connection);
        }
    }

}
