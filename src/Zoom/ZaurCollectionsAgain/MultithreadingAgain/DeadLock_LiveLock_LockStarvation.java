package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class DeadLock_LiveLock_LockStarvation {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10 attempt to capture the monitor of lock1");
        synchronized (DeadLock_LiveLock_LockStarvation.lock1) {
            System.out.println("Thread10 successfully capture the monitor of lock1");
            System.out.println("Thread10 attempt to capture the monitor of lock2");
            synchronized (DeadLock_LiveLock_LockStarvation.lock2) {
                System.out.println("Thread10 successfully capture the monitor of lock1 and lock2");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20 attempt to capture the monitor of lock2");
        synchronized (DeadLock_LiveLock_LockStarvation.lock2) {
            System.out.println("Thread20 successfully capture the monitor of lock2");
            System.out.println("Thread20 attempt to capture the monitor of lock1");
            synchronized (DeadLock_LiveLock_LockStarvation.lock1) {
                System.out.println("Thread20 successfully capture the monitor of lock2 and lock1");
            }
        }
    }
}

