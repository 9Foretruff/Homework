package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class MonitorAndSynchronizedBlocks{
    public static void main(String[] args) {
        MyRunnableImp2 myRunnableImp1 = new MyRunnableImp2();
        Thread thread1 = new Thread(myRunnableImp1);
        Thread thread2 = new Thread(myRunnableImp1);
        Thread thread3 = new Thread(myRunnableImp1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImp2 implements Runnable {

    private void doWork2() {
        System.out.println("Yra!!!");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
