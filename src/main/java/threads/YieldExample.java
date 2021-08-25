package threads;

public class YieldExample {

    public static void main(String[] args) {
        Thread t1 = new YieldSupplier();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new YieldSupplier();
        Thread t3 = new YieldSupplier();

        t1.start();
        t2.start();
        t3.start();

    }
}

class YieldSupplier extends Thread {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println("Thread Name : " + threadName +
                " priority : " + thread.getPriority());
        Thread.yield(); // providing same priority thread a chance to continue its execution
        System.out.println(threadName + " completed its execution ");
    }
}
