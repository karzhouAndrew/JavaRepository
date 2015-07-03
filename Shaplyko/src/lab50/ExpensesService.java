package lab50;

import java.util.ArrayList;

public class ExpensesService {
    private ExpensesDao expensesDao = new ExpensesDaoImpl();

    public void addExpense(Expense expense) throws ClassNotFoundException {
        expensesDao.addExpense(expense);
    }

    public ArrayList<Expense> getExpenses() throws ClassNotFoundException {
        return expensesDao.getExpenses();
    }

    public Expense getExpense(int num) throws ClassNotFoundException {
        return expensesDao.getExpense(num);
    }
}