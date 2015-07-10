package jd03lab07.service;

import jd03lab07.db.dao.ExpenseDAO;
import jd03lab07.db.dao.impl.JDBCExpenseDAOImpl;
import jd03lab07.entities.Expense;

import java.util.List;

public class ExpenseService {

    private ExpenseDAO expenseDAO = new JDBCExpenseDAOImpl();

    public Expense retrieveExpense(final int num) {
        return expenseDAO.retrieveExpense(num);
    }

    public List<Expense> retrieveAllExpenses() {
        return expenseDAO.retrieveAllExpenses();
    }

    public int insertExpense(final Expense expense) {
        return expenseDAO.insertExpense(expense);
    }
}