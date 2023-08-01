package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class ThreadLocalExample {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("hello world !!!");
        Thread thread1 = new ThreadOne();
        Thread thread2 = new ThreadTwo();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("main " + threadLocal.get());
    }

    static class ThreadOne extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadOne");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ThreadOne" + threadLocal.get());
        }
    }
    static class ThreadTwo extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadTwo");

            System.out.println("ThreadTwo" + threadLocal.get());
        }
    }
}
