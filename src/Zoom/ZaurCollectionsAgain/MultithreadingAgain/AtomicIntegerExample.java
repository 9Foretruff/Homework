package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    //    static int counter;
    static AtomicInteger counter = new AtomicInteger(0); // Он отамарный !!!

    public static void increment() {
//        counter++
//        counter.incrementAndGet();
        counter.addAndGet(-5);
//        counter.getAndSet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp18());
        Thread thread2 = new Thread(new MyRunnableImp18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp18 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            AtomicIntegerExample.increment();
        }
    }
}
