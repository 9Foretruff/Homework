package Multithreading_Top;


import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        
        Person person1 = new Person("Maks", callBox);
        Person person2 = new Person("Nekit", callBox);
        Person person3 = new Person("Vova", callBox);
        Person person4 = new Person("Ihor", callBox);
        Person person5 = new Person("Tanya", callBox);
    }
}


class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждет...");
            callBox.acquire();
            System.out.println(name + " пользуеться телефоном");
            Thread.sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}
