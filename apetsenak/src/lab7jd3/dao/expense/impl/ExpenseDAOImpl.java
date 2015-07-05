package lab7jd3.dao.expense.impl;


import lab7jd3.dao.expense.ExpenseDAO;
import lab7jd3.entities.Expense;
import lab7jd3.utils.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAOImpl implements ExpenseDAO {
    private static final String SQL_INSERT_EXPENSE = "INSERT INTO expenses (id,paydate,receiver_id,value) VALUES(?,?,?,?)";
    private static final String SQL_GET_EXPENSES = "SELECT * FROM expenses";

    @Override
    public void addExpense(Expense expense) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtils.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_EXPENSE);
            preparedStatement.setInt(1, expense.getID());
            preparedStatement.setString(2, expense.getPayDate());
            preparedStatement.setInt(3, expense.getReceiverID());
            preparedStatement.setDouble(4, expense.getValue());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }

    }

    @Override
    public List<Expense> getExpenses() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Expense> expenses = null;
        try {
            connection = DBUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_EXPENSES);
            expenses = initExpenses(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return expenses;
    }

    private List<Expense> initExpenses(ResultSet resultSet) {
        List<Expense> expenses = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Expense expense = new Expense();
                expense.setID(resultSet.getInt("id"));
                expense.setPayDate(resultSet.getString("paydate"));
                expense.setReceiverID(resultSet.getInt("receiver_id"));
                expense.setValue(resultSet.getDouble("value"));
                expenses.add(expense);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }
}
