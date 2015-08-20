package jd3task6;


import java.text.ParseException;
import java.util.List;

/**
 * Задание  6.
 * Измените предыдущую задачу таким образом, чтобы она использовала прекомпилированные запросы.
 */
public class RunDataExpences {

    public static void main(String[] args) throws ClassNotFoundException, ParseException {

        DataExpenses dataExpences = new DataExpenses();
        List<Expense> expenses = dataExpences.getExpenses();

        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        dataExpences.addExpense("20110514", 2, 30000);
    }
}
