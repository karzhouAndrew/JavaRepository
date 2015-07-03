package lab50;

import java.util.ArrayList;

/**
 * Создайте реализации DAO на основе интерфейсов приведенного выше. Также необходимо создать классы
 * Receiver и Expense, свойства которых соответствуют полям таблиц базы данных расходов. Поле дата в
 * классах можно хранить в виде строки.
 */
public class Lab50 {
    public static void main(String[] args) throws ClassNotFoundException {
        Expense newExpense = new Expense(5, "2011-06-11", 8200, 2);
        Receiver newReceiver = new Receiver(4, "Гипермаркет Простор");
        ExpensesService expenseService = new ExpensesService();
        expenseService.addExpense(newExpense);
        ArrayList<Expense> expenses = expenseService.getExpenses();
        for (Expense expense : expenses) {
            System.out.println("expenses = " + expense);
        }
        System.out.println("expenses = " + expenseService.getExpense(1));


        ReceiversService receiversService = new ReceiversService();
        receiversService.addReceiver(newReceiver);
        ArrayList<Receiver> receivers = receiversService.getReceivers();
        for (Receiver receiver : receivers) {
            System.out.println("receivers = " + receiver);
        }
        System.out.println("receiver = " + receiversService.getReceiver(1));
    }
}
