package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtwLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Maksim", lock);
        new Employee("Ihor", lock);
        new Employee("Oleg", lock);
        Thread.sleep(5000);
        new Employee("Nikita", lock);
        new Employee("Katya", lock);
        new Employee("Masha", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(name + " waiting ..");
                // lock.lock();
                System.out.println(name + " using the atw !!!");
                Thread.sleep(500);
                System.out.println(name + " ended work");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " go away from queue");
        }
    }
}
