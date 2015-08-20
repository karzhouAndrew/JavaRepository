package jd03.lab07.database.dao;

import jd03.lab07.database.pool.ConnectionPool;
import jd03.lab07.database.pool.DBUtils;
import jd03.lab07.entity.Expense;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpensesDAOImpl implements ExpensesDAO {

    @Override
    public Expense getExpense(int num) {
        String query = "SELECT * FROM expenses WHERE num = ?";
        Expense expense = null;
        Connection connection = null;
        PreparedStatement pStatement = null;
        ResultSet resultSet = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, num);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                expense = new Expense(resultSet.getInt("num"),
                        resultSet.getString("paydate"),
                        resultSet.getInt("receiver"),
                        resultSet.getInt("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, pStatement, resultSet);
        }
        return expense;
    }

    @Override
    public List<Expense> getExpenses() {
        String query = "SELECT * FROM expenses";
        List<Expense> expenses = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Expense expense = new Expense(resultSet.getInt("num"),
                        resultSet.getString("paydate"),
                        resultSet.getInt("receiver"),
                        resultSet.getInt("value"));
                expenses.add(expense);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, statement, resultSet);
        }
        return expenses;
    }

    @Override
    public int addExpense(Expense expense) {
        String query = "INSERT INTO expenses (num, paydate, value, receiver) VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement pStatement = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connection = connectionPool.getConnection();
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, expense.getNum());
            pStatement.setString(2, expense.getPaydate());
            pStatement.setInt(3, expense.getValue());
            pStatement.setInt(4, expense.getReceiver());
            pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, pStatement);
        }
        return expense.getNum();
    }
}
