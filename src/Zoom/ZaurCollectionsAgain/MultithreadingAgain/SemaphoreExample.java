package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Maksim", callBox);
        new Person("Katya", callBox);
        new Person("Ihor", callBox);
        new Person("Oleg", callBox);
    }
}

class Person extends Thread {
    String name;
    Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " is talking");
            sleep(2000);
            System.out.println(name + " end call");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}


