package Multithreading_Top;

public class DeadLock_LiveLock_LockStarvation {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }

    //DeadLock - когда мониторы ждут друг друга и ничего не делают
    //LiveLock - когда мониторы ждут друг друга но делают какую-то работу
    //LockStarvation - когда тред с низким приоритетом могут вообще не выполниться

}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: попытка захватить монитор обекта lock1");
        synchronized (DeadLock_LiveLock_LockStarvation.lock1) {
            System.out.println("Thread10: Монитор обекта lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор обекта lock2");
            synchronized (DeadLock_LiveLock_LockStarvation.lock2) {
                System.out.println("Thread10: Монитор обекта lock2 захвачен");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: попытка захватить монитор обекта lock2");
        synchronized (DeadLock_LiveLock_LockStarvation.lock2) {
            System.out.println("Thread20: Монитор обекта lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор обекта lock1");
            synchronized (DeadLock_LiveLock_LockStarvation.lock1) {
                System.out.println("Thread20: Монитор обекта lock1 захвачен");
            }
        }
    }
}