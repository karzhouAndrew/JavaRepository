package JD3_lab6.service;

import JD3_lab6.DAO.ExpensesDAO;
import JD3_lab6.DAO.Implementation.JDBSExpensesDAOImpl;
import JD3_lab6.entity.Expense;

import java.util.List;

public class ExpenseService {
    private ExpensesDAO expensesDAO = new JDBSExpensesDAOImpl();

    public List<Expense> getExpenses() throws ClassNotFoundException {

        return expensesDAO.getExpenses();
    }

    public void addExpense(Expense expense) throws ClassNotFoundException {
        expensesDAO.addExpense(expense);
    }

    public List<Expense> getExpensesByID(int ID) throws ClassNotFoundException {
        return expensesDAO.getExpensesByID(ID);
    }
}
