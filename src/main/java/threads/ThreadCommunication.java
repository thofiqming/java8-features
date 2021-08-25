package threads;

public class ThreadCommunication {
    public static void main(String[] args) throws InterruptedException {

        Message message = new Message("Content ");
        Consumer consumer = new Consumer(message);
        Thread consumert = new Thread(consumer);
        consumert.start();
    }
}

class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}


class Consumer implements Runnable {

    private final Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(message.getMessage());
            this.notify();
        }
    }
}
