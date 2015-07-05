package jd03.lab07.database.dao;

import jd03.lab07.database.pool.ConnectionPool;
import jd03.lab07.entity.Expense;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpensesDAOImpl implements ExpensesDAO {

    @Override
    public Expense getExpense(int num) {
        Expense expense = null;
        String query = "SELECT * FROM expenses WHERE num = " + num;

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             PreparedStatement pStatement = connection.prepareStatement(query);
             ResultSet resultSet = pStatement.executeQuery()) {
            while (resultSet.next()) {
                expense = new Expense(resultSet.getInt("num"),
                        resultSet.getString("paydate"),
                        resultSet.getInt("receiver"),
                        resultSet.getInt("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expense;
    }

    @Override
    public List<Expense> getExpenses() {
        List<Expense> expenses = new ArrayList<>();
        String query = "SELECT * FROM expenses";

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Expense expense = new Expense(resultSet.getInt("num"),
                        resultSet.getString("paydate"),
                        resultSet.getInt("receiver"),
                        resultSet.getInt("value"));
                expenses.add(expense);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public int addExpense(Expense expense) {
        String paydate = expense.getPaydate();
        int value = expense.getValue();
        int receiver = expense.getReceiver();
        int num = expense.getNum();
        String query = "INSERT INTO expenses (num, paydate, value, receiver) VALUES (" + num + ", " + paydate + ", " + value + ", " + receiver + ")";

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try (Connection connection = connectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
}
