package ex6.dao;

import ex6.components.Expense;

import java.util.List;

/**
 * Created by champion on 06.07.15.
 */
public interface ExpensesDao {
    Expense findExpenseById(int num);
    List<Expense> findExpenses();
    void addExpense(Expense expense);
}
