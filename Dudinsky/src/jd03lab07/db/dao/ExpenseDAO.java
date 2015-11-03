package jd03lab07.db.dao;

import jd03lab07.entities.Expense;

import java.util.List;

public interface ExpenseDAO {

    Expense retrieveExpense(final int num);

    List<Expense> retrieveAllExpenses();

    int insertExpense(final Expense expense);
}