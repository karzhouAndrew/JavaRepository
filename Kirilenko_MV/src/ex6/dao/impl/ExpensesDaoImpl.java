package ex6.dao.impl;

import ex6.dao.ExpensesDao;
import ex6.components.DBUtils;
import ex6.components.ConnectionPool;
import ex6.components.Expense;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by champion on 06.07.15.
 */
public class ExpensesDaoImpl implements ExpensesDao {

    public static final String SQL_GET_EXPENSE = "SELECT * FROM EXPENSES WHERE num = ? ";
    public static final String SQL_GET_EXPENSES = "SELECT * FROM EXPENSES";
    public static final String SQL_ADD_EXPENSE = "INSERT INTO EXPENSES (num,paydate,value,receiver) VALUES (?,?,?,?)";

    @Override
    public Expense findExpenseById(int num) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Expense expense = null;
        try {
            connection = connectionPool.getConnection();

            preparedStatement = connection.prepareStatement(SQL_GET_EXPENSE);
            preparedStatement.setInt(1, num);
            resultSet = preparedStatement.executeQuery();
            if (resultSet != null) {
                System.out.println("resultSet!=null");
                expense = new Expense();
                System.out.println(resultSet.getInt(1));
                expense.setNum(resultSet.getInt("num"));
                expense.setPaydate(resultSet.getString("paydate"));
                expense.setValue(resultSet.getFloat("value"));
                expense.setReceiver(resultSet.getInt("receiver"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, preparedStatement, resultSet);
        }
        return expense;
    }

    @Override
    public List<Expense> findExpenses() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Expense> expenses = new ArrayList<>();
        try {
            connection = connectionPool.getConnection();
            preparedStatement = connection.prepareStatement(SQL_GET_EXPENSES);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Expense expense = new Expense();
                expense.setNum(resultSet.getInt("num"));
                expense.setPaydate(resultSet.getString("paydate"));
                expense.setValue(resultSet.getFloat("value"));
                expense.setReceiver(resultSet.getInt("receiver"));
                expenses.add(expense);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, preparedStatement, resultSet);
        }
        return expenses;
    }

    @Override
    public void addExpense(Expense expense) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = connectionPool.getConnection();

            preparedStatement = connection.prepareStatement(SQL_ADD_EXPENSE);
            preparedStatement.setInt(1, expense.getNum());
            preparedStatement.setString(2, expense.getPaydate());
            preparedStatement.setFloat(3, expense.getValue());
            preparedStatement.setInt(4, expense.getReceiver());
            preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(connection, preparedStatement);
        }
    }
}
