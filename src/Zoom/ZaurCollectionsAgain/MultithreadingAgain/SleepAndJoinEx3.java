package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class SleepAndJoinEx3 {
    public static void main(String[] args) throws InterruptedException {
        // NEW - RUNNABLE - TERMINATED
        //    READY - RUNNING
        System.out.println("Main begin's");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Main end's");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begin's");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work end's");
    }
}
