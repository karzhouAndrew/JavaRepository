package ex6;

import ex6.components.Expense;
import ex6.components.Receiver;
import ex6.dao.ExpensesDao;
import ex6.dao.RecieverDao;
import ex6.dao.impl.ExpensesDaoImpl;
import ex6.dao.impl.RecieverDaoImpl;

import java.util.List;

/**
 * Created by champion on 11.07.15.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        //add
        receiver.setName("Karzhou");
        RecieverDao recieverDao = new RecieverDaoImpl();
        recieverDao.addReciever(receiver);
        //find
        ExpensesDao expensesDao = new ExpensesDaoImpl();
        List<Expense> expenses = expensesDao.findExpenses();
        if(expenses!=null) {
            for (Expense expense : expenses) {
                System.out.println(expense.getPaydate() + " " + expense.getValue() + " " + expense.getReceiver());

            }
        }
    }
}
