package jd03lab07.db.dao.impl;

import jd03lab07.db.dao.ExpenseDAO;
import jd03lab07.db.pool.ConnectionPool;
import jd03lab07.entities.Expense;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExpenseDAOImpl implements ExpenseDAO {

    private static final String SELECT_EXPENSE_TEMPLATE = "SELECT * FROM expenses WHERE num = ?";
    private static final String NUM_COLUMN_LABEL = "num";
    private static final String PAYDATE_COLUMN_LABEL = "paydate";
    private static final String RECEIVER_COLUMN_LABEL = "receiver";
    private static final String VALUE_COLUMN_LABEL = "value";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM expenses";
    private static final String INSERT_QUERY_TEMPLATE = "INSERT INTO expenses (num, paydate, receiver, value) VALUES(?,?,?,?)";

    @Override
    public Expense retrieveExpense(final int num) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Expense expense = null;
        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EXPENSE_TEMPLATE);
        ) {
            preparedStatement.setInt(1, num);
            ResultSet resultSet = preparedStatement.executeQuery();
            expense = initExpense(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expense;
    }

    private Expense initExpense(ResultSet resultSet) throws SQLException {
        Expense expense = new Expense();
        if (resultSet.next()) {
            expense.setNum(resultSet.getInt(NUM_COLUMN_LABEL));
            expense.setPaydate(resultSet.getString(PAYDATE_COLUMN_LABEL));
            expense.setReceiverNum(resultSet.getInt(RECEIVER_COLUMN_LABEL));
            expense.setValue(resultSet.getDouble(VALUE_COLUMN_LABEL));
        }
        return expense;
    }

    @Override
    public List<Expense> retrieveAllExpenses() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        List<Expense> expenses = null;
        try (
                Connection connection = connectionPool.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY)
        ) {
            expenses = initAllExpenses(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    private List<Expense> initAllExpenses(ResultSet resultSet) throws SQLException {
        List<Expense> expenses = new ArrayList<>();
        while (resultSet.next()) {
            Expense expense = new Expense();
            expense.setNum(resultSet.getInt(NUM_COLUMN_LABEL));
            expense.setPaydate(resultSet.getString(PAYDATE_COLUMN_LABEL));
            expense.setReceiverNum(resultSet.getInt(RECEIVER_COLUMN_LABEL));
            expense.setValue(resultSet.getDouble(VALUE_COLUMN_LABEL));
            expenses.add(expense);
        }
        return expenses;
    }

    @Override
    public int insertExpense(final Expense expense) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        int rowsAffected = 0;
        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY_TEMPLATE);
        ) {
            preparedStatement.setInt(1, expense.getNum());
            preparedStatement.setDate(2, Date.valueOf(expense.getPaydate()));
            preparedStatement.setInt(3, expense.getReceiverNum());
            preparedStatement.setDouble(4, expense.getValue());
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }
}