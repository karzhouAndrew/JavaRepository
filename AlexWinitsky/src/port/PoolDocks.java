package port;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by Master on 28.06.2015.
 */
public class PoolDocks<Dock> {
    private final static int POOL_SIZE = 3;
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<Dock> resources = new LinkedList<Dock>();
    public PoolDocks(Queue<Dock> source) {
        resources.addAll(source);
    }
    public Dock getResource(long maxWaitMillis) throws ResourceException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                Dock res = resources.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourceException(e);
        }
        throw new ResourceException(":превышено время ожидания");
    }
    public void returnResource(Dock res) {
        resources.add(res);
        semaphore.release();
    }
}
