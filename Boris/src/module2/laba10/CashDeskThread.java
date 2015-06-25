package module2.laba10;


import module2.laba10.customer.Customer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashDeskThread {
    private static final String THREAD_NUMBER_REGEX = "thread-(\\d+)";
    private static CashDeskThread instance;
    private static final int THREADS = 10;
    ExecutorService poolThreads;

    private CashDeskThread() {
        poolThreads = Executors.newFixedThreadPool(THREADS);
    }

    public static CashDeskThread getInstance() {
        if (instance == null) {
            instance = new CashDeskThread();
            return instance;
        }
        return instance;
    }

    public void work(final Customer customer) {
        synchronized (customer) {
            poolThreads.execute(new Runnable() {
                @Override
                public void run() {
                    Matcher matcher = Pattern.compile(THREAD_NUMBER_REGEX).matcher(Thread.currentThread().getName());
                    matcher.find();
                    System.out.println("CashDesk #" + matcher.group(1) + customer + "\n");
                }
            });
        }
    }

    public void shutdown(){
//        try {
            while (!poolThreads.isTerminated()){
                poolThreads.shutdown();
            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Goodbye.");
    }

}