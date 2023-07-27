package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImp200());
//        }
//        scheduledExecutorService.schedule(new RunnableImp200(),3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

        //scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp200(),3,1,TimeUnit.SECONDS);

        scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
        // потоки по надобности . делает потоки
    }
}


class RunnableImp200 implements Runnable {

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