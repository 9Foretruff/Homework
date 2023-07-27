package Multithreading_Top;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(1000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Potok xotyat prervat");
                System.out.println("Bye bye ");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("potok xotyat prervat co vremya sna");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
