package jd3task7.dao;

import jd3task7.entity.Expense;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Master on 02.07.2015.
 */
public interface ExpenseDAO {
    void addExpense(Expense expense) throws ClassNotFoundException, ParseException;

    List<Expense> getExpenses() throws ClassNotFoundException;

}
