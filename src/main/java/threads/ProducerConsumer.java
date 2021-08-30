package threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.process();
    }

    private void process() throws InterruptedException {
        Box box = new Box();
        Producer producer = new Producer(box);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        Thread.sleep(2000);

        Consumer consumer = new Consumer(box);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
    }


    class Producer implements Runnable {

        private final Box box;

        public Producer(Box box) {
            this.box = box;
        }

        @Override
        public void run() {
            try {
                this.producerMessage();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

        private void producerMessage() throws InterruptedException {
            System.out.println("executing producer thread content ");
            for (int i = 1; i <= 10; i++) {
                String message = "test message " + i;
                this.box.add(message);
            }
            System.out.println("messages added to the box");
            synchronized (this.box) {
                System.out.println("calling wait method on box");
                box.wait();
            }
        }
    }

    class Box {

        private List<String> messages = new ArrayList<>();

        public void add(String message) {
            messages.add(message);
        }

        public List<String> getMessages() {
            return messages;
        }
    }

    class Consumer implements Runnable {
        private final Box box;

        public Consumer(Box box) {
            this.box = box;
        }

        @Override
        public void run() {
            System.out.println(this.box.messages);
            synchronized (this.box) {
                this.box.notify();
            }
        }
    }

}


