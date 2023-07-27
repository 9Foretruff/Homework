package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.Calendar;
import java.util.concurrent.*;

public class ThreadPoolAndExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ThreadFactory threadFactory;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown();
        executorService.awaitTermination(4,TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin work!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work!");
    }
}
