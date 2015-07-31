package jd3task7;


import jd3task7.entity.Expense;
import jd3task7.entity.Receiver;
import jd3task7.service.ExpenseService;
import jd3task7.service.ResponseService;

import java.text.ParseException;
import java.util.List;

/**
 Задание  7.
 Создайте реализации DAO на основе интерфейсов приведенного выше.
 Также необходимо создать классы Receiver и Expense, свойства которых соответствуют полям таблиц базы данных расходов.
 Поле дата в классах можно хранить в виде строки.

 */
public class RunDataExpencesReceiver {

    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        ExpenseService expenseService = new ExpenseService();
        List<Expense> expenses = expenseService.getExpenses();

        ResponseService responseService = new ResponseService();
        List<Receiver> receivers = responseService.getReceivers();

        expenseService.addExpense(new Expense("20110523", 5, 20000));
        responseService.addReceiver(new Receiver(7, "Техносила"));

        for (Expense expense : expenses) {
            System.out.println(expense);
        }

        for (Receiver receiver : receivers) {
            System.out.println(receiver);
        }
    }
}
