package Multithreading_Top;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new RunnableImp200());
//        }
//        executorService.schedule(new RunnableImp200() , 3 , TimeUnit.SECONDS);

//        executorService.scheduleAtFixedRate(new RunnableImp200()
//                , 3 , 1 , TimeUnit.SECONDS);

        executorService.scheduleWithFixedDelay(new RunnableImp200()
                , 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executorService.shutdown();

        ExecutorService executorService1 = Executors.newCachedThreadPool();
        // Крутой пулл .
    }
}

class RunnableImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
