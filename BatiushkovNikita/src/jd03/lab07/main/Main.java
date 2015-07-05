package jd03.lab07.main;

import jd03.lab07.database.pool.DBConfig;
import jd03.lab07.entity.Expense;
import jd03.lab07.entity.Receiver;
import jd03.lab07.service.ExpenseService;
import jd03.lab07.service.ReceiverService;

public class Main {
    public static final String CONFIG_FILE_PATH = "jd03.lab07.database.pool.DBConfig";

    public static void main(String[] args) {
        new DBConfig(CONFIG_FILE_PATH);

        ExpenseService expenseService = new ExpenseService();
        System.out.println(expenseService.getExpense(2));
        System.out.println(expenseService.getExpenses());
        String paydate = "2013" + "21" + "99";
        //String paydate = "2011-06-12";
        Expense expense = new Expense(19, paydate, 22347785, 99);
        System.out.println(expenseService.addExpense(expense));

        System.out.println(expenseService.getExpenses());

        ReceiverService receiverService = new ReceiverService();
        System.out.println(receiverService.getReceiver(2));
        System.out.println(receiverService.getReceivers());

        Receiver receiver = new Receiver(120, "Tanya");
        receiverService.addReceiver(receiver);
    }
}
