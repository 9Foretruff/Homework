package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class DataRaceAndSynchronized2 {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

    public synchronized static void increment() {
        counter++;
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            DataRaceAndSynchronized2.increment();
        }
    }
}
