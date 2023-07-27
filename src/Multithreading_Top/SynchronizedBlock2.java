package Multithreading_Top;

import javax.management.monitor.Monitor;

public class SynchronizedBlock2 {
    static int counter = 0;
    static Object lock = new Object();
    // Делаем lock
    public static void increment() {
        synchronized (lock){
            counter++;
        }
    }
    //если статик используеться монитор класа . если нет то монитор обекта

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }

}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            SynchronizedBlock2.increment();
        }
    }
}

