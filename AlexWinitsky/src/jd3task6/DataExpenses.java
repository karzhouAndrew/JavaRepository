package jd3task6;

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
    private static final String SQL_INSERT_EXPENSE = "INSERT INTO expenses (paydate,receiver,value) values (?,?,?)";

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
        PreparedStatement preparedStatement = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = format.parse(paydate);
        Date data = new Date(parsed.getTime());


        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbase", "root", "admin123");

            preparedStatement = connection.prepareStatement(SQL_INSERT_EXPENSE);
            preparedStatement.setDate(1, data);
            preparedStatement.setInt(2, receiver);
            preparedStatement.setDouble(3, value);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }

}
