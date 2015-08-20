package lab7jd3.main;

import lab7jd3.entities.Expense;
import lab7jd3.entities.Receiver;
import lab7jd3.services.ExpenseService;
import lab7jd3.services.ReceiverService;

import java.util.List;

/**
 * Создайте реализации DAO на основе интерфейсов приведенного выше.
 * Также необходимо создать классы Receiver и Expense,
 * свойства которых соответствуют полям таблиц базы данных расходов.
 * Поле дата в классах можно хранить в виде строки.
 */
public class Task {
    public static void main(String[] args) {
        Expense newExpense = new Expense(7, "2011-12-06", 4, 34567);
        Receiver newReceiver = new Receiver(4, "STADLER");
        ExpenseService expenseService = new ExpenseService();
        ReceiverService receiverService = new ReceiverService();
        receiverService.addReceiver(newReceiver);
        expenseService.addExpense(newExpense);
        List<Receiver> receivers = receiverService.getReceivers();
        for (Receiver receiver : receivers) {
            System.out.println(receiver);
        }
        List<Expense> expenses = expenseService.getExpenses();
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }
}
