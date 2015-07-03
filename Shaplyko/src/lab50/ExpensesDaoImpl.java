package lab50;

import java.sql.*;
import java.util.ArrayList;

public class ExpensesDaoImpl implements ExpensesDao {
    public static final String SQL_INSERT_EXPENSE = "INSERT INTO expenses (num, date, sum, receiver) VALUES (?,?,?,?)";
    public static final String SQL_GET_EXPENSES = "SELECT * FROM expenses";
    public static final String SQL_GET_EXPENSE = "SELECT * FROM expenses WHERE num=";

    @Override
    public Expense getExpense(int num) throws ClassNotFoundException {
        Expense expense = null;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listexpenses", "root", "admin123");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_EXPENSE + num);
            expense = initExpense(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return expense;
    }

    @Override
    public ArrayList<Expense> getExpenses() throws ClassNotFoundException {
        ArrayList<Expense> expenses = null;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listexpenses", "root", "admin123");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_GET_EXPENSES);
            expenses = initExpenses(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(statement, resultSet, connection);
        }
        return expenses;
    }

    @Override
    public void addExpense(Expense expense) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listexpenses", "root", "admin123");
            preparedStatement = connection.prepareStatement(SQL_INSERT_EXPENSE);
            preparedStatement.setInt(1, expense.getNum());
            preparedStatement.setString(2, expense.getDate());
            preparedStatement.setInt(3, expense.getReceiver());
            preparedStatement.setInt(4, expense.getSum());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(preparedStatement, connection);
        }
    }

    private ArrayList<Expense> initExpenses(ResultSet resultSet) throws SQLException {
        ArrayList<Expense> expenses = new ArrayList<Expense>();
        while (resultSet.next()) {
            Expense expense = new Expense();
            expense.setNum(resultSet.getInt(1));
            expense.setDate(resultSet.getString(2));
            expense.setReceiver(resultSet.getInt(3));
            expense.setSum(resultSet.getInt(4));
            expenses.add(expense);
        }
        return expenses;
    }

    private Expense initExpense(ResultSet resultSet) throws SQLException {
        Expense expense = new Expense();
        expense.setNum(resultSet.getInt(1));
        expense.setDate(resultSet.getString(2));
        expense.setReceiver(resultSet.getInt(3));
        expense.setSum(resultSet.getInt(4));
        return expense;
    }
}
