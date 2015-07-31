package jd3task7.dao.impl;

import jd3task7.dao.ExpenseDAO;
import jd3task7.dao.pool.ConnectionPool;
import jd3task7.dbutil.DBUtils;
import jd3task7.entity.Expense;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 02.07.2015.
 */
public class JDBCExpenseDAOImpl implements ExpenseDAO {
    private static final String SQL_INSERT_EXPENSE = "INSERT INTO expenses (paydate,receiver,value) values (?,?,?)";
    private static final String SQL_GET_EXPENSES = "SELECT * FROM expenses";

    public List<Expense> getExpenses() throws ClassNotFoundException {
        List<Expense> expenses = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = connectionPool.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_EXPENSES);
            expenses = initExpense(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return expenses;
    }


    private List<Expense> initExpense(ResultSet resultSet) throws SQLException {
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

    public void addExpense(Expense expense) throws ClassNotFoundException, ParseException {
        Connection connection = null;
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        PreparedStatement preparedStatement = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = format.parse(expense.getPaydata());
        Date data = new Date(parsed.getTime());


        try {
            connection = connectionPool.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT_EXPENSE);
            preparedStatement.setDate(1, data);
            preparedStatement.setInt(2, expense.getReciver());
            preparedStatement.setDouble(3, expense.getValue());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }
}
