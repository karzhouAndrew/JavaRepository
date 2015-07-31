package JD3_lab6.main;

import JD3_lab6.entity.Expense;
import JD3_lab6.service.ExpenseService;

import java.util.List;

public class Test {
    public static final int ID_FOR_SEARCH = 3;

    public static void main(String[] args) throws ClassNotFoundException {

        Expense newExpense = new Expense(124, "2015-11-11", 1, 125000);
        System.out.println("Create new expense: " + newExpense);
        ExpenseService expenseService = new ExpenseService();
        expenseService.addExpense(newExpense);
        List<Expense> expenses = expenseService.getExpenses();
        System.out.println("List of expenses:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        System.out.println("List of expenses searched by ID= " + ID_FOR_SEARCH);
        List<Expense> expensesByID = expenseService.getExpensesByID(ID_FOR_SEARCH);
        for (Expense expense : expensesByID) {
            System.out.println(expense);
        }
    }
}
