package JD3_lab6.DAO.Implementation;

import JD3_lab6.DAO.ExpensesDAO;
import JD3_lab6.entity.Expense;
import JD3_lab6.utils.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBSExpensesDAOImpl implements ExpensesDAO {
    private static final String QUERY_FIND_EXPENSES = "SELECT * FROM expenses";
    private static final String QUERY_INSERT_EXPENSE = "INSERT INTO expenses (ID,paydate,receiver,value) values(?,?,?,?)";
    private static final String QUERY_SEARCH_BY_ID = "SELECT * FROM expenses WHERE ID=?";

    @Override
    public List<Expense> getExpensesByID(int ID) throws ClassNotFoundException {
        PreparedStatement preparedStatement = DBUtils.createPreparedStatement(QUERY_SEARCH_BY_ID);
        List<Expense> expenses = null;
        try {
            preparedStatement.setInt(1, ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            expenses = init(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(DBUtils.createConnection(), preparedStatement);
        }
        return expenses;
    }

    @Override
    public void addExpense(Expense expense) throws ClassNotFoundException {
        PreparedStatement preparedStatement = DBUtils.createPreparedStatement(QUERY_INSERT_EXPENSE);
        try {
            preparedStatement.setInt(1, expense.getID());
            preparedStatement.setString(2, expense.getPaydate());
            preparedStatement.setInt(3, expense.getReceiver());
            preparedStatement.setInt(4, expense.getValue());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(DBUtils.createConnection(), preparedStatement);
        }
    }

    @Override
    public List<Expense> getExpenses() throws ClassNotFoundException {
        ResultSet resultSet = null;
        List<Expense> expenses = null;
        try {
            resultSet = DBUtils.createStatement().executeQuery(QUERY_FIND_EXPENSES);
            expenses = init(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(DBUtils.createConnection(), DBUtils.createStatement(), resultSet);
        }
        return expenses;
    }

    private List<Expense> init(ResultSet resultSet) throws SQLException {
        List<Expense> expenses = new ArrayList<Expense>();
        while (resultSet.next()) {
            Expense expense = new Expense();
            expense.setID(resultSet.getInt("ID"));
            expense.setPaydate(resultSet.getString("paydate"));
            expense.setReceiver(resultSet.getInt("receiver"));
            expense.setValue(resultSet.getInt("value"));
            expenses.add(expense);
        }
        return expenses;
    }
}
