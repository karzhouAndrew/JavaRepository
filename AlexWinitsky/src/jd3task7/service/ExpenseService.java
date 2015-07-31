package jd3task7.service;

import jd3task7.dao.ExpenseDAO;
import jd3task7.dao.impl.JDBCExpenseDAOImpl;
import jd3task7.entity.Expense;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Master on 04.07.2015.
 */
public class ExpenseService {
    private ExpenseDAO expenseDAO = new JDBCExpenseDAOImpl();

    public void addExpense(Expense expense) throws ClassNotFoundException, ParseException {
        expenseDAO.addExpense(expense);
    }

    public List<Expense> getExpenses() throws ClassNotFoundException {
        return expenseDAO.getExpenses();
    }
}
