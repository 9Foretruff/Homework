package Multithreading_Top;

public class Daemon {
    // User threads
    // Daemon threads
    // что бы сделать поток Daemon нужно написать команду setDaemon()
    // что бы проверить являеться ли поток демоном isDaemon()
    // делать setDaemon можно только до вызова start , ибо будет ексепшн
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("UserThread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


