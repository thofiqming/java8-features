package threads;

public class ThreadInterruptionExample {

    public static void main(String[] args) {
        ApplicationThread applicationThread = new ApplicationThread();
        applicationThread.setName("application - thread by extending Thread Class");
        applicationThread.start();

        ApplicationThreadUsingInterface applicationThreadUsingInterface =
                new ApplicationThreadUsingInterface(Thread.currentThread());
        Thread thread = new Thread(applicationThreadUsingInterface);
        thread.setName("application - thread using runnable interface");
        thread.start();

        try {
            System.out.println("putting thread - " + Thread.currentThread() + " sleep for 5 sec ");
            Thread.sleep(4000);
        } catch (InterruptedException interruptedException) {
            System.out.println(Thread.currentThread() + interruptedException.getMessage());
        }

    }
}

//extending thread class
class ApplicationThread extends Thread {

}

//implementing runnable interface
class ApplicationThreadUsingInterface implements Runnable {

    private final Thread callingThread;

    public ApplicationThreadUsingInterface(Thread thread) {
        this.callingThread = thread;
    }

    @Override
    public void run() {
        callingThread.interrupt();
        System.out.println("Interrupting sleeping main thread...");
    }
}
