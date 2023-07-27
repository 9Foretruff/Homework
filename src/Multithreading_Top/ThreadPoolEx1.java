package Multithreading_Top;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        // Thread pool - это множество потоков,
        // каждый из которых предназначен для выполненмия той или иной задачи.
        //       ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown();
        executorService.awaitTermination(2 , TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}