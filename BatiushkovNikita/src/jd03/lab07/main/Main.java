package jd03.lab07.main;

import jd03.lab07.database.pool.DBConfig;
import jd03.lab07.entity.Expense;
import jd03.lab07.entity.Receiver;
import jd03.lab07.service.ExpenseService;
import jd03.lab07.service.ReceiverService;

import java.util.ArrayList;

public class Main {
    public static final String CONFIG_FILE_PATH = "jd03.lab07.database.pool.DBConfig";

    public static void main(String[] args) {
        new DBConfig(CONFIG_FILE_PATH);
        expensesTest();
        receiversTest();

    }

    public static void receiversTest() {
        ReceiverService receiverService = new ReceiverService();
        Receiver receiver = receiverService.getReceiver(2);
        System.out.println(receiver);

        Receiver receiver1 = new Receiver(4, "Sasha");
        receiverService.addReceiver(receiver1);

        ArrayList<Receiver> receivers = (ArrayList<Receiver>) receiverService.getReceivers();
        for (Receiver rec : receivers) {
            System.out.println(rec);
        }
    }

    public static void expensesTest() {
        ExpenseService expenseService = new ExpenseService();
        Expense expense = expenseService.getExpense(2);
        System.out.println(expense);

        Expense expense1 = new Expense(5, "2015-12-12", 89999, 1);
        expenseService.addExpense(expense1);

        ArrayList<Expense> expenses = (ArrayList<Expense>) expenseService.getExpenses();
        for (Expense exp : expenses) {
            System.out.println(exp);
        }
    }
}
