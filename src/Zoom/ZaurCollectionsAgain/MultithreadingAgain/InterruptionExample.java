package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    @Override
    public void run() {
        double sqrtSum = 0;
        for (int i = 1; i <= 1_000_000_000; i++) {
            if (isInterrupted()){
                System.out.println("Thread is interrupted");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread is going to interrupt while sleeping");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}


