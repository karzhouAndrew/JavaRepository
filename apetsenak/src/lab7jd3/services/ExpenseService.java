package lab7jd3.services;


import lab7jd3.dao.expense.ExpenseDAO;
import lab7jd3.dao.expense.impl.ExpenseDAOImpl;
import lab7jd3.entities.Expense;

import java.util.List;

public class ExpenseService {
    private ExpenseDAO expenseDAO = new ExpenseDAOImpl();

    public void addExpense(Expense expense) {
        expenseDAO.addExpense(expense);
    }

    public List<Expense> getExpenses() {
        return expenseDAO.getExpenses();
    }
}
