package jd03.lab07.service;

import jd03.lab07.database.dao.ExpensesDAO;
import jd03.lab07.database.dao.ExpensesDAOImpl;
import jd03.lab07.entity.Expense;

import java.util.List;

public class ExpenseService {
    ExpensesDAO expensesDAO = new ExpensesDAOImpl();

    public Expense getExpense(int num) {
        return expensesDAO.getExpense(num);
    }

    public List<Expense> getExpenses() {
        return expensesDAO.getExpenses();
    }

    public int addExpense(Expense expense) {
        return expensesDAO.addExpense(expense);
    }
}
