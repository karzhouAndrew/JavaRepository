package jd3task5;


import java.text.ParseException;
import java.util.List;

/**
 * Задание  5.
 * Напишите программу получающую данные о расходе в качестве исходных параметров main,
 * и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
 */
public class RunDataExpences {

    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        DataExpenses dataExpences = new DataExpenses();
        List<Expense> expenses = dataExpences.getExpenses();

        for (Expense expense : expenses) {
            System.out.println(expense);
        }

        dataExpences.addExpense("20110513", 3, 70000);
    }
}
