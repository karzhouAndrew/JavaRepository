package jd02lab10;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Shop {

    private final PrintStream OUT;

    private List<CashDesk> cashDesks = new LinkedList<>();
    private List<Thread> cashDesksThreads = new LinkedList<>();
    private CustomerGen customerGen;
    private int nextCashDeskNumber = 1;

    public Shop(PrintStream out) {
        OUT = out;
    }

    public void initCashDesks(int quantity, CustomerGen customerGen) {
        this.customerGen = customerGen;
        addCashDesks(quantity);
    }

    public void addCashDesks(int quantity) {
        for (int i = quantity; i > 0; i--) {
            CashDesk nextCashDesk = new CashDesk(OUT);
            cashDesks.add(nextCashDesk);
            nextCashDesk.setNumber(nextCashDeskNumber++);
            if (customerGen != null && !customerGen.isOpen()) {
                nextCashDesk.setOpen(false);
            }
            synchronized (OUT) {
                OUT.println("-> Cash Desk " + nextCashDesk.getNumber() + " is opening now <-");
            }
            Thread cashDesksThread = new Thread(nextCashDesk);
            cashDesksThreads.add(cashDesksThread);
            cashDesksThread.start();
        }
    }

    public void stopCashDesks(int quantity) {
        for (int i = quantity; i > 0; i--) {
            int lastIndex = cashDesks.size() - 1;
            cashDesksThreads.remove(lastIndex).interrupt();
            cashDesks.remove(lastIndex);
        }
    }

    public List<CashDesk> getCashDesks() {
        return cashDesks;
    }
}
