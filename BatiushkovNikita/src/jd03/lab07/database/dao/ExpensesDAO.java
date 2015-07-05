package jd03.lab07.database.dao;

import jd03.lab07.entity.Expense;

import java.util.List;

public interface ExpensesDAO {
    Expense getExpense(int num);
    List<Expense> getExpenses();
    int addExpense(Expense expense);
}
