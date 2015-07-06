package jd3Task6;

import jd3Task6.DTO.Expense;
import jd3Task6.DTO.Receiver;
import jd3Task6.service.ExpenseService;
import jd3Task6.service.ReceiverService;

import java.util.ArrayList;
import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        ExpenseService expenseService = new ExpenseService();
        List<Expense> expenses = new ArrayList<>(expenseService.obtainExpenses());
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        ReceiverService receiverService = new ReceiverService();
        Receiver receiver1 = new Receiver("Vasja");
        receiverService.addReceiver(receiver1);
        List<Receiver> receivers = new ArrayList<>(receiverService.obtainReceivers());
        for (Receiver receiver : receivers) {
            System.out.println(receiver);
        }
        Receiver receiver = receiverService.obtainReceiver(2);
        System.out.println("id=2");
        System.out.println(receiver);
        try {
            Expense expense = expenseService.obtainExpense(3);

            System.out.println("id=13");
            System.out.println(expense);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ID not found");
        }
    }
}
