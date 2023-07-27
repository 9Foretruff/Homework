package Multithreading_Top;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee employee1 = new Employee("Maksim", lock);
        Employee employee2 = new Employee("Ihor", lock);
        Thread.sleep(5000);
        Employee employee3 = new Employee("Vladimir", lock);
        Employee employee4 = new Employee("Nikita", lock);
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
//            System.out.println(name + " ждет...");
                //lock.lock();
                System.out.println(name + " пользуеться банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил работу");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " ушел...");
        }

    }
}
