package jd03lab07;

/* Задание  7. Создайте реализации DAO на основе интерфейсов приведенного выше.
Также необходимо создать классы Receiver и Expense, свойства которых соответствуют полям таблиц базы данных расходов.
Поле дата в классах можно хранить в виде строки. */

import jd03lab07.entities.Expense;
import jd03lab07.entities.Receiver;
import jd03lab07.service.ExpenseService;
import jd03lab07.service.ReceiverService;

import java.util.List;
import java.util.Scanner;

public class MainDBManager {

    private static final String RECEIVERS_DB_TABLE_NAME = "receivers";
    private static final String EXPENSES_DB_TABLE_NAME = "expenses";
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ReceiverService receiverService = new ReceiverService();
        List<Receiver> receivers = receiverService.retrieveAllReceivers();
        System.out.println("Результат выборки исходной таблицы получателей '" + RECEIVERS_DB_TABLE_NAME + "':");
        printReceiversList(receivers);
        System.out.println("Выполняем добавление получателя в базу INSERT-запросом:");
        System.out.println("Введите номер получателя num (тип INT): ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Введите наименование получателя name (тип varchar(255)): ");
        String name = scan.nextLine();
        Receiver receiver = new Receiver(num, name);
        System.out.println("Количество добавленных в базу строк: " + receiverService.insertReceiver(receiver));
        receivers = receiverService.retrieveAllReceivers();
        System.out.println("Результат повторной выборки таблицы получателей '" + RECEIVERS_DB_TABLE_NAME + "':");
        printReceiversList(receivers);
        System.out.println("Выполняем выборку получателя из базы SELECT-запросом:");
        System.out.println("Введите номер получателя num (тип INT): ");
        num = scan.nextInt();
        receiver = receiverService.retrieveReceiver(num);
        System.out.println("Результат выборки по номеру получателя " + num + ":\n" + receiver);

        ExpenseService expenseService = new ExpenseService();
        List<Expense> expenses = expenseService.retrieveAllExpenses();
        System.out.println("Результат выборки исходной таблицы расходов '" + EXPENSES_DB_TABLE_NAME + "':");
        printExpensesList(expenses);
        System.out.println("Выполняем добавление записи о расходе в базу INSERT-запросом:");
        System.out.println("Введите номер расхода num (тип INT): ");
        num = scan.nextInt();
        scan.nextLine();
        System.out.println("Введите дату платежа paydate (тип date): ");
        String paydate = scan.nextLine();
        System.out.println("Введите номер получателя receiver (тип INT): ");
        int receiverNum = scan.nextInt();
        System.out.println("Введите сумму платежа value (тип decimal): ");
        double value = scan.nextDouble();
        Expense expense = new Expense(num, paydate, receiverNum, value);
        System.out.println("Количество добавленных в базу строк: " + expenseService.insertExpense(expense));
        expenses = expenseService.retrieveAllExpenses();
        System.out.println("Результат повторной выборки таблицы расходов '" + EXPENSES_DB_TABLE_NAME + "':");
        printExpensesList(expenses);
        System.out.println("Выполняем выборку платежа из базы SELECT-запросом:");
        System.out.println("Введите номер платежа num (тип INT): ");
        num = scan.nextInt();
        expense = expenseService.retrieveExpense(num);
        System.out.println("Результат выборки по номеру платежа " + num + ":\n" + expense);

        scan.close();
    }

    public static void printReceiversList(List<Receiver> receivers) {
        for (Receiver currentReceiver : receivers) {
            System.out.println(currentReceiver);
        }
    }

    public static void printExpensesList(List<Expense> expenses) {
        for (Expense currentExpense : expenses) {
            System.out.println(currentExpense);
        }
    }
}