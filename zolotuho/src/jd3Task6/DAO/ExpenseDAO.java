package jd3Task6.DAO;

import jd3Task6.DTO.Expense;

import java.util.List;

public interface ExpenseDAO {
    void addExpense(Expense expense);

    List<Expense> obtainExpenses();

    Expense obtainExpense(int id);
}
