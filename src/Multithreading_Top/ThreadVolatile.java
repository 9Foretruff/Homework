package Multithreading_Top;

public class ThreadVolatile extends Thread {
    volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        // Volatile - пометка переменной которая храниться только в main memory
        ThreadVolatile threadVolatile = new ThreadVolatile();
        threadVolatile.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up");
        threadVolatile.b = false;
        threadVolatile.join();
        System.out.println("End of program");
    }

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished , counter = " + counter);
    }
}
