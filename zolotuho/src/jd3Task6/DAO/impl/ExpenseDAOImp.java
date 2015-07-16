package jd3Task6.DAO.impl;


//import com.mysql.jdbc.Connection;

import jd3Task6.DAO.ExpenseDAO;
import jd3Task6.DTO.Expense;
import jd3Task6.connection.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAOImp implements ExpenseDAO {
    public static final String SQL_INSERT_TEMPLATE = "INSERT INTO EXPENSES (PAYDATE,RECEIVER_ID,VALUE) VALUES (?,?,?);";
    public static final String SQL_SELECT = "SELECT * FROM EXPENSES;";
    public static final String SQL_SELECT_ID = "SELECT * FROM EXPENSES WHERE ID=?;";


    @Override
    public void addExpense(Expense expense) {
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            PreparedStatement prStatement = connection.prepareStatement(SQL_INSERT_TEMPLATE);
            prStatement.setString(1, expense.getPayDate());
            prStatement.setInt(2, expense.getReceiverID());
            prStatement.setDouble(3, expense.getValue());
            prStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Expense> obtainExpenses() {
        List<Expense> expenses = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(SQL_SELECT);
            expenses = initExpenses(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public Expense obtainExpense(int id) throws IndexOutOfBoundsException {
        List<Expense> expenses = null;
        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            PreparedStatement prStatement = connection.prepareStatement(SQL_SELECT_ID);
            prStatement.setInt(1, id);
            ResultSet result = prStatement.executeQuery();
            expenses = initExpenses(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses.get(0);
    }

    public List<Expense> initExpenses(ResultSet result) throws SQLException {
        List<Expense> expenses = new ArrayList<>();
        while (result.next()) {
            Expense expense = new Expense();
            expense.setID(result.getInt("ID"));
            expense.setPayDate(result.getString("PAYDATE"));
            expense.setReceiverID(result.getInt("RECEIVER_ID"));
            expense.setValue(result.getDouble("VALUE"));
            expenses.add(expense);
        }
        return expenses;
    }
}
