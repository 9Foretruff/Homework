package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class MonitorAndSynchronizedBlocks2 {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

    public static void increment() {
        synchronized (MonitorAndSynchronizedBlocks2.class){
            counter++;
        }
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            MonitorAndSynchronizedBlocks2.increment();
        }
    }
}
