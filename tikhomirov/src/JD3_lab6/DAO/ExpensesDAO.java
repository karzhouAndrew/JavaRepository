package JD3_lab6.DAO;


import JD3_lab6.entity.Expense;

import java.util.List;

public interface ExpensesDAO {
    List<Expense> getExpensesByID(int ID) throws ClassNotFoundException;

    void addExpense(Expense expense) throws ClassNotFoundException;

    List<Expense> getExpenses() throws ClassNotFoundException;
}
