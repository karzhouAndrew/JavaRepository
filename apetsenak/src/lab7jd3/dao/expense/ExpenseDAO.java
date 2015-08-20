package lab7jd3.dao.expense;


import lab7jd3.entities.Expense;

import java.util.List;

public interface ExpenseDAO {
    public void addExpense(Expense expense);

    public List<Expense> getExpenses();
}
