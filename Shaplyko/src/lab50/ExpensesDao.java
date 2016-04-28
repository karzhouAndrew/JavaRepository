package lab50;

import java.util.ArrayList;

public interface ExpensesDao {
    Expense getExpense(int num) throws ClassNotFoundException;

    ArrayList<Expense> getExpenses() throws ClassNotFoundException;

    void addExpense(Expense expense) throws ClassNotFoundException;
}
