package Multithreading_Top;

public class ThreadSleepEx1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadSleepEx1 threadSleepEx1 = new ThreadSleepEx1();
        Thread thread = new Thread(new MyRunnable1());
        threadSleepEx1.start();
        thread.start();

        threadSleepEx1.join();
        thread.join();

        System.out.println("End of program");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
