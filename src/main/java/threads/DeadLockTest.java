package threads;

public class DeadLockTest {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();

        ThreadB threadB = new ThreadB();
        threadB.start();
    }

    static class ThreadA extends Thread {

        @Override
        public void run() {
            ThreadB threadB = new ThreadB();
            threadB.m2();
        }

        synchronized void m1() {
        }
    }

    static class ThreadB extends Thread {

        @Override
        public void run() {
            ThreadA threadA = new ThreadA();
            threadA.m1();
        }

        synchronized void m2() {
        }
    }
}
