package jd3Task6.service;

import jd3Task6.DAO.impl.ExpenseDAOImp;
import jd3Task6.DTO.Expense;

import java.util.List;

public class ExpenseService {
    private ExpenseDAOImp expenseDAOImp = new ExpenseDAOImp();

    public void addExpense(Expense expense) {
        expenseDAOImp.addExpense(expense);
    }

    public List<Expense> obtainExpenses() {
        return expenseDAOImp.obtainExpenses();
    }

    public Expense obtainExpense(int id) throws IndexOutOfBoundsException {
        return expenseDAOImp.obtainExpense(id);
    }
}

